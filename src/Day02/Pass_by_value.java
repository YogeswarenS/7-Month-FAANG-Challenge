package Day02;

public class Pass_by_value {
    public static void main(String[] args) {
        int a=10;
        int b=23;
        swap(a,b);
        System.out.println(a+ " "+b);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
// original values didn't swap. why?
// In java , there is no pass by reference and also in pass by value
// it will create a copy of the values and send to functions. hence only it's changed
// only inside the function, doesn't change the original variable's values.