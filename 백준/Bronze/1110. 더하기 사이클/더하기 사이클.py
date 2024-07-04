# n 입력
n=input()

# n이 한자리수일 경우를 대비
# n이 10보다 작으면 >> a=0, b는 n의 0번 인덱스(str이라 인덱스 가능)
# 그 외 경우 >> a,b는 n의 0, 1번 인덱스
if (int(n)<10):
    a=0
    b=int(n[0])
else:
    a,b=int(n[0]),int(n[1])

# 이 이후로 n은 str이어야할 경우가 없으니 미리 변환
n=int(n)

#변수 설정
c=0
hap=0

# while 몇번 돌았나 체크. 0이면 수가 안세져서 일단 땜빵
# 근데 아름답지 못한것 같아
# 0이면 왜 수가 안세질까? >> hap이 0이라서 n이랑 같아짐 >> hap을 1로 바꾸면..? 
# n이 1이면 돌아가나????!!!!
#.. -1같은걸로 넣어볼까
# if (n==0):
#     check=1
# else:
#     check=0

hap=-1
check=0

# 횟수 한 번 올리고
# a+b값 c에 넣고
# a에 b값 넣고
# c는 str로 바꾸고
# c가 10보다 작으면 >> b는 c의 첫번째 자리수
# 그외 경우 >> b는 c의 두번째 자리수
# a,b 이어붙여서 hap에 넣기
# hap이 n과 같으면 끝, 횟수 출력
while(n!=hap):
    check+=1
    c=a+b
    a=b
    c=str(c)
    if (int(c)<10):
        b=c[0]
    else:
        b=c[1]

    hap=int(str(a)+b)
    b=int(b)
print(check)