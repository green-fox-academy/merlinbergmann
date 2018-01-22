
public class TennisGame1 implements TennisGame {

  private int player1Points = 0;
  private int player2Points = 0;
  private String player1Name;
  private String player2Name;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      player1Points++;
    else
      player2Points++;
  }

  public String getTotalScore() {
    String score = "";
    int tempScore=0;
    if (player1Points == player2Points)
    {
      switch (player1Points)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    }
    else if (player1Points >=4 || player2Points >=4)
    {
      int pointDifference = player1Points - player2Points;
      if (pointDifference==1) score ="Advantage player1";
      else if (pointDifference ==-1) score ="Advantage player2";
      else if (pointDifference>=2) score = "Win for player1";
      else score ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)
      {
        if (i==1) tempScore = player1Points;
        else { score+="-"; tempScore = player2Points;}
        switch(tempScore)
        {
          case 0:
            score+="Love";
            break;
          case 1:
            score+="Fifteen";
            break;
          case 2:
            score+="Thirty";
            break;
          case 3:
            score+="Forty";
            break;
        }
      }
    }
    return score;
  }
}