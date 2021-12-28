package com.flags.testing;

import com.flags.Flag;
import com.flags.FlagDesc;

public class FlagTestClass {
  @SuppressWarnings("unused")
  @FlagDesc(name = "string_test_flag", description = "A flag description")
  public static final Flag<String> stringTestFlag = Flag.create("default value");

  public class ClassWithoutFlags {}
}
