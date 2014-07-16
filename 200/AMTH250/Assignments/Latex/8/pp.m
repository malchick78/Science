plot(y(:,1),y(:,2))
xlabel('y1')
ylabel('y2')
print('pp1.eps','-deps')

plot(y(:,1),y(:,3))
xlabel('y1')
ylabel('y3')
print('pp2.eps','-deps')

plot(y(:,2),y(:,3))
xlabel('y2')
ylabel('y3')
print('pp3.eps','-deps')