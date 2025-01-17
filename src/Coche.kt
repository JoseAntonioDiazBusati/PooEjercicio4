class Coche (var color: String, val marca: String, val modelo:String, val numCaballos: Int, val numPuertas: Int, val matricula: String) {



    init{
        require(marca.isNotBlank()){"La marca del coche no puede estar vacia o ser nula."}
        require(modelo.isNotBlank()){"El modelo del coche no puede estar vacío o ser nulo."}
        require(matricula.isNotBlank()){}
        require(color.isNotBlank()){}
    }

    override fun toString(): String {
        return "El coche es de color $color, de la marca $marca, modelo $modelo, con una potencia de $numCaballos, con $numPuertas puertas y cuya matricula es: $matricula"
    }
}