package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for(int i=1; i<=100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    
    public void move(){
        for(Horse horse : horses){
            horse.move();
        }

    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public Horse getWinner(){
        Horse winner=horses.get(0);

        for(Horse horse : horses){
            if(horse.getDistance() > winner.getDistance()){
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("The winner is " +getWinner().getName()+"!");

    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("A", 3, 0));
        game.getHorses().add(new Horse("B", 3, 0));
        game.getHorses().add(new Horse("C", 3, 0));

        game.run();

        game.printWinner();

    }
}
