public class Solution {
    void dfs(ArrayList<String> A,boolean visited[][],int i,int j,int n,int k)
    {
        if(!visited[i][j] && A.get(i).charAt(j)=='X')
        {//coordinate checking at top,bottom,left and right coordinate.
         visited[i][j]=true;
         if((i-1)>=0)
         dfs(A,visited,i-1,j,n,k);
         if((i+1)<n)
         dfs(A,visited,i+1,j,n,k);
         if((j-1)>=0)
         dfs(A,visited,i,j-1,n,k);
         if((j+1)<k)
         dfs(A,visited,i,j+1,n,k);
        }
    }
    public int black(ArrayList<String> A) 
    {
        boolean visited[][]=new boolean[A.size()][A.get(0).length()];
        int count=0;
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.get(i).length();j++)
            {
                if(A.get(i).charAt(j)=='X' && (!visited[i][j]))
                {
                    count++;
                    dfs(A,visited,i,j,A.size(),A.get(0).length());
                }
            }
        }
        return count;
    }
}

//black shapes interview bit
