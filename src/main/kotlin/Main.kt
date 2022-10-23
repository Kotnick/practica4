fun main(args: Array<String>) {

   val list = mutableListOf<Animal>()

    val harbivars1 =Herbivores ("cow", 237.5,"straw")
    val harbivars2 =Herbivores ("elephant", 5500.4,"banana")
    val carnivores1=Carnivores("wolf", 45.3, "forests" )
    val carnivores2=Carnivores("fox", 36.4, "forests" )

    list.add(harbivars1)

    list.add(harbivars2)
    list.add(carnivores1)
    list.add(carnivores2)
    println(list)
}


open class Animal(var name:String,var weight:Double) {
    override fun toString (): String {
        return "name='$name',weight='$weight'"
    }
}

class Herbivores (name:String,weight: Double,var food:String):Animal (name,weight){
    override fun toString (): String{
        return "Herbivores(food='$food' ${super.toString()})"
    }
}

class Carnivores (name:String,weight: Double,var habitat:String):Animal (name,weight){
    override fun toString (): String {
        return "Carnivores(habitat='$habitat' ${super.toString()})"
    }}