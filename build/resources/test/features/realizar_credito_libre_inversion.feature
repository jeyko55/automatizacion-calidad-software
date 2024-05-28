#author:
  #information

Feature: Realizar un credito libre inversion en pagina Bancolombia. Yo Como cliente de Bancolombia, quiero solicitar un crédito de libre inversión en la página web para obtener financiamiento más fácilmente.

  Scenario: Realizar credito libre inversion sobre pagina Bancolombia
    Given que me encuentro en la pagina de Bancolombia
    When ingreso la informacion de mi credito
    Then veo la confirmacion del prestamo