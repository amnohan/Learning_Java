public class TshirtBuilder {
    private String newColor;
    private char newSize;

    public TshirtBuilder setNewColor(String newColor) {
        this.newColor = newColor;
        return this;
    }

    public TshirtBuilder setNewSize(char newSize) {
        this.newSize = newSize;
        return this;
    }

    public Tshirt createTshirt() {
        return new Tshirt(newColor, newSize);
    }
}