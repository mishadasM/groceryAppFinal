package com.obsqura.utilities;

import java.util.Random;

public class RandomUtility {
	 public static int RandomNumber( ) {
			Random rand=new Random();
			 int a=rand.nextInt(100);
			return a;
		}
}
