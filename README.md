# CVReportGeneration_TemplateMethodDesignPattern

This project demonstrates the **Template Method Design Pattern** by creating a structured process for generating reports from various CV formats, such as PDF, Word, and image files. Each report type has its unique data extraction and report generation steps, but they all follow a common sequence of operations.

---

## Table of Contents

1. [Features](#features)
2. [Technologies](#technologies)
3. [Design Pattern Explanation](#design-pattern-explanation)
4. [Usage](#usage)

---

## Features

- **Template Method Design Pattern** implementation for consistent CV report generation.
- Supports different CV formats: **PDF**, **Word**, and **Image**.
- **Extendable design** allows adding new CV types with minimal modifications.

---

## Technologies

- **Language**: Java
- **Pattern**: Template Method Design Pattern

---

## Design Pattern Explanation

The Template Method Design Pattern is utilized to define a skeleton for generating CV reports. While each concrete report generator, such as `PdfCvReportGenerator`, `WordCvReportGenerator`, and `ImageCvReportGenerator`, has distinct ways of extracting data and generating reports, they all follow a common structure laid out in the `CVReportGenerator` abstract class.

### Classes Overview

- **`CVReportGenerator` (Abstract Class)**: Defines the template for generating a CV report.
    - **Steps in the Template**:
        1. **readCVFile**: Reads the CV file.
        2. **extractDataFromCv**: Extracts data (implemented by concrete subclasses).
        3. **analysisExtractData**: Analyzes extracted data.
        4. **generateFinalReport**: Generates the final report (implemented by concrete subclasses).
    - **Concrete Classes**:
        - **`PdfCvReportGenerator`**: Extracts and generates reports for PDF CVs.
        - **`WordCvReportGenerator`**: Extracts and generates reports for Word CVs.
        - **`ImageCvReportGenerator`**: Extracts and generates reports for image-based CVs.

- **Supporting Classes**:
    - **`GeneratedReport`**: Holds the details of the final report, including whether it passed certain criteria.
    - **`ExtractedData`**: Represents data extracted from the CV.
    - **`AnalyzedData`**: Represents data after analysis.

---

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Template Method Design Pattern in action.

### Example Code

Here’s an example code snippet demonstrating the system:

```java
public class Main {
    public static void main(String[] args) {

        // Create a PDF CV report generator
        CVReportGenerator pdfCVReportGenerator = new PdfCvReportGenerator();
        GeneratedReport generatedCVPdfReport = pdfCVReportGenerator.generateCVReport("/temp/cv.pdf");
        System.out.println(generatedCVPdfReport.toString());
        System.out.println("---------------------------------------------------");

        // Create a Word CV report generator
        CVReportGenerator wordCVReportGenerator = new WordCvReportGenerator();
        GeneratedReport generatedWordCvReport = wordCVReportGenerator.generateCVReport("/temp/cv.docx");
        System.out.println(generatedWordCvReport.toString());
        System.out.println("---------------------------------------------------");

        // Create an Image CV report generator
        CVReportGenerator imageCVReportGenerator = new ImageCvReportGenerator();
        GeneratedReport generatedImageCvReport = imageCVReportGenerator.generateCVReport("/temp/cv.png");
        System.out.println(generatedImageCvReport.toString());
    }
}
```

### Expected Output

``` javascript
Reading file from : /temp/cv.pdf
Extracted data from cv file : /temp/cv.pdf
Analysis cv extracted data : Extracted data from cv pdf file
Generated reported about pdf cv : Analysis cv extracted data : Extracted data from cv pdf file
GeneratedReport{generatedReport='Generated reported about pdf cv : Analysis cv extracted data : Extracted data from cv pdf file', isPassed=false}
---------------------------------------------------
Reading file from : /temp/cv.docx
Extracted data from cv file : /temp/cv.docx
Analysis cv extracted data : Extracted data from cv pdf file
Generated reported about word cv : Analysis cv extracted data : Extracted data from cv pdf file
GeneratedReport{generatedReport='Generated reported about word cv : Analysis cv extracted data : Extracted data from cv pdf file', isPassed=true}
---------------------------------------------------
Reading file from : /temp/cv.png
Extracted data from cv file : /temp/cv.png
Analysis cv extracted data : Extracted data from cv pdf file
Generated reported about image cv : Analysis cv extracted data : Extracted data from cv pdf file
GeneratedReport{generatedReport='Generated reported about image cv : Analysis cv extracted data : Extracted data from cv pdf file', isPassed=false}
```
