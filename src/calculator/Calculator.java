package calculator;

public class Calculator {


    public int sum(int x, int y) {
        return x + y;
    }
    public double sum(double x, double y) {
        return x + y;
    }
    public float sum(float x, float y, float z) {
        return x + y + z;
    }
    public double sum(double x, double y, double z, double w) {
        return x + y + z + w;
    }


    public int substract(int x, int y){
        return x - y;
    }
    public int substract(float x, int y){
        return (int)x - y;
    }
    public float substract(float x, float y){
        return x - y;
    }


    public int multiply(int x, int y){
        return x * y;
    }
    public float multiply(float x, int y){
        return x * y;
    }
    public  float multiply(float x, float y, float z){
        return x * y * z;
    }



    public float divide(float x, float y){
        return x / y;
    }
    public float divide(float x, float y, float z){
        return x / y / z;
    }




    public int add(int x, int y, int z){
        return x+y+z;
    }
    public int add(double x, int y){
        return (int)x+y;
    }
    public double add(int x, double y){
        return x+y;
    }
}
