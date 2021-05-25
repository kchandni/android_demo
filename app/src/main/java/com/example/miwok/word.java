package com.example.miwok;

/**
 * {@link word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

   private int image = has_image;

   private  static  final int has_image = -1;

   private  int maudio;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */

    public  word(String defaultTranslation,String miwokTranslation ,int audio){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        maudio = audio;
    }
    public word(String defaultTranslation, String miwokTranslation, int iamgee,int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        image = iamgee;
        maudio = audio;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImage() {
        return image;
    }

    public boolean hasImage(){
        return image != has_image;
    }

    public int getMaudio() {
        return maudio;
    }
}