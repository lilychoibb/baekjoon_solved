n, m = map(int, input().split())

number1 = list(map(int, str(n)))
number2 = list(map(int, str(m)))

number1[0], number1[2] = number1[2], number1[0]
number2[0], number2[2] = number2[2], number2[0]

change1 = ''.join(map(str, number1))
change2 = ''.join(map(str, number2))

result1 = int(change1)
result2 = int(change2)

if result1 > result2:
    print(result1)
else :
    print(result2)