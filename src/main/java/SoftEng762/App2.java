package SoftEng762;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App2 {
    public static void main( String[] args ) throws IOException {
        String pathToImages = "D:\\Uni\\Part4\\Sem2\\SoftEng762\\drawings1\\";

        String file1 = "B907_Consent_tender_dwgs_Page_1.png";
        String file2 = "B907_DevDesign_dwgs_Page_1.png";
        String file3 = "B907_ForConstruction_dwgs_Page_1.png";

        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;

        // Manually configured for now
        int shiftAmountX = 87;
        int shiftAmountY = 0;

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

        BufferedImage newImage1 = new BufferedImage(img1.getWidth()+shiftAmountX, img1.getHeight()+shiftAmountY, img1.getType());
        BufferedImage newImage2 = new BufferedImage(img2.getWidth()+shiftAmountX, img2.getHeight()+shiftAmountY, img2.getType());
        BufferedImage newImage3 = new BufferedImage(img3.getWidth()+shiftAmountX, img3.getHeight()+shiftAmountY, img3.getType());

        Graphics g1 = newImage1.getGraphics();
        Graphics g2 = newImage2.getGraphics();
        Graphics g3 = newImage3.getGraphics();

        g1.setColor(Color.white);
        g1.fillRect(0,0,img1.getWidth()+shiftAmountX, img1.getHeight());
        g1.drawImage(img1, 0, 0, null);
        File outputfile1 = new File(pathToImages + "image1.png");
        ImageIO.write(newImage1, "png", outputfile1);
        g1.dispose();

        g2.setColor(Color.white);
        g2.fillRect(0,0,img2.getWidth()+shiftAmountX, img2.getHeight());
        g2.drawImage(img2, 0, 0, null);
        File outputfile2 = new File(pathToImages + "image2.png");
        ImageIO.write(newImage2, "png", outputfile2);
        g2.dispose();

        // Image to be shifted
        g3.setColor(Color.white);
        g3.fillRect(0,0,img3.getWidth()+shiftAmountX, img3.getHeight());
        g3.drawImage(img3, shiftAmountX, shiftAmountY, null);
        File outputfile3 = new File(pathToImages + "image3.png");
        ImageIO.write(newImage3, "png", outputfile3);
        g3.dispose();

    }
}
