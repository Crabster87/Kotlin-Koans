fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> {
                var sum: Sum = expr
                eval(sum.left) + eval(sum.right)
            }
        }

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()