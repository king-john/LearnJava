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
//     * ����Json����
//     * 
//     * @return
//     */
//    public static String BuildJson() {
//
//        // JSON��ʽ���ݽ�������
//        JSONObject jo = new JSONObject();
//
//        // ���湹������map��һ��list��һ��Employee����
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
//        // ��Mapת��ΪJSONArray����
//        JSONArray ja1 = JSONArray.fromObject(map1);
//        // ��Listת��ΪJSONArray����
//        JSONArray ja2 = JSONArray.fromObject(list);
//        // ��Beanת��ΪJSONArray����
//        JSONArray ja3 = JSONArray.fromObject(employee);
//
//        
//        System.out.println("JSONArray�������ݸ�ʽ��");
//        System.out.println("��Mapת��ΪJSONArray���������ݸ�ʽ");
//        System.out.println(ja1.toString());
//        System.out.println("��Listת��ΪJSONArray���������ݸ�ʽ");
//        System.out.println(ja2.toString());
//        System.out.println("��Beanת��ΪJSONArray���������ݸ�ʽ");
//        System.out.println(ja3.toString());
//        JSONArray ja = new JSONArray();
//        ja.add(0,map1);
//        ja.add(1,list);
//        ja.add(2,employee);
//        System.out.println("��JSONArray������� map list bean");
//        //[{"sex":"female","age":"23","name":"Alexia"},[{"sex":"female","age":"23","name":"Alexia"},{"sex":"male","age":"24","name":"Edward"}],{"age":24,"name":"wjl","sex":"female"}]
//        System.out.println(ja.toString());
//        
//        Employee e = null;
//        System.out.println("����Ϊ��");
//        JSONObject json = jo.fromObject(employee);
//        System.out.println(json.toString());
//        // ����JsonObject���ݣ�����һ��map��һ��jsonArray����
////        jo.put("map", map1);
////        jo.put("employee", ja2);
////        System.out.println("\n�������չ����JSON�������ݸ�ʽ��");
////        System.out.println(jo.toString());
//
//        return jo.toString();
//
//    }
//
//    /**
//     * ����Json����
//     * 
//     * @param jsonString Json�����ַ���
//     */
//    public static void ParseJson(String jsonString) {
//
//        // ����������json�ַ���ת��jsonObject���н���
//        JSONObject jb = JSONObject.fromObject(jsonString);
//        JSONArray ja = jb.getJSONArray("employee");
//
//        List<Employee> empList = new ArrayList<Employee>();
//
//        // ѭ�����Employee���󣨿����ж����
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
//        System.out.println("\n��Json����ת��ΪEmployee����");
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
