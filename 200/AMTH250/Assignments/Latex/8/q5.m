global sigma b r
sigma=10;
b=8/3;
r=28;

t=(0:0.01:100)';
y=lsode(@lv,[0 1 0],t);