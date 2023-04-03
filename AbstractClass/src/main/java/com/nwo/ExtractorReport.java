package com.nwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

  public abstract Pattern getPattern();
  public abstract String getReportName();

  private String parse(String path) throws FileNotFoundException {


    String out = "";
    File file = new File(path);
    Scanner scanner = new Scanner(file);
    if(scanner.hasNext()){
      scanner.nextLine();
    }else{
      return "Empty file;";
    }

    while (scanner.hasNext()){
      String nextline = scanner.nextLine();
      Matcher matcher = getPattern().matcher(nextline);

      boolean matches = matcher.matches();
      if(matches) {
        out += nextline + "\n";
      }
    }
    return out.isBlank() ? "Empty file" : out;
  }

  public void prepareAndSendReport(String path) throws FileNotFoundException {
    System.out.println(String.format("starting report %s ...", getReportName()));
    String report = parse(path);
    System.out.println(report);
    System.out.println(String.format("sent report %s....", getReportName()));
  }

}
