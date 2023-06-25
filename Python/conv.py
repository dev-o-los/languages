def string_to_binary(string: str) -> str:
    asciiVals = [ord(char) for char in string]
    binaryVals = list(map(lambda x: bin(x)[2:], asciiVals))
    return " ".join(binaryVals)


val = string_to_binary("ab")
print(val)

finVal = "".join(["0" if c == "1" else "1" for c in val])
print(finVal)
