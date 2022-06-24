# tic_tac_toe_backend_spring
Server allowing user to save and load tic tac toe game state from the angular application.
Exposes a few endpoints:
- Put to "/gameboard":
  - saves the game to a json file
- Get to "/gameboard":
  - retrieves the saved games state from the json file 
