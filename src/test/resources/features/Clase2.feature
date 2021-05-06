Feature: Rick and Morty

  @c2
  Scenario Outline: Pedimos todos los personajes, todos los lugares y todos los episodios
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParamiters>'
    And obtengo el ID de un personaje
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName            | statusCode | inputParamiters | operation | entity  | jsonNameResponse        |
      | RyM\rc_allcharacter | 200        | var:character   | GET       | ALLCHAR | RyM\rc_allcharacter_200 |

  @c2
  Scenario Outline: Pedimos un personaje, un episodio y un lugar al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName         | statusCode | operation     | entity    | jsonNameResponse     |
      | RyM\rc_character | 200        | GETWITHPARAMS | CHARACTER | RyM\rc_character_200 |
