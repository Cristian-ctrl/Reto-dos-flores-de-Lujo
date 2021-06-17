Feature: Feature del Buscador en Aleatorio para la pagina Flores de Lujo

  Scenario Outline: <Escenario>
    Given que me encuentro en la pagina de Flores de lujo con la url <Url>
    When busco un arreglo aleatorio en la pagina
    Then podre ver un arreglo aleatorio en la pagina

    Examples: 
      | Escenario                                             | Url                          |
      | Buscar un arreglo aleatorio en Flores de lujo exitoso | https://floresdelujo.com.co/ |
