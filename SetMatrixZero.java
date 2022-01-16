class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int arr[][] = new int[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = matrix[i][j];
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0 && arr[i][j] == 0){
                    for(int x=0; x<row; x++){
                        matrix[x][j] = 0;
                    }
                    
                    for(int y=0; y<col; y++){
                        matrix[i][y] = 0;
                    }
                }
            }
        }
        
    }
}
