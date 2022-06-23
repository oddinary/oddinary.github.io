import java.util.*;

public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);

		String line = "Hello. I'm a java developer.";
		Map<Character, Integer> s = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (!s.containsKey(c)) {
				s.put(c, 1);
			} else {
				s.put(c, s.get(c) + 1);
			}
		}
		System.out.println(s.size() + "글자가 있습니다.");
		System.out.println(s);
	}
}
