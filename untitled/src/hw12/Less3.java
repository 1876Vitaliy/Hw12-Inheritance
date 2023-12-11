package hw12;

public class Less3 extends CalcProgram{

    double calcProgram(double bid, int number) {
        if (number < 3) {
            return (bid * 125) / 100;
        } else {
            return super.calcProgram(bid, number);
        }
    }
}