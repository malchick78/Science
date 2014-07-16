function v = monte4d(n)
	k=0;
	for i=1:n
		x=rand(1,1);
		y=2*rand(1,1);
		z=4*rand(1,1);
		if (sqrt(x^2+y^2/4+z^2/16)<=1)
			k=k+1;
		end
	end
	v=4^3*k/n;
endfunction