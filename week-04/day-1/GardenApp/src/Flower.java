public class Flower extends Plant {
    Flower(String color, double waterLevel) {
        this.plantType = "Flower";
        this.color = color;
        this.needsWaterFrom = 5;
        this.absorption = 0.75;
        this.waterLevel = waterLevel;
    }
}