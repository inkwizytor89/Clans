package com.prototype.data;

import com.prototype.data.construction.Point;

import java.util.Random;

public class Nature {

    public static final Nature SPITFIRE = new Nature(1.0, 0.0);
    public static final Nature MELANCHOLIC = new Nature(0.0, -1.0);
    public static final Nature PHLEGMATIC = new Nature(-1.0, 0.0);
    public static final Nature SANGUINE = new Nature(0.0, 1.0);

    private static final Random RANDOM = new Random();
    private static final double TRANSLATION_STEP = 0.005;
    private static final double BASIC_NATURE_MULTIPLIER = 0.2;
    private static final double WORKED_NATURE_MULTIPLIER = 0.8;

    final Point basicNature;
    Point workedNature;

    public Nature() {

        basicNature = new Point(
                getRandomNature(-BASIC_NATURE_MULTIPLIER, BASIC_NATURE_MULTIPLIER),
                getRandomNature(-BASIC_NATURE_MULTIPLIER, BASIC_NATURE_MULTIPLIER));
        workedNature = new Point(
                getRandomNature(-WORKED_NATURE_MULTIPLIER, WORKED_NATURE_MULTIPLIER),
                getRandomNature(-WORKED_NATURE_MULTIPLIER, WORKED_NATURE_MULTIPLIER));
    }

    Nature(Nature nature) {

        basicNature = new Point(nature.basicNature.x, nature.basicNature.y);
        workedNature = new Point(nature.workedNature.x, nature.workedNature.y);
    }

    private Nature(double fury, double sociality) {

        if (Math.abs(fury) > 1.0) {
            fury = 0.0;
        }
        if (Math.abs(sociality) > 1.0) {
            sociality = 0.0;
        }

        basicNature = new Point(fury * BASIC_NATURE_MULTIPLIER, sociality * BASIC_NATURE_MULTIPLIER);
        workedNature = new Point(fury * WORKED_NATURE_MULTIPLIER, sociality * WORKED_NATURE_MULTIPLIER);
    }

    public void moveThinkingTo(final Nature otherNature) {

        Point translationVector = new Point(
                otherNature.workedNature.x - this.workedNature.x,
                otherNature.workedNature.y - this.workedNature.y);
        this.workedNature.x = this.workedNature.x + TRANSLATION_STEP * translationVector.x;
        this.workedNature.y = this.workedNature.y + TRANSLATION_STEP * translationVector.y;
    }

    static double getRandomNature(double minRange, double maxRange) {

        return minRange + (maxRange - minRange) * RANDOM.nextDouble();
    }

    public double getSpitfireMultiplier() {
        double beginDirection = 1.0;
        double sumNature = basicNature.x + workedNature.x;
        return Math.abs((sumNature + beginDirection) / 2 * 0.8 + 0.2 * beginDirection);
    }

    public double getMelancholicMultiplier() {
        double beginDirection = -1.0;
        double sumNature = basicNature.y + workedNature.y;
        return Math.abs((sumNature + beginDirection) / 2 * 0.8 + 0.2 * beginDirection);
    }

    public double getPhlegmaticMultiplier() {
        double beginDirection = -1.0;
        double sumNature = basicNature.x + workedNature.x;
        return Math.abs((sumNature + beginDirection) / 2 * 0.8 + 0.2 * beginDirection);
    }

    public double getSanguineMultiplier() {
        double beginDirection = 1.0;
        double sumNature = basicNature.y + workedNature.y;
        return Math.abs((sumNature + beginDirection) / 2 * 0.8 + 0.2 * beginDirection);
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        String nature = "Nature(" + round(basicNature.x + workedNature.x) + ", " + round(basicNature.y + workedNature.y) + ")";
        return nature;
    }
}
