package com.company;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLConnectionReader {

    public static void main(String[] args) throws Exception{

//    }
//    public void reader() throws Exception {
        String substringURL;
        List<String> obrazki = new ArrayList<>();
        URL url = new URL("https://www.kwejk.pl/");
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            if (inputLine.contains("load=\"imageLoaded\" src=\"")) {
                System.out.println(inputLine);
            }
//                substringURL = inputLine.substring(57, 57 + 60);
//                substringURL = substringURL.replaceAll("\"" + ">" + "", "");
//                obrazki.add(substringURL);

            Pattern compiledPattern = Pattern.compile("(https?://)?(www\\.)?([a-zA-Z0-9_%]*)\\b\\.[a-z]{2,4}(\\.[a-z]{2})?((/[a-zA-Z0-9_%]*)+)?(\\.[a-z]*)?");
            Matcher matcher = compiledPattern.matcher(inputLine);
            matcher.matches();
            System.out.println(compiledPattern.toString());

            Pattern pattern1 = Pattern.compile("(https?://)?(www\\.)?([a-zA-Z0-9_%]*)\\b\\.[a-z]{2,4}(\\.[a-z]{2})?((/[a-zA-Z0-9_%]*)+)?(\\.[a-z]*)?");
            Matcher matcher1 = pattern1.matcher("Ala ma kota. Kota ma na imie --Zygmunt--. Kot jest czarny.");
            matcher1.matches();

            }

        in.close();
//        for (String o : obrazki) {
//            System.out.println(o);
        }
//return obrazki;
    }

