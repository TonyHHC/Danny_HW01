import numpy as np
import random

def multiply(a, b):
    r = a.dot(b)
    return r

a = np.random.randint(0, high=3, size=(2, 3))
b = np.random.randint(0, high=3, size=(3, 2))

c = multiply(a, b)

print("Array a : ")
print(a)

print("Array b : ")
print(b)

print("Array c : ")
print(c)
