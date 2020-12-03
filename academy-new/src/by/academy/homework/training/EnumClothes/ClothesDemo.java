package by.academy.homework.training.EnumClothes;
//НЕ РАЗОБРАЛСЯ КАК ДОДЕЛАТЬ И ПОЧИНИТЬ STACKOVERFLOW
public class ClothesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes[] clothes = new Clothes[4];
		clothes[0] = new Tshirt(Size.XS, 10.0, "red", clothes);
		clothes[1] = new Pants(Size.M, 15.0, "black", clothes);
		clothes[2] = new Skirt(Size.L, 12.0, "gray", clothes);
		clothes[3] = new Tie(Size.S, 5.0, "yellow", clothes);
		
		//Tshirt tshirt = new Tshirt(Size.L, 5, "dark", clothes);
		Studio studio = new Studio();
		studio.dressMan(clothes);
	}

}
