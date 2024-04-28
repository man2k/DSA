pub fn main() {
    let greet: &str = "Greetings";
    let mut meet: String = "Hi, ".to_string();
    let mut sentence = String::new();
    sentence.push_str(greet);
    sentence.push_str(", ");
    sentence.push_str(&meet);
    println!("final sentence: {}", sentence);
    println!("{:?}", &sentence[0..6]);
    println!("{:?}", &meet[0..meet.len()]);
    println!("{}", meet.len());
}
