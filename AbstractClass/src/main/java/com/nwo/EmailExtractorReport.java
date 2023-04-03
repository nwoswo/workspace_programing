package com.nwo;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {

  public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  @Override
  public Pattern getPattern() {
    return VALID_EMAIL_ADDRESS_REGEX;
  }

  @Override
  public String getReportName() {
    return "Email";
  }
}
