#Feature Grupo 5 : Vuelos Encontrados Ida y vuelta

  Feature: Encontrar al menos un vuelo para ida y vuelta
            en unas fechas determinadas, estos escenario esta basado en el punto de vista del usuario final.

  @bootcamp @G5
    Scenario: El usuario busca un vuelo de ida y vuelta
    Given soy el usuario e ingreso a la pagina "JetSmart"
    When ingreso al formulario de vuelo
    And selecciono "Santiago de Chile" en el campo Origen
    And selecciono "Buenos Aires" en el campo Destino
    And Seleciona la primera fecha disponible ida
    And Seleciono la vuelta dos semanas posterior a la fecha de ida
    And presiono BuscarSmart
    Then Se muestra los vuelos en las fechas y lugares correspondientes