public abstract class Pokemon {
//    We maken de variabelen aan die voor elk object gelden.
    private String name;
    private String gender;
    private int number;
    private double height;
    private double weight;

//    We maken de constructor aan.

    public Pokemon(String name, String gender, int number, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

//    Vervolgens de getters en de setters.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    We voegen de methodes toe

    public void stelVoor(String name, String gender, int number, double height, double weight){
        System.out.println("Hallo, ik ben " + name + ", mijn geslacht is " + gender + " en mijn Pokemonnummer is " + number );
        System.out.println("Mijn gewicht is " + height + " meter en ik weeg " + weight + " kg.");
    }
    public abstract void weakness();
}
