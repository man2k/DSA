import os.path
f = open("text.txt", "r")
lines = f.readlines()
# print(lines)
# print(lines.__len__())

for line in lines:
    line = line.replace("\n", "")
    print(line)

if not os.path.isfile("text.pdf"):
    print("File not found")

if not os.path.isfile("text.txt"):
    print("File not found")
else:
    with open("text.txt") as f:
        content = f.read().splitlines()

    for line in content:
        print(line)

    with open("text.txt", "a") as f:
        f.writelines('Written by python')
        f.close()
