package edu.oakland.production.ClassProject.middleware;

public class BinaryTree{
	
	public Node root;
	
	public void addNode(String name, double gpa, int tg){
		Node newNode = new Node(name, gpa, tg);
			if(root == null){
				root = newNode;
			}
			else{
				Node focusNode = root;
				Node parent;
				while(true){
					parent = focusNode;
					if(tg < focusNode.tg){
						focusNode = focusNode.leftChild;
					
					if(focusNode == null){
						parent.leftChild = newNode;
						return;
						}
					}
					else {
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
						}
					}
				}
			}
		}
		
		public void preorderTraverseTree(Node focusNode){
			if(focusNode != null){
				System.out.println(focusNode);
				preorderTraverseTree(focusNode.leftChild);
				preorderTraverseTree(focusNode.rightChild);
			}
		}
		
		public Node findNode(int tg){
			Node focusNode = root;
			while(focusNode.tg != tg){
				if(tg > focusNode.tg){
					return focusNode;
				}
				if(tg < focusNode.tg){
					focusNode = focusNode.leftChild;
				}
				else{
					focusNode = focusNode.rightChild;
				} 
			}
			return focusNode;
			
		}
	
	}

