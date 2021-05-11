#Feature Grupo 5: No Encontrar paquete de alojamiento

  Feature: El usuario no debe encontrar alojamiento al buscar "Antartica"

    @bootcamp @G5
      Scenario: El usuario No encuentra paquete de alojamiento
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When Ingreso al formulario Hoteles
      And selecciono "Antartica" en el campo Origen
      And presiono el boton Buscar
      Then No se encuentra paquetes de alojamineto en Antartica
