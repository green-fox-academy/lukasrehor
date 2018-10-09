public class Tree extends Plant{
    Tree(String color, double waterLevel) {
        this.plantType = "Tree";
        this.color = color;
        this.needsWaterFrom = 10;
        this.absorption = 0.4;
        this.waterLevel = waterLevel;
    }
}