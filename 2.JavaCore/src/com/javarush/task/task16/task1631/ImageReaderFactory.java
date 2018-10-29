package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes istype) {

        if (istype == ImageTypes.BMP ) {
            return new BmpReader();
        }else if(istype == ImageTypes.JPG){
            return new JpgReader();
        }else if (istype == ImageTypes.PNG){
            return new PngReader();
        }else throw new IllegalArgumentException(String.format("Неизвестный тип картинки"));

    }
}
