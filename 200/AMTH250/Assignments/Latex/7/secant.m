function x = secant (x0, x1, f, n)
  x = zeros(1, n+2);
  x(1) = x0;
  x(2) = x1;
  for k = 2:n+1
    if (x(k) == x(k-1))
      x(k+1) = x(k);
    else
      x(k+1) = x(k) - f(x(k))*(x(k) - x(k-1))/(f(x(k)) - f(x(k-1)));
    end
  end
endfunction