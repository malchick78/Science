function [a, b] = bisect (f, a0, b0, tol)
# Usage: [a, b] = bisect (f, a0, b0, tol)
  if (f(a0) == 0)
    a = a0; b = a0;
    return
  elseif (f(b0) == 0)
    a = b0; b = b0;
    return
  elseif (sign(f(a0)) == sign(f(b0)))
    error ("function has same sign at both endpoints")
  end
  a = a0;
  b = b0;
  while (abs(a-b) > tol)
    m = a + (b-a)/2;
    if (f(m) == 0)
      a = m; b = m;
      return
    elseif (m == a || m == b)
      return
    elseif (sign(f(m)) == sign(f(a)))
      a = m;
    else
      b = m;
    end
  end
endfunction
