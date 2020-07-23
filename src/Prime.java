public class Prime {
    /**
     * checks whether given number p is prime number
     * @param p: input number
     * @return whehter p is prime number
     */
    public boolean primechecker(int p){
        for(int i = 0 ; i< Math.sqrt(p);i++){
            if(p%i == 0)
                return false;
        }
        return true;
    }
}
