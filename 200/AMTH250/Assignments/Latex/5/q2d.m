%uses the 'hilbert' function to find the minimum and
%maximum eigenvalues
for n=1:30
	hilbert(n);
	eig(hilbert(n))	
	emin=min(eig(hilbert(n)))
	emax=max(eig(hilbert(n)))
end
%subplot(2,1,1)
%semilogy(emin)
%subplot(2,1,2)
%semilogy(emax)
%subplot(1,1,1)
%print('eminmax.eps','-deps')