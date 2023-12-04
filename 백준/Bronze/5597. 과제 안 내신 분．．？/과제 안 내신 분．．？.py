number = []

for i in range(28):
    n = int(input())
    number.append(n)

number.sort()

for i in range(1, 31):
    if not i in number:
        print(i)