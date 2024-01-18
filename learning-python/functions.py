def square(x):
    return x*x


def multiply(x, y):
    print(f'you called multiply on variables x = {
          x} and y = {y} and the result is: {x*y}')
    return x*y


x = square(10)
y = multiply(10, 5)
print(x)
print(y)
