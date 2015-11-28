import wblut.math.*;
import wblut.processing.*;
import wblut.core.*;
import wblut.hemesh.*;
import wblut.geom.*;

HE_Mesh mesh;
WB_Render render;
String name;
void setup() {
  size(800, 800, OPENGL);
  smooth(8);
  HEC_Catalan.printTypes();
  HEC_Catalan creator=new HEC_Catalan();
  creator.setEdge(100); 
  creator.setType(7);
  name=creator.getName();
  mesh=new HE_Mesh(creator); 
  mesh.fitInAABBConstrained(new WB_AABB(-250,-250,-250,250,250,250));
  render=new WB_Render(this);
  textAlign(CENTER);
  textSize(24);
}

void draw() {
  background(255);
  directionalLight(255, 255, 255, 1, 1, -1);
  directionalLight(127, 127, 127, -1, -1, 1);
  translate(400, 400, 0);
  stroke(0);
  text(name,0,350);
  rotateY(mouseX*1.0f/width*TWO_PI);
  rotateX(mouseY*1.0f/height*TWO_PI);
  stroke(0);
  render.drawEdges(mesh);
  noStroke();
  render.drawFaces(mesh);
}
