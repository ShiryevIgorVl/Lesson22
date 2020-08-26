public class Main {
    static int size = 4;
    static String [][] arr =    {
            {"11", "12", "13", "14"},
            {"21", "22", "23", "24"},
            {"31", "32", "33", "34"},
            {"41", "42", "43", "44"},
    };

    public static int arraySum(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != size) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i].length != size) {
                    throw new MyArraySizeException();
                }
                   try {
                sum += Integer.parseInt(arr[i][j]);
            } catch (NumberFormatException e) {
                       throw new MyArrayDataException("Елемент № : " , i, j);
                   }
            }
          }
        return sum;

    }

    public static void main(String[] args) {

        try {
            System.out.println(arraySum(arr));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }
        catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(arr[e.getArrX()][e.getArrY()]);
        }
        System.out.println("end");
    }
}
