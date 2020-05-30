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

public class CActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

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

        final ArrayList<String> CIcerik = new ArrayList<>();
        CIcerik.add("Değişkenler\n" +
                        "\n" +
                        "Değişkenler bilgisayarın geçici belleğinde bilginin saklandığı gözlere verilen sembolik adlardır. Bir C programında, bir değişken tanımlandığında bu değişken için bellekte bir yer ayrılır. Her değişkenin tuttuğu değerin nasıl bir veri olduğunu gösteren bir veri tipi vardır.\n" +
                        "\n" +
                        "Değişkenler tanımlanırken bazı kurallara uymak zorunludur. Bunlar;\n" +
                        "\n" +
                        "Değişken adları en fazla 32 karakterden oluşabilir. 32 karakterden uzun değişken adları ilk\n" +
                        "32 karakteri değerlendirilir. Geriye kalan karakterler işleme tabi tutulmaz.\n" +
                        "\n" +
                        "Değişken adları ingiliz alfabesinde bulunan karakterler (A-Z) veya (a-z) yada rakamlar (0–9)\n" +
                        "ile yazılmalıdır. Türkçe karakterler, özel karakter veya boşluk karakteri kullanılamaz.\n" +
                        "\n" +
                        "Değişken adları herhangi bir rakam ile başlayamaz. Ilk karakter bir harf olmalıdır.\n" +
                        "Sonrakiler rakamlardan oluşabilir."+
                        "Veri tipi (data type) program içinde kullanılacak değişken, sabit gibi tanımlayıcıların tipini ve bellekte ayrılacak bölgenin boyutunu belirlemek için kullanılır. C programlama dilinde dört tane temel veri tipi bulunmaktadır.\n" +
                        "\n" +
                        "Tamsayılar — int (0, 1, 10, -1 ,-58)\n" +
                        "Karakterler — char (a, b, x)\n" +
                        "Mantıksal — false == 0, true != 0\n" +
                        "Kesirli Sayılar — float, double (0.5, 0.24, 1.258)\n" +
                        "Yapısal Tipler — array, string, functions, struct, files, pointers\n"
                        );
        CIcerik.add("printf() fonksiyonu, \" \" işaretleri arasında yer alan bu karakter dizisini ekrana yazar.\n");
        CIcerik.add("scanf() Fonksiyonu : Programların çalışma esnasında veri girişine ihtiyaç duyabilirler. Kullanıcıların girdiği verileri işleyip değerlendirmemize yarayan fonksiyonlarda giriş fonksiyonları adı verilir. Örneğin printf fonksiyonu nasıl verinin ekrana yazdırılmasını sağlayan bir çıkış fonksiyonu ise scanf de printf fonksiyonunuda bunun tam tersi olarak düşünebiliriz.\n"+
                "\n" +
                "--> int main(int argc, char** argv){\n" +
                "--> int s1,s2;\n" +
                "--> printf(\"2 adet sayi girisi yapiniz:\");\n" +
                "--> scanf(\"%d %d\", &s1, &s2);\n" +
                "--> printf(\"girilen sayilar:%d ve %d\", s1,s2);\n" +
                "--> return 0;\n" +
                "--> }");
        CIcerik.add("Tüm programlama dillerinde olduğu gibi C programlama dilinde de açıklama satırları bulunur. C dili açıklama satırı kullanımı kod karmaşasını önlemek için kullanılır. Dizlere programlama esnasında kolaylık sağlar. Özellikle Dev C++ tarzı dillerde yorum satırları renkli bir şekilde olduğu için kodlar arasında direkt olarak kod satırlarını ayırt edebilirsiniz.\n" +
                "C dilinde yorum satırları aşağıdaki gibi yazılır:\n" +
                "“ // ” ifadesi kullanılarak yorum satırı oluşturulur.\n --> //Bu bir yorum satırıdır.\n" +
                "“/*” ve “*/” ifadeleri kullanılarak yorum satırı veya açıklaması yapılır. \n" +
                "--> /* \n" +
                "--> Burası \n" +
                "--> bir\n" +
                "--> Açıklama \n" +
                "--> bloğudur.\n" +
                "--> */");
        CIcerik.add("C dilinde İf-else ifadesi, tek bir koşul için iki işlem gerçekleştirileceği zaman kullanılır. için kullanılır. If ifadesinin bir uzantısıdır ve iki farklı işlem gerçekleştirmemize olanak sağlar. Koşul ifadesi kullanılacağı zaman if-else ifadesinin kullanımı tercih edilir. Kullanımı aşağıdaki gibidir:\n" +
                "--> if(koşul){  \n" +
                "--> //koşul doğru ise  \n" +
                "--> }else{  \n" +
                "--> //koşul yanlış ise");
        CIcerik.add("Döngüler, karmaşık yapıları basite indirgemek amacıyla kullanılır. Döngü ile program akışını değiştirerek aynı kodu tekrar tekrar yazma zahmetinden kurtulabiliriz. Örneğin, ilk 5 tam sayıyı yazdırmamızın gerektiğini düşünelim. Printf deyimini 10 kez kullanmak yerine, 10 yineleme yapan bir döngü oluşturarak çözüm üretebiliriz. Döngüler kodun tekrar kullanılabilirliğini sağlar ve bizi aynı kodu tekrar tekrar yazma zahmetinden kurtarır. C dilinde kullanılan döngüler 3 farklı türde kullanılır:\n" +
                "\n" +
                "--> do –while\n" +
                "--> while\n" +
                "--> for\n" +
                "Ben size for döngüsünden bahsedeceğim.\n" +
                "C dilinde for kullanımının sözdizimi aşağıdaki gibidir:\n" +
                "--> for(koşul1; koşul2; koşul3){  \n" +
                "--> // çalıştırılacak kod  \n" +
                "--> }  ");
        CIcerik.add("Diziler aynı veri çeşidinden olan değişkenlerin aynı isim altında tanımlanması olarak ifade edilebilir. Diziler kullanılarak, aynı isimle birden fazla değişkene erişilebilir ve işlem yapılabilir.\n" +
                "\n" +
                "Diziler tek ya da çok boyutlu olarak tanımlanabilir ve dizi boyutu ihtiyaca göre ayarlanabilir.\n" +
                "\n" +
                "int, char, float ve double olarak tanımlanabilen dizilerde sadece aynı veri türünden değişken değerleri yer alabilir.\n" +
                "\n" +
                "Tek ve çok boyutlu dizilerin bildirimi için kullanılan genel yapı aşağıda gösterilmektedir:\n" +
                "--> veri-çeşidi dizi-adı [boyut]; /* Tek boyutlu dizi bildirimi */\n" +
                "\n" +
                "--> veri-çeşidi dizi-adı [boyut1][boyut2]...[boyutn]; /* Çok boyutlu dizi bildirimi */\n" +
                "\n" +
                "--> /* Tek boyutlu eleman sayısı tanımsız dizi bildirimi \n" +
                "--> (Atanan eleman sayısı dizi boyut kapasitesini belirler) */\n" +
                "--> veri-çeşidi dizi-adı [] = { ele1, ele2, ..., elen }; \n");
        CIcerik.add("C dilinde fonksiyon yapısı : "+
                "--> veri-türü fonksiyon-adı (parametreler)\n" +
                "--> {\n" +
                "--> işlem satırı\n" +
                "--> işlem satırı\n" +
                " \n" +
                "--> return ifade;\n" +
                "--> }" +
                "Fonksiyon yapısında 5 temel eleman vardır. Bu elemanlardan fonksiyon-adı ve işlem satırı mutlaka bulunmalıdır. Ancak, veri-türü, parametreler ve return ifadelerinin tanımlanması programcının ihtiyaçları doğrultusunda isteğe bağlıdır. Parametre yerine argüman ifadesi de kullanılmaktadır.\n" +
                "\n" +
                "\n" +
                "--> veri-türü : Fonksiyonun geri verdiği veri türünü gösterir.\n" +
                "\n" +
                "--> fonksiyon-adı : Fonksiyon adını gösterir.\n" +
                "\n" +
                "--> parametreler : Fonksiyona geçirilen verileri gösterir. Sayısı birden fazla olabilir.\n" +
                "\n" +
                "--> İşlem satırı : Fonksiyon içindeki işlem satırlarını gösterir.\n" +
                "\n" +
                "--> return : Verileri geri döndürmeye yarar. Son satırda kullanılması şart değildir.\n" +
                "\n" +
                "--> ifade : Değişken, sabit ve işlemciler kullanılarak oluşturulan veridir. Elde edilen veri türü fonksiyonun geri döndürdüğü veri türü ile aynı olmalıdır.\n");




        Bitmap degiskenler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cdegisken);
        Bitmap ekranciktisi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cekranyazdirma);
        Bitmap verialma = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cverialma);
        Bitmap yorumsatiri = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cyorumsatiri);
        Bitmap kosul = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ckosullu);
        Bitmap donguler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cdongu);
        Bitmap diziler = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cdizi);
        Bitmap fonksiyon = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.cfonksiyon);

        final ArrayList<Bitmap> CImages = new ArrayList<>();
        CImages.add(degiskenler);
        CImages.add(ekranciktisi);
        CImages.add(verialma);
        CImages.add(yorumsatiri);
        CImages.add(kosul);
        CImages.add(donguler);
        CImages.add(diziler);
        CImages.add(fonksiyon);


        ArrayAdapter arrayAdapter = new ArrayAdapter(CActivity.this,android.R.layout.simple_list_item_1,KonuIcerik);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(getApplicationContext(),ContentActivity.class);
                intent.putExtra("KonuIcerik",KonuIcerik.get(i));
                intent.putExtra("DetayIcerik",CIcerik.get(i));
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenImage(CImages.get(i));
                startActivity(intent);



            }
        });
    }
}
