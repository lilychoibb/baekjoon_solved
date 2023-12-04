n = int(input())

score = []

m = map(int, input().split())
score.extend(m)

maxscore = max(score)
change = []

for i in score:
    changescore = i/maxscore*100
    change.append(changescore)

result = sum(change)/len(change)
print(result)