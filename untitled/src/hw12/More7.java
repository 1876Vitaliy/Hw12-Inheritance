package hw12;

public class More7 extends CalcProgram{

    double calcProgram(double bid, int number) {
        if (number > 7) {
            double winCash = (bid * 200) / 100;
            double tax = (winCash * 10) / 100;
            return winCash - tax;
        } else {
            return super.calcProgram(bid, number);
        }
    }
}