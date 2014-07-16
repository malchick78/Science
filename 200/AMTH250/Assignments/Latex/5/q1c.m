%computes the real eigenvalues of the matrix and 
%their corresponding eigenvectors
eig(a)
[V,D]=eig(a)

k1=D(1,1)
v1=V(:,1)

k12=D(12,12)
v12=V(:,12)

k13=D(13,13)
v13=V(:,13)
