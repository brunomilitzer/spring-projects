package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.reftypes;

import java.io.Serializable;

public class Student implements Serializable {

   private static final long serialVersionUID = 4636700751703730710L;

   private Scores scores;

    public Scores getScores( ) {
        return scores;
    }

    public void setScores( Scores scores ) {
        this.scores = scores;
    }

    @Override
    public String toString( ) {
        return "Student{ scores = " + scores + '}';
    }
}
