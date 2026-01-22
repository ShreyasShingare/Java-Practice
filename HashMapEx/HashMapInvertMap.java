package HashMapEx;
import java.util.*;

public class HashMapInvertMap {
	public static void main(String[] args) {
		
		Map<String, String> fruitColors = new HashMap<>();
		
		fruitColors.put("Apple","Red");
		fruitColors.put("Banana","Yellow");
		fruitColors.put("Guava","Green");
		fruitColors.put("Pomegranate","Red");
		fruitColors.put("GreenApple", "Green");
		fruitColors.put("Lemon", "Yellow");
		
		System.out.println(fruitColors);
		
		Map<String, List<String>> colorFruits = new HashMap<>();
		List<String> fruits = new ArrayList<>();
		
		for(Map.Entry<String, String> entry : fruitColors.entrySet()) {
			String fruit = entry.getKey();
			String color = entry.getValue();
			
			colorFruits.putIfAbsent(color, new ArrayList<>());
			colorFruits.get(color).add(fruit);
		}
		System.out.println(colorFruits);
		
	}

}
