package BellmanFord._01;

import java.util.List;

public class BellmanFord {
	private List<Edge> edgeList;
	private List<Vertex> vertexList;

	public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
		super();
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}

	private boolean hasCycle(Edge edge) {
		return edge.getStart().getDistance() + edge.getWeight() < edge.getTarget().getDistance();
	}

	public void bellmanFord(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		
		for (int i = 0; i < vertexList.size() -1 ; ++i) {
			for (Edge edge : edgeList) {
				Vertex u = edge.getStart();
				Vertex v = edge.getTarget();

				if (u.getDistance() == Double.MAX_VALUE)
					continue;
				
				double newDistance = u.getDistance() + edge.getWeight();
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}

		for (Edge edge : edgeList) {
			if (edge.getStart().getDistance() != Double.MAX_VALUE) {
				if (hasCycle(edge)) {
					System.out.println("Detected cycle !!!");
					return;
				}
			}
		}
	}

	public void shortestPathTo(Vertex targetVertex) {
		if (targetVertex.getDistance() != Integer.MAX_VALUE) {
			System.out.println("shortest path with cost : " + targetVertex.getDistance());
			
			Vertex actualVertex = targetVertex;
			System.out.println(actualVertex + " - ");
			
			while (actualVertex.getPreviousVertex() != null) {
				actualVertex = actualVertex.getPreviousVertex();
				System.out.println(actualVertex + " - ");
			}
		}
		else {
			System.out.println("There is no path ... ");
		}
	}
}
