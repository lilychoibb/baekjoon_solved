a = int(input())
b = int(input())

def get_ones_digit(b):
    ones_digit = b % 10
    return ones_digit

def get_tens_digit(b):
    tens_digit = (b // 10) % 10
    return tens_digit

def get_hun_digit(b):
    hun_digit = (b // 10) // 10
    return hun_digit

result1 = get_ones_digit(b)
result2 = get_tens_digit(b)
result3 = get_hun_digit(b)

print(a*result1)
print(a*result2)
print(a*result3)
print((a*result1)+(a*result2*10)+(a*result3*100))