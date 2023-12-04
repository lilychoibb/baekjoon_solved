n = list(input().upper())

number_n = []

new_n = []

for i in n:
    if not i in new_n:
        new_n.append(i)

for i in new_n:
    number = n.count(i)
    number_n.append(number)

max_value = max(number_n)

if number_n.count(max_value) >= 2:
    print("?")
else:
    most_common_letter = new_n[number_n.index(max_value)]
    print(most_common_letter)