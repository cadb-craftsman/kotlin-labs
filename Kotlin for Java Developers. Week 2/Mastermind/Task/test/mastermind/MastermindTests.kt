package mastermind

import org.junit.Assert
import org.junit.Test

class MastermindTests {

    private fun testEvaluation(secret: String, guess: String, positions: Int, letters: Int) {
        val expected = Evaluation(positions, letters)
        val evaluation = evaluateGuess(secret, guess)
        Assert.assertEquals("Wrong evaluation for secret=$secret, guess=$guess",
                expected, evaluation)
    }

    // simple
    @Test
    fun testEqual() = testEvaluation("ABCD", "ABCD", 4, 0)

    @Test
    fun testOnlyWrongPositions() = testEvaluation("DCBA", "ABCD", 0, 4)

    @Test
    fun testSwap() = testEvaluation("ABCD", "ABDC", 2, 2)

    @Test
    fun testRightPositions() = testEvaluation("ABCD", "ABCF", 3, 0)

    @Test
    fun testWrongPositions() = testEvaluation("DAEF", "FECA", 0, 3)

    // repeated letters
    @Test
    fun testRightPosition() = testEvaluation("AABC", "ADFE", 1, 0)

    @Test
    fun testCourseraPosition() = testEvaluation("ACEB", "BCDF", 1, 1)

    @Test
    fun testCoursera2Position() = testEvaluation("FBAE", "CBAE", 3, 0)

    @Test
    fun testCoursera3Position() = testEvaluation("FBAE", "ABCD", 1, 1)

    @Test
    fun testCoursera4Position() = testEvaluation("FBAE", "CBFE", 2, 1)

}