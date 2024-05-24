#author:
  #information

Feature: Consultar mis reservas de vuelo. Yo como usuario registrado, quiero consultar mis reservas guardadas para verificar que la
  información es correcta.

  Scenario: Realizar reserva sobre la página de reserva de vuelos
    Given que me encuentro en la plataforma de vuelos
    When reviso el listado de mis reservas
    Then veo la información de todas mis reservas