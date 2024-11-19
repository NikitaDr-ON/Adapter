public class AdapterUSB implements USBInterface{

    private final SdCard sdCard;

    public AdapterUSB(SdCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void readFromUSB() {
        sdCard.readFromSd();
    }
}
