%graph of f(x)=(x-3)(x-1)
x1=linspace(0,4,200);
f1=x1.^2-4*x1+3;
plot(x1,f1)
hold on
xaxis=zeros(1,200);
plot(x1,xaxis,'.')
hold on
x1=1;
f1=x1.^2-4*x1+3;
plot(x1,f1,'x')
hold on
x1=3;
f1=x1.^2-4*x1+3;
plot(x1,f1,'x')