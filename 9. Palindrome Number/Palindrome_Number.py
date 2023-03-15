def isPalindrome(x: int):
    tempNum = x
    revNum = 0
    while (tempNum > 0):
        digit = tempNum % 10
        revNum = revNum*10+digit
        tempNum = tempNum//10
    return revNum == x


print(isPalindrome(12321))
