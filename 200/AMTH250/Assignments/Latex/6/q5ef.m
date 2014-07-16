%fits an exponential function to a given set of data
r=polyfit(x,log(y),1)
plot(x,y,'ro')
hold on
xx=linspace(1,10,201)';
yy=e^r(2)*exp(r(1)*xx);
plot(xx,yy)
print('ef.eps','-deps')