import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTests {

    @Test
    public void itAddsTwoNumbers() throws Exception {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        Integer calculatedValue = calculator.addition(2,2);

        // Assert
        assertThat(calculatedValue).isEqualTo(4);
    }

    @Test
    public void itAddsTwoDifferentNumbers() throws Exception {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        Integer calculatedValue = calculator.addition(3,2);

        // Assert
        assertThat(calculatedValue).isEqualTo(5);
    }

    @Test
    public void itMultipliesTwoNumbers() throws Exception {
        Calculator calculator = new Calculator();

        Integer calculatedValue = calculator.multiply(3, 2);

        assertThat(calculatedValue).isEqualTo(6);
    }

    @Test
    public void multiplyDifferentNumbers() throws Exception {
        Calculator calculator = new Calculator();

        Integer calculatedValue = calculator.multiply(2, 4);

        assertThat(calculatedValue).isEqualTo(8);
    }
}
