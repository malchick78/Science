x=linspace(-1,1,201);
plot(x,wave(x))
hold on 
plot([-1 1],[0 0])
print('wave.eps','-deps')

fzero(@wave,[-1,-0.8])
fzero(@wave,[-0.8,-0.5])
fzero(@wave,[-0.5,-0.1])
fzero(@wave,[-0.1,0.1])
fzero(@wave,[0.1,0.5])
fzero(@wave,[0.5,0.8])
fzero(@wave,[0.8,1])