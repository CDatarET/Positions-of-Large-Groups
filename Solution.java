class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        char c = s.charAt(0);
        int count = 0;
        int b = 0;
        for(int i = 0; i <= s.length(); i++){
            if(i == s.length()){
                if(count >= 3){
                    ArrayList<Integer> t = new ArrayList<Integer>();
                    t.add(b);
                    t.add(i - 1);
                    list.add(t);
                }
                break;
            }
            if(s.charAt(i) == c){
                count++;
            }
            else{
                if(count >= 3){
                    ArrayList<Integer> t = new ArrayList<Integer>();
                    t.add(b);
                    t.add(i - 1);
                    list.add(t);

                }
                b = i;
                count = 1;
            }
            c = s.charAt(i);
        }
        return(list);
    }
}
