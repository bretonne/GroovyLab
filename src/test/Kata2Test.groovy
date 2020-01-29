import org.junit.Test

class Kata2Test {
    @Test
    void "Sample Tests" () {
        assert Kata2.spinWords("Hi") == "Hi"
        assert Kata2.spinWords("Welcome") == "emocleW"
    }
}