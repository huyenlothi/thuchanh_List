import java.util.Arrays;

public class MyList {
    private int size =0;
    private int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(int e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public int get(int i){
        if(i<0 || i>=size){
            throw new IndexOutOfBoundsException("INDEX: "+ i+ ", size "+ i);
        }
        return (int) element[i];
    }

}
