class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N=9;

        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxs=new HashSet[9];

        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxs[i]=new HashSet<Character>();
        }

        for(int r=0;r<N;r++)
        {
            for(int c=0 ; c<N ; c++)
            {
                char val=board[r][c];

                if(val== '.')
                    continue;
                if(rows[r].contains(val)){ //check if present in the row set, if yes return false
                    return false;
                }
                rows[r].add(val); // if not present then add

                if(cols[c].contains(val))
                {
                    return false;
                }
                cols[c].add(val);

                int pos=r/3 * 3 + c/3 ; //finding the no of box
                if(boxs[pos].contains(val))
                {
                    return false;
                }
                boxs[pos].add(val);
            }
        }

        return true;
        
    }
}