%calculates the machine costs by using the time 
%on each machine and the cost of operating it
time=[15 8 6; 8 10 9; 8 12 10; 12 4 12; 9 4 0];
rate=[9;9;12];
cost=ones(5,1);
cost=1/60*time*rate