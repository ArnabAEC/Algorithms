public class QuickFindUF
{
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    
    public boolean connected(int p, int q)
    {
        return id[p]==id[q];
    }

    public void union(int p, int q){
        for(int i = 0; i < id.length; i++){
            int pid = id[p];
            int qid = id[q];
            if(id[i]==qid)
                id[i]=pid;
        }
    }

    public static void main(String[] args) {
        QuickFindUF obj = new QuickFindUF(10);
        obj.union(1, 2);
        System.out.println(obj.connected(2, 1));
    }
}
