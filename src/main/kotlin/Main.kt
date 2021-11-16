fun main() {

    // Crea todas las clases/funciones necesarias para realizar este ejercicio sin modificar en nada Main.
    val lista = listOf(Gato(2.0), Perro(20.0), Persona(89.0),Gato(3.0), Perro(15.0), Persona(79.0),Gato(3.0), Perro(25.0), Persona(99.0))

    // Haz un ejercicio como output tenga:
    // El peso medio de los gatos es:
    println("El peso medio de los gatos es ${calcularPesoMedioGatos(lista)}")
    // El peso medio de los perros es:
    println("El peso medio de los perros es ${calcularPesoMedioPerros(lista)}")
    // El peso medio de las personas es:
    println("El peso medio de las personas es ${calcularPesoMedioPersonas(lista)}")

    // Utiliza Herencia para Calcular desviación respecto a su peso ideal.
    // Peso ideal del perro = 22
    // Peso ideal del gato = 2.2
    // Peso ideal de la persona = 85
    lista.forEach {
        // Para el gato 1, el resutlado es -0,2. Para el perro 1 - 2.0, para la persona 1 es + 4.
        println("Este animal tiene un peso de ${it.calcularDesviacionDelPesoIdeal()} sobre lo esperado")
    }

}

fun calcularPesoMedioGatos(lista: List<Any>): Double {
    var cont : Int =0
    var total : Double=0.0
    for (i in lista){
        if(i is Gato){
            cont++
            total+=i.peso
        }
    }
    var media : Double = 0.0
    media = total/cont
    return media
}
fun calcularPesoMedioPerros(lista: List<Any>): Double {
    var cont : Int =0
    var total : Double=0.0
    for (i in lista){
        if(i is Perro){
            cont++
            total+=i.peso
        }
    }
    var media : Double = 0.0
    media = total/cont
    return media
}
fun calcularPesoMedioPersonas(lista: List<Any>): Double {
    var cont : Int =0
    var total : Double=0.0
    for (i in lista){
        if(i is Persona){
            cont++
            total+=i.peso
        }
    }
    var media : Double = 0.0
    media = total/cont
    return media
}

abstract class SerVivo(var peso: Double){
    abstract var PesoIdeal : Double

    open fun peso():Double{
        return this.peso
    }

    fun calcularDesviacionDelPesoIdeal(): Double {
        return peso()-PesoIdeal
    }
}
class Gato(peso: Double) : SerVivo(peso){
    override var PesoIdeal : Double = 2.2
}
class Perro(peso: Double) : SerVivo(peso){
    override var PesoIdeal : Double = 22.0
}
class Persona(peso: Double) : SerVivo(peso){
    override var PesoIdeal : Double = 85.0
}