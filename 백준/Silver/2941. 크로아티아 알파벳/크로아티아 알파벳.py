kro = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

n = input()

num = 0

for i in kro:
    num += n.count(i)
    n = n.replace(i, '2')

n = n.replace('2', '')
print(num + len(n))