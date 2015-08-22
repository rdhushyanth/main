package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c==0 && r==0) 1 else if (c<0||r<0) 0 else pascal(c,r-1)+pascal(c-1,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(counter:Int, list: List[Char] ): Boolean ={
      if(list.isEmpty || counter<0) counter==0
      else if (list.head=='(') loop(counter+1, list.tail)
      else if(list.head==')') loop(counter-1, list.tail)
      else loop(counter, list.tail)
    }
    loop(0,chars)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeIter( amount:Int, choice:List[Int]): Int = {
      if (amount ==0) 1
      else if (choice.isEmpty || amount < 0) 0
      else countChangeIter(amount-choice.head, choice) + countChangeIter(amount, choice.tail)
    }
    countChangeIter(money, coins)
  }
}

