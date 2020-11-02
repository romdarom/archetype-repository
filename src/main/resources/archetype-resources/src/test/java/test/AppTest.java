package test.${groupId};



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ${groupId}.application.Service;

@ExtendWith(MockitoExtension.class)
class AppTest {

	@Mock
	Service myServiceUnderTest;

	@Test
	void test() {
		assertThat(true).isTrue();
	}

}
