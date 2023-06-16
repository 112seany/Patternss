package com.creational.factory;

    public class GenerateReader {
        public static void main(String[] args) {
            ImageReader readerJPG = ImageReaderFactory.getImageReader(ImageTypes.JPG);
            readerJPG.read();

            ImageReader readerBMP = ImageReaderFactory.getImageReader(ImageTypes.BMP);
            readerBMP.read();

            ImageReader readerPNG = ImageReaderFactory.getImageReader(ImageTypes.PNG);
            readerPNG.read();

    }
}
