%computes f(x)=(e^x-1)/x for x=10^(-k), k=1,...,15
k=1:1:15;
x=10.^(-k);
f=(e.^x-1)./x;
exact=1;
err=abs(f-exact);
plot(k,log(err))
axis([0,16,-20,0])
xlabel('k')
ylabel('ln Error')
