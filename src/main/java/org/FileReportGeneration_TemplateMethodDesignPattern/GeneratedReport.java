package org.FileReportGeneration_TemplateMethodDesignPattern;


public class GeneratedReport {
    String generatedReport;
    boolean isPassed;

    public GeneratedReport(String generatedReport, boolean isPassed) {
        this.generatedReport = generatedReport;
        this.isPassed = isPassed;
    }

    @Override
    public String toString() {
        return "GeneratedReport{" +
                "generatedReport='" + generatedReport + '\'' +
                ", isPassed=" + isPassed +
                '}';
    }
}