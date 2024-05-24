#author:
  #information

Feature: Consultar reservas con un filtro. Yo como usuario usuario registrado, quiero consultar una reserva en específico para
  comprobar la información de mi reserva

  Scenario: Consultar reserva de vuelo por su codigo
    Given que me encuentro en mi listado de reservas
    When ingreso un código de reserva
    Then puedo ver la reserva con ese código

  Scenario: Consultar reservas de vuelo por fecha
    Given que me encuentro en mi listado de reservas
    When ingreso la fecha de una reserva
    Then puedo ver las reservas desde esa fecha


  Scenario: Consultar reserva de vuelo por lugar de destino
    Given que me encuentro en mi listado de reservas
    When ingreso un lugar de destino
    Then puedo ver mis reservas a ese sitio