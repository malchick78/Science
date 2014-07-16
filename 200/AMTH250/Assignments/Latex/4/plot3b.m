%graph of f(x)=1/(1-x^2) with vertical asymptotes
x3=linspace(-2,2,318)
f3=1./(1-x3.^2);
plot(x3,f3)
axis([-2,2,-5,5])
xaxis=zeros(1,318);
hold on
plot(x3,xaxis,'.')