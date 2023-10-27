package ca.cmpt213.designprinciples;// BAD interface!

/**
 * Represent a point in 2D space.
 */
interface GoodPoint2D {
	void setLocation(int x, int y);
	int getX();
	//int getYValue();
	int getY(); // consistency

	// void setHeight(int height); // clarity
	void setX(int x); // completeness
	void setY(int y);
	

	// double getDistanceTo(int y, int x);
	double getDistanceTo(int x, int y); // consis

	void drawStarAtPoint();
	void drawCircleAtPoint(int radius);
	// double computeTriangle(BadPoint2D p1, BadPoint2D p2); 
	// belongs in another class
}
