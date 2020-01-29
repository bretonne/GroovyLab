import org.junit.Test
import Kata1

class Kata1Test {
    @Test
    void "Example Tests"() {
        assert Kata1.arrayDiff([1,2], [1]) == [2]
        assert Kata1.arrayDiff([1,2,2], [1]) == [2,2]
        assert Kata1.arrayDiff([1,2,2], [2]) == [1]
        assert Kata1.arrayDiff([1,2,2], []) == [1,2,2]
        assert Kata1.arrayDiff([], [1,2]) == []
    }
}
