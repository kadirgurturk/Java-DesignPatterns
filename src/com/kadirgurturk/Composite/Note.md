## Composite Design Pattern

#### Composite tasarım deseni, bileşik nesnelerin hiyerarşik bir yapısını temsil etmek için kullanılan bir yapısal desendir. Bu desen, parça-bütün ilişkilerini ifade etmek ve bir nesne hiyerarşisini tek bir arayüz üzerinden kullanmak için kullanışlıdır.

### Composite tasarım deseni, aşağıdaki durumlarda kullanılabilir:

- Parça-bütün ilişkilerini temsil etmek: Composite deseni, parça-bütün ilişkilerini temsil etmek için ideal bir çözümdür. Nesnelerin hiyerarşik bir yapıda birleştiği durumlarda kullanılabilir. Örneğin, bir dosya sistemi, grafiksel nesne ağaçları veya organizasyonel yapılar gibi.

- Yapısal olarak benzer nesneleri yönetmek: Composite deseni, benzer özelliklere sahip nesnelerin gruplarını tek bir arayüz üzerinden yönetmek için kullanılabilir. Bu sayede, işlemler ve davranışlar bu nesne grupları üzerinde tutarlı bir şekilde uygulanabilir. Örneğin, menülerin içindeki menü öğeleri veya HTML belgelerindeki etiketler gibi.

- İşlem ve navigasyonu basitleştirmek: Composite deseni, bir bileşik nesnenin içindeki alt bileşenler üzerinde işlemler gerçekleştirmek veya gezinmek için kullanılabilir. Bu sayede, karmaşık yapıları basitleştirir ve kullanıcıya genel bir arayüz sunar. Örneğin, bir ağaç yapısında gezinmek veya bir dokümanda yapıyı analiz etmek gibi.

- Hiyerarşi düzenine ekstra gelecek yeni parçaları rahat şekilde en az yeniden ayarlama ile entegre etmek gibi.

#### Kısaca basit bir özet ile: Composite tasarım deseni, nesne hiyerarşilerini temsil etmek için kullanılan bir tasarım desenidir. Bu desenle, tek bir nesneyi veya nesne gruplarını bir araya getirerek bir hiyerarşi oluşturabilirsiniz.

## Kodlara Bakış.

#### Konunun kolay anlaşılabilmesi için hayatımızdaki günlük bir aktivite üzerinden örnek vermek istedim. Örneğin, bir dosya sistemi düşünelim. Dosyalar ve klasörler, bir dosya sisteminin temel bileşenleridir. Klasörler, içlerinde başka dosyaları veya klasörleri barındırabilir. Bu durumda, klasörler bileşik nesneleri temsil ederken, dosyalar yaprak nesneleri temsil eder.

- İlk olarak hiyerarşide bulunan sınıfların ortak davranışları için PaperWork adında bir interface oluşturyoruz.
- Bu interface ile birlikte bu yapının tüm eleman türlerinin extend edeceği Paper abstract sınıfını oluşturuyoruz. Bu sınıf ile her elemanın sahip olması gerektiği özellikler interface ile, her elemanın sahip olması gereken fieldlar ise bu abstract sınıfatan gelmektedir.
- Bu noktadan sonra hiyerarşide bulunan elemanları yazıp, gerekli override'ları bu sınıfların kendi özelliklerini göre şekilledirmek kalıyor.

#### Bu örnek üzerinden Composite Design'nın bize kattıkları:

- Hiyrarşi'de fonsiyonel olarak rahat gezinebilme, display fonksiyonlarını yazarken rahatlıkla alt tür'e ulaşabilme.
- Ekstra gelecek alt veya üst sınıfı rahat şekilde adapte edebilme, mesela Report isminde File sıralama olarak eşit bir noktada, bir sınıf yazdığımzda bu sınıf'ta Paper'dan extend olduğu için tekrar Folder nesnesini tekrar ayarlama yapmak zorunda kalmayız
- Hiyerarşi içersinde rahatlıkla bir sınıfı kaldırabilme