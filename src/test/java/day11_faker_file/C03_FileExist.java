package day11_faker_file;

import com.google.common.io.Files;
import org.junit.Assert;
import org.junit.Test;

public class C03_FileExist {

    @Test
    public void test01() {

        //bana icinde bulundugum projenin dosya yolunu (path) verir
        System.out.println(System.getProperty("user.dir"));


        System.out.println(System.getProperty("user.home"));

      //  "C:\Users\GÜLSÜM AYÇİÇEK\Desktop\Yeni Metin Belgesi.txt"

        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text.txt";
        System.out.println(dosyaYolu);

        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="\\Desktop\\text.txt";

        String masaustuYolu=farkliKisim+ortakKisim;


    }
}
