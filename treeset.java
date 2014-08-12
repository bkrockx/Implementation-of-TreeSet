import java.util.*;
import java.lang.*;
import java.io.*;
public class treeset
{
	public static void main (String[] args) throws java.lang.Exception{
 
		TreeSet<student>std1 = new TreeSet<student>(new MyMarks());
		std1.add(new student("aa",50));
		std1.add(new student("aa",50));
		std1.add(new student("cc",30));
		std1.add(new student("dd",60));
 
		for(student s:std1){
			System.out.println(s);
		}
 
 
	}
}
 
class MyMarks implements Comparator<student>{
 
	public int compare(student s1,student s2){
		String str1,str2;
		str1 = s1.getName();
		str2 = s2.getName();
		if(str1.compareTo(str2)==0){
			return 0;
		}
		else{
			if(s1.getMarks()>s2.getMarks()){
				return 1;
			}
			else{
				return -1;
			}
		}
	}
}
 
class student{
 
	public String name;
	public int marks;
 
	public student(String n,int a){
		this.name = n;
		this.marks = a;
	}
 
	public String getName(){
		return name;
	}
 
	public void setName(String name){
		this.name = name;
	}
 
	public int getMarks(){
		return marks;
	}
 
	public void setMarks(int marks){
		this.marks = marks;
	}
 
	public String toString(){
		return this.name+" "+this.marks;
	}
}
