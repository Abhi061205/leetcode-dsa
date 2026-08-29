class Solution {
    public int maxVowels(String s, int k) {

        int max=0;
        int vcount=0;
        int l=0;

        Set <Character> v = new HashSet<>();

        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');


    


        for(int i=0; i<k ;i++){

            if(v.contains(s.charAt(i))){
                vcount++;
            }
        }
        max = vcount;


        for(int j=k ;j<s.length() ;j++){

            if(v.contains(s.charAt(j))){
                vcount++;
            }
            
            if(v.contains(s.charAt(j-k))){
                vcount--;
               
            }

            max = Math.max(max , vcount);
        }


return max;
        



        // int j=k;
        // int count=0,l=0;
       
        // int max=Integer.MIN_VALUE;

        // for(int i=0 ;i < k ; i++){
                
        //     if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'||s.charAt(i) == 'o'|| s.charAt(i) == 'u'){

        //         count++;
        //     }
        // }

        // while(j < s.length()){
             
        //      if(s.charAt(j) == 'a' || s.charAt(j) == 'e'|| s.charAt(j) == 'i'||s.charAt(j) == 'o'|| s.charAt(j) == 'u'){
        //         count++;
        //      }else if(s.charAt(l) == 'a' || s.charAt(l) == 'e'|| s.charAt(l) == 'i'||s.charAt(l) == 'l'|| s.charAt(i) == 'l'){

        //      }

        //     if(count > max){
        //         max = count;
        //     }

        //     j++;
        // }

        // return max;
        
    }
}