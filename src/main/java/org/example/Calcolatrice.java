package org.example;

public class Calcolatrice {
    float x,y;

    public Calcolatrice(float x, float y) {
        this.x=x;
        this.y=y;
    }



    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float somma(float x, float y)
    {
        return getX()+getY();
    }
    public float sottrazione(float x, float y)
    {
        return getX()-getY();
    }
    public float moltiplicazione(float x, float y)
    {
        return getX()*getY();
    }
    public float divisione(float x,float y)
    {
        return getX()/getY();
    }

    public float potenza(float x,float y)
    {
        return (float) Math.pow(getX(),getY());
    }


    @Override
    public String toString() {
        return "x="+getX()+" y="+getY()+"\n";
    }
}
