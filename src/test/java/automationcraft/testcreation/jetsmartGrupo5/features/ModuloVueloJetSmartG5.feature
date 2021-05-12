#Feature Grupo5: Vuelo de Fecha de Ida cambiada

  Feature: Encontrar una fecha modificada del vuelo ida por una mas economica del proximo mes,
      estos escenario esta basado en el punto de vista del usuario final.

  @bootcamp @G5 @VueloAlto
    Scenario: El usuario modifica un vuelo de ida para uno mas economico
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When selecciono "Santiago" en el campo Origen
      And selecciono "Buenos Aires" en el campo Destino
      And Seleciono el Checkbox de Ida
      And Seleciona la primera fecha disponible ida
      And Seleciono un Adulto
      And Seleciono dos ninos
      And presiono BuscarSmart
      And cierro la ventana club descuento
      And Seleciono el boton "Vuelo Mas barato"
      And Selecion la segunda fecha de vuelo disponible del proximo mes
      And Presiono el boton continuar
      And Seleciono el Pack de vuelo mas barato
      And fijo precio por 24hrs
      And Clickear en Continuar
      And Clickear en pagar ahora
      Then Se muestra en la pantalla de medios de pago, la fecha cambiada de IDA con la nueva fecha de vuelo más barata



    @bootcamp @G5 @VueloMedio
    Scenario: El usuario busca un vuelo de ida y vuelta
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When selecciono "Santiago" en el campo Origen
      And selecciono "Buenos Aires" en el campo Destino medio
      And selecciono ckeck ida y vuelta
      And Seleciona la primera fecha disponible ida
      And Seleciono la vuelta dos semanas posterior a la fecha de ida
      And presiono BuscarSmart
      Then Se muestra los vuelos en las fechas y lugares correspondientes


    @bootcamp @G5 @VueloBajo
    Scenario: El sistema no logra encontrar destino
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When selecciono "Santiago" en el campo Origen
      And selecciono "AAAAA" en el campo Destino
      Then Aparece la alerta "No hay Resultados"
