public class RockPaperScissors {
    public static void main(String[] args)
    {
        System.out.println("GAME: Rock, Paper, Scissors");
        game("rock", "paper");
    }
    public static void game(String first, String second)
    {
        System.out.format("First player: %s\nSecond player: %s\n", first, second);
        String f = first.toLowerCase();
        String s = second.toLowerCase();
        if(f.equals(s))
            System.out.println("Tie");
        else if(f == "paper" && s == "rock" || f == "rock" && s == "scissors" || f == "scissors" && s == "paper")
            System.out.println("1 player wins");
        else 
            System.out.println("2 player wins");
    }
}