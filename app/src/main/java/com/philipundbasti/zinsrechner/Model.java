package com.philipundbasti.zinsrechner;

public class Model {
    private static Model instance;

    private double initialCapital;
    private double interestRate;
    private int runningTime;

    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public double getInterest() {
        return initialCapital * Math.pow((1 + interestRate / 100), runningTime) - initialCapital;
    }
}
