package com.booleanuk.medium;

import java.util.HashMap;

/**
 * There are three towers: the Towers of Hanoi. View the link below for a visual.
 * https://www.mathsisfun.com/games/towerofhanoi.html
 *
 * Given a number of discs, calculate the minimum amount of steps required to complete the game.
 * E.g.
 * 3 discs -> 7 steps
 *
 * Note: 1 disc can be changed per move and the amount of discs is always a positive number
 */
public class TowersOfHanoi {
    public int solution(int discs) {

        return ((int) Math.pow(2, discs) - 1);
    }
}
