n, m = map(int, input().split())

basket = [_ for _ in range(1, n+1)]

for _ in range(m):
    i, j = map(int, input().split())
    while i < j:
        basket[i-1], basket[j-1] = basket[j-1], basket[i-1]
        i += 1
        j -= 1

for _ in basket:
    print(_, end = ' ')