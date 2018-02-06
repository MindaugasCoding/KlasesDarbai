
public class KlasesPvz {


public static void main(String[] args){
    //objekto sukurimas, perduodam parametra i konstruktoriu
    SecondClassExample secondClassExample = new SecondClassExample(67);
secondClassExample.testMethod(); //metodo iskvietimas

}
}
// klase be oublic nes faile gali buti tik viena su public
class  SecondClassExample{
    private int id; //klases lugio kintamasis

    //default kostruktorius
    public SecondClassExample(){
        id = 10;
    }

    public  SecondClassExample(int ids){
      //  id = ids; /// galima nes skiriasi vardai
        this.id = id; //priskiria nauja reiksme
    }

    public void testMethod(){
        System.out.println("this is my method :)" + id);

    }

}