coeffs=zeros(10,11);
for n1=1:10
 coeffs(n1,1:n1+1)=fliplr(polytrig(tt,conc,k,n1,0));
end