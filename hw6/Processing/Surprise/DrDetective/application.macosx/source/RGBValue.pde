// class for storing a pixel's RGB color values
// used to simplify processing RGB values
public class RGBValue {
    private float r;
    private float g;
    private float b;
    private color Color;
    
    public RGBValue(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.Color = color(r,g,b);
    }
    
    public float getR() {
        return this.r;
    }
    
    public float getG() {
        return this.g;
    }
    
    public float getB() {
        return this.b;
    }
    
    public color getColor() {
        return this.Color;
    }
}