n = int(input())

for i in range(n):
    r, s = input().split()
    r = int(r)
    result = ""
    for a in s:
        result += r * a 
    print(result)