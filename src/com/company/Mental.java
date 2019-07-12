package com.company;

public class Mental extends Player implements SuperAbility {
    private  int mentalAttack;


    public int getMentalAttack() {
        return mentalAttack;
    }

    public void setMentalAttack(int mentalAttack) {
        this.mentalAttack = mentalAttack;
    }

    @Override
    public void superAbility() {
        System.out.println("Супер способность");

    }

    @Override
    public void superAbility(String name) {
        System.out.println("Критический Удар");

    }
}

