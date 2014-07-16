r21=conc-c21;
norm(r21)
r22=conc-c22;
norm(r22)
r23=conc-c23;
norm(r23)
r24=conc-c24;
norm(r24)

r41=conc-c41;
norm(r41)
r42=conc-c42;
norm(r42)
r43=conc-c43;
norm(r43)
r44=conc-c44;
norm(r44)

subplot(2,1,1)
plot(t,r22)
title('n1=2, n2=2')

subplot(2,1,2)
plot(t,r42)
xlabel('n1=4, n2=2')
print('ptres.eps','-deps')