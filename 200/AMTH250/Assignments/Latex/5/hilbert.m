function h=hilbert(n)
	for i=1:n
	for j=1:n
		h(i,j)=1/(i+j-1);
	end
	end
endfunction