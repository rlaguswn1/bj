b=[]
for i in range(10):
    b.append(int(input())%42)
print(len(set(b)))