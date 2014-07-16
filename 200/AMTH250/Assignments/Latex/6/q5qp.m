%fits a quadratic polynomial to a given set of data
x=(1:10)';
b=vander(x,3);
y=[27.7 39.3 38.4 57.6 46.3 54.8 108.5 137.6 194.1 281.2]';
a=(b\y)'
plot(x,y,'or')
hold on
xx=linspace(1,10,201)';
plot(xx,polyval(a,xx))