a=list()
n=int(input())
for i in range(0,n):
    a.append(int(input()))

s=set(a)
print(s)
b=list(s)
b.sort()
for i in range(len(b)-1,-1,-1):
    print(b[i],end="")
