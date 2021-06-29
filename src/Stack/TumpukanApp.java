package Stack;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(4);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("Nilai teratas = " + tumpukan.peek());
        System.out.println("Nama Saya Adalah Vita Karenina");
        System.out.println("Nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
}
       
        
    
    

