//   USER-DEFINED LINKED LIST



package Task1;
import java.util.*;

public class LinkedList1 
{
		static class Node
		{
			int data;
			Node next;
		}
		
		static void printList(Node node)
		{
			while (node != null)
			{
				System.out.println(node.data+" ");
				node =node.next;
			}
			System.out.println();
		}
		static Node newNode(int key)
		{
			Node temp=new Node();
			temp.data =key;
			temp.next=null;
			return temp;
			
		}
		static Node insertBeg(Node head,int val)
		{
			Node temp=newNode(val);
			temp.next=head;
			head=temp;
			return head;
		}
		static void rearrangeOddEven(Node head)
		{
			Stack<Node>odd=new Stack<Node>();
			Stack<Node>Even=new Stack<Node>();
			int i=1;
			while(head !=null)
			{
				if(head.data % 2!=0 && i%2==0)
				{
					odd.push(head);
				}
				else if(head.data % 2==0 && i% 2!=0)
				{
					Even.push(head);
					
				}
				head=head.next;
				i++;
			}
			while(odd.size()>0 && Even.size()>0)
			{
				int k=odd.peek().data;
				odd.peek().data=Even.peek().data;
				Even.peek().data=k;
				odd.pop();
				Even.pop();
			}
		}
		public static void main(String[] args) 
		{
			Node head =newNode(8);
			head=insertBeg(head,7);
			head=insertBeg(head,3);
			head=insertBeg(head,6);
			head=insertBeg(head,2);
			head=insertBeg(head,1);
			head=insertBeg(head,4);
			head=insertBeg(head,5);
			System.out.println("LINKED LIST :");
			printList(head);
			rearrangeOddEven(head);
			System.out.println("Linked List after "+"Rearranging");
			printList(head);
			
			
			
		}
		
}


