import io.qameta.allure.kotlin.junit4.AllureRunner
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureRunner::class)
class MyTest {
    @Test
    fun testSum() {
        assertEquals(4, sum(2,2))
    }
}