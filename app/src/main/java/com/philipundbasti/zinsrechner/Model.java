package com.philipundbasti.zinsrechner;

public class Model {
    //1:1 Übernahme aus Übungsaufgabe

    /*
     * Singleton-Bereich
     */
    private static Model instance;

    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    /*
     * Model-Bereich
     */
    private double initialCapital;
    private double interestRate;
    private int runningTime;

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
