#Feature Grupo5: Busqueda sin resultados

  Feature: El Usuario al realizar una busqueda entre dos paises diferentes por defecto no encuentra resultado

    @bootcamp @G5
    Scenario: El usuario realiza una busqueda de traslado
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When Ingreso al formulario Traslados
      And Seleciono radio boton "Ida y vuelta"
      And selecciono "Ezeiza" en el campo Origen
      And selecciono "Bogota Colombia" en el campo Destino
      And Seleciono una fecha de ida en 30 dias
      And Seleciono el horario de las 09:00 AM
      And Seleciono una fecha de vuelta en 31 dias de la fecha actual
      And Seleciono el horario de vuelta Actual
      And presiono el boton Buscar
      Then Se muestra que no se han encontrado resultados para el traslado