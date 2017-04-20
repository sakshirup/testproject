package com.example.hppav.restraunt;

/**
 * Created by HP PAV on 11-04-2017.
 */

public class main_course1 {
    private String name;
    private String desc;
    private float price;


    public static final main_course1[] workouts= {
            new main_course1("Chhole Bhature", "Bhatura chole is a combination of chana masala and fried bread called bhatoora (made of maida flour) from India. Chole is a spicy curry made from white chickpeas where as Bhatura is a fried leavened bread\n",300),
            new main_course1("Spaghetti and Cheese ", "Spaghetti is a long, thin, cylindrical, solid pasta. It is a staple food of traditional Italian cuisine. Like other pasta, spaghetti is made of milled wheat and water. Italian spaghetti is made from durum wheat semolina, but elsewhere it may be made with other kinds of flour.\n",400),
            new main_course1("Sambhar Dosa ", "It is a vegetarian dish, Dosa sambar is a favorite of health conscious people who want to eat tasty food as well.",190),
            new main_course1("Paav Bhaji ", "Pav bhaji is a fast food dish from Maharashtra, India, consisting of a thick vegetable curry fried and served with a soft bread roll",250),
            new main_course1("Chop suey ", "Chop suey is a dish in American Chinese cuisine, with eggs, cooked quickly with vegetables such as bean sprouts, cabbage, and celery and bound in a starch-thickened sauce.",540)
    };
    private main_course1(String name, String desc, float price)
    {
        this.name=name;
        this.price=price;
        this.desc=desc;}

    public String getdesc()
    {
        return desc;
    }
    public String getname()
    {
        return name;
    }
    public float getprice()
    {
        return price;
    }
    public String toString()
    {
        return this.name;
    }

//    public float calc(float price)
//    {
//        int
//    }
}

