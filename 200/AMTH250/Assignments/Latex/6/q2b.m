%interpolates the square root function using a pchip cubic 
pp=interp1(xx,yy,'pchip','pp');
plot(x,ppval(pp,x),x,y)
axis([0,.25,0,.5])
hold on
plot(xx,yy,'ro')
print('pchip.eps','-deps')