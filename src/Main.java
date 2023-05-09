
public class Main {
    public static void main(String[] args) {
        Ps ps = new Ps("", "", "", "", "", "", "", "");
        Prise prise = new Prise(12, 21, 38, 384, 38, 684, 651, 666);
        Buyer buyer = new Buyer("Хома Олег", "4441 1144 2659 4881", "12/29", "777", "0001");

        buyer.ticket();
        prise.totalPrise();
     }
    }
