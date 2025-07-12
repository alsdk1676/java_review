package test;

import java.util.Arrays;
import java.util.Objects;

public class Researcher extends Person{
   
   private long id;
   private String[] lotto;
   private String search;
   
   public Researcher() {;}

   public Researcher(long id, String name, int age, String phone, String job, String search) {
      super(id, name, age, phone, job);
      this.search = search;
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

   public String getSearch() {
      return search;
   }

   public void setSearch(String search) {
      this.search = search;
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
      Researcher other = (Researcher) obj;
      return id == other.id;
   }

   @Override
   public String toString() {
      return "Researcher [id=" + id + ", lotto=" + Arrays.toString(lotto) + ", search=" + search + "]";
   }
   
   @Override
   public void work() {
      System.out.println("연구원은" + this.getSearch() + "중입니다"); 
   }

   public void investLab(boolean lucky) {
      if(lucky) {
         System.out.println("연구에 투자한다");
      }else {
         System.out.println("나에게 투자한다");
      }
   }
   
   public void buyFood(boolean lucky) {
      if(lucky) {
         System.out.println("지인에게 밥을 산다");
      }else {
         System.out.println("집에 쌀을 산다");
      }
   }
   
}





