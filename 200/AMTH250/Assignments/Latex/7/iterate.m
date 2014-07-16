function x=iterate(g,x0,n)
	x=zeros(1,n+1);
	x(1)=x0;
	for i=1:n
		x(i+1)=g(x(i));
	end
endfunction