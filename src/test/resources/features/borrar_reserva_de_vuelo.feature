#author:
  #information

Feature:  Borrar reserva de vuelo. Yo como usuario registrado, quiero cancelar alguna de mis reservas de vuelo para no tener
  que comprometerme con el viaje.

  Scenario: Borrar reserva de vuelos desde el listado de reservas
    Given que me encuentro en la página de reservas
    When elijo eliminar una reserva Y confirmo la eliminación
    Then mi reserva es eliminada
