package com.testscenarios;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTemplate {
  @Test
  public void f() {
  }
  @AfterMethod  //Post Test
  public void afterMethod() {
  }

  @BeforeClass //Pre condition
  public void beforeClass() {
  }

  @AfterClass  //Post condition
  public void afterClass() {
  }

}
