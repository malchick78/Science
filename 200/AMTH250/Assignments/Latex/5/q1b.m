%compares estimated and actual errors for the 13x13 system of linear equations
x0=zeros(13,1);

x0(1)=-20*sqrt(2);
x0(2)=20;
x0(3)=10;
x0(4)=-30;
x0(5)=10*sqrt(2);
x0(6)=20;
x0(7)=0;
x0(8)=-30;
x0(9)=5*sqrt(2);
x0(10)=25;
x0(11)=20;
x0(12)=-25*sqrt(2);
x0(13)=25;

err=norm(x-x0)/norm(x0);
disp("Actual error:"), disp(err)
disp("Ratio estimate/actual:"), disp(esterr/err)