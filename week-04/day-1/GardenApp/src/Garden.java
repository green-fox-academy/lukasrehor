import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> garden;
    Garden() {
        garden = new ArrayList<>();
    }
    void addPlant(Plant plant) {
        this.garden.add(plant);
    }
    void printInfo() {
        for (Plant plant : garden) {
            if (plant.waterLevel < plant.needsWaterFrom) {
                System.out.println("The " + plant.color + " " + plant.plantType + " needs water!");
            } else {
                System.out.println("The " + plant.color + " " + plant.plantType + " doesn't need water.");
            }
        }
        System.out.println();
    }
    void waterPlants(int amount) {
        System.out.println("Watering with " + amount);
        int thirstyPlants = 0;
        for (Plant plant : this.garden) {
            if (plant.waterLevel < plant.needsWaterFrom) {
                thirstyPlants++;
            }
        }
        amount /= thirstyPlants;
        for (Plant plant : this.garden) {
            if (plant.waterLevel < plant.needsWaterFrom) {
                plant.watering(amount);
            }
        }
    }
}