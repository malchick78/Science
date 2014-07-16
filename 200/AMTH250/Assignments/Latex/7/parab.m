function xx = parab(f, a0, b0, c0, n)
  xx = zeros(1,n);
  a  = a0;
  b  = b0;
  c  = c0;
  fa = f(a);
  fb = f(b);
  fc = f(c);
  for i = 1:n
    x = b - ((fb-fc)*(b-a)^2 - (fb-fa)*(b-c)^2) / ... 
            (2*((fb-fc)*(b-a) - (fb-fa)*(b-c)));
    fx = f(x);
    xx(i) = x;
    if (x > b)
      if (fx > fb)
        c  = x;
        fc = fx;
      else
        a  = b;
        fa = fb;
        b  = x;
        fb = fx;
      end
    else
      if (fx > fb)
        a  = x;
        fa = fx;
      else
        c  = b;
        fc = fb;
        b  = x;
        fb = fx;
      end
    end
  end
endfunction