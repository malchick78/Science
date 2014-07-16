%log-log plots of error against h comparing 
% central and forward difference approximation
loglog(h,err_c,'b',h,err_f,'r')
xlabel('ln h')
ylabel('ln Error')
legend('Central','Forward')