%solves profit maximisation problem
obj=[5.35 4.5 5 4.7 3.05]'
cnstr=[15 8 8 12 9; 8 10 12 4 4; 6 9 10 12 0]
rhs=[4800,4800,4800]
lb=[0 0 20 30 0]'
ub=[]
ctype="UUU"
vtype="IIIII"
ptype=-1
[x,opt]=glpk(obj,cnstr,rhs,lb,ub,ctype,vtype,ptype)