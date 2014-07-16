plot(y1(:,1),y1(:,2))
xlabel('y1')
ylabel('y2')
print('pp1s.eps','-deps')

plot(y1(:,1),y1(:,3))
xlabel('y1')
ylabel('y3')
print('pp2s.eps','-deps')

plot(y1(:,2),y1(:,3))
xlabel('y2')
ylabel('y3')
print('pp3s.eps','-deps')