n = int(input())

a = []

try:
    b = map(int, input().split())
    a.extend(b)
except:
    pass

print(min(a), max(a))