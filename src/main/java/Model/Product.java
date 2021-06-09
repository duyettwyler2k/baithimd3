package Model;

public class Product {
   int id;
   String name;
   double price;
   int number;
   String color;
   String mota;
   String danh_sach;

   public Product(String name, double price, int number, String color, String mota, String danh_sach) {
      this.name = name;
      this.price = price;
      this.number = number;
      this.color = color;
      this.mota = mota;
      this.danh_sach = danh_sach;
   }

   public Product(int id, String name, double price, int number, String color, String mota, String danh_sach) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.number = number;
      this.color = color;
      this.mota = mota;
      this.danh_sach = danh_sach;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getMota() {
      return mota;
   }

   public void setMota(String mota) {
      this.mota = mota;
   }

   public String getDanh_sach() {
      return danh_sach;
   }

   public void setDanh_sach(String danh_sach) {
      this.danh_sach = danh_sach;
   }

   @Override
   public String toString() {
      return "Product{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", price=" + price +
              ", number=" + number +
              ", color='" + color + '\'' +
              ", mota='" + mota + '\'' +
              ", danh_sach='" + danh_sach + '\'' +
              '}';
   }
}

