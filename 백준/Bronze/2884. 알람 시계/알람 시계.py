hour, minute = map(int, input().split())

if (hour == 0) and (0 <= minute <= 44) :
    hour = hour + 23
    minute = minute + 60 - 45
    print(hour, minute)
elif 0 <= minute <= 44 :
    hour = hour - 1
    minute = minute + 60 - 45
    if minute == 60:
        minute = 0
        print(hour + 1, minute)
    else:
        print(hour, minute)
else :
    print(hour, minute - 45)