import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class HandlerTest {
    private val handler = Handler()

    private val context = Mockito.mock(Context::class.java)

    @Test
    fun `should success`() {
        val input = APIGatewayProxyRequestEvent()

        val response = handler.handleRequest(input, context)

        assertEquals(200, response.statusCode)

        assertEquals("Hello, World!", response.body)
    }
}