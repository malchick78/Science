maxeig = zeros(30,1);
mineig = zeros(30,1);
for n = 1:30
	eighilb = abs(eig(hilb(n)));
	maxeig(n) = max(eighilb);
	mineig(n) = min(eighilb);
end
subplot(2,1,1)
plot(maxeig)
title('Maximum eigenvalues')
subplot(2,1,2)
semilogy(mineig)
title('Minimum eigenvalues')
xlabel('n')
print('maxeig.eps','-deps')