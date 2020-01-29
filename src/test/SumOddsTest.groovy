import org.junit.Test
import SumOdds;

class SumOddsTest {

    @Test
    void basicTests() {
        assert SumOdds.rowSumOddNumbers(1) == 1
        assert SumOdds.rowSumOddNumbers(2) == 8
        assert SumOdds.rowSumOddNumbers(13) == 2197
        assert SumOdds.rowSumOddNumbers(19) == 6859
        assert SumOdds.rowSumOddNumbers(41) == 68921
        assert SumOdds.rowSumOddNumbers(42) == 74088
        assert SumOdds.rowSumOddNumbers(74) == 405224
        assert SumOdds.rowSumOddNumbers(86) == 636056
        assert SumOdds.rowSumOddNumbers(93) == 804357
        assert SumOdds.rowSumOddNumbers(101) == 1030301
    }
}
