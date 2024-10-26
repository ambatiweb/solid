package com.solid.principles;

public class InterfaceSegregatePrinciple {
    public static void main(String[] args) {
         new CoffeeMachineImpl().prepareCoffee();
         new TeaMachineImpl().prepareTea();
         new TeaCoffeeMachineImpl().prepareCoffee();
         new TeaCoffeeMachineImpl().prepareTea();
    }
}
interface  ITeaMachine {
    void prepareTea();
}
interface  ICoffeeMachine {
    void prepareCoffee();
}

class CoffeeMachineImpl implements ICoffeeMachine {

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing Coffee.");
    }
}

class TeaMachineImpl implements ITeaMachine {

    @Override
    public void prepareTea() {
        System.out.println("Preparing Tea.");
    }
}

class TeaCoffeeMachineImpl implements ICoffeeMachine, ITeaMachine {

    @Override
    public void prepareTea() {
        System.out.println("Preparing Tea.");
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing Coffee.");
    }
}
