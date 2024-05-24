#author:
  #information

Feature:  Actualizar datos de reserva de vuelo. Yo como usuario registrado quiero actualizar los datos de mi reserva para que la
  información quede correctamente registrada.

  Scenario: Actualizar reserva de vuelo sobre el listado de reservas
    Given que me encuentro en el listado de reservas
    When elijo una reserva Y actualizo sus datos
    Then recibo la confirmación de la actualización de mi reserva
