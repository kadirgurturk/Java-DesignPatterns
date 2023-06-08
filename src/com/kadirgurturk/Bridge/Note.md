##Bridge Design Pattern

####Bridge tasarım deseni, nesne tabanlı yazılım geliştirme alanında kullanılan bir tasarım deseni (design pattern) türüdür. Bu desen, karmaşık bir sınıf yapısını iki ayrı hiyerarşi olarak tasarlamak ve bu iki hiyerarşi arasındaki bağı zayıflatmak için kullanılır. Bridge tasarım deseni, sınıfların uygulamadan bağımsız olarak bir arayüz üzerinden etkileşim kurmasını sağlar.

####Bridge tasarım deseni, "köprü" anlamına gelen bir isimle ifade edilir, çünkü bu desen, birbiriyle ilgili ama farklı iki hiyerarşik yapının birleşmesi için bir köprü görevi görür. Bu iki hiyerarşi, soyutlama ve uygulama kısımları olarak adlandırılan iki ayrı bileşenden oluşur.


####Uygulama kısmı ise soyutlama kısmının alt sınıflarıdır. Bu kısım, soyutlama kısmının tanımladığı operasyonları gerçek uygulama detaylarına gönderir. Farklı uygulama kısımları, birbiriyle değiştirilebilir şekilde çalışabilir.

##Kodlara Bakış.

#### Konunun kolay anlaşılabilmesi için hayatımızdaki günlük bir aktivite üzerinden örnek vermek istedim. Aslında olay kod öncesinde oldukça basit, istediğimiz bir cihaz'dan istediğimiz bir ses cihazı ile, sevdiğimiz diziyi izlemek.

#### İşte bu noktada izlediğimiz cihaza istediğimiz diziyi bir aracı ile veririz. Bu sayede videpyu oynatacak araç'ın görevi azalır, sadece gerekli ekipmanları takmak ve çalıştırma işi kalır. Aradaki köprü ile platform'da hangi dizi veya filmin oynayacağı işlemi diğer cihazdan ayrı gerçekleşir.

#### Device Soyut Sınıf'ı ile Platform ve Audio soyut sınıfları arasında "a has b" iliskisi bulunmaktadır. Yine Platform ile Video Soyut Sınıfı arasında da "a has b" ilişkisi vardır. Kodda Device'ın tek yapması gereken gerekli nesneleri bünyesinde barındırıp run etmektir. Bu nesnlerin kendi iç işlerini karışmaz. Örneğin platfrom'da hangi tür video olacağının veya bu video'nun ismi ile ilgilenmez.  