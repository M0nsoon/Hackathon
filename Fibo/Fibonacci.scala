package Fibo

class Fibonacci {
  //I'm gonna show off a bit here: here's some ways to solve it

  //this will get slower as the number gets bigger, and eventually cause StackOverFlow
  def FiboPatternMatching(n:Int):Int = n match {
    case 0 | 1 => n
    case _ => FiboPatternMatching(n-1) + FiboPatternMatching(n-2)
  }

  //tail recursion, the most efficient and powerful way to solve this
  def FiboTailRec(n:Int):Int ={
    //the magic of scala here: define a help-function inside a function to solve it better
    def fib_tail(n:Int,a:Int,b:Int):Int  = n match {
      case 0 => a
      case _ => fib_tail(n-1,b,a+b)
    }
    return fib_tail(n,0,1)
  }
  //this may not the ellegant way to solve it, but at least it won't encounter StackOverFlow
  def FiboIteration(n:Int):Int ={
    var a = 0
    var b =1
    var i =0
    while (i < n) {
      val c = a + b
      a = b
      b = c
      i+=1
    }
  return a
  }

}
