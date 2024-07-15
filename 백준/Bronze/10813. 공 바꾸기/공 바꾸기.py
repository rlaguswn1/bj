n, m = map(int, input().split(sep=" ")) #n, m을 받음

'''
n=바구니 갯수
m = 몇 줄
'''
a=[]
for i in range(1,n+1):
    a.append(i)

while(m>0):
    i, j =map(int, input().split(sep=" "))
    '''
    공 바꾸기
    일단.. n개의 요소를 가진 리스트를 어케 만들지 0을 n번 append
    
    들어온 숫자를 가지고 바로 바꾸면 안됨 >> 처음엔 괜찮은데 1번 바구니에 3번 공이 들어있다든가 하면 안됨
    들어온 숫자는 a에서 인덱스 지정하는 용도로 쓰고
    무슨 공이 어디 들어있나를 어떻게..?
    a[x]에 공을 넣고 바꿀때는 a[x]에 들은 걸 바꾸는..식인데
    변수 하나 넣어서 tmp로 쓰면 되나

    a[x]에 있던걸 tmp에 넣고
    a[y]에 있던걸 a[x]로 옮기고
    tmp에 있던걸 a[y]로 옮기고

    '''
    tmp=a[i-1]
    a[i-1]=a[j-1]
    a[j-1]=tmp

    m-=1

for x in a:
    print(x)