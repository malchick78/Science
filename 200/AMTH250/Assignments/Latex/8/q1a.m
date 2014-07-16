f1=@(x) x.^3./(e.^x-1);
ezplot(f1, [0,15])
print('f1.eps','-deps')
[intf1,ierr1,nf1,eerr1]=quad(f1,0,Inf,[1e-13 0])