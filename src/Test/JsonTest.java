package Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;



import util.json.JSONException;
import util.json.JSONObject;







public class JsonTest {

//	  /**
//     * 构造Json数据
//     * 
//     * @return
//     */
//    public static String BuildJson() {
//
//        // JSON格式数据解析对象
//        JSONObject jo = new JSONObject();
//
//        // 下面构造两个map、一个list和一个Employee对象
//        Map<String, String> map1 = new HashMap<String, String>();
//        map1.put("name", "Alexia");
//        map1.put("sex", "female");
//        map1.put("age", "23");
//
//        Map<String, String> map2 = new HashMap<String, String>();
//        map2.put("name", "Edward");
//        map2.put("sex", "male");
//        map2.put("age", "24");
//
//        List<Map> list = new ArrayList<Map>();
//        list.add(map1);
//        list.add(map2);
//
//        Employee employee = new Employee();
//        employee.setName("wjl");
//        employee.setSex("female");
//        employee.setAge(24);
//
//        // 将Map转换为JSONArray数据
//        JSONArray ja1 = JSONArray.fromObject(map1);
//        // 将List转换为JSONArray数据
//        JSONArray ja2 = JSONArray.fromObject(list);
//        // 将Bean转换为JSONArray数据
//        JSONArray ja3 = JSONArray.fromObject(employee);
//
//        
//        System.out.println("JSONArray对象数据格式：");
//        System.out.println("将Map转换为JSONArray对象后的数据格式");
//        System.out.println(ja1.toString());
//        System.out.println("将List转换为JSONArray对象后的数据格式");
//        System.out.println(ja2.toString());
//        System.out.println("将Bean转换为JSONArray对象后的数据格式");
//        System.out.println(ja3.toString());
//        JSONArray ja = new JSONArray();
//        ja.add(0,map1);
//        ja.add(1,list);
//        ja.add(2,employee);
//        System.out.println("将JSONArray对象添加 map list bean");
//        //[{"sex":"female","age":"23","name":"Alexia"},[{"sex":"female","age":"23","name":"Alexia"},{"sex":"male","age":"24","name":"Edward"}],{"age":24,"name":"wjl","sex":"female"}]
//        System.out.println(ja.toString());
//        
//        Employee e = null;
//        System.out.println("对象为空");
//        JSONObject json = jo.fromObject(employee);
//        System.out.println(json.toString());
//        // 构造JsonObject数据，包括一个map和一个jsonArray对象
////        jo.put("map", map1);
////        jo.put("employee", ja2);
////        System.out.println("\n填入最终构造的JSON对象数据格式：");
////        System.out.println(jo.toString());
//
//        return jo.toString();
//
//    }
//
//    /**
//     * 解析Json数据
//     * 
//     * @param jsonString Json数据字符串
//     */
//    public static void ParseJson(String jsonString) {
//
//        // 将传过来的json字符串转成jsonObject进行解析
//        JSONObject jb = JSONObject.fromObject(jsonString);
//        JSONArray ja = jb.getJSONArray("employee");
//
//        List<Employee> empList = new ArrayList<Employee>();
//
//        // 循环添加Employee对象（可能有多个）
//        for (int i = 0; i < ja.size(); i++) {
//            Employee employee = new Employee();
//
//            employee.setName(ja.getJSONObject(i).getString("name"));
//            employee.setSex(ja.getJSONObject(i).getString("sex"));
//            employee.setAge(ja.getJSONObject(i).getInt("age"));
//
//            empList.add(employee);
//        }
//
//        System.out.println("\n将Json数据转换为Employee对象：");
//        for (int i = 0; i < empList.size(); i++) {
//            Employee emp = empList.get(i);
//            System.out.println("name: " + emp.getName() + " sex: "
//                    + emp.getSex() + " age: " + emp.getAge());
//        }
//
//    }

    /**
     * @param args
     */
    public static void main(String[] args) {
      Map<String, String> map = new HashMap<String, String>();
      map.put("body", "1");
      map.put("sex", "female");
      map.put("age", "23");
      
	  JSONObject jsonObj  = new JSONObject(map);
	  System.out.println(jsonObj);
	  
	  Employee employee = new Employee();
      employee.setName("wjl");
      employee.setSex("female");
      employee.setAge(24);
	  JSONArray ja = JSONArray.fromObject(map);
	  System.out.println(ja.toString());
	  List<Employee> list = new ArrayList<Employee>();
	  list.add(employee);
	  list.add(employee);
	  Map<String, List> map1 = new HashMap<String, List>();
      map1.put("body", list);
      JSONObject jsonObj2  = new JSONObject(map1);
	  System.out.println(jsonObj2);
	 
	  String jsonString = jsonObj.toString();
	  try {
		JSONObject jb = new JSONObject(jsonString);
		String body = jb.get("body").toString();
		System.out.println("---------"+body);
		List list2 = (List) jsonObj2.get("body");
		for(Object o :list2){
			System.out.println("list:"+o);
		}
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

}
