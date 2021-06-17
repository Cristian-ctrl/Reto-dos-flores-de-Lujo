Feature: Feature del Buscador para la pagina Flores de Lujo

  Scenario Outline: <Escenario> <arreglo>
    Given que me encuentro en la pagina de Flores de lujo con la url <Url>
    When busco el arreglo <arreglo> en el buscador
    Then podre ver el arreglo <arreglo> en la pagina

    Examples: 
      | Escenario                                                    | arreglo                               | Url                          |
      | Buscar el arreglo en el buscador de Flores de Lujo 1 exitoso | Arreglo floral Sensacion- 1 por 12uni | https://floresdelujo.com.co/ |
      | Buscar el arreglo en el buscador de Flores de Lujo 2 exitoso | Arreglo floral sensación 12uni        | https://floresdelujo.com.co/ |
      | Buscar el arreglo en el buscador de Flores de Lujo 3 exitoso | Arreglo floral rosas y Lirios         | https://floresdelujo.com.co/ |
      | Buscar el arreglo en el buscador de Flores de Lujo 4 exitoso | Arreglo floral bouques rosa           | https://floresdelujo.com.co/ |
      | Buscar el arreglo en el buscador de Flores de Lujo 5 exitoso | Arreglo floral canasta de rosas       | https://floresdelujo.com.co/ |
