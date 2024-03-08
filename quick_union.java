public class quick_union
{
    private int[] id;

    public quick_union(int N){
        id = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while (i!=id[i]) {
            i = id[i];
        }
        return i;
    }
    
    public boolean connected(int p, int q)
    {
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[j] = i;
    }

    public static void main(String[] args) {
        quick_union obj = new quick_union(10);
        obj.union(1, 2);
        obj.union(1, 4);
        System.out.println(obj.connected(2, 4));
    }
}
