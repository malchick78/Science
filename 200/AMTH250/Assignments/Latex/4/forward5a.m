%forward difference approximation to f'(x) for f(x)=sin(x) at x=1
n=-2:-1:-17;
h=10.^n;
exact=cos(1);
approx_f=(sin(1+h)-sin(1))./h;
err_f= abs(approx_f-exact)/exact;
