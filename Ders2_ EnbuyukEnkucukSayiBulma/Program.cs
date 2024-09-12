// See https://aka.ms/new-console-template for more information    






using System;
//using System.ComponentModel.Design;

Console.WriteLine("En Büyük ve en küçük pozitif sayi bulma programi: ");
// Aşsağıda bir deneme yaptım console hata verdi, silmek istemedim.



/*
int a, b, c;
int Enbuyuk, Enkucuk;
a = 10;
b = 110;
c = 0;


//Console.WriteLine("Sayilarini Giriniz: " );

if(a>b )
{
    Enbuyuk = a;
    Enkucuk = b;    

}
else{ Enbuyuk = b;
    Enkucuk = a;
}
Console.WriteLine("En Büyük Sayı: " + Enbuyuk);
Console.WriteLine("En Küçük Sayı: " + Enkucuk);
*/





//int a,b,c,d;
int Enbuyuk, Enkucuk;

Console.WriteLine("Sayinizi giriniz: ");


/*
String a = Console.ReadLine(); 
String b = Console.ReadLine();  
string c = Console.ReadLine();  
string d = Console.ReadLine();  
*/
int a = Convert.ToInt32(Console.ReadLine());
int b = Convert.ToInt32(Console.ReadLine());
int c = Convert.ToInt32(Console.ReadLine());
int d = Convert.ToInt32(Console.ReadLine());

if (a>b&& a>c && b>c)
{
    Enbuyuk= Convert.ToInt32(a);
    Console.WriteLine("Enbuyuk Sayi" a);
    Console.WriteLine("Enbuyuk Sayi" c);

}
else if(b>a && b >c && b!=0 && c>a && c!= 0)
{
    Console.WriteLine("Enbuyuk Sayi" b);

    Console.WriteLine("Enkucuk Sayi" a);

}   
else if(c>a&& c>b&& c!=0 && b>a)
{
    Console.WriteLine("Enbuyuk" c);
    Console.WriteLine("Enkucuk" a);
}     






