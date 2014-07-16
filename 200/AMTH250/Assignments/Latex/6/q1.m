%determines the coefficients of an interpolating function
x=[-2 -1 0 1 2]';
aa=[exp(-2*x) exp(-x) ones(5,1) exp(x) exp(2*x)]
b=[125.948 7.673 -4.000 -14.493 -103.429]'
a=aa\b