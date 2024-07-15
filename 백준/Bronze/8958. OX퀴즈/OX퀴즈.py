n=int(input())

# TC수만큼 돌리기
for i in range(0,n):
    # 카운트, 점수누계 초기화
    check=0
    hap=0

    #문제 입력
    a=input()

    # a를 하나씩 돌면서 O를 만나면 +1, x를 만나면 0으로 초기화
    for j in a:        
        if (j=="O"):
            check+=1

        elif (j=="X"):
            check=0

        #한개 확인하고나서 점수에 추가해준다
        hap+=check
        
    print(hap)