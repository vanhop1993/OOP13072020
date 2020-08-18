package com.example.oop13072020;

public class Sinhvien {
    // thuộc tính
    private String ten;
    private int tuoi;
    private String quequan;
    // phương thức
    /*public void setTen(String ten){
        if(!ten.isEmpty()){
            this.ten = ten; // this tượng trưng cho cái class hiện tại của mình. dùng dể phân biệt biến nào của sinh viên biến nào của tham số truyền vào
        }
    }
    public String getTen(){
        return ten;
    }*/
   // alt + ins

    public Sinhvien(String ten, int tuoi,String quequan){
        this.ten = ten;
        this.tuoi =tuoi;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(!ten.isEmpty()) {
            this.ten = ten;
        }
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
}
