package com.endava.junit.process;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ProcessPatternTestCase {

    private ProcessPattern processPattern;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        processPattern = new ProcessPattern();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGeneratePositionWithMiddleGradeAndAgeThree() {
        String expectedResult = "Developer 2";
        String result = processPattern.generatePosition("middle", 3);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithJuniorGradeAndAgeThree() {
        String expectedResult = "Junior Developer";
        String result = processPattern.generatePosition("junior", 3);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithMiddleGradeAndAgeOne() {
        String expectedResult = "Developer 1";
        String result = processPattern.generatePosition("middle", 1);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithSeniorGradeAndAgeLessThenFive() {
        String expectedResult = "Senior 1";
        String result = processPattern.generatePosition("senior", 1);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithSeniorGradeAndAgeGreaterThenFive() {
        String expectedResult = "Senior 2";
        String result = processPattern.generatePosition("senior", 8);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithBadGradeAndAgeGreaterThenFive() {
        String expectedResult = "Unknown Position";
        String result = processPattern.generatePosition("graduate", 8);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithBadGradeAndAgeZero() {
        String expectedResult = null;
        String result = processPattern.generatePosition("graduate", 0);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGeneratePositionWithNullGradeAndAgeZero() {
        String expectedResult = null;
        String result = processPattern.generatePosition(null, 0);
        assertEquals(expectedResult, result);
    }
}
