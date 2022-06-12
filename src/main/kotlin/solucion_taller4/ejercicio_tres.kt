package solucion_taller4

fun main(){
    var num : Int
    print("¿Cuantas palabras desea ingresar?")
    num = readLine()!!.toInt()
    var lista : MutableList<String> = mutableListOf()
    repeat(num){
        print("Ingrese la palabara")
        var palabra = readLine()!!
        lista.add(palabra)
    }
    print("de las $num  palabaras  los verbos son ${verbos(lista)}")
}

fun verbos (list: MutableList<String>):Int {
    var contador = 0
    for (palabra in list){
        var p = palabra.lowercase()
        if (palabra.endsWith("ar")|| palabra.endsWith("er")||palabra.endsWith("ir")){
            contador ++
        }
    }
    return contador
}