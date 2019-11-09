package com.example.maptrial.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BranchesLst {
    @SerializedName("Id")
    @Expose
    private long id;
    @SerializedName("ArabicName")
    @Expose
    private String arabicName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("BreifAR")
    @Expose
    private Object breifAR;
    @SerializedName("BreifEN")
    @Expose
    private Object breifEN;
    @SerializedName("Fax")
    @Expose
    private Object fax;
    @SerializedName("Tele")
    @Expose
    private String tele;
    @SerializedName("X_Piont")
    @Expose
    private String xPiont;
    @SerializedName("Y_Piont")
    @Expose
    private String yPiont;
    @SerializedName("CountryId")
    @Expose
    private long countryId;
    @SerializedName("CountryArabicName")
    @Expose
    private String countryArabicName;
    @SerializedName("CountryEnglishName")
    @Expose
    private String countryEnglishName;

    /**
     * No args constructor for use in serialization
     */
    public BranchesLst() {
    }

    /**
     * @param englishName
     * @param address
     * @param breifAR
     * @param countryId
     * @param breifEN
     * @param yPiont
     * @param arabicName
     * @param countryEnglishName
     * @param xPiont
     * @param id
     * @param fax
     * @param tele
     * @param countryArabicName
     */
    public BranchesLst(long id, String arabicName, String englishName, String address, Object breifAR, Object breifEN, Object fax, String tele, String xPiont, String yPiont, long countryId, String countryArabicName, String countryEnglishName) {
        super();
        this.id = id;
        this.arabicName = arabicName;
        this.englishName = englishName;
        this.address = address;
        this.breifAR = breifAR;
        this.breifEN = breifEN;
        this.fax = fax;
        this.tele = tele;
        this.xPiont = xPiont;
        this.yPiont = yPiont;
        this.countryId = countryId;
        this.countryArabicName = countryArabicName;
        this.countryEnglishName = countryEnglishName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BranchesLst withId(long id) {
        this.id = id;
        return this;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public BranchesLst withArabicName(String arabicName) {
        this.arabicName = arabicName;
        return this;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public BranchesLst withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BranchesLst withAddress(String address) {
        this.address = address;
        return this;
    }

    public Object getBreifAR() {
        return breifAR;
    }

    public void setBreifAR(Object breifAR) {
        this.breifAR = breifAR;
    }

    public BranchesLst withBreifAR(Object breifAR) {
        this.breifAR = breifAR;
        return this;
    }

    public Object getBreifEN() {
        return breifEN;
    }

    public void setBreifEN(Object breifEN) {
        this.breifEN = breifEN;
    }

    public BranchesLst withBreifEN(Object breifEN) {
        this.breifEN = breifEN;
        return this;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public BranchesLst withFax(Object fax) {
        this.fax = fax;
        return this;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public BranchesLst withTele(String tele) {
        this.tele = tele;
        return this;
    }

    public String getXPiont() {
        return xPiont;
    }

    public void setXPiont(String xPiont) {
        this.xPiont = xPiont;
    }

    public BranchesLst withXPiont(String xPiont) {
        this.xPiont = xPiont;
        return this;
    }

    public String getYPiont() {
        return yPiont;
    }

    public void setYPiont(String yPiont) {
        this.yPiont = yPiont;
    }

    public BranchesLst withYPiont(String yPiont) {
        this.yPiont = yPiont;
        return this;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public BranchesLst withCountryId(long countryId) {
        this.countryId = countryId;
        return this;
    }

    public String getCountryArabicName() {
        return countryArabicName;
    }

    public void setCountryArabicName(String countryArabicName) {
        this.countryArabicName = countryArabicName;
    }

    public BranchesLst withCountryArabicName(String countryArabicName) {
        this.countryArabicName = countryArabicName;
        return this;
    }

    public String getCountryEnglishName() {
        return countryEnglishName;
    }

    public void setCountryEnglishName(String countryEnglishName) {
        this.countryEnglishName = countryEnglishName;
    }

    public BranchesLst withCountryEnglishName(String countryEnglishName) {
        this.countryEnglishName = countryEnglishName;
        return this;
    }

}
