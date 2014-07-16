%solves a system the 13x13 system of linear equations and estimates the error
k=sqrt(2)/2; %alpha

a=zeros(13,13); %initialise matrix and rhs to zeros
b=zeros(13,1);

a(1,2)=1; %1st equation
a(1,6)=-1;

a(2,3)=1; %2nd equation
b(2)=10;

a(3,1)=k;
a(3,4)=-1;
a(3,5)=-k;

a(4,1)=k;
a(4,3)=1;
a(4,5)=k;

a(5,4)=1;
a(5,8)=-1;

a(6,7)=1;

a(7,5)=k;
a(7,6)=1;
a(7,9)=-k
a(7,10)=-1;

a(8,5)=k;
a(8,7)=1;
a(8,9)=k;
b(8)=15;

a(9,10)=1;
a(9,13)=-1;

a(10,11)=1;
b(10)=20;

a(11,8)=1;
a(11,9)=k;
a(11,12)=-k;

a(12,9)=k;
a(12,11)=1;
a(12,12)=k;

a(13,12)=k;
a(13,13)=1;

x=a\b;
esterr=cond(a)*eps;
disp("Solution:"), disp(x)
disp("Estimated error:"), disp(esterr)