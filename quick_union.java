public class quick_union
{
    private int[] id;
    private int[] sz;

    public quick_union(int N){
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i){
        while (i!=id[i]) {
            id[i] = id[id[i]];  //KEEPS ALMOST FLAT TREE
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
        if(sz[i]<sz[j]) { id[i] = j; sz[j]+=sz[i];} //WEIGHTED ROOT UPDATE
        else { id[j] = i; sz[j]+=sz[i];}
    }

    public static void main(String[] args) {
        quick_union obj = new quick_union(10);
        obj.union(1, 2);
        obj.union(1, 4);
        System.out.println(obj.connected(2, 4));
    }
}
