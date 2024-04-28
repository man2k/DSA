struct Person {
    name: String,
}

impl Person {
    fn say_name(&self) {
        println!("{}", self.name);
    }
}

fn main() {
    let alex = Person {
        name: "Man 3 k".to_string(),
    };
    alex.say_name();
}
