package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("---- Fiyat Listesi ----");
        Car c200 = getMercedesC200();
        System.out.println(c200.model + " " + c200.getFiyat());
        Car c180 = getMercedesC180();
        System.out.println(c180.getFiyat() + " " + c180.yakit);

        Car mercedes=new Car();
        mercedes.marka="mercedes";
        mercedes.model="GLA";
        mercedes.setVites("oto");
        mercedes.yakit="diesel";
        System.out.println("Markası: "+ mercedes.marka+ " \nModeli: "+mercedes.model+ " \nVites: "+mercedes.getVites()+"\nYakit: "+mercedes.yakit);
        Satis GLB=new Satis();
        mercedes.marka="mercedes";
        mercedes.setFiyat(300000);
        mercedes.model="GLB";
        mercedes.setKm(0);
        GLB.adet=5;
        System.out.println("Markası: "+mercedes.marka+"\nModel: "+mercedes.model+"\nFiyat: "+mercedes.getFiyat()+"\nKm: "+mercedes.getkm());
        GLB.toplam= GLB.adet* mercedes.getFiyat();
        System.out.println("Toplam Satış Tutarı: "+ GLB.toplam);
        System.out.println("Şirket ismi: "+mercedes.getSirket());

        B180 B200=new B180();
        mercedes.model="B180";
        mercedes.setFiyat(50000);
        mercedes.setKm(13000);
        System.out.println("Model: "+mercedes.model+"\nFiyat: "+mercedes.getFiyat()+"\nKm: "+mercedes.getkm());
        Satis B180=new Satis();
        B180.adet=10;
        B180.toplam=B180.adet*mercedes.getFiyat();
        System.out.println("Toplam Satış Tutarı: "+B180.toplam);
        B200.goster();

    }


    public static Car getMercedesC200() {
        Car mercedes = new Car();
        mercedes.setFiyat(10000) ;
        mercedes.marka = "merdeces";
        mercedes.model = "c200";
        mercedes.yakit = "diesel";
        return mercedes;
    }

    public static Car getMercedesC180() {
        Car mercedes = new Car();
        mercedes.setFiyat(9000);
        mercedes.marka = "merdeces";
        mercedes.model = "c180";
        mercedes.yakit = "benzin";
        return mercedes;
    }




        public static Car getMercedesGla() {
            Car mercedes = new Car();


return mercedes;
        }


}