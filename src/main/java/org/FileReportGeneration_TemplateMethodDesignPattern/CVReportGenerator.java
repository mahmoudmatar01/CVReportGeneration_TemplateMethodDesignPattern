package org.FileReportGeneration_TemplateMethodDesignPattern;

import java.io.File;

public abstract class CVReportGenerator {

    protected abstract ExtractedData extractDataFromCv(File cvFile);
    protected abstract GeneratedReport generateFinalReport(AnalyzedData analyzedData);

    // Same template implementation for all concrete classes
    private File readCVFile(String cvFilePath) {
        System.out.println("Reading file from : "+cvFilePath);
        return new File(cvFilePath);
    }

    private AnalyzedData analysisExtractData(ExtractedData extractedData) {
        System.out.println("Analysis cv extracted data : "+extractedData.extractedData);
        return new AnalyzedData("Analysis cv extracted data : "+extractedData.extractedData);
    }

    public GeneratedReport generateCVReport(String cvFilePath){
        File cvFile = readCVFile(cvFilePath);
        ExtractedData extractDataFromCv= extractDataFromCv(cvFile);
        AnalyzedData analyzedData = analysisExtractData(extractDataFromCv);
        return generateFinalReport(analyzedData);
    }

}
