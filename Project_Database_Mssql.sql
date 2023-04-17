Create Database ProjectDB;
Use ProjectDB;

CREATE TABLE registration(

Name varchar(50) not null,
UserName varchar(50) not null,
Password varchar(50) not null

);


select *from registration


CREATE TABLE Doctor(

DoctorID  int  primary key not null,

Doctor_Name varchar(50) not null,

Doctor_Phone varchar(11) not null, 

Department varchar(50) not null,

Visit int not null,
);


insert into Doctor(DoctorID,Doctor_Name,Doctor_Phone,Department,visit)
values


       (201,'Tanvir' ,01771436379,'Surgery',1050),
	   (202,'Nayem' ,01876890987,'Medicine',1000),
	   (203,'Chandrima' ,01578930238,'Surgery',1500),
	   (204,'Tanjima' ,01568499382,'Neurology',2500),
	   (205,'Tanjila' ,01568499000,'Hepatologist',3000),
	   (206,'Nisa' ,01388949938,'Neurosurgon',4000),
	   (207,'Saurav' ,01372819288,'Gaynoulogist',1200),
	   (208,'Salman' ,01662738910,'Medicine',2700),
	   (209,'Sajid' ,01964738291,'Surgery',2800),
	   (210,'Rifat' ,01399874653,'Neourology',2900),
	   (211,'NazMus_Sakib' ,01988276453,'Surgery',2550),
	   (212,'Yaseen' ,01988273645,'Neurology',2930);
       


select *from Doctor



--truncate table doctor

--ALTER TABLE Doctor ADD visit int;
--DELETE FROM Doctor WHERE DoctorID = 1;



CREATE TABLE patient(

PatientID int primary key not null, 

Patient_Name varchar(50) not null,

Phone_no varchar(11) not null,

Age int not null,

Áddress varchar(50) not null,

Disease varchar(50) not null,

Gender varchar(10) not null,

DoctorID int not null foreign key references Doctor(DoctorID)

);

insert into patient(PatientID,Patient_Name,Phone_no,Age,Áddress,Disease,Gender,DoctorID)
values


      (101,'Nayem',01871627437,30,'Jatrabari','Cancer','Male',212),
      (102,'Tanvir',01987654321,20,'Rampura','Cold','Male',201),
	  (103,'Tanjima',01987654321,30,'Mogbazar','Fever','FeMale',203),
	  (104,'Tasnia',01987654321,10,'Wireless_Mogbazar','Cholera','Female',206),
	  (105,'Tanjila',01987654321,25,'Dhaka','Fever','Female',205),
	  (106,'Chandrima',01987654321,45,'Jigatola','Diaria','Female',211),
	  (107,'Saurav',01987654321,26,'Khilgaon','Cold','male',210),
	  (108,'Joso',01987654321,35,'Mirpur','Heart_Attack','male',209),
	  (109,'Sabbir',01987654321,40,'Mirpur','Rahh','male',202),
	  (110,'Salman',01987654321,22,'Uttra','Fever','male',206),
	  (111,'Rifat',01987654321,39,'Mirpur','Cold','male',208),
	  (112,'Nafis',01987654321,47,'Jigatola','Cold','male',201),
      (113,'Maraj',01871627437,28,'Uttra','Cancer','Male',211),
	  (114,'Jubayer',01909856772,10,'Kamargao','Cold','Male',202),
      (115,'Junaiba',01987654321,11,'Sreenagar','Fever','Female',209),
      (116,'Tanjila',01988909876,15,'Dhaka','Cold','Male',211);

select *from patient
--truncate table patient
select patient.PatientID,patient.Patient_Name,patient.Age,patient.DoctorID from patient


CREATE TABLE Lab(
Lab_No int primary key not null,
Admission_Date date not null,
DoctorID int not null foreign key references Doctor(DoctorID),
PatientID int not null foreign key references Patient(PatientID),
Category varchar(50) not null,
Amount float not null
);

insert into Lab(Lab_No,Admission_Date,DoctorID,PatientID,Category,Amount)
values
      (301,'2023-02-01',201,101,'X-Ray',1500),
	  (302,'2022-03-01',212,111,'Ultrasonography',12000),
	  (303,'2021-01-01',211,113,'MRI',15000),
	  (304,'2020-02-01',210,109,'X-Ray',11000),
	  (305,'2019-02-01',208,107,'Blood',200),
	  (306,'2013-02-01',206,106,'CT-Scan',25500),
	  (307,'2014-02-01',205,104,'Urin',150),
	  (308,'2023-01-01',203,105,'Hagu',100),
	  (309,'2023-02-03',202,103,'CT-Scan',2550),
	  (310,'2015-02-01',209,102,'Urin',150),
	  (311,'2010-02-01',210,107,'Urin',150),
	  (312,'2009-12-01',211,110,'ECG',17500);

select *from Lab


CREATE TABLE Bill(

BillID  int identity (501,1) primary key not null,

Release_Date date not null,

PatientID int not null foreign key references Patient(PatientID),

Confirm varchar(50) not null)

);



insert into Bill (Release_Date,PatientID)
values
      ('2023-12-19',111),
	   ('2023-11-28',101),
	    ('2023-10-27',112),
		 ('2023-09-26',109),
		  ('2023-08-20',104),
		   ('2023-07-15',103),
		    ('2023-06-19',105),
			 ('2023-05-12',106),
			  ('2023-04-08',110),
			   ('2023-03-09',113);

select *from Bill	  
	  
      


Create table Room(

Room_No int primary key not null,

PatientID int not null foreign key references Patient(PatientID),

Room_Type varchar(50) not null,

Room_Status varchar(50) NOT NULL,

Room_Charge int not null

);

--ALTER TABLE Room ADD Room_Charge int;




insert into Room(Room_No,PatientID,Room_Type,Room_Status,Room_Charge) 
values
       (413,102,'Single_Bed_Cabin','Available',1500),
	   (414,104,'Double_Bed_Cabin','UnAvailable',1600),
	   (415,106,'Single_Bed_Cabin','Available',1300),
	   (416,108,'Double_Bed_Cabin','UnAvailable',1500),
	   (417,110,'Double_Bed_Cabin','Available',1200),
	   (418,112,'Single_Bed_Cabin','Available',1400),
	   (419,111,'Double_Bed_Cabin','Available',4000),
	   (420,109,'Single_Bed_Cabin','UnAvailable',9000),
	   (421,107,'Single_Bed_Cabin','Available',3500),
	   (422,105,'Double_Bed_Cabin','Available',2500),
	   (423,103,'Double_Bed_Cabin','UnAvailable',3500),
	   (424,101,'Single_Bed_Cabin','Available',1360);


select *from Room


--Create table OutPatient(
--PatientID int not null foreign key references Patient(PatientID),
--Lab_no int not null foreign key references Lab(Lab_No)
--);
--insert into Outpatient(PatientID,Lab_no)
--values
      --(8,201),
      --(10,203)

select Patient.PatientID,Patient.Patient_Name,Patient.Disease,Patient.DoctorID,Lab.Lab_No  from Patient  join Lab on Patient.PatientID = Lab.PatientID where Category ='Inpatient';
select * from Patient;
select * from Lab
   select * from Doctor

select * from lab
select * from Room
--select * from Outpatient

--select GETDATE()

CREATE TABLE Inpatient(
PatientID int not null foreign key references Patient(PatientID),
DoctorID int not null foreign key references Doctor(DoctorID),
Lab_No int not null foreign key references Lab(Lab_No),
Room_No int not null foreign key references Room(Room_No),
Admission_date DATE not null

)

insert into Inpatient (PatientID,DoctorID,Lab_No ,Room_NO ,Admission_date)
values

       	  
      (101,203,301,413,'2023-02-01'),
	  (102,207,302,415,'2023-01-10'),
	  (103,205,303,417,'2023-01-09'),
	  (104,209,304,419,'2023-01-11'),
	  (105,211,305,421,'2023-02-08'),
	  (106,202,306,423,'2023-02-05'),
	  (107,204,307,414,'2023-02-08'),
	  (108,206,308,416,'2023-02-10'),
	  (109,208,309,418,'2023-02-18'),
	  (110,210,310,420,'2023-02-27'),	  
	  (111,212,311,422,'2023-02-18'),
	  (112,201,311,424,'2023-04-27');
	


Create Table Lab_Report(

PatientID int not null foreign key references Patient(PatientID),

Patient_Category varchar(50)

);

insert into Lab_Report(PatientID,Patient_Category)
values
      (109,'In'),
      (101,'In'),
	  (103,'In'),
	  (104,'Out');

select *from Lab_Report
truncate table Lab_Report

select *from registration
select *from Doctor
select *from Patient
select *from Lab
select * from Room
select * from Inpatient 



-----Bill


 select patient.PatientID,patient.Patient_Name,Lab.DoctorID,(Select Doctor.Visit*(Select COUNT(Doctor.Visit ) from Doctor join patient on  Doctor.DoctorID = patient.DoctorID Where patient.PatientID = 112) 
from Doctor join patient on  Doctor.DoctorID = patient.DoctorID Where patient.PatientID = 112)+


(SELECT Lab.Amount *(Select COUNT(Lab.Amount) from Lab join patient on  Lab.PatientID = patient.PatientID Where patient.PatientID = 111) 
from Lab join patient on  Lab.PatientID = patient.PatientID Where patient.PatientID = 111)   + 

(Select top(1)Room.Room_Charge *(Select COUNT(Room.Room_No) from Room join Inpatient  on  Room.Room_No = Inpatient.Room_No Where Inpatient.PatientID = 112) 
from Room join Inpatient  on  Room.Room_No = Inpatient.Room_No where Inpatient.PatientID = 112 ) as Total_Amount from Patient join Lab on Patient.PatientID = Lab.PatientID  join Bill on Bill.PatientID=patient.PatientID  where patient.PatientID = 108;





---Patient History Show For Admitted  Out  Patient

select Bill.BillID,Bill.PatientID,Patient.Patient_Name,Bill.Release_Date,Lab.Admission_Date,DATEDIFF(day,Lab.Admission_Date,Bill.Release_Date) As N0_Of_Dayes from Bill join Lab on Bill.PatientID = Lab.PatientID join Patient on Patient.PatientID = Lab.PatientID  join Lab_Report on Lab_Report.PatientID = patient.PatientID where Lab_Report.Patient_Category='In'


---Patient History Show For  OutPatient

select patient.PatientID,patient.Patient_Name,patient.Disease,patient.DoctorID from patient join Lab_Report On patient.PatientID = Lab_Report.PatientID where Lab_Report.Patient_Category='Out'



