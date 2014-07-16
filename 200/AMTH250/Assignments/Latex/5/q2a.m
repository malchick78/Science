%graphs the ln of the condition number of a
%30 x 30 Hilbert matrix
chilb=zeros(30,1);
for n=1:30
	chilb(n)=cond(hilb(n));
end
semilogy(chilb)
print('chilb.eps','-deps')