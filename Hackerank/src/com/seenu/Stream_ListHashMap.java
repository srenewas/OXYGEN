package com.seenu;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Stream_ListHashMap {
	public static void main(String[] args) {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "seenu");
		map.put("key2", "suhas");
		map.put("key3", "akhil");
		map.put("key4", "anupama");
		map.put("key5", "mini");
		map.put("key6", "aron");
		map.put("key7", "google");
		map.put("key8", "capgemini");
		map.put("key9", "cognizant");
		list.add(map);
		list.stream().filter(x-> x.containsKey("key3")).map(x->x.get("key3")).forEach(y-> System.out.println(y));
		Optional<String> opt = map.entrySet().stream().filter(x-> "java".equals(x.getValue())).map(Map.Entry::getKey).findFirst();
		System.out.println(opt);
		   
	}

}
