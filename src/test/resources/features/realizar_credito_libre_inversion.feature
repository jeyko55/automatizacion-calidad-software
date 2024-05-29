#author:
  #information
#HU: Yo Como cliente de Bancolombia, quiero solicitar un credito de libre inversion en la pagina web para obtener el financiamiento que necesito
Feature: realizar_credito_libre_inversion.feature

  Scenario: Realizar credito libre inversion sobre pagina Bancolombia
    Given que me encuentro en la pagina de Bancolombia
    When ingreso la informacion de mi credito
    Then veo la confirmacion del prestamo


  