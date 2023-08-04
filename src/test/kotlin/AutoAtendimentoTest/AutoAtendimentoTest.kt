package AutoAtendimentoTest

import AutoAtendimento
import org.mockito.InjectMocks
import org.mockito.junit.jupiter.MockitoExtension
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockitoExtension::class)
class AutoAtendimentoTest {

    @InjectMocks
    private lateinit var autoAtendimento: AutoAtendimento
