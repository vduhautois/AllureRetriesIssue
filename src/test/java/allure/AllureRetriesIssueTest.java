package allure;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AllureRetriesIssueTest {
	private static int index = 0;
	@Test
	public void shouldGenerateAFlakyTest() {
		if (index == 0) {
			index++;
			fail("Failure on purpose");
		}
	}
}
