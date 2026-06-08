class FileWritter {
    public static void main(String[] args) throws Exception {
        file f1=new file("navya.txt");
        f1.CreateNewFile();
        FileReader f=new FileReader("navya.txt");
        BufferedReader br=new BufferedReader(f);
        String s;

        FileWritter fw=new FileWriter("navya.txt");
        fw.write("navya is a student");
        fw.close();
    }
}