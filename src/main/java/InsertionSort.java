import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    private List<Integer> dataSource;

    public InsertionSort(List<Integer> data) {
        this.dataSource = new ArrayList<>(data);
    }


    public List<Integer> sort(){
        for (int i = 1; i < dataSource.size(); i++){
            for (int j = i ; j >=1; j--){
                if (dataSource.get(j-1) > dataSource.get(j)){
                    swap(j-1 , j , dataSource);
                }
            }
        }
        return dataSource;
    }

    private void swap(int from , int to , List<Integer> data){
        int tmp = data.get(from);
        data.set(from , data.get(to));
        data.set(to,tmp );
    }
}
