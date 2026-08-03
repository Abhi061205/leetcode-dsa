class Solution {

    public  Stack<Character> process(String s){
        
        Stack<Character> st = new Stack<>();

        for(int i=0 ;i<s.length() ;i++){

            if(s.charAt(i) != '#'){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty())
                    st.pop();
            }
        }
        return st;
    }
    public boolean backspaceCompare(String s, String t) {
        
        

        if( process(s).equals(process(t) ) ){
            return true;
        }

        return false;
    }
}