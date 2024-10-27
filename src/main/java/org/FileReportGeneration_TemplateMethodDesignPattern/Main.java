package org.FileReportGeneration_TemplateMethodDesignPattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a pdf cv report generator
        CVReportGenerator pdfCVReportGenerator = new PdfCvReportGenerator();
        GeneratedReport generatedCVPdfReport = pdfCVReportGenerator.generateCVReport("/temp/cv.pdf");
        System.out.println(generatedCVPdfReport.toString());
        System.out.println("---------------------------------------------------");

        // Create a word cv report generator
        CVReportGenerator wordCVReportGenerator = new WordCvReportGenerator();
        GeneratedReport generatedWordCvReport = wordCVReportGenerator.generateCVReport("/temp/cv.docx");
        System.out.println(generatedWordCvReport.toString());
        System.out.println("---------------------------------------------------");

        // Create a image cv report generator
        CVReportGenerator imageCVReportGenerator = new ImageCvReportGenerator();
        GeneratedReport generatedImageCvReport = imageCVReportGenerator.generateCVReport("/temp/cv.png");
        System.out.println(generatedImageCvReport.toString());
    }
}