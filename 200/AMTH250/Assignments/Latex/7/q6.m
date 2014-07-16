a=linspace(0,pi/2,100)';
c=9.80665/800;
p=[c*ones(length(a),1) -sin(a).*cos(a) 13*cos(a).^2];
pr=zeros(length(a),2);  
maxpr=zeros(length(a),1);  
for i=1:length(a)
  pr(i,1:2)=roots(p(i,:));
  maxpr(i)=max(pr(i,1:2));
end
xmax
