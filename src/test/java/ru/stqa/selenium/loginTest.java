package ru.stqa.selenium;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class loginTest extends TestNgTestBase{

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/?gfe_rd=cr&ei=NuGHV9SHKKS16ATYmaDwCg&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("что-то");
    driver.findElement(By.cssSelector("img[alt=\"Google\"]")).click();
    driver.findElement(By.name("btnI")).click();
  }
}