name=input("Enter a string: ")
freq={}
for i in name:
    if i in freq:
        freq[i]+=1
    else:
        freq[i]=1
print("The frequency of each character is:", freq)
print("The length of the string is:", len(name))