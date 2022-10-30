class Demo :DemoInter{
    //class Demo :Parent()-- to inherit
    private lateinit var name:String

    override fun walk() {
        println("walking")
    }

//    override fun parentFun(){
//        prinltn("Overriden function with inheritance")
//    }
}