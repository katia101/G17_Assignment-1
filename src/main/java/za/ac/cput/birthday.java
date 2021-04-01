package za.ac.cput;

public class birthday {
    private int birthYear;
    private int currentYear;
    private int age;

    public birthday(int birthYear, int currentYear)
    {
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }

    public birthday()
    {}

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int age(int currentAge){

        currentAge = currentYear - birthYear;

        return currentAge;
    }

    @Override
    public String toString() {
        return "Assignment1{" +
                "birthYear=" + birthYear +
                ", currentYear=" + currentYear +
                ", age=" + age +
                '}';
    }
}
