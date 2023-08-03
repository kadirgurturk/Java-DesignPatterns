# Prototype Tasarım Deseni

## Nedir?

Prototype tasarım deseni, nesne yaratma maliyetini azaltmak ve nesne özelliklerini kopyalayarak yeni nesneler oluşturmak için kullanılan bir tasarım desenidir. Bu desen, nesne klonlama yoluyla yeni nesneler oluşturmayı sağlar. Böylece her defasında yeni nesne oluşturmak yerine, mevcut bir nesneyi kopyalayarak yeni nesneler oluşturulabilir.

## Nerede Kullanılır?

#### Prototype deseni, aşağıdaki durumlar için uygun olabilir:

- Yeni nesne oluşturmanın maliyetli olduğu durumlar.
- Nesnelerin belirli özelliklerle farklı varyasyonlarını oluşturmanız gereken durumlar.
- Karmaşık nesne yapıları ve ilişkileri gerektiren durumlar.

## Avantajları

- Nesne yaratma maliyetini azaltır: Yeni nesne yaratmak yerine klonlama ile daha hızlı yeni nesneler oluşturulabilir.
- Nesne özelliklerini kolayca kopyalar: Özellikleri değiştirerek farklı nesne varyasyonları yaratmak mümkündür.
- Karmaşık yapıları yönetir: Nesnelerin iç içe geçmiş veya hiyerarşik yapıları varsa, bu desen kullanılarak bu yapılar kolayca yönetilebilir.

## Deep Copy ve Shallow Copy

- **Deep Copy:** Nesnenin tüm bileşenleri, alt nesneleri ve içeriği kopyalanır. Orijinal nesne ve kopyası tamamen bağımsızdır. Farklı bellek alanlarında saklanır.
- **Shallow Copy:** Sadece nesnenin referansı (adresi) kopyalanır, içeriği aynı bellek bölgesini işaret eder. Bu nedenle orijinal nesne veya kopyası değiştiğinde diğeri de değişir.

Bu konu, özellikle prototype deseninde önemlidir. Çünkü bir klonlama işlemi gerçekleştirilirken hangi tür kopyalama yapılacağı belirlenmelidir. Nesnenin karmaşıklığına ve kullanım senaryolarına göre uygun kopyalama yöntemi seçilmelidir.

## Yazılan Kodlar Üzeri Anlatım

#### Bu örnekte, kitap nesnelerini oluşturmak için Prototype tasarım deseni kullanılıyor. BookPrototype arayüzü, kopyalama işlevselliğini belirler ve Novel ile Magazine sınıfları bu arayüzü uygular. BookStore sınıfı, kitap örneklerini yaratır ve yönetir. İstemci, bu örnekleri kopyalayarak yeni nesneler oluşturabilir.

#### Prototype tasarım deseni sayesinde kitap nesneleri aynı türde oluşturulurken özelliklerini değiştirerek farklı nesneler oluşturulabilir. Bu, yeni nesne yaratma maliyetini azaltır ve nesne özelliklerini kopyalama yoluyla taşımanıza olanak sağlar.
