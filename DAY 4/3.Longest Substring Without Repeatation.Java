class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap <Character,Integer> hm=new HashMap();
        int i=0,j=0,count=0,max=0;
        int len=s.length();
        while(i<len){
            while(hm.get(s.charAt(i))!=null)
            {
            hm.remove(s.charAt(j));
            j++;
            }
            hm.put(s.charAt(i),i);
            count=(i-j)+1;
            i++;
            if(count>max){
            max=count;
            }
        }
        return max;
        
    }
}
