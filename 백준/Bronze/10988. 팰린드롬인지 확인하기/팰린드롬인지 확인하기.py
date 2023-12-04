n = list(input())

reverse_n = []

for i in reversed(n):
    reverse_n.append(i)
    
if ''.join(n) == ''.join(reverse_n):
    print(1)
else:
    print(0)