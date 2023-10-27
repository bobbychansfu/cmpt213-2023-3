package ca.cmpt213.designprinciples;// BAD interface!

/**
 * Represent a point in 2D space.
 */
interface BadPoint2D {
	void setLocation(int x, int y);
	int getX();
	int getYValue();
	void setHeight(int height);
	double getDistanceTo(int y, int x);
	void drawStarAtPoint();
	void drawCircleAtPoint(int radius);
	double computeTriangle(BadPoint2D p1, BadPoint2D p2);
}
