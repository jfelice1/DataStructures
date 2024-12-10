class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    MyMap<String, Integer> creditHours = new MyHashMap<String, Integer>();

    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    System.out.println("HashSet contains IT-1025: " + creditHours.containsKey("IT-1025"));
    System.out.println("HashSet contains IT-2110: " + creditHours.containsKey("IT-2110"));

    System.out.println("All values in map: " + creditHours);

    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150");

    System.out.println("All values in map: " + creditHours);
  }
}