fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> {
                var sum: Sum = expr
                eval(sum.left) + eval(sum.right)
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
