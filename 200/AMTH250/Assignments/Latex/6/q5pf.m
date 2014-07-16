%fits a power function to a given set of data
s=polyfit(log(x),log(y),1)
plot(x,y,'ro')
hold on
xx=linspace(1,10,201)';
yy=e^s(2)*xx.^s(1);
plot(xx,yy)
print('pf.eps','-deps')