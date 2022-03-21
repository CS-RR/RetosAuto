@stories
Feature:
  Como usuario deseo diligenciar y verificar el formulario de la pantalla "Block Validation"
  en la pagina colorlib
  @scenario1
  Scenario:  Verificar el diligenciamiento del formulario
    Given pedro ingresa a la pagina colorlib y se autentica
    |user|password|
    |demo|demo    |
    When Ingresa a la pagina y busca la seccion block validation
    And  diligencia el formulario block validation
    Then verifica respuesta correcta/fallida del diligenciamiento
