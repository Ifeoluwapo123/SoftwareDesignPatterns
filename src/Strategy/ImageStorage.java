package Strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        //JPEG, PNG, ...
        //B&W, High Contrast

        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
