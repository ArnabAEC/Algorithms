public static class QuickFindUF
{
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
        }

        public boolean connected(int p, int q){
            return id[p]==id[q])
        }

        public int union(int p, int q){

            for(int i = 0; i < id.length; i++){
                pid = id[p];
                qid = id[q];
                if(id[i]==qid)
                    id[i]=pid;
            }
        }
    }
}