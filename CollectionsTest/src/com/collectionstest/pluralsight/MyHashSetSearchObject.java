package com.collectionstest.pluralsight;

import java.util.HashSet;

public class MyHashSetSearchObject {
 
    public static void main(String a[]){
         
        HashSet<Price> lhs = new HashSet<Price>();
        lhs.add(new Price("Banana", 20));
        lhs.add(new Price("Apple", 40));
        lhs.add(new Price("Orange", 30));
        for(Price pr:lhs){
            System.out.println(pr);
        }
        Price key = new Price("Banana", 60);
        System.out.println("Key" + key);
        System.out.println("Does set contains key? "+lhs.contains(key));
    }
}
 
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
   /* public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }*/
     
   /* public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }*/
     
    public String getItem() {
        return item;
    }
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}