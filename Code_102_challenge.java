package Question_100_coding_challenge;

public class Code_102_challenge {
    public static void main(String[] args) {
                int iterations = 1000;


                long startTime = System.currentTimeMillis();
                String str = "";
                for (int i = 0; i < iterations; i++) {
                    str += "a";  // Creates a new String each time
                }
                long stringTime = System.currentTimeMillis() - startTime;

                // Test with StringBuilder (not thread-safe but fast)
                startTime = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < iterations; i++) {
                    sb.append("a");
                }
                long stringBuilderTime = System.currentTimeMillis() - startTime;

                // Test with StringBuffer (thread-safe, slightly slower)
                startTime = System.currentTimeMillis();
                StringBuffer sf = new StringBuffer();
                for (int i = 0; i < iterations; i++) {
                    sf.append("a");
                }
                long stringBufferTime = System.currentTimeMillis() - startTime;

                // Output results
                System.out.println("String: " + stringTime + "ms, " +
                        "StringBuilder: " + stringBuilderTime + "ms, " +
                        "StringBuffer: " + stringBufferTime + "ms");
            }
        }


