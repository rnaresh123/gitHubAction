package codingpractice;

public class DuplicateCharacter {
        public static void main(String[] args) {
            String str = "automation";
            printDuplicateCharacters(str);
        }

        private static void printDuplicateCharacters(String str) {
            char[] characters = str.toCharArray();
            System.out.println("Duplicate characters in the string '" + str + "':");
            for (int i = 0; i < characters.length; i++) {
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        System.out.print(characters[j]+" ");
                        break;
                    }
                }
            }
        }
    }

