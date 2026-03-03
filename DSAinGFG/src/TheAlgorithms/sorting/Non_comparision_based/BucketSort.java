package TheAlgorithms.sorting.Non_comparision_based;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static void insertion(List<Float> bucket) {
        for (int i = 0; i < bucket.size(); i++) {
            float key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }

    public static void buckets(float[] arr) {
        int n = arr.length;
        List<Float>[] buckets = new ArrayList[arr.length];


        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int bi = (int) (arr.length * arr[i]);
            buckets[bi].add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            insertion(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }


    }


}