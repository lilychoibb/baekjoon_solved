n = input()

dial = []

for i in n:
    if i in 'ABC':
        dial.append(3)
    elif i in 'DEF':
        dial.append(4)
    elif i in 'GHI':
        dial.append(5)
    elif i in 'JKL':
        dial.append(6)
    elif i in 'MNO':
        dial.append(7)
    elif i in 'PQRS':
        dial.append(8)
    elif i in 'TUV':
        dial.append(9)
    elif i in 'WXYZ':
        dial.append(10)

print(sum(dial))