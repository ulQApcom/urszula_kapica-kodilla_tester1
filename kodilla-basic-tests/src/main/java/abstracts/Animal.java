package abstracts;

public abstract class Animal {
    private int numberOfLegs = 4;

    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public abstract void giveVoice();
    }
