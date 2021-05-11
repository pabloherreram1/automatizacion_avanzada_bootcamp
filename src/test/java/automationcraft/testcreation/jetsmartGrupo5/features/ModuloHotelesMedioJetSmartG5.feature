#Feature Grupo 5: Encontrar paquete de alojamiento

  Feature: El usuario debe encontrar al menos un paquete de alojamiento al ingresar "Londres",
    estos escenario esta basado en el punto de vista del usuario final.

    @bootcamp @G5
      Scenario: El usuario busca y encuentra un paquete de alojamiento
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When Ingreso al formulario hoteles
      And Seleciono "Londres" en el campo de Origen
      And Agregar primera fecha disponible
      And Agrefar fecha final de alojamiento de dos semanas posterior
      And presionar Buscar
      Then Se muestra al menos un resultado alojamiento en Londres con una habitación