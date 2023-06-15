package classandobject;

public class Student {


        private String fullName;
        private String address;
        private String contactNumber;
        private String rollNumber;
        public Student() {
        }

        public Student (String fullName, String contactNumber, String address, String rollNumber)
        {
                this.fullName = fullName;
                this.address = address;
                this.contactNumber = contactNumber;
                this.rollNumber = rollNumber;
        }


        @Override
        public String toString() {

                return "Student details :: \n "+ "Name:: "+ this.fullName+"\n"+ "address "+this.address
                        + "contact number:: "+ this.contactNumber+ "\n"+"roll number::" + this.rollNumber;
        }
}
