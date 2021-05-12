#Feature Grupo5: Reservación de un transporte

Feature: El Usuario al reservar un transporte entre dos aeropuertos del mismo país, con fecha de ida del mes actual con dos pasajeros.

  @bootcamp @G5 @TrasladoAlto
  Scenario: El usuario realiza una busqueda de traslado
    Given soy el usuario e ingreso a la pagina "JetSmart"
    When Ingreso al formulario Traslados
    And Seleciono radio boton "Ida"
    And selecciono "Ezeiza" en el campo Origen traslado
    And selecciono "Newbery" en el campo Destino traslado
    And Seleciono una fecha de ida en 30 dias
    And Seleciono el horario de las 9AM
    And Seleciona 2 pasajeros
    And presiono el boton Buscar traslado
    And Click en reservar ahora en el primer resultado
    And Ingresar nombre del pasajero "Raul el perro"
    And Ingresar email del pasajero "raul@gmail.com"
    And Ingresar email de confirmacion del pasajero "raul@gmail.com"
    And Ingresar codigo pais "Islas Caiman" del pasajero
    And Ingresar numero celular del pasajero "88839039"
    And Ingresar numero de vuelo del pasajero "CD123"
    And presionar boton "ir a Caja"
    Then Se muestra en pantalla los medios de pago disponibles y los datos del transporte


  @bootcamp @G5 @TrasladoMedio
  Scenario: El usuario realiza una busqueda de traslado
    Given soy el usuario e ingreso a la pagina "JetSmart"
    When Ingreso al formulario Traslados
    And Seleciono radio boton Ida y vuelta
    And selecciono "Ezeiza" en el campo Origen traslado
    And selecciono "Bogota Colombia" en el campo Destino traslado
    And Seleciono una fecha de ida en 30 dias
    And Seleciono el horario de las 9AM
    And Seleciono una fecha de vuelta en 31 dias de la fecha actual
    And Selecciono un pasajero
    And presiono el boton Buscar traslado
    Then Se muestra que no se han encontrado resultados para el traslado


  @bootcamp @G5 @TrasladoBajo
  Scenario: El usuario realiza una busqueda de traslado
    Given soy el usuario e ingreso a la pagina "JetSmart" traslado
    When Ingreso al formulario Traslados
    And Seleciono radio boton "Ida"
    And selecciono "Santiago" en el campo Origen traslado
    And selecciono "La Serena" en el campo Destino traslado
    And Selecciono la primera fecha disponible
    And Selecciono el horario de las 13:00hrs
    And Selecciono un pasajero
    And presiono el boton Buscar traslado
    Then Se muestran las opciones de traslado del aeropueto de España, La Serena.


