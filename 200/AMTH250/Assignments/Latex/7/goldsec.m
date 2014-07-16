function [a,b] = goldsec(f, a0, b0, tol)
# Usage: [a, b] = goldsec (f, a0, b0, tol)
  tau = (sqrt(5) - 1)/2;
  a = a0;
  b = b0;
  x1 = a + (1 - tau)*(b-a);
  x2 = a + tau*(b-a);
  f1 = f(x1);
  f2 = f(x2);
  while (abs(b-a) > tol)
    if (f1 > f2)
       a = x1;
       x1 = x2;
       x2 = a + tau*(b-a);
       f1 = f2;
       f2 = f(x2);
    else
       b = x2;
       x2 = x1;
       x1 = a + (1 - tau)*(b-a);
       f2 = f1;
       f1 = f(x1);
    end
    if (x1 == a || x2 == b)
      return
    end
  end
endfunction
