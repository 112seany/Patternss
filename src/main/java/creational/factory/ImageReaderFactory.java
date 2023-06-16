package creational.factory;

    public class ImageReaderFactory {

    private ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes type) {

        if(type == null)
        {
            throw new IllegalArgumentException("Unknown image type");
        }

        ImageReader imageReader;

        switch (type) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Unknown image type");
        }

        return imageReader;

    }
}
