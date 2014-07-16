%reads in data
co2=load('co2_mm_mlo.txt');
t=co2(:,3);
conc=co2(:,5);

%rescale time and computes constant k
tt=(t-mean(t))/std(t);
k=2*pi*std(t)

%polynomial fits for up to degree 4
[a10 c10]=polytrig(tt,conc,k,1,0);
subplot(2,2,1)
plot(t,conc)
hold on
plot(t,c10,'r')
title('Straight line')
hold off

[a20 c20]=polytrig(tt,conc,k,2,0);
subplot(2,2,2)
plot(t,conc)
hold on
plot(t,c20,'r')
title('Quadratic')
hold off

[a30 c30]=polytrig(tt,conc,k,3,0);
subplot(2,2,3)
plot(t,conc)
hold on
plot(t,c30,'r')
xlabel('Cubic')
hold off

[a40 c40]=polytrig(tt,conc,k,4,0);
subplot(2,2,4)
plot(t,conc)
hold on
plot(t,c40,'r')
xlabel('Quartic')
hold off

print('pfits.eps','-deps')

subplot(2,2,1)
r10=conc-c10;
plot(t,r10)
title('Straight line')
subplot(2,2,2)
r20=conc-c20;
plot(t,r20)
title('Quadratic')
subplot(2,2,3)
r30=conc-c30;
plot(t,r30)
xlabel('Cubic')
subplot(2,2,4)
r40=conc-c40;
plot(t,r40)
xlabel('Quartic')

print('pres.eps','-deps')

%norms of the residuals
d10=norm(r10)
d20=norm(r20)
d30=norm(r30)
d40=norm(r40)