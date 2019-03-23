package exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    @Test fun reverseStringSB () {
        Assert.assertEquals("bs niltok", reverseStringSB("kotlin sb"))
    }

    @Test fun reverseStringLoop() {
        Assert.assertEquals("pool niltok", reverseStringLoop("kotlin loop"))
    }
}