a, b, c = map(int, input().split())

if a == b == c :
    print(10000 + (a or b or c) * 1000)
elif (a == b) or (b == c) or (c == a) :
    if a == b :
        print(1000 + (a or b) * 100)
    elif b == c :
        print(1000 + (b or c) * 100)
    else :
        print(1000 + (c or a) * 100)
else:
    if a > b and a > c :
        print(a * 100)
    elif b > a and b > c:
        print(b * 100)
    else:
        print(c * 100)