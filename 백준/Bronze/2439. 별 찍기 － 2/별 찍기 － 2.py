n = int(input())

star = []

for i in range(n+1, 1, -1):
        star.append(" ")

for i in range(n):
    del star[0]
    star.append('*')
    result = ''.join(star)
    print(result)