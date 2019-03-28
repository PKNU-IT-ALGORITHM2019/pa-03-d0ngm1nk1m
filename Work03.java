package Algorithm;

public class Work03 {
    
    static int [] arr_Random;
    static int [] arr_Reverse;
    
    public static void main(String[] args) {
        
        int [] data = { 1000, 10000, 100000 };
        double result = 0;
        
        System.out.print("\t");
        for(int i = 0; i < 3; i++) {
            System.out.print("\t" + "Random" + data[i]);
            System.out.print("\t" + "Reverse" + data[i]);
        }
        
        System.out.println();
        
        System.out.print("Bubble\t");        //bubble_Sort()
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                result += bubble_Sort(data[i], arr_Random);
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            System.out.print("\t\t" + String.format("%.3f", bubble_Sort(data[i], arr_Reverse)));
        }
        
        System.out.println();
        
        System.out.print("Selection");    // selection_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                result += selection_Sort(data[i], arr_Random);
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            System.out.print("\t\t" + String.format("%.3f", selection_Sort(data[i], arr_Reverse)));
        }
        
        System.out.println();
        
        System.out.print("Insertion");    // insertion_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                result += insertion_Sort(data[i], arr_Random);
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            System.out.print("\t\t" + String.format("%.3f", insertion_Sort(data[i], arr_Reverse)));
        }
        
        System.out.println();
        
        System.out.print("Merge\t");    // merge_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                long start_time = System.currentTimeMillis();
                merge_Sort(0, data[i] - 1, arr_Random);
                long end_time = System.currentTimeMillis();
                result += (end_time - start_time)/1000.0;
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            long start_time = System.currentTimeMillis();
            merge_Sort(0, data[i] - 1, arr_Reverse);
            long end_time = System.currentTimeMillis();
            result = (end_time - start_time)/1000.0;
            System.out.print("\t\t" + String.format("%.3f",result));
        }
        
        System.out.println();
        
        System.out.print("Quick1\t");    // quick1_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                long start_time = System.currentTimeMillis();
                quick1_Sort(0, data[i] - 1, arr_Random);
                long end_time = System.currentTimeMillis();
                result += (end_time - start_time)/1000.0;
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            if(i == 2) {
                System.out.print("\t\tError\t\tError");
                break;
            }
            Make_Array_Reverse(data[i]);
            long start_time = System.currentTimeMillis();
            quick1_Sort(0, data[i] - 1, arr_Reverse);
            long end_time = System.currentTimeMillis();
            result = (end_time - start_time)/1000.0;
            System.out.print("\t\t" + String.format("%.3f",result));
        }
        
        System.out.println();
        
        System.out.print("Quick2\t");    // quick2_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                long start_time = System.currentTimeMillis();
                quick2_Sort(0, data[i] - 1, arr_Random);
                long end_time = System.currentTimeMillis();
                result += (end_time - start_time)/1000.0;
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            long start_time = System.currentTimeMillis();
            quick2_Sort(0, data[i] - 1, arr_Reverse);
            long end_time = System.currentTimeMillis();
            result = (end_time - start_time)/1000.0;
            System.out.print("\t\t" + String.format("%.3f",result));
        }
        
        System.out.println();
        
        System.out.print("Quick3\t");    // quick3_Sort();
        for(int i = 0; i < 3; i++) {
            result = 0;
            for(int j = 0; j < 10; j++) {
                Make_Array_Random(data[i]);
                long start_time = System.currentTimeMillis();
                quick3_Sort(0, data[i] - 1, arr_Random);
                long end_time = System.currentTimeMillis();
                result += (end_time - start_time)/1000.0;
            }
            System.out.print("\t\t" + String.format("%.3f", (result/10)));
            Make_Array_Reverse(data[i]);
            long start_time = System.currentTimeMillis();
            quick3_Sort(0, data[i] - 1, arr_Reverse);
            long end_time = System.currentTimeMillis();
            result = (end_time - start_time)/1000.0;
            System.out.print("\t\t" + String.format("%.3f",result));
        }
        
    }
    
    public static void Make_Array_Random(int num) {
        
        arr_Random = new int[num];
        for(int i = 0; i < num; i++)
            arr_Random[i] = (int)(Math.random()*num + 1);
        
    }
    
    public static void Make_Array_Reverse(int num) {
        
        arr_Reverse = new int[num];
        for(int i = 0; i < num; i++)
            arr_Reverse[i] = num - i;
        
    }
    
    public static double bubble_Sort(int num, int []arr) {
        
        long start_time = System.currentTimeMillis();
        for(int i = num - 1; i > 0 ; i--)
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        long end_time = System.currentTimeMillis();
        return (end_time - start_time)/1000.0;
        
    }
    
    public static double selection_Sort(int num, int []arr){
        
        int max;
        int result;
        
        long start_time = System.currentTimeMillis();
        for(int i = num - 1; i > 0; i--) {
            max = arr[i];
            result = i;
            for(int j = 0; j < i; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                    result = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[result];
            arr[result] = tmp;
        }
        long end_time = System.currentTimeMillis();
        return (end_time - start_time)/1000.0;
    }
    
    public static double insertion_Sort(int num, int []arr){
        
        long start_time = System.currentTimeMillis();
        for(int i = 1; i < num; i++) {
            int tmp = arr[i];
            int k = i;
            for(int j = i - 1; j >= 0; j--) {
                if(tmp < arr[j] && j != 0) {
                    arr[k] = arr[j];
                    k--;
                }
                else if(tmp < arr[j] && j == 0) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
                else if(tmp >= arr[j] && j != 0){
                    arr[k] = tmp;
                    break;
                }
            }
        }
        long end_time = System.currentTimeMillis();
        return (end_time - start_time)/1000.0;
    }
    
    public static void merge_Sort(int begin, int end, int []arr){
        if( begin < end) {
            int middle = (begin + end)/2;
            merge_Sort(begin, middle, arr);
            merge_Sort(middle + 1, end, arr);
            merge(begin, middle, end, arr);
        }
    }
    
    public static void merge(int p, int q, int r, int []data) {
        
        int i = p, j = q + 1, k = p;
        int []tmp = new int[data.length];
        while(i <= q && j <= r) {
            if(data[i] <= data[j])
                tmp[k++] = data[i++];
            else
                tmp[k++] = data[j++];
        }
        while (i <= q)
            tmp[k++] = data[i++];
        while (j <= r)
            tmp[k++] = data[j++];
        for(int v = p; v <= r; v++)
            data[v] = tmp[v];
        
    }
    
    public static void quick1_Sort(int begin, int end, int []arr){
        
        if(begin <= end) {
            int pivot = partition1(begin, end, arr);
            quick1_Sort(begin, pivot - 1, arr);
            quick1_Sort(pivot + 1, end, arr);
        }
        
    }
    
    public static int partition1(int p, int r, int []a) {
        
        int pivot = a[r];
        int i = p - 1;
        for(int j = p; j < r; j++) {
            if(a[j] <= pivot) {
                i += 1;
                swap(i, j, a);
            }
        }
        
        swap(i + 1, r, a);
        
        return i + 1;
        
    }
    
    public static void quick2_Sort(int begin, int end, int []arr){
        
        if(begin <= end) {
            int pivot = partition2(begin, end, arr);
            quick2_Sort(begin, pivot - 1, arr);
            quick2_Sort(pivot + 1, end, arr);
        }
        
    }
    
    public static int partition2(int p, int r, int []a) {
        
        int m = (p + r) / 2;
        int pivot = 0;
        int i = p - 1;
        
        if(a[p] < a[r] && a[r] < a[m]) {
            pivot = a[r];
        }
        else if(a[m] < a[r] && a[r] < a[p]) {
            pivot = a[r];
        }
        else if(a[r] < a[p] && a[p] < a[m]) {
            pivot = a[p];
            swap(p, r, a);
        }
        else if(a[m] < a[p] && a[p] < a[r]) {
            pivot = a[p];
            swap(p, r, a);
        }
        else {
            pivot = a[m];
            swap(m, r, a);
        }
        
        for(int j = p; j < r; j++) {
            if(a[j] <= pivot) {
                i += 1;
                swap(i, j, a);
            }
        }
        
        swap(i + 1, r, a);
        
        return i + 1;
        
    }
    
    public static void quick3_Sort(int begin, int end, int []arr){
        
        if(begin <= end) {
            int pivot = partition3(begin, end, arr);
            quick3_Sort(begin, pivot - 1, arr);
            quick3_Sort(pivot + 1, end, arr);
        }
        
    }
    
    public static int partition3(int p, int r, int []a) {
        
        int num = (int)(Math.random()*(r - p + 1) + p);
        int pivot = a[num];
        int i = p - 1;
        
        swap(num, r, a);
        
        for(int j = p; j < r; j++) {
            if(a[j] <= pivot) {
                i += 1;
                swap(i, j, a);
            }
        }
        
        swap(i + 1, r, a);
        
        return i + 1;
        
    }
    
    public static void swap(int i, int j, int []arr) {
        
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        
    }
    
}
