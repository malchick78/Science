f=@(t,y) -2*t*y;
N=16;
h=zeros(1,N);
y1=zeros(1,N);
for k=1:N
	hk=2^-k;
	h(k)=hk;
	[t y]=euler(f,0,1,hk,2^k);
	y1(k)=y(end);
end

plot(t,y)
xlabel('t')
ylabel('y')
print('euler.eps','-deps')

err=y-exp(-t.^2);
plot(t,err)
xlabel('t')
ylabel('error')
print('error.eps','-deps')

err1=abs(exp(-1)-y1);
plot(h,err1)
xlabel('h')
ylabel('error')
print('err1.eps','-deps')