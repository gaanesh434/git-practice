import numpy as np 

a = np.array([12,34,56],dtype='int16')

print(a.ndim)
print(a.size)
print(a.itemsize)
print(a.dtype)
print(a.nbytes)
print(a.shape)


# acessing and changing specific elements rows,elements,colums

b = np.array([[1,2,3,4,5,6,7,8,9],[10,11,12,13,14,15,16,17,18]])
print(b)


print(b[0,8])
print(b[:,2])

#all 0's matrix
print(np.zeros((2,3)))

#full
print(np.full((2,2), 99))

print(np.random.rand(2,2))

print(np.random.randint(-4, 8 , size=(3,3)))

#repeat the arr

arr = np.array([1,2,3])
rp = np.repeat(arr,3)
print(rp)

#task
arr1 = np.ones([5,5])
print(arr1)

z = np.zeros([3,3])

z[1,1] = 9
print(z)

arr1[1:4,1:4] = z

#copy
arr3 = ([5,6,7,8])
arr4 = arr3.copy()
print(arr4)

arr4[0] = 10
print(arr4)

# cal

p = np.array([1,2,3])
p+2
p-2
p*2
p/4
print(p)

print(np.sin(p))

#linear algebra
a =  np.ones((3,2))
print(a)
b = np.full((2,2),2)

print(np.matmul(a,b))

c= np.identity(3)
print(np.linalg.det(c))
