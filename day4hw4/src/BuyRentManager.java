public class BuyRentManager implements BuyRentService{
    @Override
    public void Buy(Gamer gamer,Game game) {
        System.out.println("Merhaba " + gamer.getFirstName() + " , Oyun ba�ar�yla sat�n al�nd� : " +game.getGameName() );
    }

    @Override
    public void Rent(Gamer gamer,Game game) {
    	System.out.println("Merhaba " + gamer.getFirstName() + " , Oyun ba�ar�yla sat�n al�nd� : " +game.getGameName() );
    }
}