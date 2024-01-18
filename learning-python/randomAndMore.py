from random import sample
from random import shuffle
from random import uniform
from random import random
from random import randint
# random between 0 and 1
print(random())
print(random())
print(random())
print(random()*10)
print(random()*50+1000)

# Random int in range
print(randint(5, 9))
print(randint(5, 9))
print(randint(5, 9))

# Random float in range
print(uniform(1, 10))
print(uniform(0, 1))
print(uniform(20, 50))

# List manipulation using shuffle
numbers = [1, 2, 3, 4, 5, 6, 7]
shuffle(numbers)
print(numbers)


# Pick random values from list using sample
# returns a list of random values from the given data
print(sample(numbers, 2))
print(sample(numbers, 2)[1])
