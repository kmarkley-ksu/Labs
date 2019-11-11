public class Lab11 
{
	public static void main(String[] args)
	{
		//PART 1:
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(25.0);
		
		System.out.println(String.format("Radius is: %.2f", 
				circle1.GetRadius()));
		
		System.out.println(String.format("Area is: %.2f", 
				circle1.GetArea()));
		
		System.out.println(String.format("Perimeter is: %.2f", 
				circle1.GetPerimeter()));
		
		System.out.println(circle1);
		
		circle1.SetRadius(50.0);
		
		System.out.println("Radius is: " + circle1.GetRadius());
		System.out.println("Area is: " + circle1.GetArea());
		System.out.println("Perimeter is: " + circle1.GetPerimeter());
		System.out.println(circle1);
		
		System.out.println("Radius is: " + circle2.GetRadius());
		System.out.println("Area is: " + circle2.GetArea());
		System.out.println("Perimeter is: " + circle2.GetPerimeter());
		
		System.out.println(circle2 + "\n");
		
		//PART 2:
		Radio radio = new Radio();
		
		radio.TurnOn();
		System.out.println(radio);
		
		radio.VolumeUp();
		radio.VolumeUp();
		radio.VolumeUp();
		System.out.println(radio);
		
		radio.StationUp();
		radio.StationUp();
		radio.StationUp();
		radio.StationUp();
		radio.StationUp();
		System.out.println(radio);
		
		radio.VolumeDown();
		System.out.println(radio);
		
		radio.StationDown();
		radio.StationDown();
		radio.StationDown();
		System.out.println(radio);
		
		radio.TurnOff();
		System.out.println(radio);
		
		radio.VolumeUp();
		radio.VolumeUp();
		System.out.println(radio);
		
		radio.StationDown();
		radio.StationDown();
		System.out.println(radio);
	}
}
