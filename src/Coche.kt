class Coche (var color: String?, val marca: String?, val modelo:String?, val numCaballos: Int?, val numPuertas: Int?, val matricula: String?) {


    init{
        require(!marca.isNullOrEmpty()) { "La marca no puede ser nulo o vacío.  " }
        require(!modelo.isNullOrEmpty()) { "El modelo no puede ser nulo o vacío." }
        require(!color.isNullOrBlank()) { "El color nu puede estar vacío." }
        require(!matricula.isNullOrEmpty()) { "La matricula no puede ser nulo." }
        require(numCaballos != null)  { "Los numeros de caballos no pueden ser nulos" }
        require(numPuertas != null)  { "El numero de puertas no puede ser nulo" }
    }

    constructor(){}

    override fun toString(): String {
        return "El coche es de color $color, de la marca $marca, modelo $modelo, con una potencia de $numCaballos, con $numPuertas puertas y cuya matricula es: $matricula"
    }
}