xx=1:1:7;
yy=[1.9 2.7 4.8 5.3 7.1 9.4 11.3];
pp=interp1(xx,yy,'spline','pp');
x=linspace(1,7,917);
plot(x,ppval(pp,x))
hold on
plot(xx,yy,'ro')
pp1=ppderiv(pp);
plot(x,ppval(pp1,x))
pp2=ppderiv(pp1);
plot(x,ppval(pp2,x))
print('s3cs.eps','-deps')