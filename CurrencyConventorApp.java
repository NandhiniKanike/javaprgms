final class CurrencyConventor
{
    final String baseCurrency="INR";
    final double convertToUSD(double amountInINR)
    {
        return amountInINR*0.012;

    }
    public void dispalyBaseCurrency()
    {
        System.out.println("Base Curremcy :"+baseCurrency);
    }
}
// class AdvancedConventor extends CurrencyConventor
// {
//     public double convertToUSD(double amountInINR)
//     {
//         return amountInINR*0.013;
//     }
// }
public class CurrencyConventorApp 
{
    public static void main(String[] args) 
    {
        CurrencyConventor converter=new CurrencyConventor();
        converter.dispalyBaseCurrency();
        double usd=converter.convertToUSD(1000);
        System.out.println("INR 1000=USD "+usd);
        
    }
    
}
