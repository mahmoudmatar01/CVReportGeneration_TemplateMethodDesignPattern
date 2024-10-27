package org.FileReportGeneration_TemplateMethodDesignPattern;

import java.io.File;

public class PdfCvReportGenerator extends CVReportGenerator{

    @Override
    public ExtractedData extractDataFromCv(File cvFile) {
        System.out.println("Extracted data from cv file : "+cvFile.getAbsolutePath());
        return new ExtractedData("Extracted data from cv pdf file");
    }

    @Override
    protected GeneratedReport generateFinalReport(AnalyzedData analyzedData) {
        System.out.println("Generated reported about pdf cv : " + analyzedData.analyzedData);
        return new GeneratedReport("Generated reported about pdf cv : " + analyzedData.analyzedData,false);
    }
}
