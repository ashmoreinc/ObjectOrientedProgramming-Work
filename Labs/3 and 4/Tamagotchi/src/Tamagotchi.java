public class Tamagotchi {
    private int hunger;
    private int happiness;
    private int fatigue;
    private int cleanliness;

    public Tamagotchi() {
        this.hunger = 0;
        this.happiness = 10;
        this.fatigue = 0;
        this.cleanliness = 10;
    }

    public void feed(){
        hunger += 5;
        if (hunger > 10) hunger = 10;
    }

    public void walk (){
        happiness += 3;
        fatigue += 2;

        if (happiness > 10) happiness = 10;
        if (fatigue > 10) fatigue = 10;
    }

    public void pet (){
        happiness += 5;
        if (happiness > 10) happiness = 10;
    }

    public void clean(){
        cleanliness = 10;
    }

    public void passTime(){
        if (hunger < 10) {
            hunger ++;
        }

        if (cleanliness > 0) {
            cleanliness--;
        }

        if (fatigue == 10) {
            fatigue = 0;
        } else {
             fatigue++;
        }

        if (hunger >= 7) {
            decreaseHappiness();
        }

        if (cleanliness < 3){
            decreaseHappiness();
        }
    }

    public String getMood(){
        if (fatigue == 10) return "Asleep";
        else if (fatigue >= 8) return "Tired";
        else if (hunger >= 7) return "Hungry";
        else if (cleanliness < 3) return "Dirty";
        else if (happiness >= 8) return "Happy";
        else if (happiness >= 4) return "Okay";
        else return "Sad";
    }

    private void decreaseHappiness(){
        if(happiness > 0){
            happiness--;
        }
    }
}
