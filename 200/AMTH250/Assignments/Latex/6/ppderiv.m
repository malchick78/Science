function ppd = ppderiv(pp)
% derivative of a piecewise polynomial
  ppd.x = pp.x;
  ppd.P =zeros(pp.n, pp.k-1);
  for j = 1:pp.n 
    ppd.P(j,:) = polyderiv(pp.P(j,:));
  end
  ppd.n = pp.n;
  ppd.k = pp.k-1;
  ppd.d = pp.d;
endfunction
    
