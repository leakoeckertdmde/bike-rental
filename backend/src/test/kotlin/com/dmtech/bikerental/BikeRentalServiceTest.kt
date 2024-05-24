import com.dmtech.bikerental.Bike
import com.dmtech.bikerental.BikeRentalApplication
import com.dmtech.bikerental.BikeRentalService
import com.dmtech.bikerental.BikeRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest(classes = [BikeRentalApplication::class])
class BikeRentalServiceTest {

    @MockBean
    private lateinit var bikeRepository: BikeRepository

    private lateinit var bikeRentalService: BikeRentalService

    @BeforeEach
    fun setUp() {
        bikeRentalService = BikeRentalService(bikeRepository)
    }

    @Test
    fun `getAllBikes returns all bikes`() {
        val bikes = listOf(Bike(), Bike())
        `when`(bikeRepository.findAll()).thenReturn(bikes)

        val result = bikeRentalService.getAllBikes()

        assertEquals(bikes, result)
    }
}