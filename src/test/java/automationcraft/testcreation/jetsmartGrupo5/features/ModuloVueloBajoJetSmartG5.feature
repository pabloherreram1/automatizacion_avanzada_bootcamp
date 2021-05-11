#Feature Grupo 5: Vuelo Bajo

  Feature:Modulo Vuelo Bajo de web JetSmart Grupo5
    Archivo Gherkin que contiene el modulo vuelo bajo de la pagina JetSmart
    estos escenario esta basado en el punto de vista del usuario final.

    @bootcamp @G5
    Scenario: El sistema no logra encontrar destino
      Given que soy un usuario e ingreso a la web "JetSmart"
      When ingreso al formulario de vuelo
      And Seleciono "Santiago, Chile" en el campo Origen
      And Seleciono "AAAAA" en el campo Destino
      Then Aparece la alerta "No hay Resultados"

