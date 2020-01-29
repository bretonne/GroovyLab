package test

import main.Pyramid
import org.junit.Test

class PyramidTest {
    @Test
    void "Sample Tests" () {
        assert Pyramid.pyramid(0) == []
        assert Pyramid.pyramid(1) == [[1]]
        assert Pyramid.pyramid(2) == [[1], [1, 1]]
    }
}
