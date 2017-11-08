package org.jonnyzzz.demo.langbasic



fun main(args: Array<String>) {
  runBasic {
    10 PRINT "Hello, from Kotlin!"
    30 PRINT "@jonnyzzz"
    40 INPUT "@jonnyzzz" AS "twitter"
    50 PRINT "Another text"
    60 GOTO 10
  }
}


fun runBasic(builder : BasicBuilder.() -> Unit) {
  val host = ProgramBuilder()
  BasicBuilder(host).builder()
  host.execute()
}

class BasicBuilder(private val builder : ProgramBuilder) {
  infix fun Int.PRINT(text : String) {
    builder.nextLine(PrintStatement(this, text))
  }

  infix fun Int.INPUT(text: String) = INPUTStatement(this, text).apply {
    builder.nextLine(this)
  }

  infix fun Int.GOTO(line : Int) {
    builder.nextLine(GOTOStatement(this, line))
  }
}

class ProgramBuilder {
  private val lines = mutableListOf<BasicLine>()

  fun nextLine(code: BasicLine) {
    val line = lines.lastOrNull()?.line
    if (line != null && line >= code.line) {
      throw Exception("Invalid line number. In Basic lines must be monotonious. Current line: ${code.line}, prev line: $line")
    }

    lines += code
  }

  fun execute() {

    var line = lines.firstOrNull()

    fun nextLine() {
      val targetNumber = line?.line
      if (targetNumber != null) {
        line = lines.firstOrNull { it.line > targetNumber}
      }
    }

    while(line != null) {
      val current = line
      when(current) {

        is PrintStatement -> {
          println(current.text)
          nextLine()
        }

        is GOTOStatement -> {
          line = lines.firstOrNull { it.line == current.toLine }
        }

        is INPUTStatement -> {
          println(current.text)
          readLine()
          nextLine()
        }
      }
    }
  }
}

sealed class BasicLine(val line : Int)
class PrintStatement(line: Int, val text: String) : BasicLine(line)
class GOTOStatement(line: Int, val toLine: Int) : BasicLine(line)
class INPUTStatement(line: Int, val text: String) : BasicLine(line) {
  var targetVariableName : String? = null

  infix fun AS(text : String) {
    targetVariableName = text
  }
}