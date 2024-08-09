mx=0
a=[]

#9번 돌아감
# b에 숫자를 입력받고 a에 집어넣음 >> 인덱스 찾아야돼서 >> 배열 없이 그냥 최대값 찾았을때 i를 저장..? >> 근데 이거 배열 문제자나ㅋㅋ큐ㅠ
# 현재 최대값이 b보다 작으면 b를 최대값으로 설정
for i in range(9):
    b=int(input())
    a.append(b)
    if (mx<b):
        mx=b
print(mx)
print(a.index(mx)+1)
