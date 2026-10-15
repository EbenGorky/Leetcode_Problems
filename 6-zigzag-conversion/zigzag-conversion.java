class Solution {

    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) {
            arr[i] = new StringBuilder();
        }

        int a = 0;
        while(a<s.length()) {
            for(int i=0;i<numRows && a<s.length();i++) {
                arr[i].append(s.charAt(a++));
            }

            for(int i=numRows-2;i>0 && a<s.length();i--) {
                arr[i].append(s.charAt(a++));
            }
        }

        StringBuilder retstr = new StringBuilder();
        for(StringBuilder ss : arr) {
            retstr.append(ss);
        }
        
        return retstr.toString();
    }
}