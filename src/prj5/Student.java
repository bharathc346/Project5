/**
 * 
 */
package prj5;

import java.util.ArrayList;

/**
 * @author bharathchintagunta
 * @version 04.19.17
 */
public class Student {
    private int id;
    private String date;
    private String major;
    private String region;
    private String hobby;
    private ArrayList<String> heardData;
    private ArrayList<String> likedData;


    /**
     * Constructor
     * 
     * @param i
     *            id
     * @param d
     *            date
     * @param m
     *            major
     * @param r
     *            region
     * @param h
     *            hobby
     */
    public Student(int i, String d, String m, String r, String h) {
        this.id = i;
        this.date = d;
        this.major = m;
        this.region = r;
        this.hobby = h;
        this.heardData = new ArrayList<String>();
        this.likedData = new ArrayList<String>();
    }


    /**
     * get id
     * 
     * @return id
     */
    public int getId() {
        return this.id;
    }


    /**
     * get date
     * 
     * @return date
     */
    public String getDate() {
        return this.date;
    }


    /**
     * get major
     * 
     * @return major
     */
    public String getMajor() {
        return this.major;
    }


    /**
     * get region
     * 
     * @return region
     */
    public String getRegion() {
        return this.region;
    }


    /**
     * get hobby
     * 
     * @return hobby
     */
    public String getHobby() {
        return this.hobby;
    }


    /**
     * set heard data
     * 
     * @param s
     *            ArrayList to set to
     */
    public void setHeardData(ArrayList<String> s) {
        this.heardData = s;
    }


    /**
     * set liked data
     * 
     * @param s
     *            ArrayList to set to
     */
    public void setLikedData(ArrayList<String> s) {
        this.likedData = s;
    }


    /**
     * get heard data
     * 
     * @return heardData
     */
    public ArrayList<String> getHeardData() {
        return this.heardData;
    }


    /**
     * get liked data
     * 
     * @return likedData
     */
    public ArrayList<String> getLikedData() {
        return this.likedData;
    }

}
