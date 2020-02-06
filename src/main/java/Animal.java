public class Animal {
    protected String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void sound()
  {
      System.out.println("animal make sound");
  }

    protected void eat()
    {
        System.out.println(this.name + " eats");
    }
}

