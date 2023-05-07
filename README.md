# UTS_Lab3_OOPJava

## No 1

#### a. Class
Class adalah sebuah blueprint atau cetak biru untuk membuat objek. Class mendefinisikan karakteristik dari sebuah objek, seperti atribut dan method yang dapat digunakan untuk memanipulasi atribut tersebut.

_anjing.java_
```java
public class anjing {
    //atribut
    String jenis;
    int berat;
    int umur;
    
    //method
    void bark() {
        System.out.println("Woof");
    }
    void eat() {
        System.out.println("Bang, makan bang");
    }
}

```

#### b. Object
Object adalah sebuah instance atau wujud nyata dari sebuah class. Setiap objek memiliki atribut dan method yang sudah didefinisikan di dalam class yang sama.

_main.java_
```java
anjing anjing1 = new anjing();
anjing1.jenis = "Rotweiller";
anjing1.berat = 45;
anjing1.umur = 6;
anjing1.bark();
```

#### c. Constructor
Constructor merupakan suatu method yang akan memberikan nilai awal pada saat suatu objek dibuat. Pada saat program dijalankan, constructor akan langsung memberikan nilai awal pada saat perintah new, membuat suatu objek.

_anjing.java_
```java
public anjing(){
    this.jenis = "Golden";
    this.berat = 40;
    this.umur = 7;
}

public anjing(String jenis, int berat, int umur){
    this.jenis = jenis;
    this.berat = berat;
    this.umur = umur;
}
```
_main.java_
```java
anjing anjing2 = new anjing();
System.out.println(anjing2.jenis);
```
#### d. Method Overloading
Method overloading adalah kemampuan untuk membuat dua atau lebih method dengan nama yang sama di dalam sebuah class, namun memiliki parameter atau tipe data yang berbeda-beda. Dalam method overloading, ketika suatu method dipanggil, Java akan menentukan method yang mana yang harus dipanggil berdasarkan jumlah dan tipe data parameter yang digunakan.

_anjing.java_
```java
    void deskripsi(String jenis){
        System.out.println("Jenis = "+ jenis);
    }
    void deskripsi(String jenis, int umur){
        System.out.println("Jenis = "+ jenis);
        System.out.println("Umur = "+ umur);
    }
    void deskripsi(String jenis, int umur, int berat){
        System.out.println("Jenis = "+ jenis);
        System.out.println("Umur = "+ umur);
        System.out.println("Berat = "+ berat);
    }
```
_main.java_
```java
anjing2.deskripsi("Shiba Inu", 5, 8);
```

#### e. Method Setter dan Getter
Method setter dan getter adalah method yang digunakan untuk mengakses dan mengubah nilai dari atribut (variabel) dalam sebuah class. Setter digunakan untuk mengubah nilai atribut, sedangkan getter digunakan untuk mengambil nilai atribut.
##### Setter

_anjing.java_
```java
public void setJenis(String jenis){
    this.jenis = jenis;
}
```
_main.java_
```java
anjing2.setJenis("Poodle");
ystem.out.println(anjing2.jenis);
```

##### Getter
_anjing.java_
```java
public String getJenis(){
    return jenis;
}
```
_main.java_
```java
System.out.println(anjing1.getJenis());
```

## No 2
![Screenshot (7)](https://user-images.githubusercontent.com/110342947/236661512-5c4970e5-feb8-4bf3-9f32-adf1bb6a28ff.png)
## No 3
![Screenshot (8)](https://user-images.githubusercontent.com/110342947/236661471-0055775b-e7ac-4f03-993a-d4fbfd50d21d.png)
## No 4
![Screenshot (10)](https://user-images.githubusercontent.com/110342947/236679017-8c1f47b3-6a4e-4e3b-811b-c404367511dc.png)
