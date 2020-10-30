package vorozheykin.Math;

import java.util.Objects;

public final class Fractional extends Number {
    int numerator;
    int denumerator;

    public Fractional(int numerator, int denumerator) {
        if(denumerator == 0){
            throw new IllegalArgumentException("Denomerator mustn't be zero");
        }
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public Fractional addition(Fractional a){
        int totalDenumenator;
        int totalNumerator;

        if(a.denumerator == denumerator){
            totalNumerator = numerator + a.numerator;
            totalDenumenator = denumerator;
        } else{
            totalDenumenator = denumerator * a.denumerator;
            totalNumerator = (totalDenumenator / denumerator * numerator) +
                             (totalDenumenator / a.denumerator * a.numerator);
        }

        return new Fractional(totalNumerator, totalDenumenator);
    }

    public Fractional addition(int number){

        return this.addition(new Fractional(number, 1));
    }

    public Fractional subtraction(Fractional a){
        int totalDenumenator;
        int totalNumerator;

        if(a.denumerator == denumerator){
            totalNumerator = numerator - a.numerator;
            totalDenumenator = denumerator;
        } else{
            totalDenumenator = denumerator * a.denumerator;
            totalNumerator = (totalDenumenator / denumerator * numerator) -
                             (totalDenumenator / a.denumerator * a.numerator);
        }

        return new Fractional(totalNumerator, totalDenumenator);
    }

    public Fractional substraction(int number){

        return this.subtraction(new Fractional(number, 1));
    }

    public Fractional multiplication(Fractional a){
        int totalDenumenator;
        int totalNumerator;

        totalNumerator = numerator * a.numerator;
        totalDenumenator = denumerator * a.denumerator;

        return new Fractional(totalNumerator, totalDenumenator);
    }

    public Fractional multiplication(int number){

        return this.multiplication(new Fractional(number, 1));
    }

    public Fractional dividing(Fractional a){
        int totalDenumenator;
        int totalNumerator;

        totalNumerator = numerator * a.denumerator;
        totalDenumenator = denumerator * a.numerator;

        return new Fractional(totalNumerator, totalDenumenator);
    }

    public Fractional dividing(int number){

        return this.dividing(new Fractional(number, 1));
    }

    @Override
    public String toString(){
        return numerator + "/" + denumerator;
    }

    @Override
    public int intValue() {
        return numerator / denumerator;
    }

    @Override
    public long longValue() {
        return numerator / denumerator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / (float) denumerator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / (float) denumerator;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;

        Fractional fractional = (Fractional) o;
        return  numerator == fractional.numerator &&
                denumerator == fractional.denumerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denumerator);
    }
}
