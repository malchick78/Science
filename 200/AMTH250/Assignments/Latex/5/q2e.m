eigmax = zeros(12,1);
eigmin = zeros(12,1);
for n = 1:12
	hilbeig = abs(eig(hilb(n)));
	condhilb(n)=cond(hilb(n));
	eigmax(n) = max(hilbeig);
	eigmin(n) = min(hilbeig);
end