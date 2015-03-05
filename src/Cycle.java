/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */

    public class Cycle {
        private int wheel;
        private double weight;
        
          public Cycle() {
               this(100,1000) ;
        }
        public Cycle(int wheel, double weight) {
        this.wheel = wheel;
        this.weight = weight;
         }
      

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cycle{" + "wheel=" + wheel + ", weight=" + weight + '}';
    }
    }

     
        


        

