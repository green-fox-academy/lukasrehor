public class Plant {
    String plantType;
    String color;
    int needsWaterFrom;
    double absorption;
    double waterLevel;

    public void watering(int waterAmount) {
        this.waterLevel += (waterAmount * absorption);
    }
}