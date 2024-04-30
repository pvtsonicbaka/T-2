class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int tm[][]  =  new int[matrix.length][matrix[0].length];
        int l =matrix.length;
        int k=0;
        for(int i=0;i<tm.length;i++){
            for(int j=0;j<tm.length;j++){
                tm[i][j] = matrix[k][l];
                l--;
            }
            l=matrix.length;
            k++;
        }
        for(int i=0;i<tm.length;i++){
            for(int j=0;j<tm.length;j++){
                matrix [i][j] = tm[i][j];
            }
        }

    }
}