%interpolates the square root function using a cubic spline
xx=[0 .01 .04 .09 .16 .25];
yy=[0 .1 .2 .3 .4 .5];
x=linspace(0,.25,917);
y=sqrt(x);
pp=interp1(xx,yy,'spline','pp');
plot(x,ppval(pp,x),x,y)
hold on
plot(xx,yy,'ro')
print('cubicspline.eps','-deps')
