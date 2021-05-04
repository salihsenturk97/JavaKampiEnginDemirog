public class GamerManager implements GamerService {

    public GamerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    private VerificationService verificationService;
    @Override
    public void add(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
        System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adl� kullan�c� eklendi.");
        }else{
            System.out.println("Kullan�c� Eklenemedi");
        }

    }

    @Override
    public void delete(Gamer gamer) {

        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adl� kullan�c� silindi.");
        }else{
            System.out.println("Kullan�c� Silinemedi");
        }


    }

    @Override
    public void update(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adl� kullan�c� g�ncellendi.");
        }else{
            System.out.println("Kullan�c� G�ncellenemedi");
        }

    }
}