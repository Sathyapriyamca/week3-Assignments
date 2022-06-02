
public class Students {
	
		public void getStudentInfo(int id) {
			System.out.println("My id number  = "+(id));
		}
		public void getStudentInfo(int id, String name) {
			System.out.println("My id number  = "+(id));
			System.out.println("My name  = "+(name));
		}
		public void getStudentInfo(String email,long phone) {
			System.out.println("My email id  = "+(email));
			System.out.println("My Phone Number  = "+(phone));
			
		}
			public static void main(String[] args) {
			Students information = new Students();
			information.getStudentInfo(631);
			information.getStudentInfo(635,"sathyaPriya T ");
			information.getStudentInfo("sathyapriyat3@gmail.com ",7395850426L);


			}
}
		