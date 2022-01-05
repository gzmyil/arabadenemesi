package com.company;

public class Car implements Home {
    public String marka;
    public String model;
    private String vites;
    public String yakit;
    private int fiyat;
    private int km;

    Car(){
    }

    Car(String marka, String model, String vites, String yakit,int fiyat, int km){
        this.marka=marka;
        this.model=model;
        this.vites=vites;
        this.yakit=yakit;
        this.getFiyat();


        }
        public int getkm(){
        return km;
        }
        public void setKm(int km){
        this.km=km;
        }

        public String getVites(){
        return vites;
        }
        public void setVites(String vites){
        this.vites=vites;
        }

    public int getFiyat(){
        return fiyat;

        }
        public void setFiyat(int fiyat) {
            this.fiyat = fiyat;

        }

    @Override
    public String getSirket() {
        return "Mengerler";
    }
}
