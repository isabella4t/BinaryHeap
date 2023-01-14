public class Heap {
    Node root;
    int[] heap;
    
    public Heap(int n){
        heap = new int[n];
    }

    public Heap(int[] n){
        heap = int[] n;
    }
    public void insert(int m){
        int[] temp = new int[heap.length+1];
        int acc = 0;
        for(int i = 0; i<heap.length; i++){
            temp[i] = heap[i];
            acc++;
        }
        temp[acc++] = m;
        heap = temp;

    }

    public void delete(int n){
         int[] temp = new int[heap.length-1];
        int acc = 0;
        for(int i = 0; i<heap.length; i++){
            if(heap[i] != n){
                temp[acc] = heap[i];
                acc++;
            }
        }
        heap = temp;
    }

}
