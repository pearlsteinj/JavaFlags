package com.flags;

import java.io.PrintStream;
import java.util.Map;

class UsagePrinter {
  static void printUsage(Map<String, FlagData> flags, PrintStream out) {
    for (String flagName : flags.keySet()) {
      FlagData flagData = flags.get(flagName);
      out.println(String.format("\t%s\t%s", flagData.getName(), flagData.getDescription()));
    }
  }
}
