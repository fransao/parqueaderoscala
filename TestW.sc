
object Testw {

  object EnumTiempo extends Enumeration {
    val HORA = Value(1, "Hora")
    val DIA  = Value(2, "Dia")
  }

  object EnumTipoVehiculo extends Enumeration {
    val CARRO = Value(1, "Carro")
    val MOTO  = Value(2, "Moto")
  }

  class Tarifa(val tipoVehiculo:EnumTipoVehiculo.Value, val tiempo:EnumTiempo.Value, val valor:Float) {

  }

  val lista: List[Tarifa] = List(
    new Tarifa(EnumTipoVehiculo.CARRO, EnumTiempo.HORA, 1000.0f),
    new Tarifa(EnumTipoVehiculo.CARRO, EnumTiempo.DIA,  8000.0f),
    new Tarifa(EnumTipoVehiculo.MOTO, EnumTiempo.HORA,  500.0f),
    new Tarifa(EnumTipoVehiculo.MOTO, EnumTiempo.DIA,   4000.0f)
  )

  val option2 : Tarifa = lista.filter( tarifa => tarifa.tipoVehiculo == EnumTipoVehiculo.CARRO).head

  println("Tarifa es: " +option2.valor + " por " +option2.tiempo + " para tipo vehiculo " + option2.tipoVehiculo )

  val option : Option[Tarifa] = lista.find(tarifa => tarifa.tipoVehiculo == EnumTipoVehiculo.CARRO)
    // t => t.tipoVehiculo == EnumTipoVehiculo.CARRO)
  println(option)

   option match {
    case Some(t)=> "tarifa: " + t
    case None=> "Sin tarifa"
  }


}