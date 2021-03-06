package com.anthony.moneylender.implement;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.ByteArrayOutputStream;
import java.util.Base64;

public class EncoderHelperImplement {

    private static Bitmap imagen;
    private static byte[] decoded,encoder;
    private static Base64.Decoder decoder;
    private static ByteArrayOutputStream baos;



    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String encode(Bitmap str)  {
        baos = new ByteArrayOutputStream();
        str.compress(Bitmap.CompressFormat.JPEG,100,baos);
        encoder = baos.toByteArray();
        String encImage = Base64.getEncoder().encodeToString(encoder);

        return encImage;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static Bitmap decode(String str){
        decoder = Base64.getDecoder();
        decoded = decoder.decode(str);
        imagen = BitmapFactory.decodeByteArray(decoded,0,decoded.length);
        return  imagen;

    }

    }
