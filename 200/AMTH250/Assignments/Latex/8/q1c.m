f3=@(x) tan(sin(x))-sin(tan(x));
ezplot(f3, [0,pi])
print('f3.eps','-deps')
[intf3,ierr3,nf3,eerr3]=quad(f3,0,pi,[1e-12 0])