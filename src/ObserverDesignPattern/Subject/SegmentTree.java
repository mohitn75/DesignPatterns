package ObserverDesignPattern.Subject;


import java.util.Arrays;
import java.util.Scanner;

public class SegmentTree {

    public int[] segmentTree;

    public SegmentTree(int n){
        this.segmentTree = new int[4 * n];
    }

    // odd operation kind = OR, even operation kind = XOR
    public void build(int node, int l, int r, int[] arr, int kind){
        if(l == r){
            segmentTree[node] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(2 * node + 1, l, mid, arr, kind ^ 1);
        build(2 * node + 2, mid + 1, r, arr, kind ^ 1);
        if(kind == 1){
            segmentTree[node] = segmentTree[2 * node + 1] | segmentTree[2 * node + 2];
        }
        else{
            segmentTree[node] = segmentTree[2 * node + 1] ^ segmentTree[2 * node + 2];
        }
    }

    public void updateQuery(int node, int idx, int val, int l, int r, int kind){
//        System.out.printf("node = %d, idx = %d, val = %d, l = %d , r = %d , kind = %d \n", node, idx, val, l, r, kind);
        if(l == r){
            segmentTree[node] = val;
            return;
        }
        int mid = (l + r) / 2;
        if(idx <= mid){
            updateQuery(2 * node + 1, idx, val, l, mid, kind ^ 1);
        }
        else{
            updateQuery(2 * node + 2, idx, val, mid + 1, r, kind ^ 1);
        }
        if(kind == 1){
            segmentTree[node] = segmentTree[2 * node + 1] | segmentTree[2 * node + 2];
        }
        else{
            segmentTree[node] = segmentTree[2 * node + 1] ^ segmentTree[2 * node + 2];
        }
//        System.out.println(segmentTree[node]);
    }
}
class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // possibly not used
        int m = sc.nextInt(); // number of queries

        int size = 1 << n;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] queries = new int[m][2];
        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        SegmentTree segmentTree = new SegmentTree(size);
        segmentTree.build(0, 0, size - 1, arr, n % 2);
        System.out.println(Arrays.toString(segmentTree.segmentTree));
        for(int i = 0 ; i < m ; i++){
            int key = queries[i][0];
            int val = queries[i][1];
            key = key - 1;
            arr[key] = val;
            segmentTree.updateQuery(0, key, val, 0, size - 1, n % 2);
            System.out.println(segmentTree.segmentTree[0]);
        }
    }
}
