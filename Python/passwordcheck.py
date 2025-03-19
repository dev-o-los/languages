import re

passwords = input("Type in: ")
passwords = passwords.split(",")

accepted_pass = []

for i in passwords:
    if len(i) < 6 or len(i) > 12:
        continue
    elif not re.search("[a-z]+", i):
        continue
    elif not re.search("[A-Z]+", i):
        continue
    elif not re.search("[0-9]+", i):
        continue
    elif not re.search("[!$^%^@]+", i):
        continue
    else:
        accepted_pass.append(i)

print(",".join(accepted_pass))
