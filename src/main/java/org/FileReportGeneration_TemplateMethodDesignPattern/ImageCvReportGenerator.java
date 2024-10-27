package org.FileReportGeneration_TemplateMethodDesignPattern;

import java.io.File;

public class ImageCvReportGenerator extends CVReportGenerator{

    @Override
    public ExtractedData extractDataFromCv(File cvFile) {
        System.out.println("Extracted data from cv file : "+cvFile.getAbsolutePath());
        return new ExtractedData("Extracted data from cv pdf file");
    }

    @Override
    protected GeneratedReport generateFinalReport(AnalyzedData analyzedData) {
        System.out.println("Generated reported about image cv : " + analyzedData.analyzedData);
        return new GeneratedReport("Generated reported about image cv : " + analyzedData.analyzedData,false);
    }

}
