package hw12;

public class More3Less7 extends CalcProgram {

    double calcProgram(double bid, int number) {
        if (number >= 3 && number <= 7) {
            double winCash = (bid * 125) / 100;
            double tax = (winCash * 5) / 100;
            return winCash - tax;
        } else {
            return super.calcProgram(bid, number);
        }
    }
}

