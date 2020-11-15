
public class PushDominoes838 {

	public static void main(String[] args) {
		System.out.println(pushDominoes(args[0]));
	}

	public static String pushDominoes(String dominoes) {
		boolean changed = false;
		char[] items = dominoes.toCharArray();
		do {
			char previous = 'x';
			char next = 'x';
			changed = false;
			for(int i = 0; i < items.length; i++) {
				char current = items[i];
				if(i + 1 < items.length) {
					next = items[i + 1];
				}
				else {
					next = 'x';
				}
				if('.' == current) {
					if(previous != 'R' && next == 'L') {
						items[i] = 'L';
						changed = true;
					}
					if(previous == 'R' && next != 'L') {
						items[i] = 'R';
						changed = true;
					}
				}
				previous = current;
			}
		} while(changed);
		return new String(items);
	}
}

