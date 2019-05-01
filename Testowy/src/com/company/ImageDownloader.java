package com.company;

import sun.net.www.content.image.png;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import java.net.URL;

public class ImageDownloader
{


    public static void main(String[] args) throws Exception {




    {
        BufferedImage image =null;


        URL url =new URL("https://kwejk.pl/obrazek/3375853/rosja-to-nie-kraj.html"   );
                    // read the url
                    image = ImageIO.read(url);

           // for png
            ImageIO.write(image, "png",new File("/tmp/have_a_question.png"));

            // for jpg
            ImageIO.write(image, "jpg",new File("/tmp/have_a_question.jpg"));


        }
    }}