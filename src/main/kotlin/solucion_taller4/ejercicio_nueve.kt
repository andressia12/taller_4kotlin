package solucion_taller4
public var x1 :Double = 0.0
public var y1 :Double = 0.0
fun main(){

    var no_puntos :Int
    print("¿Cuantos puntos desea ingresar?")
    no_puntos = readLine()!!.toInt()


    var lista : MutableList<Pair<Double,Double>> = mutableListOf()
    var contador = 0
    repeat(no_puntos){
        contador ++
        print("Ingrese la coordenada X del punto $contador: ")
        x1 = readLine()!!.toDouble()

        print("Ingrese la coordenada Y del punto $contador: ")
        y1 = readLine()!!.toDouble()
        var punto = Pair(x1,y1)
        var punto1= lista.add(Pair(x1,y1))
        println("El punto ingresado es  de coordenadas: ${lista_pares(lista).first}")
        println("El cuadrante en el que se encuentra ubicado el punto es ${lista_pares(lista).third}")
        println("La distancia al origen del punto es:  ${lista_pares(lista).second}")

    }



}
//ítem a
fun distancia_origen(x: Double, y:Double):Double{

    var distancia = Math.sqrt((Math.pow(x,2.0))+(Math.pow(y,2.0)))
    return distancia

}

//Item b
fun cuadrante_plano(x:Double, y:Double):Int {
 var cuadrante : Int
    if (x > 0.0 && y > 0.0) {
        cuadrante = 1
    } else if (x < 0.0 && y > 0.0) {
        cuadrante = 2
    } else if (x < 0.0 && y < 0.0) {
        cuadrante = 3
    } else if (x > 0.0 && y < 0.0) {
        cuadrante = 4
    } else {
        cuadrante = 0
    }
    return cuadrante
}

//Item c

fun lista_pares(list: MutableList<Pair<Double, Double>>):Triple<Pair<Double,Double>, Double, Int>{

    var punto = Pair(x1,y1)
    var dis_origen = distancia_origen(x1,y1)
    var cuadrante_pla = cuadrante_plano(x1,y1)

    return Triple(punto,dis_origen,cuadrante_pla)
    }












