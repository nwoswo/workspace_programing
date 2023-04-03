package com.nwo;
import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {

  private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

  @Override
  public Pattern getPattern() {
    return PATTERN;
  }

  @Override
  public String getReportName() {
    return "PhoneNumbers";
  }

}
