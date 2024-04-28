pub fn main() {
    let mut k: i32 = 5;
    loop {
        println!("{}", k);
        k = k - 1;
        if k == 0 {
            break;
        }
    }
    // labled break
    'outer: for x in 1..5 {
        println!("x : {x}");
        let mut i = 0;
        while i < x {
            println!("x: {x}, i: {i}");
            i += 1;
            if i == 3 {
                break 'outer;
            }
        }
    }
}
