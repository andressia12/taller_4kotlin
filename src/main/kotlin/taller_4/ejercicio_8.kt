package taller_4

/*
Enunciado: Función que halla el area de un triangulo
Entradas:
base -->Double-->b
altura -->Double-->a
Salidas:
area-->Double-->area
*/
fun areaTriangulo(b:Double, a:Double)=b*a/2

fun main(){
    val triangulos = mutableListOf<Triple<String,Double, Double>>()
    print("Ingrese el número de triangulos a evaluar:  ")
    val nt = readLine()!!.toInt()
    repeat(nt){
        print("Digite el nombre del triangulo N: ${it+1} :  ")
        val x = readLine()!!.toString()
        print("Digite la base:  ")
        val y = readLine()!!.toDouble()
        print("Digite la altura:  ")
        val z = readLine()!!.toDouble()
        triangulos.add(Triple(x,y,z))
    }
    println("El triangulo de mayor áera es: ${nombreTrianguloMayorArea(triangulos)}")
    print("Que tiene un area de ${areaTrianguloConNombre(triangulos, nombreTrianguloMayorArea(triangulos))}")

}

fun nombreTrianguloMayorArea(triangulos: MutableList<Triple<String, Double, Double>>): String {
    var mayorArea: Pair<String, Double>
    mayorArea=Pair("Nombre", 0.0)
    for (elem in triangulos) {
        if (areaTriangulo(elem.second, elem.third) > mayorArea.second) {
            mayorArea = Pair(elem.first, areaTriangulo(elem.second, elem.third))
        }
    }
    return mayorArea.first
}
fun areaTrianguloConNombre(triangulos: MutableList<Triple<String, Double, Double>>, nombre:String):Double{
    for (elem in triangulos) {
        if (elem.first == nombre) {
            return areaTriangulo(elem.second, elem.third)
        }
    }
    return -1.0
}
