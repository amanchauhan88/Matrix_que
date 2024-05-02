import java.util.*;

public class searchKey {

public static boolean search(int matrix[][],int key ){
int n = matrix.length;
int m = matrix[0].length;

for(int i = 1; i <n; i++){
    for(int j = 1; j <m; j++){
        if(matrix[i][j] == key){
            System.out.println("key found at"+"("+i+", "+j+")");
            return true;
        }
    }
}
System.out.println("key not found");

return false;

}

    public static void main(String[] args) {

        int matrix[][] = {

                { 1, 2, 3, },
                { 4, 5, 6, },
                { 7, 8, 9, }

        };
        //int key =10; output key not found
        int key = 5;  // key found

        search(matrix, key);

    }
}