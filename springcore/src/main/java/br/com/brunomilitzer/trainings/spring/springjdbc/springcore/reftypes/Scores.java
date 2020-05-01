package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.reftypes;

import java.io.Serializable;

public class Scores implements Serializable {

   private static final long serialVersionUID = -7730834039556171545L;

   private Double maths;

   private Double physics;

   private Double chemistry;

    public Double getMaths( ) {
        return maths;
    }

    public void setMaths( Double maths ) {
        this.maths = maths;
    }

    public Double getPhysics( ) {
        return physics;
    }

    public void setPhysics( Double physics ) {
        this.physics = physics;
    }

    public Double getChemistry( ) {
        return chemistry;
    }

    public void setChemistry( Double chemistry ) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString( ) {
        return "Scores{ maths = " + maths + ", physics = " + physics + ", chemistry = " + chemistry + '}';
    }
}
