function [t, y] = euler(f, t0, y0, dt, n)
  k = length(y0);       % this determines the number of equations
  t = zeros(n+1, 1);
  y = zeros(n+1, k);
  t(1) = t0;
  y(1,:) = y0;
  for i = 1:n
    t(i+1) = t(i) + dt;
    y(i+1,:) = y(i,:) + f(y(i,:), t(i))*dt;
  end
endfunction