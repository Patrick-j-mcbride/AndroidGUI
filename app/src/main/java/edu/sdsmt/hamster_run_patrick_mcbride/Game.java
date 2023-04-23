package edu.sdsmt.hamster_run_patrick_mcbride;

import android.graphics.Point;

public class Game {

    private static final int MOVE_ENERGY = 1;
    private static final int FOOD_PICK_AMOUNT = 5;
    private static final int ZOOM_MOVE_ENERGY = 2;
    private static final int ZOOM_START_MOVES = 2;
    private static final int EAT_ENERGY = 5;
    private static final int FOOD_PASS_THROUGH_AMOUNT = 2;
    private static final int FOOD_IN_AREA_2_2 = 5;
    private static final int WIN_AMOUNT = 30;
    private static final int MAX_ENERGY = 15;
    private static final int MAX_FOOD_IN_POUCHES = 20;
    private static final int BARS_LIMIT = 5;
    private static final int HEAVY_HAMSTER = 15;

    private int storedFood = 0;
    private int energy = 10;
    private int foodInPouches = 0;
    private int moves = 0;
    private int zoomsLeft = 0;
    private Point playerLocation = new Point(0, 0);

    public void move(int dx, int dy) {
        Point newLocation = new Point(playerLocation.x + dx, playerLocation.y + dy);

        if (newLocation.x < 0 || newLocation.y < 0) {
            return;
        }

        if (newLocation.equals(playerLocation)) {
            return;
        }

        if (newLocation.x == 4 && newLocation.y == 4) {
            storedFood += foodInPouches;
            foodInPouches = 0;
        }

        playerLocation = newLocation;
        moves++;
        energy -= MOVE_ENERGY;
    }

    public void eat() {
        if (foodInPouches > 0) {
            foodInPouches--;
            energy = Math.min(energy + EAT_ENERGY, MAX_ENERGY);
        }
    }

    public void pickup() {
        if (playerLocation.x == 0 && playerLocation.y == 1 && foodInPouches < MAX_FOOD_IN_POUCHES) {
            foodInPouches = Math.min(foodInPouches + FOOD_PICK_AMOUNT, MAX_FOOD_IN_POUCHES);
        }
    }

    public int getHomeStores() {
        return storedFood;
    }

    public int getEnergy() {
        return energy;
    }

    public int getFood() {
        return foodInPouches;
    }

    public int getMoves() {
        return moves;
    }

    public int getZoomsLeft() {
        return zoomsLeft;
    }

    public Point getPlayerLocation() {
        return playerLocation;
    }

    public boolean isLost() {
        return energy <= 0;
    }

    public boolean isWon() {
        return storedFood >= WIN_AMOUNT;
    }
}

