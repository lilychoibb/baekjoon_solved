number = []

for i in range(10):
    n = int(input())
    number.append(n)

rest = []

for i in number:
    rest_val = i % 42
    if not rest_val in rest:
        rest.append(rest_val)

result = len(rest)

print(result)