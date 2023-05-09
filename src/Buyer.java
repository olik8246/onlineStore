public class Buyer {
    String nameAndSurname;
    String cardNumber;
    String valid;
    String cvv;
    String pin;

    public Buyer(String nameAndSurname, String cardNumber, String valid, String cvv, String pin) {
        this.nameAndSurname = nameAndSurname;
        this.cardNumber = cardNumber;
        this.valid = valid;
        this.cvv = cvv;
        this.pin = pin;
    }
    void ticket(){
        System.out.println("Покупець:" + nameAndSurname);
        System.out.println("Номер карти:" + cardNumber);
    }
}
