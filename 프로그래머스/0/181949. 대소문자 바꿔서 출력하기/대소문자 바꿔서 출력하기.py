str_input = input()

result = []

for i in str_input:
    if i.islower():
        result.append(i.upper())
    else:
        result.append(i.lower())

# 결과를 문자열로 출력
print(''.join(result))
