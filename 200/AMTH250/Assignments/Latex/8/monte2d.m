function ii=monte2d(n)
	k=0;
	sumf=0;
	while (k<n)
		x=rand(1,1);
		y=rand(1,1);
		if (x.^2+y.^2<=1)
			k=k+1;
			sumf=sumf+exp(-sqrt(x.^2+y.^2));
		end
	end
	ii=(pi/2)*(sumf/n);
endfunction