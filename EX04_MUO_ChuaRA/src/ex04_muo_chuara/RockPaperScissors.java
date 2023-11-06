import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int yourScore = 0;
                int compScore = 0;
                int uhhhh = 0;
                
		while (uhhhh != 3) {
                    System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: ");
                    System.out.println("1. Start game ");
                    System.out.println("2. Change number of rounds ");
                    System.out.println("3. Exit application ");
                    System.out.print("> ");
                    
                    uhhhh = input.nextInt();
                    if (uhhhh == 1) {
                        int random = 0;
                        int yourMove = 0;
                        int result = 4;
                        compScore = 0;
                        yourScore = 0;
                        
                        System.out.println("This match will be first to " + roundsToWin + " wins");
                        while (yourScore < roundsToWin || compScore < roundsToWin) {
                            random = (int) Math.floor(Math.random()*3) + 1;
                            System.out.println("The computer has selected its move. Select your move:");
                            System.out.println("1. Rock");
                            System.out.println("2. Paper");
                            System.out.println("3. Scissors");
                            System.out.print("> ");
                            yourMove = input.nextInt();
                            
                            if (yourMove == 1) {
                                if (random == 1) {
                                    result = rock.compareMoves(rock,rock);
                                } else if (random == 2) {
                                    result = rock.compareMoves(rock,paper);
                                } else if (random == 3) {
                                    result = rock.compareMoves(rock,scissors);
                                }
                            } else if (yourMove == 2) {
                                if (random == 1) {
                                    result = paper.compareMoves(paper,rock);
                                } else if (random == 2) {
                                    result = paper.compareMoves(paper,paper);
                                } else if (random == 3) {
                                    result = paper.compareMoves(paper,scissors);
                                }
                            } else if (yourMove == 3) {
                                if (random == 1) {
                                    result = scissors.compareMoves(scissors,rock);
                                } else if (random == 2) {
                                    result = scissors.compareMoves(scissors,paper);
                                } else if (random == 3) {
                                    result = scissors.compareMoves(scissors,scissors);
                                }
                            } else {
                                System.out.println("Invalid input");
                            }
                            
                            if (result == 0) {
                                yourScore += 1;
                                if (yourMove == 1) {
                                    System.out.println("Player chose Rock, Computer chose Scissors, Player won !!!!!!!!!!!!");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 2) {
                                    System.out.println("Player chose Paper, Computer chose Rock, Player won !!!!!!!!!!!!");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 3) {
                                    System.out.println("Player chose Scissors, Computer chose Paper, Player won !!!!!!!!!!!!");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                }
                            } else if (result == 1) {
                                compScore += 1;
                                if (yourMove == 1) {
                                    System.out.println("Player chose Rock, Computer chose Paper, Computer won :((((((((((");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 2) {
                                    System.out.println("Player chose Paper, Computer chose Scissors, Computer won :((((((((((");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 3) {
                                    System.out.println("Player chose Scissors, Computer chose Rock, Computer won :((((((((((");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                }
                            } else if (result == 2) {
                                if (yourMove == 1) {
                                    System.out.println("Player chose Rock, Computer chose Rock, It's a draw");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 2) {
                                    System.out.println("Player chose Paper, Computer chose Paper, It's a draw");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                } else if (yourMove == 3) {
                                    System.out.println("Player chose Scissors, Computer chose Scissors, It's a draw");
                                    System.out.println("Player - " + yourScore + ", Computer - " + compScore);
                                }
                            } 
                            
                            if (yourScore == roundsToWin) {
                                System.out.println("Player has won the game !!!!!!!!!");
                                break;
                            } else if (compScore == roundsToWin) {
                                System.out.println("Computer has won the game :((((((((((");
                                break;
                            }
                            
                        }
                        
                    } else if (uhhhh == 2) {
                        
                        System.out.println("How many rounds? ");
                        System.out.print("> ");
                        roundsToWin = input.nextInt();
                        
                    } else if (uhhhh == 3) {
                    
                        System.out.println("Bye");
                        break;
                        
                    } else {
                        System.out.println("invawid input");
                    }
                }
	}
}