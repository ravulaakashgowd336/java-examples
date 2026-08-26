package com.abstraction;

abstract class GameCharacter {

 // Common properties
 protected String name;
 protected int level;
 protected int healthPoints;

 // Constructor
 GameCharacter(String name, int level, int healthPoints) {
     this.name = name;
     this.level = level;
     this.healthPoints = healthPoints;
 }

 // Abstract method
 abstract void attack();

 // Concrete method
 void chooseTarget() {
     System.out.println("Target selected.");
 }

 // Concrete method
 void animateAttack() {
     System.out.println("Attack animation played.");
 }
}

//Warrior class
class Warrior extends GameCharacter {

 private String weaponType;

 Warrior(String name, int level, int healthPoints, String weaponType) {
     super(name, level, healthPoints);
     this.weaponType = weaponType;
 }

 @Override
 void attack() {
     System.out.println("Performing melee attack with " + weaponType + ".");
 }
}

//Mage class
class Mage extends GameCharacter {

 private String spellType;

 Mage(String name, int level, int healthPoints, String spellType) {
     super(name, level, healthPoints);
     this.spellType = spellType;
 }

 @Override
 void attack() {
     System.out.println("Casting spell: " + spellType + ".");
 }
}

//Archer class
class Archer extends GameCharacter {

 private String arrowType;

 Archer(String name, int level, int healthPoints, String arrowType) {
     super(name, level, healthPoints);
     this.arrowType = arrowType;
 }

 @Override
 void attack() {
     System.out.println("Shooting arrow: " + arrowType + ".");
 }
}

//Main class
public class Example2 {
 public static void main(String[] args) {

     GameCharacter warrior =
             new Warrior("Conan", 5, 100, "Sword");

     GameCharacter mage =
             new Mage("Gandalf", 7, 120, "Fireball");

     GameCharacter archer =
             new Archer("Legolas", 8, 110, "Elven Arrow");

     // Warrior
     warrior.attack();
     warrior.chooseTarget();
     warrior.animateAttack();

     System.out.println();

     // Mage
     mage.attack();
     mage.chooseTarget();
     mage.animateAttack();

     System.out.println();

     // Archer
     archer.attack();
     archer.chooseTarget();
     archer.animateAttack();
 }
}
