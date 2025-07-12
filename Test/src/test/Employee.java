package test;

import java.util.Arrays;
import java.util.Objects;

public class Employee extends Person{
   private long id;
   private String[] lotto;
   private String company;
   
   public Employee() {;}

   public Employee(long id, String name, int age, String phone, String job, String company) {
      super(id, name, age, phone, job);
      this.company = company;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String[] getLotto() {
      return lotto;
   }

   public void setLotto(String[] lotto) {
      this.lotto = lotto;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   @Override
   public String toString() {
      return "Employee [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", company=" + company + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(id);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      Employee other = (Employee) obj;
      return id == other.id;
   }
   
   @Override
   public void work() {
      System.out.println(this.getJob() + "하루종일 일을한다");
   }
   
   public void byeCompany(boolean lucky) {
      if(lucky) {
         System.out.println("직장을 그만둔다");
      }else {
         System.out.println("다시 일한다");
      }
   }
   
   public void saveMoney(boolean lucky){
      if(lucky) {
         System.out.println("전액을 저축한다");
      }else {
         System.out.println("다시 돈을 번다");
      }
   }
   
   
}


