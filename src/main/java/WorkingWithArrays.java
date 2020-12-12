import java.util.Arrays;

public class WorkingWithArrays {

    public int[] arrayTransformation(int[] arr) {

        int lastFourIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastFourIndex = i; //записать индекс найденной четверки
            }
        }

        if (lastFourIndex != -1) { //если четверка найдена

            int arrTransformLength = arr.length - (lastFourIndex + 1); //размер новго массива
            int[] arrTransform = new int[arrTransformLength];
            System.arraycopy(arr, lastFourIndex + 1, arrTransform, 0, arrTransformLength); //скопировать элементы в новый массив
            /*            System.out.println(Arrays.toString(arrTransform));*/
            return arrTransform;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean searchForOnesAndFours(int[] arr) {

        boolean foundOne = false; //ищет единицу
        boolean foundFour = false; //ищет четврку
        boolean foundAnotherDigit = false; ////ищет другие цифры

        for (int i : arr) {
            if (i == 1) {
                foundOne = true;
            } else if (i == 4) {
                foundFour = true;
            } else {
                foundAnotherDigit = true;
            }

        }

        if (foundOne && foundFour && !foundAnotherDigit) { //если все три условия выполнены
            return true;
        } else {
            return false;
        }

    }

}
