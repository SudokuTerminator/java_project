package stl;
import stl.Vertex;
class Vector{
	private float x;
	private float y;
	private float z;
	void calculateVector(Vertex A,Vertex B,Vertex C){
		this.x = (A.y - C.y) * (B.z - C.z) - (A.z - C.z) * (B.y - C.y);
