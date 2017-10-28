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

  /*@Test
  public void testSimpleAdd() throws Exception {
    driver.get(baseUrl);
    Thread.sleep(2001);
    WebElement input = driver.findElement(By.id("number"));
    input.sendKeys("1");
    //input.sendKeys(Keys.RETURN);
    Thread.sleep(2000);
  }*/
}
