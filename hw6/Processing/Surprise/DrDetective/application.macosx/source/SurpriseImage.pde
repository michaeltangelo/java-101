// image class for processing background image
class SurpriseImage {
    // declare PImage img
    PImage img;
    // constructs PImage based on String constructor (received from main app)
    public SurpriseImage(String imageName) {
        img = loadImage(imageName);
    }
    // receives x and y coordinate and returns RGBValue in a color object
    public color getBGColorAtPos(int x, int y) {
        int pixelLoc = x + y*width;
        int pixelData = img.pixels[pixelLoc];
        RGBValue rgb = new RGBValue(red(pixelData), green(pixelData), blue(pixelData));
        return rgb.getColor();
   }
}