#Feature Grupo 5: Iniciar Sesion

  Feature: Modulo Iniciar Sesion en la web JetSmart Grupo5
    Archivo Gherkin que contiene el modulo iniciar sesion de la pagina JetSmart
    estos escenario esta basado en el punto de vista del usuario final.

  @bootcamp @G5
    Scenario: El usuario logra iniciar Sesion
    Given El usuario ingresa a "JetSmart"
    When Ingreso al formulario Iniciar Sesion
    And Escribo en el campo Correo Electronico "Pabloherreram1@hotmail.com"
    And Escribo en el campo contrasena "pabloprueba123"
    And Seleciono el boton "Inicia Sesion"
    Then Inicia sesion Correctamente