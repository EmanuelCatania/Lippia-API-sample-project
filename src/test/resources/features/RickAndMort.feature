Feature: Rick and Morty

  @RyM @ok
  Scenario Outline: Pedimos un personaje, un episodio y un lugar al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParamiters>'
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName         | statusCode | inputParamiters | operation | entity    | jsonNameResponse     |
      | RyM\rc_character | 200        | character:2     | GET       | CHARACTER | RyM\rc_character_200 |
      | RyM\rc_location  | 200        | location:1      | GET       | LOCATION  | RyM\rc_location_200  |
      | RyM\rc_episode   | 200        | episode:15      | GET       | EPISODE   | RyM\rc_episode_200   |


  @RyM @ok
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParamiters>'
    Then se obtuvo el status code <statusCode>
    Then le respuesta es correcta
    Examples:
      | jsonName         | statusCode | inputParamiters | operation | entity    |
      | RyM\rc_character | 200        | character:2     | GET       | CHARACTER |


  @RyM @error
  Scenario Outline: Pedimos un personaje, un episodio y un lugar al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParamiters>'
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName         | statusCode | inputParamiters | operation | entity | jsonNameResponse     |
      | RyM\rc_character | 404        | character:9999  | GET       | ERROR  | RyM\rc_character_404 |
      | RyM\rc_location  | 404        | location:9999   | GET       | ERROR  | RyM\rc_location_404  |
      | RyM\rc_episode   | 404        | episode:9999    | GET       | ERROR  | RyM\rc_episode_404   |


  @all
  Scenario Outline: Pedimos todos los personajes, todos los lugares y todos los episodios
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParamiters>'
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName            | statusCode | inputParamiters | operation | entity  | jsonNameResponse        |
      | RyM\rc_allcharacter | 200        | var:character   | GET       | ALLCHAR | RyM\rc_allcharacter_200 |
      | RyM\rc_allcharacter | 200        | var:episode     | GET       | ALLEPI  | RyM\rc_allepisode_200   |
      | RyM\rc_allcharacter | 200        | var:location    | GET       | ALLLOC  | RyM\rc_alllocation_200  |