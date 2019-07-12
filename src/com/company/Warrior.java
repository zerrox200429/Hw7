package com.company;
public class Warrior extends Player  implements SuperAbility{
   private  int physicalAttack;


    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    @Override
    public void superAbility() {
        System.out.println("Супер способность");

    }

    @Override
    public void superAbility(String name) {
        System.out.println("Проникновение в разум");


    }
}


