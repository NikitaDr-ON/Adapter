public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SdCard sdCard = new SdCard();
        AdapterUSB adapterUSB = new AdapterUSB(sdCard);
        computer.readFromUSB(adapterUSB);
    }
}