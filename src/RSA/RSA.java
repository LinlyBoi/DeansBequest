public class RSA
{
  double q,alpha,Xa,Xb;

  public static void main(String[] args)
  {
    RSA pair1 = new RSA(71, 7, 5, 12);
    System.out.println(pair1.getYa());
    System.out.println(pair1.getYb());
    System.out.println(pair1.getKey());
  }

  RSA(double q , double alpha, double Xa, double Xb)
  {
    if(isPrime(q))
    {
    this.q = q;
    this.alpha = alpha;
    this.Xa = Xa;
    this.Xb = Xb;
    }
    else
    System.out.println("q must be prime!");
  }

  //Get public keys 
  public double getYa()
  {
    return  Math.pow(alpha,Xa) % q; 
  }

  public double getYb()
  {
    return  Math.pow(alpha,Xb) % q; 
  }

  //Generate Key
  public double getKey()
  {
    double Kab,Kba;
    Kab = Math.pow(getYb(),Xa) % (int) q;
    System.out.println(Kab);
    Kba = Math.pow(getYa(),Xb) % (int) q;
    System.out.println(Kba);
    if(Kab == Kba)
      return  Kab;
    else if(Math.abs(Kab - Kba) <= 1.9 && Kab > Kba)
      return Kab;
    else if(Math.abs(Kab - Kba) <= 1.9 && Kba > Kab)
      return Kba;
    else 
      return 0;
  }
  //Check if number is prime
  public static boolean isPrime(double n)
  {
    for(double i=2;i<n;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
