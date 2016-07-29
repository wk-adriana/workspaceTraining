package com.endava.junit.process;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SplitPatternTestCase {

    private SplitPattern splitPattern;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        splitPattern = new SplitPattern();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSplitByLength() {
        List<String> expectedResult = Arrays.asList("medium", "long", "small");
        List<String> result = splitPattern.splitByLength(Arrays.asList("development", "supercalifragilisticexpialidocious", "pie"));
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetStringLengthMediumString() {
        String expectedResult = "medium";
        String result = splitPattern.getStringLength("computer");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetStringLengthSmallString() {
        String expectedResult = "small";
        String result = splitPattern.getStringLength("pug");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetStringLengthLongString() {
        String expectedResult = "long";
        String result = splitPattern.getStringLength("machiavellianism");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetStringLengthNullString() {
        String expectedResult = null;
        String result = splitPattern.getStringLength(null);
        assertEquals(expectedResult, result);
    }
}
