f2=@(x) log(1+x).*log(1-x);
ezplot(f2, [-1,1])
print('f2.eps','-deps')
[intf2,ierr2,nf2,eerr2]=quad(f2,-1,1,[1e-13 0])