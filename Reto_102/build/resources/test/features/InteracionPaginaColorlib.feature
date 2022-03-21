@stories
Feature:
  Como usuario deseo diligenciar y verificar el formulario de la pantalla "Inline Validation"
  en la pagina colorlib
  @scenario1
  Scenario: Verificar el diligenciamiento del formulario
    Given pedro ingresa a la pagina colorlib y se autentica
      |user|password|
      |demo|demo    |
    When Ingresa a la pagina y busca la seccion Inline validation
    And  diligencia el formulario Inline validation
    Then verifica respuesta correcta/fallida del diligenciamiento
