package com.felight.myapp;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.font.PDSimpleFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.tools.TextToPDF;

import java.io.BufferedReader;
import java.io.*;

public class PdfDemo {

    public static void main(String[] args) throws IOException {
            PdfManager pdfManager = new PdfManager();
            pdfManager.textFiletoPdf("yoyo.txt", "yoyo.pdf");
    }
}
