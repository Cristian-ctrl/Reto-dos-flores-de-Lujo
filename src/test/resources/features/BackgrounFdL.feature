Feature: Feature del Background para la pagina Flores de Lujo

  Background: 
    Given que me encuentro en la pagina de Flores de lujo con la url https://floresdelujo.com.co/

  Scenario: Buscar el producto con el filtrador de Flores de Lujo
    When Filtro el arreglo
      | arreglo                               |
      | Arreglo floral Sensacion- 1 por 12uni |
    Then veo el arreglo filtrado en la pantalla

  Scenario: Buscar el producto con el filtrador de Flores de Lujo
    When Filtro el arreglo
      | arreglo                       |
      | Arreglo floral rosas y Lirios |
    Then veo el arreglo filtrado en la pantalla
