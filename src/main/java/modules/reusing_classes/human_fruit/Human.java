package modules.reusing_classes.human_fruit;

public class Human {

    public static int max_energy = 100;
    public static int work_rate = 10;

    private String firstName;
    private String lastName;

    private int energy;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        energy = 50;
    }

    public void eat(Fruit fruit){

        if(fruit.getEnergy() + energy < max_energy) {
            energy += fruit.getEnergy();
        }else {
            energy = 100;
            System.out.println("We are full of energy :)");
        }

    }

    public void work(int hours){

        int expendedEnergy = work_rate * hours;

        if(energy - expendedEnergy >= 0) {
            energy = energy - expendedEnergy;
        }else{
            System.out.println("Not enough energy. Try eating something.");
        }

    }

    public int getEnergy() {
        return energy;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
