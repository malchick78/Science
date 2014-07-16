function y=target(x,a)
	y=9.80665*x.^2/(800*cos(a).^2)-tan(a)*x+13;
endfunction