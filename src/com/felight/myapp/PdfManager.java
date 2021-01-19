package com.felight.myapp;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.font.PDSimpleFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.tools.TextToPDF;

import java.io.*;

public class PdfManager {

    public boolean textFiletoPdf(String source, String destination) throws FileNotFoundException, IOException {
        TextToPDF pdf = new TextToPDF();
        //String fileName = "test.txt";
        File pdfFile = new File(destination);

        BufferedReader reader = new BufferedReader(new FileReader(source));

        PDSimpleFont courier = PDType1Font.COURIER;
        PDDocument document = new PDDocument();
        //PDSimpleFont testFont = PDTrueTypeFont.loadTTF( document, new File("times.ttf" ));

        ///pdf.setFont(testFont);
        pdf.setFontSize(8);

        pdf.createPDFFromText(document, reader);

        document.save(pdfFile);
        document.close();
        return true;
    }
}
