
public class TennisGame2 implements TennisGame
{
  private int player1Points = 0;
  private int player2Points = 0;

  private String player1Score = "";
  private String player2Score = "";
  private String totalScore = "";
  private String player1Name;
  private String player2Name;

  public TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getTotalScore(){
    if (player1Points == player2Points && player1Points < 4)
    {
      if (player1Points ==0)
        player1Score = "Love";
      if (player1Points ==1)
        player1Score = "Fifteen";
      if (player1Points ==2)
        player1Score = "Thirty";
      if (player1Points ==3)
        player1Score = "Forty";
      totalScore = player1Score + "-All";
    }
    if (player1Points == player2Points && player1Points >3)
      totalScore = "Deuce";

    if (player1Points > 0 && player2Points ==0)
    {
      if (player1Points ==1)
        player1Score = "Fifteen";
      if (player1Points ==2)
        player1Score = "Thirty";
      if (player1Points ==3)
        player1Score = "Forty";

      totalScore = player1Score + "-Love";
    }
    if (player2Points > 0 && player1Points ==0)
    {
      if (player2Points ==1)
        player2Score = "Fifteen";
      if (player2Points ==2)
        player2Score = "Thirty";
      if (player2Points ==3)
        player2Score = "Forty";

      totalScore = "Love-" + player2Score;
    }

    if (player1Points > player2Points && player1Points < 4)
    {
      if (player1Points ==2)
        player1Score ="Thirty";
      if (player1Points ==3)
        player1Score ="Forty";
      if (player2Points ==1)
        player2Score ="Fifteen";
      if (player2Points ==2)
        player2Score ="Thirty";
      totalScore = player1Score + "-" + player2Score;
    }
    if (player2Points > player1Points && player2Points < 4)
    {
      if (player2Points ==2)
        player2Score ="Thirty";
      if (player2Points ==3)
        player2Score ="Forty";
      if (player1Points ==1)
        player1Score ="Fifteen";
      if (player1Points ==2)
        player1Score ="Thirty";
      totalScore = player1Score + "-" + player2Score;
    }

    if (player1Points > player2Points && player2Points >= 3)
    {
      totalScore = "Advantage player1";
    }

    if (player2Points > player1Points && player1Points >= 3)
    {
      totalScore = "Advantage player2";
    }

    if (player1Points >=4 && player2Points >=0 && (player1Points - player2Points)>=2)
    {
      totalScore = "Win for player1";
    }
    if (player2Points >=4 && player1Points >=0 && (player2Points - player1Points)>=2)
    {
      totalScore = "Win for player2";
    }
    return totalScore;
  }

  public void setPlayer1Points(int number){

    for (int i = 0; i < number; i++)
    {
      pointForPlayer1();
    }

  }

  public void setPlayer2Points(int number){

    for (int i = 0; i < number; i++)
    {
      pointForPlayer2();
    }

  }

  public void pointForPlayer1(){
    player1Points++;
  }

  public void pointForPlayer2(){
    player2Points++;
  }

  public void wonPoint(String playerName) {
    if (playerName == player1Name)
      pointForPlayer1();
    else
      pointForPlayer2();
  }
}