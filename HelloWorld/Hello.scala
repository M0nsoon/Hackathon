package HelloWorld



class Hello {
    def doTheMagic:Unit ={
      print("What's your name?")

      val a = readLine()
      print("Hello " + a)
    }
}
