class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] row=new int[n];
        int[] col=new int[m];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==0||col[j]==0)
                    mat[i][j]=0;
            }
        }
    }
}
