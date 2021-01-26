/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;

    }

    public Counter() {
        this.startValue = 0;
    }

    public int value() {

        return this.startValue;
    }

    public void increase() {
        this.startValue += 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.startValue += increaseBy;
        } 

    }

    public void decrease() {
        this.startValue -= 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.startValue -= decreaseBy;
        } else {
            this.startValue = this.startValue;
        }
    }

    int getString() {
        return this.startValue;
    }

}
