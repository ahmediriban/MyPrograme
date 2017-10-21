/**
 * @(#)Rectangle.java
 *
 *
 * @author 
 * @version 1.00 2017/10/17
 */


interface Drawable{  
void draw(){
	System.out.println("drawing rectangle");
}  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
/* Drawable d=new Rectangle();  
d.draw();  */
System.out.println(Drawable.cube(3));  
}}  