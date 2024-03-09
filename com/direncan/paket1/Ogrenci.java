package com.direncan.paket1;

import com.direncan.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci { /* Interfacei implement ettik fakat hata aldık. Çünkü Interface başka bir paket olan
                                                 paket2'nin içerisinde. O yüzden paket2 içerisindeki AdayOgrenciyi bu classta import
                                                 ediyoruz. Import ettik. Yine de hata aldık.
                                                 Bu seferde Interface içerisinde yer alan metodu implement etmemiz gerekti.
                                                 onu da yaptık. */  //  3
    @Override
    public void ders_calis() {  // Interface içerisindeki metodu implement ettik. Hata ortadan kalktı. // 4
        System.out.println("Ders çalışıyorum...");

    }



}
