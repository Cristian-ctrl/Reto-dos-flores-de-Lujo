Feature: Feature del escenario Exitoso y no Exitoso para la pagina Flores de Lujo

  Scenario: Buscar palabra en el buscador de Floires de lujo exitoso
    Given que me encuentro en la pagina de Flores de lujo con la url https://floresdelujo.com.co/
    When busco ciertos arreglos florales en el buscador
      | arreglo                               |
      | Arreglo floral Sensacion- 1 por 12uni |
    Then podre ver modelos buscados con su precio respectivo

  Scenario: Buscar palabra en el buscador de de Floires de lujo no exitoso
    Given que me encuentro en la pagina de Flores de lujo con la url https://floresdelujo.com.co/
    When busco ciertos arreglos florales en el buscador
      | arreglo |
      | Play 5  |
    Then podre ver modelos buscados con su precio respectivo
