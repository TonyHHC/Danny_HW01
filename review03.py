import sys
import numpy as np

def largestIndex(arr):
    iMax = np.max(arr)
    r = np.argwhere(arr == iMax)

    return r


strSchoolID = sys.argv[1]

d = np.reshape(list(map(int, list(strSchoolID))), (3, 3))
print(d)

c = largestIndex(d)
print(c[-1])
