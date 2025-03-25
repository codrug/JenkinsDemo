import java.applet.*;
import java.awt.*;

/*<applet code= "appletdemo01.class" width="300" height="300"></applet>*/
public class appletdemo01 extends Applet{
  public void paint(Graphics g){
    g.drawString("Hello, World!", 100, 150);
  }
}
/*
  javac filename.java
  appletviewer filename.java
*/
