public class Cat extends Animal {
    private Animal name;

    public Cat()
    {

       this.setName("Storm");
    }

    protected void sound(){
        System.out.println("Meeawu ");
    }
}
