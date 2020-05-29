package modules.reusing_classes.human_fruit;

public class Fruit {
    String type;
    int energy;

    public Fruit(String type, int energy){
        this.type = type;
        this.energy = energy;
    }

    String getType(){
        return type;
    }
    int getEnergy(){
        return energy;
    }
}
