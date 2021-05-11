#Feature Grupo5: Mostrar paquetes con filtros.

  Feature: El usuario debe filtrar por presupuesto, populares y estrellas para "Londres".

    @bootcamp @G5
      Scenario: El usuario aplica filtros para realizar una busqueda mas personalizada
      Given soy el usuario e ingreso a la pagina "JetSmart"
      When Ingreso al formulario hoteles
      And Seleciono "Londres" en el campo de Origen
      And Agregar primera fecha disponible
      And Agregar fecha final de alojamiento de dos semanas posterior
      And presionar Buscar
      And Selecionar el primer resultado del Checkbox en la categoria presupuesto
      And Selecionar el checkbox de filtros populares la opcion "Hoteles"
      And Selecionar el Checkbox de estrellas la opcion "3 Estrellas"
      Then Se filtra los resultados y solo se muestran resultados pertenecientes a los 3 filtros aplicados.