public class Prise {
    int processor;
    int hdd;
    int videoCard;
    int ssd;
    int motherBord;
    int corps;
    int ram;
    int cooling;
    int assemble = 500;

    public Prise(int processor, int hdd, int videoCard, int ssd, int motherBord, int corps, int ram, int cooling) {
        this.processor = processor;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.ssd = ssd;
        this.motherBord = motherBord;
        this.corps = corps;
        this.ram = ram;
        this.cooling = cooling;
    }
    void totalPrise(){
        int p;
        p=processor+hdd+videoCard+ssd+motherBord+corps+ram+cooling+assemble;
        System.out.println("Ціна компютера:" + p);
    }
}
