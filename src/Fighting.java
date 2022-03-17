public class Fighting extends Pokemon{
    private String specialPunch;
    private String nameOfTrainer;
    private int numbersOfKnockOut;
    private boolean meanFighter;

//  We maken weer de constructor aan.

    public Fighting(String name, String gender, int number, double height, double weight, String specialPunch, String nameOfTrainer, int numbersOfKnockOut, boolean meanFighter) {
        super(name, gender, number, height, weight);
        this.specialPunch = specialPunch;
        this.nameOfTrainer = nameOfTrainer;
        this.numbersOfKnockOut = numbersOfKnockOut;
        this.meanFighter = meanFighter;
    }
//    Vervolgens weer de setters en de getters.

    public String getSpecialPunch() {
        return specialPunch;
    }

    public void setSpecialPunch(String specialPunch) {
        this.specialPunch = specialPunch;
    }

    public String getNameOfTrainer() {
        return nameOfTrainer;
    }

    public void setNameOfTrainer(String nameOfTrainer) {
        this.nameOfTrainer = nameOfTrainer;
    }

    public int getNumbersOfKnockOut() {
        return numbersOfKnockOut;
    }

    public void setNumbersOfKnockOut(int numbersOfKnockOut) {
        this.numbersOfKnockOut = numbersOfKnockOut;
    }

    public boolean isMeanFighter() {
        return meanFighter;
    }

    public void setMeanFighter(boolean meanFighter) {
        this.meanFighter = meanFighter;
    }
//    De methodes

    @Override
    public void weakness(){
        System.out.println("Psychic & Fairy");
    }
    public void fighterIsMean(){
        if(meanFighter){
            System.out.println("Ik ben de gemeenste vechter.");
        }else{
            System.out.println("Ik vecht lief, maar win wel!!");
        }
    }
}
