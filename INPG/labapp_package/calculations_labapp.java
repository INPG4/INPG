package labapp_package;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class calculations_labapp {
	
	protected static double calculate_uncertainty(double[] Data_Series , double average) {
		double uncertainty = 0;
		for ( double a: Data_Series ) {
			uncertainty = uncertainty+pow((a - average),2);
		}
		uncertainty = uncertainty/(Data_Series.length*(Data_Series.length - 1));
		uncertainty = sqrt(uncertainty);
		return uncertainty;
	}
	
	protected static double calculate_average(double[] Data_Series) {
		double average = 0.0 ;
		for( double a: Data_Series)
			average=a+average;
		average=average/Data_Series.length;
		return average;
	}
	
	protected static String convert_to_string(double[] Data_Series) {
		String Series = "";
		for(Double a : Data_Series) {
			Series = Series + "\n" + a.toString();
		}
		Series=Series.substring(1);
		return Series;
	}
	
	protected static double[] convert (String Data_Series) {
		int i = 0;
		Scanner scanner = new Scanner(Data_Series);
		while (scanner.hasNextLine()) {
		  i=i+1;
		  @SuppressWarnings("unused")
		  String line = scanner.nextLine();
		}
		scanner.close();
		scanner = new Scanner(Data_Series);
		double[] conv_res = new double [i];
		i = 0;
		while (scanner.hasNextLine()) {
			  String line = scanner.nextLine();
			  conv_res[i]=Double.parseDouble(line);
			  i=i+1;
			}
		scanner.close();
		return conv_res;
	}
	
	protected static double[] exercise_13(data_object Data) {
		double[] diameter = Data.Data_First_Series;
		double[] mass = Data.Data_Second_Series;
		double[] time = Data.Data_Third_Series;
		double length = Double.parseDouble(Data.Const_Third);
		double g = Double.parseDouble(Data.Const_First);
		double density = Double.parseDouble(Data.Const_Second);
		double tube_diameter = Double.parseDouble(Data.Const_Fourth);
		int integer = 0;
		double[] result = new double[diameter.length];
		for(integer=0;integer<diameter.length;integer++) {
			result[integer] = 1000*(mass[integer]/1000 - (Math.PI*density*Math.pow(diameter[integer]/1000, 3)/6))*g*time[integer]/(3*Math.PI*length*diameter[integer]*0.000001*(1+2.4*diameter[integer]/tube_diameter));
		}
		return result;
	}
	
	protected static double[] exercise_32(data_object Data) {
		double[] resistance = Data.Data_First_Series;
		double[] a = Data.Data_Second_Series;
		double length = Double.parseDouble(Data.Const_First);
		double[] result = new double[resistance.length];
		for(int integer = 0 ; integer < resistance.length ; integer++)
			result[integer] = resistance[integer]*a[integer]/(length-a[integer]);
		return result;
	}
	
	protected static double[] exercise_1(data_object Data) {
		double[] k = Data.Data_First_Series;
		double[] T = Data.Data_Second_Series;
		double[] result = new double[k.length];
		for(int integer = 0 ; integer < k.length ; integer++)
			result[integer] = T[integer]/k[integer];
		return result;
	}
	
	protected static double[] exercise_51(data_object Data) {
		double[] a_d = Data.Data_First_Series;
		double[] a_g = Data.Data_Second_Series;
		double[] result = new double[a_d.length];
		for(int integer = 0 ; integer < a_d.length ; integer++)
			result[integer] = a_d[integer]-a_g[integer];
		return result;
	}
	
	
}
