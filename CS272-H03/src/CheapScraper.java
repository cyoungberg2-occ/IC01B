
public class CheapScraper {
	
	public static void usage() {
		System.out.println();
	}

	public static void main(String[] args) {
		if (args.length < 3) {
			usage();
			System.exit(0);
		}
		int n = 0;
		int c = 0;
		
		while(in.hasNextLine) {
			String s = in.nextLine();
			a[n][c] = s.trim();
			c++;
			if (c==cols) {
				c = 0;
				n++;
			}
		}
		for(int i = 0; i < n; ++i) {
			for (int j = 1; j < cols; ++j) {
				if (j==1)
					out.print(",\"" + a[i][j] + "\"");
				else
					out.print("," + a[i][j]);
				
			}
			out.println();
		}
		out.close();
	}
	
}
