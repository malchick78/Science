[a11 c11]=polytrig(tt,conc,k,1,1);
[a12 c12]=polytrig(tt,conc,k,1,2);
[a13 c13]=polytrig(tt,conc,k,1,3);
[a14 c14]=polytrig(tt,conc,k,1,4);

[a21 c21]=polytrig(tt,conc,k,2,1);
[a22 c22]=polytrig(tt,conc,k,2,2);
[a23 c23]=polytrig(tt,conc,k,2,3);
[a24 c24]=polytrig(tt,conc,k,2,4);

[a41 c41]=polytrig(tt,conc,k,4,1);
[a42 c42]=polytrig(tt,conc,k,4,2);
[a43 c43]=polytrig(tt,conc,k,4,3);
[a44 c44]=polytrig(tt,conc,k,4,4);

subplot(2,2,1)
plot(t,conc)
hold on
plot(t,c11,'r')
title('n2=1')
hold off

subplot(2,2,2)
plot(t,conc)
hold on
plot(t,c12,'r')
title('n2=2')
hold off

subplot(2,2,3)
plot(t,conc)
hold on
plot(t,c13,'r')
xlabel('n2=3')
hold off

subplot(2,2,4)
plot(t,conc)
hold on
plot(t,c14,'r')
xlabel('n2=4')
hold off

print('pt1.eps','-deps')

subplot(2,2,1)
plot(t,conc)
hold on
plot(t,c21,'r')
title('n2=1')
hold off

subplot(2,2,2)
plot(t,conc)
hold on
plot(t,c22,'r')
title('n2=2')
hold off

subplot(2,2,3)
plot(t,conc)
hold on
plot(t,c23,'r')
xlabel('n2=3')
hold off

subplot(2,2,4)
plot(t,conc)
hold on
plot(t,c24,'r')
xlabel('n2=4')
hold off

print('pt2.eps','-deps')

subplot(2,2,1)
plot(t,conc)
hold on
plot(t,c41,'r')
title('n2=1')
hold off

subplot(2,2,2)
plot(t,conc)
hold on
plot(t,c42,'r')
title('n2=2')
hold off

subplot(2,2,3)
plot(t,conc)
hold on
plot(t,c43,'r')
xlabel('n2=3')
hold off

subplot(2,2,4)
plot(t,conc)
hold on
plot(t,c44,'r')
xlabel('n2=4')
hold off

print('pt3.eps','-deps')
