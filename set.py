a=list()
n=input()
for i in range(0,n):
  a.append(input())

s=set(a)
print(s)
b=list(s)
if a==b:
  print("Unique")
else:
  b.sort()
  for i in range(0,len(b)):
    print(b[i]),