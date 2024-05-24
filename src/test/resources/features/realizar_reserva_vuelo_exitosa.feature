#author:
  #information

Feature: Realizar reserva de vuelo de forma exitosa. Yo como usuario registrado, quiero realizar una reserva de vuelo para separar mi vuelo de
  forma exitosa

  Scenario: Realizar reserva sobre la página de reserva de vuelos
    Given que me encuentro en la página de reservas
    When ingreso los datos de una nueva reserva
    Then veo un mensaje confirmando la reserva