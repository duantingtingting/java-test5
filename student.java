package test5;

public class student {
	public String id;
	public String name;
	public String major;
	
	public student(String id,String name,String major){
		this.id=id;
		this.name=name;
		this.major=major;
	}
	public String toString() 
	{
		  return "ѧ�����: "+this.id+"  ����: "+this.name+"  ��ҵ����:"+this.major;
		 }
}