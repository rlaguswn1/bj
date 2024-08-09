h,m=map(int,input().split())
cook=int(input())
a=cook+m
b=int(a/60)
c=int(b+h)
if c>=24:
    c-=24
d=a-(b*60)
print(c, d)