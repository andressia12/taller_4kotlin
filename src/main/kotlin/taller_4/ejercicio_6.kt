package taller_4

/*
6. Desarrolle la siguiente función y programa
a. Escriba un función que reciba una lista de pares (el primer elemento es el nombre de un estudiante,
 y el segundo es el año de nacimiento) y que retorne el nombre del estudiante más viejo de toda la lista.
b. Escriba el programa que lea el nombre y año de nacimiento de N estudiantes de la universidad,
 almacene cada par en una lista, y luego de terminar la lectura, y usando la función
anterior, imprima el nombre del estudiante más viejo.
 */

fun main(){
    print("Cuantos Estudiantes desea Ingresar?: ")
    val std  = readLine()!!.toInt()
    val students = mutableListOf<Pair<String, Int>>()
    repeat(std){
        print("Escribe el nombre:  ")
        val x = readLine()!!
        print("Año de nacimiento?: ")
        val y = readLine()!!.toInt()
        students.add(Pair(x,y))
    }
    print("El estudiante con mayor edad es: ${studenOldes(students)}")
}

fun studenOldes(students: MutableList<Pair<String, Int>>): String {

    var name =""
    var born = 2022
    for (elem  in 0  until students.size){

        if (students[elem].second < born){
            born = students[elem].second
            name = students[elem].first
        }
    }
    return name
}