package BellmanFord._01;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<>();
		
//		vertexList.add(new Vertex("S"));
//		vertexList.add(new Vertex("a"));
//		vertexList.add(new Vertex("b"));
//		vertexList.add(new Vertex("c"));
//		vertexList.add(new Vertex("d"));
//		vertexList.add(new Vertex("t"));

		List<Edge> edgeList = new ArrayList<>();

//		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
//		
//		edgeList.add(new Edge(2, vertexList.get(1), vertexList.get(2)));
//		
//		edgeList.add(new Edge(5, vertexList.get(2), vertexList.get(3)));
//		
//		edgeList.add(new Edge(-7, vertexList.get(3), vertexList.get(4)));
//		edgeList.add(new Edge(-2, vertexList.get(3), vertexList.get(5)));
//		
//		edgeList.add(new Edge(-1, vertexList.get(4), vertexList.get(1)));
		
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		
		edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
		edgeList.add(new Edge(-1, vertexList.get(1), vertexList.get(2)));
		edgeList.add(new Edge(-11, vertexList.get(2), vertexList.get(0)));

		BellmanFord bellmanFord = new BellmanFord(edgeList, vertexList);
		
		bellmanFord.bellmanFord(vertexList.get(0));
//		bellmanFord.shortestPathTo(vertexList.get(2));
	}
}
