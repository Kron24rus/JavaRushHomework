package com.javarush.test.level16.lesson13.bonus01;


import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Александр on 29.07.2015.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes a) {
        if (a == ImageTypes.JPG) return new JpgReader();
        if (a == ImageTypes.BMP) return new BmpReader();
        if (a == ImageTypes.PNG) return new PngReader();
        else
        {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
