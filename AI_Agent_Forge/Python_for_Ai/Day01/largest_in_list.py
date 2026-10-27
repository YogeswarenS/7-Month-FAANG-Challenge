mylist=[]
for i in range(1, 11):
    a=int(input("Enter a number: "))
    mylist.append(a)
print("The list is:", mylist)

def largest_in_list(mylist):
    largest=mylist[0]
    for i in mylist:
        if i>largest:
            largest=i
    return largest

print("The largest number in the list is:", largest_in_list(mylist))
