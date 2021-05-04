public class GamerManager implements GamerService {

    public GamerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    private VerificationService verificationService;
    @Override
    public void add(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
        System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlý kullanýcý eklendi.");
        }else{
            System.out.println("Kullanýcý Eklenemedi");
        }

    }

    @Override
    public void delete(Gamer gamer) {

        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlý kullanýcý silindi.");
        }else{
            System.out.println("Kullanýcý Silinemedi");
        }


    }

    @Override
    public void update(Gamer gamer) {
        if (verificationService.Verification(gamer) ==true){
            System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adlý kullanýcý güncellendi.");
        }else{
            System.out.println("Kullanýcý Güncellenemedi");
        }

    }
}