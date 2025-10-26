class Solution {
    public long removeZeros(long n) {
        StringBuilder sb=new StringBuilder();
        long r=0;
        while(n!=0){
            r=n%10;
            if(r!=0)
                sb.append(r);
            n=n/10;
        }
        String s=sb.reverse().toString();
        long res=Long.parseLong(s);
        return res;
    }
}
