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

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

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

        final ArrayList<String> JavaIcerik = new ArrayList<>();
        JavaIcerik.add("Java’da Veri Tipleri ve Değişkenler \n" +
                "Nesne yönelimli programlama dillerinde, genel olarak her sınıf bir veri tipidir. Kulanılan bu tipler verileri tutmak, saklamak için kullanılır. Kullanılan veri tipine göre bellekte yer ayrılır. Java’da veri tipleri 3 gruba ayrılır.\n" +
                "--> İlkel (Primitive) Veri Tipleri\n" +
                "--> Referans Tipleri\n" +
                "--> Null Tipi\n" +
                "Ben şuanda Sizlere ilkel olan veri tiplerinden bahsedeceğim\n" +
                "İlkel Veri Tipleri\n" +
                "Tam sayılar:\n" +
                "Byte: -128 ve 127 arasında değerler alır. (8 bit)\n" +
                "Short: -32768 ve 32767 arasında değerler alır. (16 bit)\n" +
                "Integer: Orta uzunluktaki sayıları tutmak için kullanılır. En fazla kullanılan veri tipidir. (32 bit)\n" +
                "Long: Çok uzun sayıları tutmak için kullanılır. (64 bit)\n" +
                "Ondalıklı Sayılar:\n" +
                "Float: Bu tip virgülden sonra 7 haneye kadar yeterli duyarlılıktadır. (Tek duyarlı — 32 bit)\n" +
                "Double: Bu tip virgülden sonra 17 haneye kadar yeterli duyarlılıktadır. (Çift duyarlı — 64 bit)\n" +
                "Char: Javada karakterleri temsil eder. 16 bit yer kaplar.\n" +
                "Boolean: Bu tip sadece True-False değerini alabilir.\n");
        JavaIcerik.add("Ekrana yazdırma işlermlerinde System.out.print(), System.out.println(), System.out.printf() metotları kullanılmaktadır.\n" +
                "System.out.print(); -> Bu metot parametre olarak gelen ifadeleri ekrana yazdırır. Örneğin ekrana “Java” ifadesini yazdı. Ardından yine bir yazdırma işlemi yaptınız ve “Eclips” ifadesini yazdırdınız. İşte o zaman ekrana “JavaEclips” yazacaktır.\n" +
                "\n" +
                "System.out.printf()- > C’de sık kullandığımız printf() metotu ile aynı işi görmektedir.\n" +
                "\n" +
                "System.out.println(); -> Kendisinden sonraki gelen ifadeleri alt satırda devam ettirir. Az önce ki örnek üzerinden gidersek ekran çıktısı şöyle olur:\n" +
                "\n" +
                "Java\n" +
                "\n" +
                "Eclips");
        JavaIcerik.add("Scanner Kullanımı\n" +
                "\n" +
                "Kullanıcıdan veri alanacak alana Scanner eklemek için vermeniz gereken iki komut vardır. Bunlar;\n" +
                "--> Scanner girdi = new Scanner(System.in);\n" +
                "--> int sonuc = girdi.nextInt();\n" +
                "girdi adı ile oluşturulan Scanner'a System.in ile kullanıcıdan veri aktarılacağı belirtiliyor. Ardından gelen girdi verisini sonuç değişkenine atıyoruz. Peki bu kullanılan fonksiyonlar neyin nesi?\n" +
                "\n" +
                "Türler\n" +
                "--> nextInt()\n" +
                "\n" +
                "Kullanıcıdan integer (tam sayı) değerini alır. (1,2,3,4,5...)\n" +
                "\n" +
                "--> nextDouble()\n" +
                "\n" +
                "Kullanıcıdan double (ondalıklı sayılar dahil) değerleri alır. (3.14, 2.7, 1.05, 10.9, 9...)\n" +
                "\n" +
                "--> next()\n" +
                "\n" +
                "Kullanıcıdan string (metin) değerini alır. (mert, topuz, com, java, dersleri...)\n" +
                "\n" +
                "--> nextLine()\n" +
                "\n" +
                "Kullanıcıdan string (metin) değerini alır fakat o satırda ne var ne yoksa hepsini alır.\n" +
                "\n");
        JavaIcerik.add("Programlama dillerinin güzel bir özelliği de kodların arasına yorum satırları ekleye bilmemizdir. Yorum satırı hangi metotta ne yapıldığını hangi sınıf neden oluşturulduğunu bağlantılarının neler olduğunu yazabileceğiniz alanları içerir. Bu da yazdığımız kodun anlaşılırlığını kolaylaştırır. Ekip çalışmalarında oldukça önemlidir. Kimin neyi neden oluşturduğunu anlamamıza yardımcı olur. \n"
                );
        JavaIcerik.add("Koşul ifadeleri bir durumun olması(true değer döndürmesi) durumunda yapılması istenen aksiyonları tanımlamamıza olanak sağlar.\n" +
                "--> int x=3;\n" +
                "\n" +
                "--> if(x==3)\n" +
                "--> {\n" +
                "--> System.out.println(“X, 3’e eşit”);\n" +
                "--> }\n" +
                "\n" +
                "bu yapıda dışında iki farklı yapı daha vardır. Bunlar else if ve else’dir. Else if’de bu durum değil de şu durumsa gibi tanımlanmış diğer bir durumun olması halinde çalışacak kodu tanımlamamıza olanak verirken, Else beklenen durum olması dışındaki bütün durumlar halinde tanımlanacak kodu belirler.\n");
        JavaIcerik.add(" Yazilan programlarda bazen belli komut parçalarinin birçok kez çalismasi gerekebilir. Yani bazi komut parçalarinin, belli sartlar altinda tekrar tekrar islenmesi gerekebilir. Döngü deyimleri, bahsedilen komut parçalarinin belirtilen sartlar gerçeklestikçe tekrar tekrar islenmesini saglar. \n" +
                "\n" +
                "Java’da üç tür döngü vardir. Bunlar çogu programlama dilinde olan; “for”, “do-while” ve “while” döngüleridir. Bu döngülerden for ve while döngüsünde, kosul sinamasi döngüye girmeden önce yapilirken, do-while döngüsünde kosul sinamasi bir kod parçasi çalistiktan sonra yapilir.\n" +
                "\n Ben size for döngüsünden bahsedeceğim.\n" +
                "--> for ( 1. deger (baslangiç degeri-initialization) ; 2.deger (kosul kontrolü) ; 3.deger (islemler) )\n" +
                "--> {\n" +
                "--> sarta bagli tekrarlanmasini istedigimiz kodlar\n" +
                "\n" +
                "--> }");
        JavaIcerik.add("Diziler aynı tipte birden çok değişkeni tutabilen veri yapılarıdır. Nesne gibi düşündükleri için referans tipleri olarak değer görürler. Referans tipleri 2 kısıma ayrılır. Referans ve İlkel veri tipleri. Referans, nesnelerin bellekteki yerlerini tutar. İlkel ver tipleriyse sadece 1 adet veriyi tutarlar.\n" +
                "Dizi Oluşturma\n" +
                "\n" +
                "Dizi aşağıdaki biçimde tanımlanır;" +
                "\n" +
                "--> veritipi [] diziAdi= new veritipi[eleman sayısı];\n" +
                "--> int[] values = new int[3];\n" +
                "Bu dizi, int tipinde, values isminde 3 değişken tutabilen bir dizidir. Dizilerin ilk elemanı 0 ‘dan başlar.");
        JavaIcerik.add("Fonksiyonlar bizim ana programımızı yöneten main() fonksiyonunun yükünü azaltır. Bunun yanında fonksiyonlar ile kod daha anlaşılır olur ve ilerleyen süreçte kod üzerinde yeni eklemeler ve çıkarmalar yapacağımız zaman da bize kolaylık sağlar.\n" +
                "\n" +
                "Fonksiyonlar sayesinde programımızı küçük küçük parçalar halinde yazabilir ve daha sonra bu parçaları birleştirip bir bütün elde edebilir.\n" +
                "\n" +
                "Fonksiyonlar ile ilgili teknik detaylara gelecek olursak her fonksiyonun mutlaka bir tipi olmak zorundadır. Program hangi tipte ise o tipte bir değeri return etmelidir. Yani fonksiyon çalışıp görevini yerine getirdikten sonra bir geri dönüş gerçekleştirmelidir. Eğer bir geri dönüş beklemiyorsak bu fonksiyonumuzun tipini void yapmalıyız. Her fonksiyonun bir adı olmalı ve adından sonra () parantezler gelmeli. Bu parantezler içine eğer varsa parametreler girilir. Parametre olmak zorunda değildir. Ve fonksiyonun ne yapacağı ise {} süslü parantezler içinde belirtilmelidir.\n");
        JavaIcerik.add("Sınıf (class) yapısının bu sınıftan üretilecek nesneler için bir şablon görevi gördüğünü söyleyebiliriz.\n" +
                "\n" +
                "Nesneleri oluşturmanın ilk adımı, o nesnenin özelliklerini ve eylemlerini belirleyen sınıf yapısını tanımlamaktır. Java'da sınıf yapısı;\n" +
                "--> class Sınıfİsmi\n" +
                "--> {\n" +
                "--> Özellik Tanımları;\n" +
                "--> Metod Tanımları;\n" +
                "--> }\n" +
                "Şeklinde olur.");





        Bitmap degiskenler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javadegisken);
        Bitmap ekranciktisi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javaekranayazdirma);
        Bitmap verialma = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javaverialma);
        Bitmap yorumsatiri = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javayorum);
        Bitmap kosul = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javakosullu);
        Bitmap donguler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javadonguler);
        Bitmap diziler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javadizi);
        Bitmap fonksiyon = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javafonksiyon);
        Bitmap sinif = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.javasinif);

        final ArrayList<Bitmap> JavaImages = new ArrayList<>();
        JavaImages.add(degiskenler);
        JavaImages.add(ekranciktisi);
        JavaImages.add(verialma);
        JavaImages.add(yorumsatiri);
        JavaImages.add(kosul);
        JavaImages.add(donguler);
        JavaImages.add(diziler);
        JavaImages.add(fonksiyon);
        JavaImages.add(sinif);


        ArrayAdapter arrayAdapter = new ArrayAdapter(JavaActivity.this,android.R.layout.simple_list_item_1,KonuIcerik);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(getApplicationContext(),ContentActivity.class);
                intent.putExtra("KonuIcerik",KonuIcerik.get(i));
                intent.putExtra("DetayIcerik",JavaIcerik.get(i));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(JavaImages.get(i));
                startActivity(intent);



            }
        });
    }
}