class Solution {
    public String simplifyPath(String path) {
        Deque<String> dq=new ArrayDeque<>();
        String[] dir=path.split("/");

        for(String d : dir)
        {
            if(d.equals("") || d.equals("."))
                continue;
            else if(d.equals(".."))
            {
                if(!dq.isEmpty())
                    dq.pollLast();
                
            }
            else
                dq.offerLast(d);
        }

        StringBuilder sb=new StringBuilder();
        for(String st : dq)
        {
            sb.append("/").append(st);
        }
   
        return sb.length()>0 ? sb.toString() : "/";
    }
}