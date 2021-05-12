#Feature Grupo5: Mostrar paquetes con filtros.


  Feature: El usuario debe filtrar por presupuesto, populares y estrellas para "Londres".

    @bootcamp @G5 @HotelAlto
      Scenario: El usuario aplica filtros para realizar una busqueda mas personalizada
      Given soy el usuario e ingreso a la pagina "JetSmart" hotel
      When Ingreso al formulario hoteles
      And selecciono "Londres" en el campo Origen hotel
      And Agregar primera fecha disponible
      And Agregar fecha final de alojamiento de dos semanas posterior
      And presionar Buscar hotel
      And Selecionar el primer resultado del Checkbox en la categoria presupuesto
      And Selecionar el checkbox de filtros populares la opcion "Hoteles"
      And Selecionar el Checkbox de estrellas la opcion "3 Estrellas"
      Then Se filtra los resultados y solo se muestran resultados pertenecientes a los 3 filtros aplicados


    @bootcamp @G5 @HotelMedio
    Scenario: El usuario busca y encuentra un paquete de alojamiento
      Given soy el usuario e ingreso a la pagina "JetSmart" hotel
      When Ingreso al formulario hoteles
      And selecciono "Londres" en el campo Origen hotel
      And Agregar primera fecha disponible
      And Agregar fecha final de alojamiento de dos semanas posterior
      And presionar Buscar hotel
      Then Se muestra al menos un resultado alojamiento en Londres con una habitación


    @bootcamp @G5 @HotelBajo
    Scenario: El usuario No encuentra paquete de alojamiento
      Given soy el usuario e ingreso a la pagina "JetSmart" hotel
      When Ingreso al formulario hoteles
      And selecciono "Antartica" en el campo Origen hotel bajo
      And presionar Buscar hotel
      Then No se encuentra paquetes de alojamiento en Antartica