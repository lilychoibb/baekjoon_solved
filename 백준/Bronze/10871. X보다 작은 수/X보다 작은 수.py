n, x = map(int, input().split())

a = []

try:
    b = map(int, input().split())
    a.extend(b)
except:
    pass

c = []

for i in a:
    if i < x:
        c.append(str(i))

print(' '.join(c))