#Feature Grupo5: Busqueda con resultado

  Feature: El usuario realiza una busqueda de traslado desde el aeropuerto Santiago con destino a la Serena

    @bootcamp @G5
      Scenario: El usuario realiza una busqueda de traslado
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When Ingreso al formulario Traslados
      And Seleciono radio boton "Ida"
      And selecciono "Santiago" en el campo Origen
      And selecciono "La Serena" en el campo Destino
      And Seleciono la primera fecha disponible
      And Seleciono el horario de las 13:00hrs
      And presiono el boton Buscar
      Then Se muestran las opciones de traslado del aeropueto de España, La Serena.