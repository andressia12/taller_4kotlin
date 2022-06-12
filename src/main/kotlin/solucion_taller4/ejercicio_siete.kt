package solucion_taller4

fun main(){
    var no_carros :Int
    print("¿Cuantos carros desea ingresar?")
    no_carros = readLine()!!.toInt()


    var lista : MutableMap<Double, Double> = mutableMapOf()

    //MutableMap<Double, Double> = mutableMapOf()
    repeat(no_carros){

        print("Ingrese la placa del carro: ")
        var pla = readLine()!!.toDouble()

        print("Ingrese el precio del carro: ")
        var precio = readLine()!!.toDouble()

        lista.put(pla,precio)
    }
    var placa_consulta: Double
    print("Ingrese la placa del carro de la cual desea consultar el precio: ")
    placa_consulta = readLine()!!.toDouble()
    print("El carro de placa  $placa_consulta  tiene un costo de ${lista_pares(lista,placa_consulta)}")
}

fun lista_pares (list: MutableMap<Double, Double>, placa_consulta:Double): Double{
    var precio_carro = -1.0
    for ((pla,precio) in list){

        if( placa_consulta == pla){
            precio_carro = precio

        }
    }

    return  precio_carro
}