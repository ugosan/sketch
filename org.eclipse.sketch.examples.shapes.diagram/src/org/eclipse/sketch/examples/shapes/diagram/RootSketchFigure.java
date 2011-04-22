package org.eclipse.sketch.examples.shapes.diagram;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.swt.graphics.Color;

public class RootSketchFigure extends FreeformLayer {

	@Override
	public void add(IFigure child, Object constraint, int index) {
		// TODO Auto-generated method stub
		super.add(child, constraint, index);
		
		System.out.println("asdasdasdasd");
	}

	@Override
	public void paint(Graphics g) {
		g.setLineWidth(1);
		g.setForegroundColor(new Color(null, 100, 100, 100));
		
		/*DiagramImpl d = (DiagramImpl) getModel();

		Sketch s = ((Diagram) d.getElement()).getRootSketch();

		if (s != null) {

			for (int i = 1; i < s.getPointlist().size(); i++) {
				Point p = (Point) s.getPointlist().get(i);
				Point lastp = p;
				lastp = (Point) s.getPointlist().get(i - 1);

				if (lastp.x == -1) {
					//if the last point is a pen lift, then consider just the current one
					g.drawLine(p.x, p.y, p.x, p.y);

				} else if (p.x > 0) {
					//if is a normal point, then traces a line from the last point to the current
					g.drawLine(lastp.x, lastp.y, p.x, p.y);
				}

			}
		}*/
		g.drawLine(0,0,300,300);
		super.paint(g);
	}
	
	public Rectangle getFreeformExtent() {
		// Do not count children; they are decorations that should not interfere with diagram contents.
		Insets insets = getInsets();
		return new Rectangle(0, 0, insets.getWidth(),
				insets.getHeight());
	}

}
