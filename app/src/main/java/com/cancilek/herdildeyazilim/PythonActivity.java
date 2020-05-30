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

public class PythonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

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

        final ArrayList<String> PythonIcerik = new ArrayList<>();
        PythonIcerik.add("Değişken Nedir ?\n" +
                "\n" +
                "Öncelikle bu konuya bir açıklık getirelim. Değişkenler bir değeri tutan programlama dillerinin en küçük yapı taşıdır. Adından da anlaşılacağı gibi değişkenlerin değerleri kodun içinde değiştirilebilmektedir. Yani aynı kodun farklı bölümlerinde farklı değerler alabilirler. Ve bir de değişkenlerin tipleri vardır." +
                "\n" +
                "Değişken Tipleri Nelerdir ? \n" +
                "1- Integer = Tam sayı değişken tipidir.\n"+
                "2-Char Değer= Bu değişken tipi tek bir karakter tutmamızı sağlar \n"+
                "3- String = Düz yazı türüdür ve en kapsamlı değişken tipidir.\n" +
                "4-Float = Virgüllü (ondalık) sayı değişken tipidir.\n"+
                "Python’da Degişken Tanımlama ?\n" +
                "\n" +
                "Python’da değişken tanımlamak çok basittir.Aradaki = atama operatörüdür. Sağındaki değeri solundaki değişkene atar.");
        PythonIcerik.add("print() Fonksiyonu Ne İşe Yarar? \n" +
                "\n" +
                "Ekrana Çıktı yazdıra bilmek için print() fonksiyonunu kullanırız.");
        PythonIcerik.add("Input() Fonksiyonu Ne İşe Yarar? \n" +
                "\n" +
                "Kullanıcıdan Veri alabilmek için Input() fonksiyonunu kullanırız.");
        PythonIcerik.add("Yorum Satırı Nedir Ne işe Yarar? \n" +
                "\n" +
                "Yazılım dünyasında önemli bir konu olan okunabilirlik de çok önemli bir yeri olan yorum satırı ve açıklama satırlarıdır. Yazdığımız kodun bir başkasının anlamasını veya bizim bir başkasının kodunu anlamamızı sağlayan sihirli bir değnektir. Hele ki bir firmada çalıştınız zaman veya büyük bir projede bulunduğunuz zaman binlerce satır kod ile uğraşacaksınız. Bazen kendi yazdığınız kodlara bile dönüp baktığınız zaman hatırlamayabilirsiniz. İşte biz yazılımcılar bu sorunu çözmek için yazdığımız kodlara küçük notlar veya açıklamalar ekleyerek bu sorunu ortadan kaldırıyoruz. \n" +
                "Nasıl Kullanılır?\n" +
                "\n" +
                "Kullanımı çok basittir Python # işareti gördüğü satırları yorum satırları olarak algılıyor ve işlemiyor.Eğer Yorum satırı sayımız birden fazla ise de \"\"\" arasına yazıyoruz açıklamalarımızı.");
        PythonIcerik.add("Bir şart koşup o şart sağlanıyorsa programa bunu yapma sağlanmıyorsa şunu yap derken kullandığımız ifadelere Koşullu durumlar diyoruz.\n" +
                "Python programlama dilinde koşullu durumları belirtmek için 3 adet deyim bulunmaktadır.\n" +
                "\n" +
                "--> if\n" +
                "--> elif\n" +
                "--> else\n" +
                "if\n" +
                "\n" +
                "İngilizce bir kelime olan if Türkçede eğer anlamındadır. Anlamından da çıkartabileceğimiz gibi koşul (şart) ifadesi barındırmaktadır. Yani ne demek oluyor bu, eğer girilen sayı belli bir değerden büyükse şunu şunu yap şeklinde olabilir.\n"+
                "\n"+
                "elif\n" +
                "\n" +
                "elif lerde if ile aynı görür fakat koşul durumlara elif ile başlanmaz. Elifler birden çok if kullanacağımız zamanlarda ilk if'ten sonra kullanacağımız yapılardır.\n" +
                "\n" +
                "else\n" +
                "\n" +
                "Else'ler ise Artık hiç bir if ve eliflerin sağlanmadığı durumda girilecek kod bloğu anlamına gelir");
        PythonIcerik.add("Döngüleri kullanmadan yazdığımız programlarda yazdığımız programlar bir defa çalışıyor ve sona eriyordu. Ancak biz çoğu zaman programlarımızın belli koşullarda çalışmasını sürekli devam ettirmesini ve işlemlerini tekrar etmesini isteriz. İşte bunları yapmamızı sağlayan yapılara döngü diyoruz.\n" +
                "\n" +
                "Döngüler bütün programlama dillerinde bulunan ve belli koşullarda işlemlerini sürekli tekrar eden yapılardır. İsterseniz gerçek hayattaki programlara bakarak döngü mantığını anlamaya çalışalım.\n" +
                "\n" +
                "Örneğin , siz ATM makinesine gidip kartınızı yerleştiriyorsunuz ve program başlıyor. Para Çekme, Para Yatırma , Vergileri Ödeme gibi işlemleri tekrar tekrar gerçekleştiriyorsunuz. Programın sona ermesi ise Kart İade seçeneği ile gerçekleşiyor. Yani siz Kart İade tuşuna basmadığınız sürece ATM makinesi çalışmaya devam ediyor. Buna bakarak ,aslında ATM makinesi döngü yapılarını kullanıyor diyebiliriz."+
                "2 Çeşit Döngü çeşidi vardır.\n"+
                "For \n" +
                "While \n"+
                "İkiside aynı görevi görmektedir ikisiylede aynı işlemleri yapabilirsiniz yukarda verdiğim örnek ise For döngüsü üzerinden bir örnektir.");
        PythonIcerik.add("Listeler-Diziler oldukça yararlı ve fonksiyonel bir Python değişken türüdür. Kullanım amaçları bir veri topluluğunu tek çatı altında toplayarak kolay ulaşılabilir hale getirmektir. Üstelik aynı stringler gibi ,indekslenir,parçalanır ve işlemlere tabi tutulabilirler.\n"+
                "\n"+
                "Liste oluşturma\n" +
                "\n" +
                "Python array değişken türünün en önemli özelliklerinden birisi dizi içinde farklı değişken türlerini bir arada tutabilmenizdir. Böylece oldukça kolay bir şekilde farklı türleri aynı dizide depolayabilirsiniz. Öyleyse birçok farklı yöntemle liste/dizi nasıl oluşturulur hemen onu görelim."+
                "\n"+"\n"+
                "liste =  [10,11,12,\"Python\",3.14,51.035] \n"+
                "Yukardaki şekilde hem bir listenin nasıl oluşturulduğunu hemde oluşturulan diziye farklı türden verilerin nasıl atıldığını görmüş olduk.");
        PythonIcerik.add("Fonksiyonlar kısaca belirli bir işlevi yapmak için oluşturulan komutlar kümesidir. Örneğin print() fonksiyonu ekrana çıktı vermemizi sağlayan işlevi yapmak için belirli komutlar bulundurur.\n"+
                "\n Fonksiyonlar;\n" +
                "\n" +
                "--> Her biri belli bir işi yerine getiriyor.\n" +
                "--> Parametre alan fonksiyon var almayan fonksiyon olmak üzere iki ayırabiliriz.\n" +
                "--> Fonksiyonların görevi, karmaşık işlemleri bir araya toplayarak, bu işlemleri tek adımda yapmamızı sağlamaktır.\n" +
                "--> Fonksiyonları kullanarak, bir veya birkaç adımdan oluşan işlemleri tek bir isim altında toplayabiliriz.\n"+
                "\n Fonksiyon Kullanımı\n" +
                "\n" +
                "Python da iki tür fonksiyon vardır birincisi Python ile hazır gelen fonksiyonlar yani gömülü fonksiyonlar, ikincisi ise bizim oluşturduğumuz fonksiyonlar. Print() ve Input() gibi fonksiyonlar Python ile birlikte geldiği için biz sadece onları kullanmak istediğimiz yerde çağırıyoruz.\n" +
                "\n" +
                "Fonksiyonların genel kullanım taslağı şu şekildedir.\n" +
                "\n" +
                "def fonksiyon_Adi(parametre1,parametre2):\n" +
                "\n" +
                "işlemler\n" +
                "\n" +
                "fonksiyon_Adi() \n"+
                "\n Şeklinde Olur.");
        PythonIcerik.add("Sınıflar programlama dillerinde önemli bir yer tutarlar.Nesnelerin özelliklerinin,davranışlarının tanımlandığı genel bir taslak veya şablon olarak tanımlanabilirler.Sınıflar nesnelere ait metotları,özellikleri,alanları,yapıcı metotları bünyesinde  barındırarak kendilerinden üretilen nesnelerin kullanmasını sağlarlar.Sınıfları kullanmanın en büyük avantajı kod tekrarının önüne geçmektir.Sınıflar sayesinde programlar parçalara bölünebilirler.Bu sayede okunabilirlik artar."+
                "\n"+
                "Pythonda Sınıf Tanımlamak \n --> \"class Muhendis():\" \n Şekilnde Olur. \n"+
                "Bu sınıftan Nesne Tanımlamak ise ;\n"+
                "--> \"muhendis=Muhendis()\"  \n Şeklinde olur.");


        Bitmap degiskenler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pdegiskenler);
        Bitmap ekranciktisi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pekranyazdirma);
        Bitmap verialma = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pverialma);
        Bitmap yorumsatiri = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pyorumsatiri);
        Bitmap kosul = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pkosullu);
        Bitmap donguler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pdonguler);
        Bitmap diziler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pdiziler);
        Bitmap fonksiyon = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pfonksiyon);
        Bitmap sinif = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.psinif);

        final ArrayList<Bitmap> PythonImages = new ArrayList<>();
        PythonImages.add(degiskenler);
        PythonImages.add(ekranciktisi);
        PythonImages.add(verialma);
        PythonImages.add(yorumsatiri);
        PythonImages.add(kosul);
        PythonImages.add(donguler);
        PythonImages.add(diziler);
        PythonImages.add(fonksiyon);
        PythonImages.add(sinif);


        ArrayAdapter arrayAdapter = new ArrayAdapter(PythonActivity.this,android.R.layout.simple_list_item_1,KonuIcerik);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(getApplicationContext(),ContentActivity.class);
                intent.putExtra("KonuIcerik",KonuIcerik.get(i));
                intent.putExtra("DetayIcerik",PythonIcerik.get(i));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(PythonImages.get(i));
                startActivity(intent);



            }
        });
    }
}
