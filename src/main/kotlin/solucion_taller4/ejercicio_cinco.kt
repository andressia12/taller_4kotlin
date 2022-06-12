package solucion_taller4

fun main(){
    var num_ciudad : Int
    print("Cuantas ciudades desea ingresar:")
    num_ciudad = readLine()!!.toInt()
    var lista : MutableList<String> = mutableListOf()
    repeat(num_ciudad){
        print("Ingrese el nombre de la ciudad: ")
        var ciudades = readLine()!!
        lista.add(ciudades)
    }

    var nombre_ciudad :String
    print("Ingrese la ciudad que desea comparar en la lista de ciudades: ")
    nombre_ciudad = readLine()!!
    print("La ciudad ${ciudades_pais(lista,nombre_ciudad)} en las $num_ciudad  ciudades de la lista")

}

    fun ciudades_pais(list: MutableList<String>, nom_ciudad:String):String{

    var validar = ""
    for(ciudades in list){
        if(nom_ciudad == ciudades){
        validar = "si esta"
    }else{
        validar ="no esta"
        }
    }
    return validar
}

