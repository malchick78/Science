c=1e-10*randn(1,1);
d=1e-10*randn(1,1);
g=1e-10*randn(1,1);

t=(0:0.01:100)';
y1=lsode(@lv,[c 1+d g],t);