x=-10:0.01:10;
c=@(x) cos(pi*x.^2/2);
s=@(x) sin(pi*x.^2/2);
		
for i=1:length(x)
	C(i)=quad(c,0,x(i));
	S(i)=quad(s,0,x(i));
end

plot(x,C)
print('fresc.eps','-deps')
plot(x,S)
print('fress.eps','-deps')
plot(S,C)
print('cornu.eps','-deps')