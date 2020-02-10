public class Education {
    protected String Degree;
    protected String Major;
    protected int Research;
    Education(String Degree, String Major, int Research){
        this.Degree = Degree;
        this.Major = Major;
        this.Research = Research;
    }
    public String getDegree(){
        return Degree;
    }
    public String getMajor(){
        return Major;
    }
    public int getResearch(){
        return Research;
    }
    public void setDegree(String Degree) {
        this.Degree = Degree;
    }
    public void setMajor(String Major) {
        this.Major = Major;
    }
    public void setResearch(int Research) {
        this.Research = Research;
    }
}
