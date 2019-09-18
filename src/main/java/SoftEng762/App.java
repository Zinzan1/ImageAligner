package SoftEng762;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String pathToImages = "D:\\Uni\\Part4\\Sem2\\SoftEng762\\drawings1\\";

        String file1 = "B907_Consent_tender_dwgs_Page_1.png";
        String file2 = "B907_DevDesign_dwgs_Page_1.png";
        String file3 = "B907_ForConstruction_dwgs_Page_1.png";

        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;

        try {
            img1 = ImageIO.read(new File(pathToImages + file1));
            img2 = ImageIO.read(new File(pathToImages + file2));
            img3 = ImageIO.read(new File(pathToImages + file3));
        } catch (IOException e) {
        }

        int rgbColour;

        int red;
        int green;
        int blue;
        Color colorAtPixel;
        int colourThreshold = 700;

        int xOffset = 0;
        int yOffset = 0;

        img1loop:   for (int x=70; x<img1.getWidth(); x++) {
            for (int y=70; y<img1.getHeight(); y++) {
                rgbColour = img1.getRGB(x, y);
                colorAtPixel = new Color(rgbColour);

                red = colorAtPixel.getRed();
                green = colorAtPixel.getGreen();
                blue = colorAtPixel.getBlue();

//                System.out.println("Colour values at pixel co-ordinates: " + x + ", " + y);
//                System.out.println("Red: " + red);
//                System.out.println("Green: " + green);
//                System.out.println("Blue: " + blue);
//                System.out.println("");

                if (red+green+blue < colourThreshold) {
                    xOffset = x;
                    yOffset = y;
                    System.out.println(xOffset + ", " + yOffset);
                    break img1loop;
                }
            }
        }

        img2loop: for (int x=70; x<img2.getWidth(); x++) {
            for (int y=70; y<img2.getHeight(); y++) {
                rgbColour = img2.getRGB(x, y);
                colorAtPixel = new Color(rgbColour);

                red = colorAtPixel.getRed();
                green = colorAtPixel.getGreen();
                blue = colorAtPixel.getBlue();

//                System.out.println("Colour values at pixel co-ordinates: " + x + ", " + y);
//                System.out.println("Red: " + red);
//                System.out.println("Green: " + green);
//                System.out.println("Blue: " + blue);
//                System.out.println("");

                if (red+green+blue < colourThreshold) {
                    xOffset = x;
                    yOffset = y;
                    System.out.println(xOffset + ", " + yOffset);
                    break img2loop;
                }
            }
        }

        img3loop: for (int x=70; x<img3.getWidth(); x++) {
            for (int y=70; y<img3.getHeight(); y++) {
                rgbColour = img3.getRGB(x, y);
                colorAtPixel = new Color(rgbColour);

                red = colorAtPixel.getRed();
                green = colorAtPixel.getGreen();
                blue = colorAtPixel.getBlue();

//                System.out.println("Colour values at pixel co-ordinates: " + x + ", " + y);
//                System.out.println("Red: " + red);
//                System.out.println("Green: " + green);
//                System.out.println("Blue: " + blue);
//                System.out.println("");

                if (red+green+blue < colourThreshold) {
                    xOffset = x;
                    yOffset = y;
                    System.out.println(xOffset + ", " + yOffset);
                    break img3loop;
                }
            }
        }
    }
}
