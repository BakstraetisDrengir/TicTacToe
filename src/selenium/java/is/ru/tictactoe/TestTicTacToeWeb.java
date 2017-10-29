package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacToeWeb extends SeleniumTestWrapper {
  
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("TicTacToe", driver.getTitle());
  }

  // Check to see if user input gets into the input field
  @Test
  public void testUserInput() throws Exception {
    driver.get(baseUrl);
    // User input
    WebElement input = driver.findElement(By.id("number"));
    // A number is put into the input field
    input.sendKeys("5");
    Thread.sleep(2000);
    WebElement inField = driver.findElement(By.id("number"));
    String result = inField.getAttribute("value");
  
    assertEquals("5", result);  
  }

  // Check to see if the select button works
  @Test
    public void selectButtonTest() throws Exception {
      driver.get(baseUrl);
      // User input
      WebElement input = driver.findElement(By.id("number"));
      input.sendKeys("9");
      Thread.sleep(2000);
      WebElement button = driver.findElement(By.tagName("button")); 
      button.submit();
      Thread.sleep(2000);
      input = driver.findElement(By.id("number"));
      String inputFormAfterSelect = input.getAttribute("value");
      
      // The expected result is an empty string
      // because after the select button is pressed
      // the input field is cleared.
      String expectedResult = "";
      // Hence if the inputFormAfterSelect is an empty string
      // the button works correctly.
      assertEquals(inputFormAfterSelect, expectedResult);  
  }
}
