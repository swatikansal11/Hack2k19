class Student{
	double cgpa, int sem;
}

class BranchStudent extends Student{
	String BranchName;

	BranchStudent(){
		BranchName = Name;
	}

	void display(String Name){
		System.out.println("Name -:" + BranchName);
	}
}

class StudentPlacement extends BranchStudent{
	String PreferredCompanyList, StatusOfPlacement, StatusOfInternship; 
}

class XcompanyShortlist{
	if(BranchName == "CSE" && cgpa>7.5 && sem == 7){
		System.out.println("Writtesn Test Required");
	}
	else if(PreferredCompanyList == "Xcompany"){
		
	}
	else{
		System.out.println("Not Shortlisted");
	}
}