package test

import main.Tortoise
import org.junit.Test

class TortoiseTest {
    @Test
    void "Basic Tests"() {
        assert [0, 32, 18] == Tortoise.race(720, 850, 70)
        assert [3, 21, 49] == Tortoise.race(80, 91, 37)
        assert null == Tortoise.race(820, 81, 550)
    }
}
