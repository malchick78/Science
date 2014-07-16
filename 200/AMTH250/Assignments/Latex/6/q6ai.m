co2=load('co2_mm_mlo.txt');
t=co2(:,3);
conc=co2(:,5);

p1=polyfit(t,conc,1)
subplot(2,2,1)
plot(t,conc)
hold on
plot(t,polyval(p1,t),'r')
title('Straight line')
hold off

p2=polyfit(t,conc,2)
subplot(2,2,2)
plot(t,conc)
hold on
plot(t,polyval(p2,t),'r')
title('Quadratic polynomial')
hold off

p3=polyfit(t,conc,3)
subplot(2,2,3)
plot(t,conc)
hold on
plot(t,polyval(p3,t),'r')
xlabel('Cubic polynomial')
hold off

p4=polyfit(t,conc,4)
subplot(2,2,4)
plot(t,conc)
hold on
plot(t,polyval(p4,t),'r')
xlabel('Quartic polynomial')
hold off

print('pfits.eps','-deps')

subplot(2,2,1)
plot(t,conc-polyval(p1,t))
title('Straight line')
subplot(2,2,2)
plot(t,conc-polyval(p2,t))
title('Quadratic polynomial')
subplot(2,2,3)
plot(t,conc-polyval(p3,t))
xlabel('Cubic polynomial')
subplot(2,2,4)
plot(t,conc-polyval(p4,t))
xlabel('Quartic polynomial')

print('pres.eps','-deps')

norm(conc-polyval(p1,t))
norm(conc-polyval(p2,t))
norm(conc-polyval(p3,t))
norm(conc-polyval(p4,t))