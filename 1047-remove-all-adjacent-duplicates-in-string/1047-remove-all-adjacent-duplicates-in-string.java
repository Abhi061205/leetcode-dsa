
import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {

        int n = s.length();
        StringBuilder res = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }

            if (st.peek() == s.charAt(i)) {
                st.pop();
                continue;
            }

            st.push(s.charAt(i));
        }

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        res.reverse();

        return res.toString();
    }
}


// class Solution {
//     public String removeDuplicates(String s) {

//         int n = s.length();
//         String res;

//         Stack<Character> st = new Stack<>();

//         for(int i=0 ;i<n ;i++){

//             if(st.isEmpty()){
                
//                 st.push(s.charAt[i]);
//                 continue;
//             }

//             if(st.peek() == s.charAt[i]){

//                 st.pop();
//                 continue;
//             }
//             st.push(s[i]);
//         }

//         while(!st.isEmpty()){

//             res.push(st.peek());
//             st.pop();
//         }

//         res.reverse();


//         return res;
//     }
// }