
/**
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *  
 *
 * $Id$
 */ 
package org.eclipse.sketch.examples.shapes.tests;





public class Demo4 {
/*
public static void main(String args[]){
      Shell shell = new Shell();
      shell.setSize(350,350);
      shell.open();
      shell.setText("Demo 4");
      LightweightSystem lws = new LightweightSystem(shell);
      IFigure panel = new Figure();
      //panel.setLayoutManager(new XYLayout());
      lws.setContents(panel);
      RectangleFigure
            node1 = new RectangleFigure(),
            node2 = new RectangleFigure();
      RectangleFigure node3 = new RectangleFigure();


      Polyline line=new Polyline();
      PointList list = new PointList();

//NEW
      list.addPoint(10,10);
      list.addPoint(20,120);
      line.setBackgroundColor(ColorConstants.black);
      line.setLineWidth(10);
      line.setPoints(new PointList());
      line.setLineWidth(10);
//
      node1.setBackgroundColor(ColorConstants.red);
      node1.setSize(64, 36);
      node2.setBackgroundColor(ColorConstants.blue);
      //node2.setLocation(new Rectangle(100, 100, 64, 36));
      node2.setSize(40,50);
      //node3.setSize(100,100);
      //node3.setLocation(new Point(200,200));


      PolylineConnection conn = new PolylineConnection();
      conn.setSourceAnchor(new ChopboxAnchor(node1));
      conn.setTargetAnchor(new ChopboxAnchor(node2));
      conn.setTargetDecoration(new PolygonDecoration());

      Label label = new Label("MidpointAAAA");
      label.setOpaque(true);
      label.setBackgroundColor(ColorConstants.buttonLightest);
      label.setBorder(new LineBorder());
      conn.add(label, new MidpointLocator(conn, 0));

      panel.add(node1);
      panel.add(node2);
      //panel.add(node3);
//New
      panel.add(line);
//
      panel.add(conn);
      new Dragger(node1);
      new Dragger(node2);
      Display display = Display.getDefault();
      while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                  display.sleep ();
}

}
static class Dragger extends MouseMotionListener.Stub implements
MouseListener {
      public Dragger(IFigure figure){
            figure.addMouseMotionListener(this);
            figure.addMouseListener(this);
      }
      Point last;
      public void mouseReleased(MouseEvent e){}
      public void mouseClicked(MouseEvent e){}
      public void mouseDoubleClicked(MouseEvent e){}
      public void mousePressed(MouseEvent e){
            last = e.getLocation();
      }
      public void mouseDragged(MouseEvent e){
            Point p = e.getLocation();
            Dimension delta = p.getDifference(last);
            last = p;
            Figure f = ((Figure)e.getSource());
            f.setBounds(f.getBounds().getTranslated(delta.width,
delta.height));
      }
	
};
*/
}
