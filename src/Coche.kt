class Coche (var color: String?, marca: String?, modelo:String?, val numCaballos: Int?, val numPuertas: Int?, val matricula: String?) {


    init {
        require(!marca.isNullOrEmpty()) { "La marca no puede ser nulo o vacío.  " }
        require(!modelo.isNullOrEmpty()) { "El modelo no puede ser nulo o vacío." }
        require(!color.isNullOrBlank()) { "El color nu puede estar vacío." }
        require(!matricula.isNullOrEmpty() && matricula.length == 7) { "La matricula no puede ser nulo y debe tener 7 digitos." }
        require(numCaballos != null && numCaballos in 70..700) { "Los numeros de caballos no pueden ser nulos y deben ser entre 70 y 700." }
        require(numPuertas != null && numPuertas in 3..5) { "El numero de puertas no puede ser nulo y deben ser entre 3 y 5." }
    }

    val marca: String
        get() = marca.replaceFirstChar { it.uppercase() }


    val modelo: String
        get() = modelo.replaceFirstChar { it.uppercase() }


    override fun toString(): String {
        return "El coche es de color $color, de la marca $marca, modelo $modelo, con una potencia de $numCaballos, con $numPuertas puertas y cuya matricula es: $matricula"
    }
}