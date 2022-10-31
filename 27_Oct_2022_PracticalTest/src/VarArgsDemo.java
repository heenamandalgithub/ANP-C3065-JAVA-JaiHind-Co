
public class VarArgsDemo {
	void setArray(int a[]) {
		
	}
	void setVarArgs(int ...paramVar) {
		System.out.println("setVarArgs");
		for(int a:paramVar )
			System.out.println(a);
	}
	void setValues(double paramVar1,int ...paramVar2) {
		System.out.println("SetVarArgs");
		for(int a:paramVar2 )
			System.out.println(a);
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		VarArgsDemo varArgsDemoObj=new VarArgsDemo();
		//varArgsDemoObj.setVarArgs();
		varArgsDemoObj.setVarArgs(3,1,2);
	}

}
