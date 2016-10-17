package clans.character.nature;

import construction.point.Point;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by inkwizytor89 on 17.10.16.
 */
public class NatureTest {

    public static final double ALMOST_ZERO = 0.001;
    public static final int MIN_REQUIRED_STEPS_COUNT = 1000;
    public static final int MAX_REQUIRED_STEPS_COUNT = 2000;
    public static final double MIN_NATUR_MULTIPLIERT = 0.2;
    public static final double MAX_NATUR_MULTIPLIERT = 1.0;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void moveThinkingTo() throws Exception {
        Nature startNature = new Nature(Nature.PHLEGMATIC);
        Nature endNature = Nature.SPITFIRE;
        int step = 0;

        while (Point.distance(startNature.workedNature, endNature.workedNature) > ALMOST_ZERO) {
            startNature.moveThinkingTo(endNature);
            step++;
        }

        assertTrue(step > MIN_REQUIRED_STEPS_COUNT);
        assertTrue(step < MAX_REQUIRED_STEPS_COUNT);
    }

    @Test
    public void getRandomNature() throws Exception {
        for (int i = 0; i < 100; i++) {
            double value = Nature.getRandomNature(-1.0, 1.0);
            assertTrue(value >= -1.0);
            assertTrue(value <= 1.0);
        }
    }

    @Test
    public void whenPhlegmaticGetSpitfireMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.PHLEGMATIC);
        assertEquals(MIN_NATUR_MULTIPLIERT, startNature.getSpitfireMultiplier(), DELTA);
    }

    @Test
    public void whenSpitfireGetSpitfireMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.SPITFIRE);
        assertEquals(MAX_NATUR_MULTIPLIERT, startNature.getSpitfireMultiplier(), DELTA);
    }


    @Test
    public void whenSanguineGetMelancholicMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.SANGUINE);
        assertEquals(MIN_NATUR_MULTIPLIERT, startNature.getMelancholicMultiplier(), DELTA);
    }

    @Test
    public void whenMelancholicGetMelancholicMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.MELANCHOLIC);
        assertEquals(MAX_NATUR_MULTIPLIERT, startNature.getMelancholicMultiplier(), DELTA);
    }

    @Test
    public void whenSpitfireGetPhlegmaticMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.SPITFIRE);
        assertEquals(MIN_NATUR_MULTIPLIERT, startNature.getPhlegmaticMultiplier(), DELTA);
    }

    @Test
    public void whenPhlegmaticGetPhlegmaticMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.PHLEGMATIC);
        assertEquals(MAX_NATUR_MULTIPLIERT, startNature.getPhlegmaticMultiplier(), DELTA);
    }

    @Test
    public void whenMelancholicGetSanguineMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.MELANCHOLIC);
        assertEquals(MIN_NATUR_MULTIPLIERT, startNature.getSanguineMultiplier(), DELTA);
    }

    @Test
    public void whenSanguineGetSanguineMultiplier_thenGivenHimMinMultiplier() throws Exception {
        Nature startNature = new Nature(Nature.SANGUINE);
        assertEquals(MAX_NATUR_MULTIPLIERT, startNature.getSanguineMultiplier(), DELTA);
    }
}