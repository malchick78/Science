f=@(x) -1./((x-0.3).^2+0.01)-1./((x-0.9).^2+0.04)
ezplot(f,[-1,2])
axis([-1 2 -110 1])
print('fmin.eps','-deps')
