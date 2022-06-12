package solucion_taller4

fun main(){

    var lista : MutableList<Int> = mutableListOf()
    print("Ingrese la edad: ")
    var edad = readln()!!.toInt()
    while (edad>-1){
        lista.add(edad)
        print("Ingrese la edad: ")
        edad = readln()!!.toInt()

        print(lista)
    }
    var (siglo_pasado,promedio) = siglo(lista)
    println("Hay $siglo_pasado estudiantes del siglo pasado")
    println("El promedio de edad de la universidad $promedio")
}

fun siglo (list: MutableList<Int>):Pair<Int, Double> {
    var siglo_pasado = 0
    var suma = 0.0
    for (edad in list) {
        if (edad >= 22) {
            siglo_pasado++
        }
        suma += edad
    }
    var promedio = suma/list.size
    return siglo_pasado to promedio
}