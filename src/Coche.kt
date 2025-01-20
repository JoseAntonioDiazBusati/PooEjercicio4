class Coche (var color: String?, val marca: String?, val modelo:String?, val numCaballos: Int?, val numPuertas: Int?, val matricula: String?) {


    init{

    }

    override fun toString(): String {
        return "El coche es de color $color, de la marca $marca, modelo $modelo, con una potencia de $numCaballos, con $numPuertas puertas y cuya matricula es: $matricula"
    }
}