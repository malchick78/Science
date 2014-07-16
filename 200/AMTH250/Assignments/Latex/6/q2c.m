%interpolates the square root function using a polynomial
%of degree 5 
p=polyfit(xx,yy,5)
px=polyval(p,x);
plot(x,px,x,y)
hold on
plot(xx,yy,'ro')
print('poly5.eps','-deps')