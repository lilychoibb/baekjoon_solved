total = int(input())
n = int(input())

price = []

for i in range(1, n+1):
    a, b = map(int, input().split())
    multi = a*b
    price.append(multi)

if sum(price) == total:
    print("Yes")
else:
    print("No")