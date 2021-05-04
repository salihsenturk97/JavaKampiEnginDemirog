public class CampaignManager implements CampaignService{
    @Override
    public void login(Game game) {
        System.out.println("Kampanyaya giriþiniz yapýldý : " + game.getGameName()+ " : "+game.getGamePrice() / 10 +" TL");

    }

    @Override
    public void delete(Game game) {
        System.out.println("Kampanya silindi : " + game.getGameName()+" : "+game.getGamePrice()+"" +" TL");

    }

    @Override
    public void update(Game game) {
        System.out.println("Kampanya güncellendi : " + game.getGameName()+ " : "+game.getGamePrice() / 15 +" TL");
    }
}