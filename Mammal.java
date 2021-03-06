package Distributed_System_Java_Src;

class Animal {
   String name;
   public Animal(String name)
   {
       this.name = name;
   } 
   public void setName(String name)
   {
       this.name = name;
   }
   public String getName(){
       return this.name;
   }
}
public class Mammal extends Animal implements Runnable {
    public Mammal(String name)
    {
        super(name);
    }
    public void run()
    {
        for(int i = 0 ; i<100;i++)
        {
            System.out.println("The name of the Animal is: " + this.getName());
        }
    }
    
    public static void main(String[] args)
    {
        Animal firstAnimal = new Mammal("Tiger");
        Thread threadOne = new Thread((Runnable) firstAnimal);
        threadOne.start();
        Animal secondAnimal = new Mammal("Elephant");
        Thread threadTwo = new Thread((Runnable) secondAnimal);
        threadTwo.start();
    }
}
