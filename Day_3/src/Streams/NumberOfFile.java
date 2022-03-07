package Streams;

import java.io.*;

    class LineDemo
    {
        public static void main(String [ ]a) throws Exception
        {
            File f = new File("d:/jp/streams","test.doc");
            FileReader fr = new FileReader(f);
            LineNumberReader lnr = new LineNumberReader(fr);
            int i;
            String s;
            while((s=lnr.readLine())!=null)
            {
                i = lnr.getLineNumber();
                System.out.println(i+" "+s);
            }
        }
    }

