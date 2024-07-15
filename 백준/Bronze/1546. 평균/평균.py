n=int(input())
a=list(map(int,input().split(sep=" ")))
m=max(a)
for i in range(0,n):
    a[i]=(a[i]/m)*100
print(sum(a)/n)