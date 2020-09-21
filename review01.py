import sys

def largestList(arr):
    iMax = max(arr)
    
    r = [i for i, x in enumerate(arr) if x == iMax]

    return r



strSchoolID = input("請輸入學號 : ")

d = list(map(int, list(strSchoolID)))

r = largestList(d)

# 列印索引
print("最大值個數 : ", len(r), ", 最大索引 : ", r[-1] )



