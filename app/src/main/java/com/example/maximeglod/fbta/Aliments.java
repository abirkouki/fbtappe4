package com.example.maximeglod.fbta;

public class Aliments {
    private String nomalimentsName;

    //Nom de l'image sans l'extension
    private String imagealimentsName;
    private int calories;

    public Aliments(String nomalimentsName, String imagealimentsName, int calories){
        this.nomalimentsName= nomalimentsName;
        this.imagealimentsName= imagealimentsName;
        this.calories= calories;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories){
        this.calories= calories;
    }
    public String getNomalimentsName(){
        return nomalimentsName;
    }
    public void setNomalimentsName(String nomalimentsName){
        this.nomalimentsName=nomalimentsName;
    }
    public String getImagealimentsName(){
        return imagealimentsName;
    }
    public void setImagealimentsName(String imagealimentsName){
        this.imagealimentsName= imagealimentsName;
    }
    //Message retourné
    @Override
    public String toString() {
        return this.nomalimentsName+" (Calories: "+this.calories+")";
    }

}

