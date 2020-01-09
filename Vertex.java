package BellmanFord._01;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean isVisited;
	private double distance = Double.MAX_VALUE;
	private Vertex previousVertex;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public void addNeighbour(Edge edge) {
		this.adjacencies.add(edge);
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}

}
