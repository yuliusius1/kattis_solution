b=(input()).split(' ')

z=[int(i) for i in b]
z.sort()
x=(z[1]-z[0])
y=(z[2]-z[1])
if (x==y):
    print(z[2]+y)

elif (y>x):
    print(z[1]+x)
    
elif(x>y):
    print(z[0]+y)
