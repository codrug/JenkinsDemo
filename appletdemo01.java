import java.applet.*;
import java.awt.*;
public class appletdemo01 extends Applet{
  public void paint(Graphics g){
    g.drawString("Hello, World!", 100, 150);
  }
}

/*<applet code= "appletdemo01.class" width="300" height="300"></applet>*/
/*
  javac filename.java
  appletviewer filename.java
*/
