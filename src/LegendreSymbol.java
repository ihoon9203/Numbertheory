
public class LegendreSymbol {
    Prime prime = new Prime();
    /**
     * Calculates legendre symbol (p/q)
     * @param p parameter p
     * @param q parameter q
     * @return (p/q)
     */
    public int legendre(int p, int q){
        //if p divides q or q is not an odd prime number
        if(q%p == 0 || !prime.primechecker(q)|| q==2){
            return 0;
        }
        else{

        }
        return 0;
    }
}
