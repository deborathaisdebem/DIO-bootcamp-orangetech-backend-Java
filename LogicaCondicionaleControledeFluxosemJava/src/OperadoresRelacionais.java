public class OperadoresRelacionais {



        public static void main(String[] var0) {
            byte var1 = 10;
            byte var2 = 20;
            float var3 = 4.5F;
            float var4 = 3.5F;
            double var5 = 59.6;
            byte var7 = 120;
            byte var8 = 121;
            String var9 = "Fulano";
            String var10 = "Fulano";
            String var11 = "Cicrano";
            boolean var12 = true;
            boolean var13 = false;
            long var14 = 1597L;
            long var16 = 8997L;
            byte var18 = 1;
            byte var19 = 25;
            System.out.println("i1 == i2 " + (var1 == var2));
            System.out.println("i1 != i2 " + (var1 != var2));
            System.out.println("i1 > i2 " + (var1 > var2));
            System.out.println("i1 <= i2 " + (var1 <= var2));
            System.out.println("f1 == f2 " + (var3 == var4));
            System.out.println("f1 != f2 " + (var3 != var4));
            System.out.println("f1 >= f2 " + (var3 >= var4));
            System.out.println("f1 < f2 " + (var3 < var4));
            System.out.println("c1 == c2 " + (var7 == var8));
            System.out.println("c1 != c2 " + (var7 != var8));
            System.out.println("c1 > c2 " + (var7 > var8));
            System.out.println("c1 <= c2 " + (var7 <= var8));
            System.out.println("s1 == s2 " + (var9 == var10));
            System.out.println("s1 == s3 " + (var9 == var11));
            System.out.println("s1 != s2 " + (var9 != var10));
            System.out.println("b1 == b2 " + (var12 == var13));
            System.out.println("b1 != b2 " + (var12 != var13));
            System.out.println("i2 > f1 " + ((float)var2 > var3));
            System.out.println("d1 == h1 " + (var5 == (double)var19));
            System.out.println("l1 == i2 " + (var14 == (long)var2));
            System.out.println("l2 >= i1 " + (var16 >= (long)var1));
            System.out.println("y1 != h1 " + (var18 != var19));
        }


}
