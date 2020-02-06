import java.util.ArrayList;

public class Home extends Animal {

    public void adoptPet(Animal animal){
        ArrayList<String>Adoption = new ArrayList<String>();

        if(animal.name == "Rax")
        {
            if(Adoption.contains("Rax"))
            {
                System.out.println("Rax is already adopted");
            }else
            {
                Adoption.add("Rax");
                System.out.println("Rax adopted");
            }


        }else
        if(Adoption.contains("Storm"))
        {
            System.out.println("Storm is already adopted");
        }else
        {
            Adoption.add("Storm");
            System.out.println("Storm adopted");
        }
    }

    public void makeAllSounds(Animal animal){
        if(animal.name == "Rax")
        {
            System.out.println("Woof woof");
        }else
            if(animal.name == "Storm")
        {
            System.out.println("Meauw");
        }

    }



}
