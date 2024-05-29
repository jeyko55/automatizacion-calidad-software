#author:
  #information
#HU: Yo como cliente interesado en solicitar un credito de libre inversión en Bancolombia, quiero recibir indicaciones claras cuando la ciudad seleccionada no esté disponible en esta operación Para entender como proceder y que acciones tomar.
Feature: ciudad_erronea.feature

  Scenario: Realizar credito libre inversion con datos sobre pagina Bancolombia con ciudad no disponible
    Given que me encuentro en la pagina de creditos de Bancolombia
    When ingreso la informacion de mi credito Y selecciono una ciudad sin disponibilidad de la pagina
    Then veo un mensaje indicando que la ciudad no esta disponible para esta operacion Y que puedo hacer en consecuencia