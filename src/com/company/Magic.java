package com.company;

public class Magic extends Player implements SuperAbility {
    private  int magicalAttack;


    public int getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(int magicalAttack) {
        this.magicalAttack = magicalAttack;
    }

    @Override
    public void superAbility() {
        System.out.println("Супер способность");

    }

    @Override
    public void superAbility(String name) {
        System.out.println("Магическая Атака");


    }
}

