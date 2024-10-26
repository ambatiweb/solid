package com.solid.principles;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Machine coffee = new CoffeeMachine();
        coffee.prepareDrink();
        Machine tea = new TeaMachine();
        tea.addMilk();
        tea.prepareDrink();
    }
}
// Machine -> Prepare Tea and Coffee

abstract class Machine {
    public abstract void prepareDrink();
    public void addMilk(){
        System.out.println("Adding Milk..!");
    }
}

class CoffeeMachine extends Machine {

    @Override
    public void prepareDrink() {
        System.out.println("Coffee has been prepared.");
    }
}

class TeaMachine extends  Machine {

    @Override
    public void prepareDrink() {
        System.out.println("Tea has been prepared.");
    }
}
