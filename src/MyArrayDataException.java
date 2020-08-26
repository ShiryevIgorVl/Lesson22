public class MyArrayDataException extends RuntimeException{
    private int arrX;
    private int arrY;

    public void setArrX(int arrX) {
        this.arrX = arrX;
    }

    public void setArrY(int arrY) {
        this.arrY = arrY;
    }

    public MyArrayDataException(String mas, int arrX, int arrY) {
        super(mas);
        this.arrX = arrX;
        this.arrY = arrY;
    }

    public int getArrX() {
        return arrX;
    }

    public int getArrY() {
        return arrY;
    }
}
