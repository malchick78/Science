function x = newton(x0, f, df, n)
  x = zeros(1,n+1);
  x(1) = x0;
  for k = 1:n
    x(k+1) = x(k) - f(x(k))/df(x(k));
  end
endfunction