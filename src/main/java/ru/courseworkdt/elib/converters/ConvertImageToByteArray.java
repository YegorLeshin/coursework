package ru.courseworkdt.elib.converters;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

//public class ConvertImageToByteArray {
//    public static void main(String[] args) throws IOException {
//        String directory = "";
//        ByteArrayOutputStream baos = new ByteArrayOutputStream(1000);
//        BufferedImage image = ImageIO.read(new File(directory, "imageFile.jpg"));
//
//        // явно указываем расширение файла для простоты реализации
//        ImageIO.write(image, "png", baos);
//        baos.flush();
//
//        String base64String = Base64.encode(baos.toByteArray());
//        baos.close();
//
//        // декодируем полученную строку в массив байт
//        byte[] resByteArray = Base64.decode(base64String);
//
//        // считываем полученный массив в объект BufferedImage
//        BufferedImage resultImage = ImageIO.read(new ByteArrayInputStream(resByteArray));
//
//        // сохраняем объект BufferedImage в виде нового изображения
//        ImageIO.write(resultImage, "jpg", new File(directory,"resultImage.jpg"));
//    }
//}
