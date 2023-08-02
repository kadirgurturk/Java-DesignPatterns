# Flyweight Tasarımı

#### Flyweight tasarım deseni, bellek kullanımını azaltmak ve nesne oluşturmanın maliyetli olduğu durumlarda performansı artırmak için kullanılan bir tasarım desenidir.
## Nasıl Çalışır?

#### Bu desen, bir fabrika (factory) tarafından yönetilen nesnelerin yeniden kullanılmasına dayanır. Nesne oluşturulduktan sonra, fabrika tarafından saklanır. Bir nesne istendiğinde, fabrika önce nesnenin daha önce oluşturulup oluşturulmadığını kontrol eder. Eğer nesne daha önce oluşturulmuşsa, mevcut nesneyi döndürür; aksi takdirde yeni bir nesne oluşturur, saklar ve istemciye verir.

#### Flyweight nesnelerinin değişmez (immutable) olması çok önemlidir: durumdaki herhangi bir işlem fabrika tarafından gerçekleştirilmelidir.

## Temel Kavramlar

- **İçsel (Intrinsic) Bileşenler:** Flyweight nesneleri arasında paylaşılan sabit özelliklerdir. Bu bileşenler nesneler arasında paylaşılabilir çünkü değişmezler.

- **Dışsal (Extrinsic) Bileşenler:** İstemci kodu tarafından manipüle edilebilen değişken özelliklerdir. Her istemciye özgüdürler ve flyweight nesnesinin durumunu etkilerler.

## Avantajlar

- Bellek kullanımını azaltır: Aynı özelliklere sahip birden çok nesne paylaşılır, bu da bellek kullanımını minimize eder.
- Nesne oluşturmanın maliyetini düşürür: Yeniden kullanılan nesneler oluşturma maliyetini azaltır.
- Performansı artırır: Özellikle nesne oluşturmanın pahalı olduğu durumlarda performans iyileştirmesi sağlar.

## Örnek Kullanım Alanları

- Metin düzenleme programları (harfler veya karakterler flyweight nesneleri olabilir).
- Oyun motorları (oyundaki çok sayıda benzer nesne için bellek tasarrufu sağlar).
- Grafiksel kullanıcı arayüzleri (arayüz öğelerinin tekrar kullanılması).

## Özet

Flyweight tasarım deseni, bellek kullanımını düşürmek ve nesne oluşturmanın maliyetini azaltmak için güçlü bir araçtır. Doğru şekilde uygulandığında, performans artışı ve bellek tasarrufu sağlayabilir.





