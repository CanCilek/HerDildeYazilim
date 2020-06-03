package com.cancilek.herdildeyazilim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CSharpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_sharp);

        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> KonuIcerik = new ArrayList<>();
        KonuIcerik.add("DEĞİŞKENLER");
        KonuIcerik.add("EKRAN ÇIKTISI");
        KonuIcerik.add("VERİ ALMA");
        KonuIcerik.add("YORUM SATIRI");
        KonuIcerik.add("KOŞULLU İFADELER");
        KonuIcerik.add("DÖNGÜLER");
        KonuIcerik.add("DİZİLER-LİSTELER");
        KonuIcerik.add("FONKSİYONLAR");
        KonuIcerik.add("SINIFLAR");

        final ArrayList<String> CsharpIcerik = new ArrayList<>();
        CsharpIcerik.add("Değişken türleri \n" +
                "\n"+
                "--> byte \n" +
                "--> sbyte \n" +
                "--> short \n" +
                "--> ushort \n" +
                "--> int \n" +
                "--> uint \n" +
                "--> long \n" +
                "--> ulong \n" +
                "--> float \n" +
                "--> double \n" +
                "--> decimal \n" +
                "--> char \n" +
                "--> String \n" +
                "--> bool \n" +
                "--> object \n" +
                "Gibi farklı değişken türleri vardır. \n" +
                "\n Değişken adlandırma kuralları\n" +
                "\n" +
                "Aşağıdaki kuralları ihlal etmemek şartıyla değişkenlere istediğiniz adı verebilirsiniz.\n" +
                "\n" +
                "--> Değişken adları boşluk, simge içeremez.\n" +
                "--> Değişkenler bir numerik karakterle başlayamaz.\n" +
                "--> C#'ın diğer bütün komut, metot ve benzerlerinde olduğu gibi değişken adlarında büyük-küçük harf duyarlılığı vardır. Yani degisken isimli bir değişkenle Degisken isimli bir değişken birbirinden farklıdır.\n" +
                "--> Değişken adları Türkçe karakterlerden(ğ,ü,ş,ö,ç,ı) oluşamaz. (Yeni versiyonlarda Türkçe karakterler kullanılabilir.)");
        CsharpIcerik.add("C# da Ekrana yazı yazdırabilmek için Console.Write() Fonksiyonu kullanılır."+
                "\n"+
                "Örnek olarak \n"+
                "\n Console.Write(\"Merhaba Dünya\"); bu kodu yazarsanız Konsol ekranına Merhaba Dünya yazıcaktır.\n" +
                "C# her satırın sonuna “;” eklenir.Bu kuraldır.\n" +
                "Bidahaki satıra “Console.Readkey();” yazarak programın direk kapanmasını önlersiz.");
        CsharpIcerik.add("C# da Kullanıcıdan veri almak için Console.Read() Fonksiyonu kullanılır.");
        CsharpIcerik.add("Tek satırlık için yorum satırı yapmak;\n" +
                "\n" +
                "“//” kodunu kullanarak tek satırlık açıklama satırı oluşturabiliriz.Örnek olarak şöyle verebiliriz;" +
                "\n" +
                "Birden fazla satır için yorum satırı yapmak;\n" +
                "\n" +
                "Eğer birden fazla yorum satırı oluşturmak istiyorsak yazacağınız açıklamaları “/*” ve “*/” kodları içerisine almanız gerekmektedir.Örnek olarak şöyle diyebiliriz." +
                "\n");
        CsharpIcerik.add("If-else yapısı diğer programlama dillerinde olduğu gibi C#’dada, koşullu dallanma ifadesi olarak kullanılmaktadır. Programda alternatifli durumlarla karşılaşıldığında, duruma özgü komutların işletilmesini sağlar. Dallanma işlemlerinde programcıların en çok tercih ettiği yapıdır.\n");
        CsharpIcerik.add("C# döngüler, Programlama dilinde döngüler belirtilen komut satırlarının tekrar tekrar çalıştırılmasını sağlayan yapılardır. For döngüsü genellikle üç ifade ile kullanılır. Bu ifadelerden ilkinde döngü değişkeni için bir başlangıç değeri verilir. İkinci ifadede döngü değişkenin değerine bağlı bir koşul belirlenir bu koşul sağlandığı sürece döngü içerisindeki belirtilen işlemleri tekrar eder. Üçüncü ifade de çoğunlukla döngü değişkeninin artış yada azalış miktarı için kullanılır.\n" +
                "\n" +
                "Yukarıdaki döngüde öncelikli olarak i değişkeninin başlangıç değeri olan 1 kurulur. Daha sonra koşul operatörü olan i<=5 ifadesi çalışır. Bu ifadenin sonucu eğer Trueise döndü satırları çalıştırılır. Döngü içeriği bittikten sonra i++ arttırma operatörü çalışır ve i değişkenin değeri 2 olur. Bu değer tekrar i<=5 için çalıştırılır. Ve sonuçTrue olduğu sürece döngü devam eder. i değişken değeri bu örnek için 6 olduğu durum da i<=5 ifadesinin sonucu False olur ve döngü kodu işletilmeden döngü sonlandırılır.");
        CsharpIcerik.add("C# Diziler, Az sayıda değişken tanımlayacağımız zamanlarda tek tek yazıp tanımlayabiliyoruz. Ancak çoğu zaman bu böyle olmayabiliyor. Bazı programlarda 200-300 değişkene kadar ihtiyaç duyabiliriz. Bunların hepsinin teker teker tanımlanması oldukça zahmetlidir. İşte bu yüzden programlama dillerinde dizi diye bir kavram vardır. Aslında bir dizi, birbiriyle ilişkili değişkenlerin oluşturduğu bir gruptan başka bir şey değildir. Diyelim ki sayi1 ve sayi2 adlı iki değişken tanımladık. Bunların adları birbirine benzemesine rağmen birbiriyle hiçbir ilişkisi yoktur. Yani bir döngü içinde sayiX yazarak bu değişkenlere erişemeyiz. Halbuki dizilerde bu mümkündür.");
        CsharpIcerik.add("Metotlar oluşturarak programımızı parçalara böler ve programımızın karmaşıklığını azaltırız. Ayrıca bazı kodları bir metot içine alıp aynı kodlara ihtiyacımız olduğunda bu metodu çağırabiliriz. Bu sayede de kod hamallığı yapmaktan kurtuluruz.\n" +
                "\n" +
                "Metot Nasıl Tanımlanır? \n" +
                "\n" +
                "--> int MetotAdi(int a,int b)\n" +
                "--> {\n" +
                "--> return a+b;\n" +
                "--> }");
        CsharpIcerik.add("Sınıf nedir?\n" +
                "\n" +
                "OOP türü yazdığımız programlarda sadece nesneler vardır. Bu nesneler, mesaj alışverişi yaparak, birbirleriyle haberleşirler.\n" +
                "Nesneler OOP de sınıf olarak ifade edilen şablonlardan yaratılır. Her sınıf içinde, o sınıftan üretilecek nesnelerin özelikleri, davranışları tespit edilir. Örneğin Araba isminde bir sınıf yaratabiliriz. Bu sınıftan üretilecek nesnelerin ortak yani, bir motor, 4 teker, direksiyon gibi parçalar olacaktır." +
                "\n" +
                "\n" +
                "Nesne Nedir?\n" +
                "\n" +
                "Nesne, içinde veri ve bu veriler üzerinde işlem yapacak olan metotları(fonksiyon) bulunduran yazılım bileşenidir. Nesne bu tanıma uygun olarak, kendi işlevselliğini de içinde taşır. Nesneler her uygulamada tekrar tekrar kullanılabilir. Veri ve metotlar, birlikte nesnenin üyeleri (members) adını alır. Bir nesne yapısı, bir sınıf (class) içinde tanımlanır. Sınıf içinde nesneyi oluşturan üye değişkenler ve metotlar açıkça tanımlanır.\n" +
                "\n");





        Bitmap degiskenler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpdegisken);
        Bitmap ekranciktisi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpveriyazdirma);
        Bitmap verialma = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpverialma);
        Bitmap yorumsatiri = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpyorumsatiri);
        Bitmap kosul = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpkosullu);
        Bitmap donguler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpdonguler);
        Bitmap diziler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpdizi);
        Bitmap fonksiyon = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpmetot);
        Bitmap sinif = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.csharpsinif);

        final ArrayList<Bitmap> CsharpImages = new ArrayList<>();
        CsharpImages.add(degiskenler);
        CsharpImages.add(ekranciktisi);
        CsharpImages.add(verialma);
        CsharpImages.add(yorumsatiri);
        CsharpImages.add(kosul);
        CsharpImages.add(donguler);
        CsharpImages.add(diziler);
        CsharpImages.add(fonksiyon);
        CsharpImages.add(sinif);


        ArrayAdapter arrayAdapter = new ArrayAdapter(CSharpActivity.this,android.R.layout.simple_list_item_1,KonuIcerik);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(getApplicationContext(),ContentActivity.class);
                intent.putExtra("KonuIcerik",KonuIcerik.get(i));
                intent.putExtra("DetayIcerik",CsharpIcerik.get(i));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(CsharpImages.get(i));
                startActivity(intent);



            }
        });
    }
}
