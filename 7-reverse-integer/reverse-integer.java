class Solution {

    public int reverse(int x) {
        int retval = 0;

        while(x!=0) {
            if(retval > Integer.MAX_VALUE / 10 || retval < Integer.MIN_VALUE / 10) return 0;
            retval = retval*10 + x%10;
            x = x/10;
        }

        return retval;
    }
}