hour, minute = map(int, input().split())
cookmin = int(input())

fin_min = minute + cookmin

if (fin_min // 60) >= 1 :
    hour = hour + fin_min // 60
    if hour > 23 :
        hour = hour - 24
        fin_min = fin_min - (fin_min // 60)*60
        print(hour, fin_min)
    else:
        fin_min = fin_min - (fin_min // 60)*60
        print(hour, fin_min)        
else :
    fin_min = minute + cookmin
    print(hour, fin_min)