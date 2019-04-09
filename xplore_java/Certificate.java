package xplore_java;

public class Certificate 
{
private int id;
private String title;
private String date;
private int rank;
Certificate(int id,String title,String date,int rank)
{
this.id=id;
this.title=title;
this.date=date;
this.rank=rank;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}


/*
public void set_id(int id)
{
this.id=id;	
}
public int get_id()
{
return id;	
}

public void set_title(String title)
{
this.title=title;	
}
public String get_title()
{
return title;	
}
public void set_date(String date)
{
this.date=date;	
}
public String get_date()
{
return date;	
}
public void set_rank(int rank)
{
this.rank=rank;	
}
public int get_rank()
{
return rank;	
}
*/
}
