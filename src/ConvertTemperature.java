import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(convert(0)));
    }
    static double[] convert(double celsius)
    {
        double[] arr =new double[2];
        arr[0]=celsius+273.15;
        arr[1]=celsius*1.80+32.00;

        return arr;
    }
}
