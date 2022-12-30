package encapsulationConcept;

public class SetterGetter_Methods 
{
		//private data variables
		private int student_Id;
		
		//created setter method
		public void setStudentId(int stdId)
		{
			student_Id=stdId;
		}
		
		//created getter method
		public int getStudentId()
		{
			return student_Id;
		}
		
		public static void main(String[] args) 
		{
			SetterGetter_Methods sm=new SetterGetter_Methods();
			sm.setStudentId(25);
			System.out.println(sm.getStudentId());
		}
}
