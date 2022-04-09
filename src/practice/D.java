package practice;

interface C{

short cntr = 0; void test();
}
public class D implements C

{

public static void main(String[] args) {

D d = new D();

d.test();

}

public void test() {

for (int x = 6; x>cntr; x--, ++cntr)

System.out.print(" " + cntr);}}