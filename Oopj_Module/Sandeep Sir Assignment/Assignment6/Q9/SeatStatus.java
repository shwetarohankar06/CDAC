package assignment.in;

public enum SeatStatus {
    AVAILABLE('A'), 
    BOOKED('B');   
	
    private final char symbol;

    SeatStatus(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
