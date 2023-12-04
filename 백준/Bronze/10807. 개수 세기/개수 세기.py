n = int(input())

a = []

try:
    b = map(int, input().split())
    a.extend(b)
except:
    pass

v = int(input())

v_count = 0
for i in a:
    if i == v:
        v_count += 1

print(v_count)