class User:
    name = ""

    def __init__(self, name):
        self.name = name

    def sayHello(self):
        print('Hey, my name is '+self.name)


james = User("James")
david = User("david")
mank = User("Man2k")

james.sayHello()
david.sayHello()
mank.sayHello()
