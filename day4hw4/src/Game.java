public class Game {

    private int id;
    private String gameName;
    private int gamePrice;
    private int rentPrice;


    public Game(){

    }


    public Game(int id, int gamePrice, int rentPrice,String gameName) {
        this.id = id;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.rentPrice = rentPrice;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }



}