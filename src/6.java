// Java code for generating a random number between 1 and 10
int randomNumber = (int)(Math.random()*10)+1;

// Java code for generating a random string with length of 5
String randomString = "abcdefghijklmnopqrstuvwxyz";
char[] chars = new char[5];
for(int i=0;i<chars.length;i++){
    int index = (int)(Math.random()*26);
    chars[i] = randomString.charAt(index);
}
String output = new String(chars);

// Java code for generating a random boolean value
boolean randomBoolean = Math.random()<0.5;
