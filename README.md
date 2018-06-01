# NumberGame

<p>
  <b>Specification: Number Game</b>
    The game itself allows players to find matches between pairs
    of numbers or two numbers that add up to 10. The objective
    of the game is to clear the game board and score the highest
    possible score. The game board (see Figure 1) is made up of
    a matrix of 12 rows and 9 columns. Each of the cells within
    the matrix has a random number (1 to 9) allocated.
    Read this document carefully! Any clarification should be sought at the earliest opportunity.
  
    The player is able to select neighbours within the same row,
    column, or by wrapping around the edge of the board to the
    previous or subsequent row, Figure 2 on page 3 indicates
    legal combinations. Note: the player must be able to select
    the neighbours in any order i.e.
    • left-to-right or right-to-left
    • top-to-bottom or bottom-to-top
    • wrapping around the right edge of the board and
    moving down a row or wrapping around the left edge
    of the board an moving up a row
    
    If a match is found then the panels for those numbers are
    “removed” from play (they are set to blank panels – orange
    on the image Figure 1). Pairs can then be made through the
    blank panels providing the player with more points. On the
    figure to the right you can see that in the eighth row there
    is a 5 and then four blank panels and another 5. These
    two 5s form a pair as there are no number cells between
    them.
    Figure 1: Screen shot of the Number
    If the player clears an entire row then this blank row is Game
    removed from the game board and the subsequent rows are
    moved one row up the board. This will result in a blank row at the bottom of the game
    board.
</p>
<p align="center">
  <img src="Screenshot from 2018-05-30 23-42-20.png" width="350"/>  
</p>
