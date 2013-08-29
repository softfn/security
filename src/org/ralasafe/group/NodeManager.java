package org.ralasafe.group;

import java.util.Collection;

public interface NodeManager {
 
	public abstract void addNode(Node node);
	public abstract void updateNode(Node node);
	public abstract void deleteNode(int nodeId);
	public abstract void deleteNodeCascade(int nodeId);
	public abstract Node getNode(int nodeId);
	public abstract Node getParentNode(Node node);
	public abstract Collection getChildrenNodes(Node pnode);
	public abstract boolean isChild(int pnodeId, int nodeId);
	public abstract boolean isCascadeChild(int pnodeId, int nodeId);
	public abstract void moveNode(Node node, Node targetNode);
	public abstract void moveNode(Collection nodes, Node targetNode);
	public abstract Node getRoot();
	public abstract Node getTree(int nodeId);
}