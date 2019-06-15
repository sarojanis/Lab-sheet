/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtfractionapp;

/**
 *
 * @author Student
 */
public class ADTFractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADTFraction af1=new  ADTFraction(7,10);
        ADTFraction af2=new ADTFraction();
        af2.set(3, 15);
        af1.Display();
        af2.Display();
        ADTFraction t1=af1.times(5);
        t1.Display();
        af1.times(af2);
        ADTFraction t2=af1.times(af2);
        t2.Display();
        
        ADTFraction p=af1.plus(af2);
        p.Display();
    
            ADTFraction reci=p.reciprocal();
                    reci.Display();
                   System.out.println("value of af1="+af1.value());
                   
                      


        
    }
    
}
class ADTFraction{
    private int n;
    private int d;
    public ADTFraction(){
        this.n=0;
        this.d=1;
    }
    public ADTFraction(int a, int b){
   
        set(a,b); 
    
    }
        public void set(int a,int b){
            if(b !=0){
       this.n=a;
       this.d=b;
        
        
        }
        else{ 
            System.out.println("Invalid Fraction");
            }
        }
        public ADTFraction times(int a){
           // int newN, newD;
            //newN=this.n*a;
           // newD=this.d;
            //ADTFraction af=new ADTFraction(newN,newD);
            return new ADTFraction(this.n*a, this.d);
        }
        public ADTFraction times(ADTFraction x){
             //int newN=this.n*x.n;
            //int newD=this.d*x.d;
            //ADTFraction af=new ADTFraction(newN, newD);
            return new ADTFraction(this.n*x.n, this.d*x.d);
        }
        public ADTFraction plus(ADTFraction x){
           int max,lcm;
           if(this.d>x.d){
               max=this.d;
           }
           else{
               max=x.d;
           }
           lcm=max;
           while(true){
               if(lcm%this.d==0 && lcm%x.d==0){
                   break;
                   
               }
               lcm+=max;
           }
          
          int  newN=lcm/this.d*this.n+lcm/x.d*x.n;
          int  newD=lcm;
           ADTFraction af=new ADTFraction(newN,newD);
        }
        public ADTFraction reciprocal(){
            if(this.n !=0){
           
            ADTFraction af=new ADTFraction(this.d, this.n);
            return af;
        }
            else{
                System.out.println("invalid reciprocal");
                return null;
            }
            }
        public float value(){
           return (float)this.n/this.d;
           
        }
        public void Display(){
            System.out.println(this.n+"/"+this.d);
        }

    }
    
    