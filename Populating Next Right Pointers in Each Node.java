class Solution {
    public Node connect(Node root) {
        if(root==null)
        {
            return root;
        }
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s = q.size();            
                        
            for(int i=0;i<s;i++)
            {
                Node rem = q.remove();
                                
                if(i==s-1)
                {
                    rem.next = null;
                    
                }                
                else if(!q.isEmpty())
                {
                    rem.next = q.peek();
                }
                
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
                
            }
        }
        
        return root;
    }
}
