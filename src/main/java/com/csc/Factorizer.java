package com.csc;
import java.util.ArrayList;

public class Factorizer 
{
  public String primeFactors(int input) 
  {
    ArrayList<Integer> factors = new ArrayList<>();

    if (input > 1)
    {
      for (int i = 2; i <= Math.sqrt(input); i += 1)
      {
        if (input % i == 0)
        {
          if (isPrime(i))
          {
            factors.add(i);
          }
          if (input/i != i)
          {
            if (isPrime(input/i))
            {
              factors.add(input/i);
            }
          }
        }
      }
    }

    String combined = "Prime factors for " + input + ": ";
    for (int i = 0; i < factors.size(); i++) 
    {
      int factor = factors.get(i);
      combined += factor + (i == factors.size() - 1 ? "." : ", "); // Check if last element
    }

    return input > 1 ? combined : "null";
  }

  public static boolean isPrime(int number)
  {
    if (number == 2) // 2 only even prime
    {
      return true;
    }
    if (number % 2 == 0) // even numbers not prime 
    {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(number); i += 2) // optimal bounds, found online
    {
      if (number % i == 0)
      {
        return false; // found factor, so not prime
      }
    }

    return true; // no factors found, must be prime
  }

  public boolean isComposite(int number)
  {
    return (number > 1 && !isPrime(number));
  }
}
