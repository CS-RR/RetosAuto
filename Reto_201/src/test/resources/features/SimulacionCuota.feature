@stories
Feature:
  Verificar el funcionamiento de la pantalla de simulación de créditos expuesta
  por el grupo Bancolombia, en cuanto a la presentación de los valores calculados,
  campos: “Valor de la Cuota”.
  @scenario1
  Scenario: Verificar el funcionamiento de la pantalla de simulación de créditos
    Given Laura ingresa a la pagina de bancolombia en la seccion simulacion de credito
    When Ingresa los datos necesarios para simular su credito
    |Simular|Fecha|Tipotasa|Producto|Plazo|Valor|
    |Simula tu Cuota|1994-10-02|Tasa Fija|Libranza Proteccion|24|10000000|
    Then verfica los resultados obtenidos para su cuota mensual
