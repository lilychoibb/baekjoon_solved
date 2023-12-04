n = input()

alphabet = 'abcdefghijklmnopqrstuvwxyz'

result = []

for i in alphabet:
    if i in n:
        indexing = n.index(i)
        result.append(indexing)
    else:
        result.append(-1)
print(' '.join(map(str, result)))