# neobis
# Let's start our trip
## Java

```
for query in range(1, q + 1):
    typeQ, posQ, color[query] = map(int, input().split())
    if typeQ == 1:
        timeR[posQ - 1] = query
    else:
        timeC[posQ - 1] = query
```
