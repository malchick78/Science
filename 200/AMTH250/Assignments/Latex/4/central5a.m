%central difference approximation to f'(x) for f(x)=sin(x) at x=1
n=-2:-1:-17;
h=10.^n;
exact=cos(1);
approx_c=(sin(1+h)-sin(1-h))./(2*h);
err_c= abs(approx_c-exact)/exact;
