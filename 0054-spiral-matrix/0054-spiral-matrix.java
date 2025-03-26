class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spiral=new ArrayList<Integer>();

        int rowStart=0, colStart=0, rowEnd=matrix.length-1, colEnd=matrix[0].length -1;
        

        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            for(int col=colStart;col<=colEnd;col++)
            {
                spiral.add(matrix[rowStart][col]);
            }
            rowStart++;
            for(int row=rowStart;row<=rowEnd;row++)
            {
                spiral.add(matrix[row][colEnd]);
            }
            colEnd--;
            if(rowStart<=rowEnd)
            {
                for(int col=colEnd; col>=colStart ;col--)
                {
                    spiral.add(matrix[rowEnd][col]);
                }
            }
            rowEnd--;
            if(colStart <=colEnd)
            {
                for(int row=rowEnd; row>=rowStart; row--)
                {
                    spiral.add(matrix[row][colStart]);
                }
            }
            colStart++;
        }
         return spiral;
    }
}