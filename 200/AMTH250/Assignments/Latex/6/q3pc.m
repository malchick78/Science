%computes and plots the pchip interpolants and
%their first, second and third derivatives
pp=interp1(xx,yy,'pchip','pp');
x=linspace(1,7,917);
subplot(2,2,1)
plot(x,ppval(pp,x))
hold on
plot(xx,yy,'ro')
title('Pchip')
pp1=ppderiv(pp);
subplot(2,2,2)
plot(x,ppval(pp1,x))
title('First derivative')
pp2=ppderiv(pp1);
subplot(2,2,3)
plot(x,ppval(pp2,x))
xlabel('Second derivative')
pp3=ppderiv(pp2);
subplot(2,2,4)
plot(x,ppval(pp3,x))
xlabel('Third derivative')
print('q3pc.eps','-deps')