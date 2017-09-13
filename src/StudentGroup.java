import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		  return this.students;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException("Illegal Arguments");
		}
         this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length){
			throw new IllegalArgumentException("illegal Argument");
		}
		return this.students[index];
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if((student==null)|| ((index<0 || index>=this.students.length))){
						throw new IllegalArgumentException("illegal Argument");

		}
		this.getStudents()[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student t[] = new Student[this.students.length+1];
		t[0]=student;
		for(int i=1;i<t.length;i++){
			t[i]=this.students[i-1];
		}
		this.students=t;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student t[] = new Student[this.students.length+1];
		for(int i=0;i<this.students.length;i++){
			t[i]=this.students[i];
		}
		t[t.length-1]=student;
		this.students=t;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if((student==null)|| ((index<0 || index>=this.students.length))){
						throw new IllegalArgumentException("illegal Argument");

		}
		Student t[] = new Student[this.students.length+1];
		for(int i=0;i<index;i++){
			t[i]=this.students[i];
		}
		t[index]=student;
		for(int i=index;i<this.students.length;i++){
			t[i+1]=this.students[i];
		}
		this.students=t;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student[] t = new Student[this.students.length-1];
		for(int i=0;i<index;i++){
			t[i]=this.students[i];
		}
		for(int i=index+1;i<this.students.length;i++){
			t[i-1]=this.students[i];
		}
		this.students=t;
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student t[] = new Student[this.students.length-1];
		for(int q=0;q<this.students.length;q++){
			if(this.students[q]==student){
				continue;
			}
			t[q]=this.students[q];
		}
		this.students=t;
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student t[] = new Student[index];
		for(int i=0;i<index;i++){
			t[i]=this.students[i];
		}
		this.students=t;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException("illegal Argument");
		}
	
			int index=-1;
		for(int i=0;i<this.students.length;i++){
			if(this.students[i]==student){
				index=i;
				break;
			}
		}
		Student t[] = new Student[index];
		for(int i=0;i<index;i++){
			t[i]=this.students[i];
		}
		this.students=t;
	}
	

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=this.students.length){
			throw new IllegalArgumentException("illegal Argument");
		}
		Student t[] = new Student[this.students.length-index];
		for(int i=index;i<this.students.length;i++){
			t[i]=this.students[i];
		}
		this.students=t;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException("illegal Argument");
		}
		int index=-1;
		for(int i=0;i<this.students.length;i++){
			if(this.students[i]==student){
				index=i;
				break;
			}
		}
		Student t[] = new Student[this.students.length-index];
		for(int i=index;i<this.students.length;i++){
			t[i]=this.students[i];
		}
		this.students=t;
	}
	
	
	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<this.students.length;i++){
			for(int j=0;j<this.students.length-i-1;j++){
				if(this.students[j].getId()>this.students[j+1].getId()){
					Student t= this.students[j];
					this.students[j]=this.students[j+1];
					this.students[j+1]=t;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		/*Date d= new Date();
		if(indexOfStudent<0 || indexOfStudent>=this.students.length){
			throw new IllegalArgumentException("illegal Argument");
		}
		return Math.abs(this.students[indexOfStudent].getBirthDate().getYear()- d.getYear());*/
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max=0;
		for(int i=0;i<this.students.length;i++){
			if(this.students[i].getAvgMark()>max){
				max=this.students[i].getAvgMark();
			}
		}
		ArrayList<Student> al= new ArrayList<Student>();
		for(int i=0;i<this.students.length;i++){
			if(this.students[i].getAvgMark()==max){
				al.add(this.students[i]);
			}
		}
		
		this.students=al.toArray(new Student[al.size()]);
		return this.students;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
	if(student==null){
		throw new IllegalArgumentException("illegal Argument");
	}
	int index=-1;
		for(int i=0;i<this.students.length;i++){
			if(this.students[i]==student){
				index=i;
				break;
			}
		}
		if(index<this.students.length-1){
			return this.students[index+1];
		}
		else{
			return null;
		}
		
	}
}
