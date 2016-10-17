package clans.character.nature;

import construction.point.Point;

import java.util.Random;

public class Nature {

    public static final Nature SPITFIRE = new Nature(0.0, 1.0);
    public static final Nature MELANCHOLIC = new Nature(-1.0, 0.0);
    public static final Nature PHLEGMATIC = new Nature(0.0, -1.0);
    public static final Nature SANGUINE = new Nature(1.0, 0.0);

    private static final Random RANDOM = new Random();
    private static final Double RANGE_MIN = -1.0;
    private static final Double RANGE_MAX = 1.0;
    private static final double TRANSLATION_STEP = 0.005;
    private static final double BASIC_NATURE_MULTIPLIER = 0.2;

    final Point basicNature;
    Point workedNature;

    public Nature() {

        basicNature = new Point(
                getRandomNature(RANGE_MIN, RANGE_MAX) * BASIC_NATURE_MULTIPLIER,
                getRandomNature(RANGE_MIN, RANGE_MAX) * BASIC_NATURE_MULTIPLIER);
        workedNature = new Point(
                getRandomNature(RANGE_MIN, RANGE_MAX),
                getRandomNature(RANGE_MIN, RANGE_MAX));
    }

    Nature(Nature nature) {

        basicNature = new Point(0.0, 0.0);
        workedNature = new Point(nature.workedNature.x, nature.workedNature.y);
    }

    private Nature(double sociality, double fury) {

        basicNature = new Point(0.0, 0.0);
        workedNature = new Point(sociality, fury);
    }

    public void moveThinkingTo(final Nature otherNature) {

        Point translationVector = new Point(
                otherNature.workedNature.x - this.workedNature.x,
                otherNature.workedNature.y - this.workedNature.y);
        this.workedNature.x = this.workedNature.x + 0.1 * translationVector.x;
        this.workedNature.y = this.workedNature.y + TRANSLATION_STEP * translationVector.y;
    }

    static double getRandomNature(double minRange, double maxRange) {

        return minRange + (maxRange - minRange) * RANDOM.nextDouble();
    }

    public double getSpitfireMultiplier() {
        return ((this.workedNature.y + 1) / 2) + basicNature.y;
    }

    public double getMelancholicMultiplier() {
        return ((this.workedNature.x - 1) / -2) - basicNature.x;
    }

    public double getPhlegmaticMultiplier() {
        return ((this.workedNature.y - 1) / -2) - basicNature.y;
    }

    public double getSanguineMultiplier() {
        return ((this.workedNature.x + 1) / 2) + basicNature.x;
    }
}
