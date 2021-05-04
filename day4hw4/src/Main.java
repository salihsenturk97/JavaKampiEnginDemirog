import java.util.Date;
public class Main {

	public static void main(String[] args) {
	
		Gamer gamer1 = new Gamer("41965640702","Salih", "Þentürk",new Date(1997,1,31)); // EKLENECEK SÝLÝNECEK GÜNCELLENECEK

		Gamer gamer2 = new Gamer("12345678911","Engin", "Demiroð",new Date(1996,5,8));  // HATA VERECEK ÇÜNKÜ TC YANLIÞ

		GamerManager gamerManager = new GamerManager(new VerificationManager());

	//	gamerManager.add(gamer1);
	//	gamerManager.delete(gamer1);
	//	gamerManager.update(gamer1);
		
		Gamer[] gamers = { gamer1, gamer2 };	
		
		
		for (Gamer gamer : gamers ) {
			
			gamerManager.add(gamer);
			gamerManager.delete(gamer);
			gamerManager.update(gamer);
			
		}					

		Game game1 = new Game();
		game1.setGameName("Counter Strike");
		game1.setGamePrice(1000);
		game1.setId(1);
		game1.setRentPrice(100);

		BuyRentService buyRentService1 = new BuyRentManager();

		buyRentService1.Buy(gamer1, game1);
		buyRentService1.Rent(gamer2, game1);	

		CampaignService campaignService = new CampaignManager();

		campaignService.login(game1);
		campaignService.delete(game1);
		campaignService.update(game1);
	}
}