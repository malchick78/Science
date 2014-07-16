coeffs=zeros(10,11);
for n2=1:10
 coeffs(n2,1:n2+1)=polytrig(tt,conc,k,4,n2);
end