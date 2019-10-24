package com.example.android.tourguide;

public class Place {
    private String place_name;
    private String place_short_description;
    private String place_description;
    private String place_adress;
    private String place_phone;
    private int front_image_id;
    private int image1_id;
    private int image2_id;
    private int image3_id;
    private int image4_id;
    private int image5_id;
    private int image6_id;

    public Place(String p_name, String p_short_description, String p_description, String p_adress, String p_phone, int image_f, int image1, int image2, int image3) {
        place_name = p_name;
        place_short_description = p_short_description;
        place_description = p_description;
        place_adress = p_adress;
        place_phone = p_phone;
        front_image_id = image_f;
        image1_id = image1;
        image2_id = image2;
        image3_id = image3;

    }


    public String getPlace_name() {
        return place_name;
    }

    public String getPlace_short_description() {
        return place_short_description;
    }

    public String getPlace_description() {
        return place_description;
    }

    public String getPlace_address() {
        return place_adress;
    }

    public String getPlace_phone() {
        return place_phone;
    }

    public int getFront_image_id() {
        return front_image_id;
    }

    public int getImage1_id() {
        return image1_id;
    }

    public int getImage2_id() {
        return image2_id;
    }

    public int getImage3_id() {
        return image3_id;
    }

}
