public class Game {


    private String Title;
    private int releaseDate;

    public Game(String Title, int releaseDate) {
        this.Title = Title;
        this.releaseDate = releaseDate;
    }

    public void speak() {
        System.out.println("The Title Is" + this.Title + "And Was Released In" + this.releaseDate);
    }
}
