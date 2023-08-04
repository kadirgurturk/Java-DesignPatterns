# Iterator Tasarım Deseni

Iterator Tasarım Deseni, yazılım geliştirme süreçlerinde kullanılan bir tasarım desenidir. Bu desen, bir koleksiyon yapısındaki nesnelere erişimi düzenlemek ve koleksiyonun iç yapısını istemciden gizlemek amacıyla kullanılır. Kısacası, Iterator Tasarım Deseni, koleksiyonun elemanlarına erişimi sırasıyla sağlamak için bir yol sunar.

## Çıkış Noktası

Bu desen, "Design Patterns: Elements of Reusable Object-Oriented Software" adlı kitapta (Gang of Four kitabı olarak da bilinir) tanıtılmıştır. Bu kitap, Erich Gamma, Richard Helm, Ralph Johnson ve John Vlissides tarafından yazılmış ve tasarım desenlerinin temel kavramlarını açıklamıştır. Iterator deseni, bu kitapta "Behavioral Patterns" kategorisinde yer almaktadır.

## Neden Kullanılır?

Iterator deseni, karmaşık koleksiyon yapısına sahip veri öğelerini dolaşmak ve elemanlara erişim sağlamak gerektiğinde oldukça kullanışlıdır. Basit diziler veya listeler döngü ile kolayca dolaşılabilirken, ağaçlar gibi daha karmaşık yapılarda elemanlara erişim ve dolaşım süreci karmaşık hale gelebilir. Iterator deseni bu karmaşıklığı giderir ve istemcinin koleksiyonun yapısı hakkında endişelenmeden elemanlara erişimini sağlar.

## Avantajları

- Koleksiyon yapısının değişmesi durumunda sadece Iterator sınıfı güncellenir, böylece istemci kodda minimal değişiklik yapılır.
- İstemci kod, koleksiyonun iç yapısını bilmek zorunda değildir, sadece Iterator arayüzü üzerinden elemanlara erişir.
- Birden fazla döngü aynı koleksiyon üzerinde eşzamanlı olarak çalışabilir, her bir döngüye ait ayrı bir Iterator nesnesi bulunur.
