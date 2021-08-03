package Strategy;

public class main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();

        imageStorage.store("a",new PngCompressor(), new BandWFilter());
        imageStorage.store("b",new JpegCompressor(), new BandWFilter());
    }

}
