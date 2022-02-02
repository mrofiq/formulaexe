package formula

class FormulaExe {

}

fun main(arg: Array<String>){
    val math = MathEval()

    math.setVariable("PPN", .25)

    println(math.evaluate("100*PPN"))
    println(math.evaluate("(100+PPN)*25"))
    println(arg)
}