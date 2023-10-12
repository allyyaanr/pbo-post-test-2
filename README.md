# pbo-post-test-2

STUDI KASUS : Tema Toko Roti

Program ini dibuat untuk sistem manajemen inventaris toko roti. Dalam program ini, pemilik toko roti dapat melakukan berbagai operasi CRUD pada daftar roti, termasuk menambahkan roti baru, melihat daftar roti yang ada, memperbarui informasi roti yang ada, dan menghapus roti dari inventaris.

A. PACKAGE breads : NAME FILE bread

1. Deklarasi Kelas
   public class bread merupakan deklarasi dari kelas `bread`.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/39d0e4c6-a9b7-4376-a8db-f193913e28bc)

3. Atribut Kelas
   - `breadNumber`: Variabel ini adalah nomor atau identifikasi unik untuk produk roti. Dalam kode ini, atribut ini bersifat final, yang berarti nilainya hanya dapat 
      diatur satu kali dalam konstruktor dan tidak dapat diubah setelahnya.
   - `breadName`: Variabel ini berisi nama produk roti.
   - `breadType`: Variabel ini berisi tipe atau jenis produk roti.
   - `breadPrice`: Variabel ini berisi harga produk roti. Harga ini dapat diubah melalui metode `setPrice()`.
   - `breadStock`: Variabel ini berisi stok atau jumlah produk roti yang tersedia. Stok ini dapat diubah melalui metode `setStock()`.
   - 
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/f0457958-6bee-4e5d-8394-4b8d86de0e7b)

4. Konstruktor
   Fungsinya untuk membuat objek `bread` baru dengan menginisialisasi nilai atribut-atributnya sesuai dengan parameter yang diterima saat pembuatan objek.     
   Konstruktor ini mengambil lima parameter: nomor roti, nama roti, tipe roti, harga roti, dan stok roti.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/5148790b-ba8f-4d73-8576-fe4e8fbc93c8)
   
6. Setter Methods
   Metode `setPrice()` dan `setStock()` digunakan untuk mengubah harga dan stok produk roti setelah objek telah dibuat.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/07b2234d-e5e6-4448-85fc-f65c06e2e691)

6. Getter Methods
   Metode-metode seperti `getbreadNumber()`, `getbreadName()`, `getType()`, `getPrice()`, dan `getStock()` digunakan untuk mendapatkan nilai dari atribut-atribut
   objek roti.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/f61fa396-c199-4177-8b84-e773ee2afc66)

Gambar keseluruhan Setter Methods dan Getter Methods

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/27645606-204c-44d1-b8eb-568e12f7ca94)

B. PACKAGE toko_roti : NAME FILE Toko_Roti

1. Import Statement
  import breads.bread;: ini fungsinya ialah untuk mengimpor kelas bread yang didefinisikan di paket breads.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/8e1cf6da-fc84-464a-b2e8-4969878d3046)

3. Kelas Toko_Roti
  Ini adalah kelas utama atau main class yang berisi metode main(). Kelas ini bersifat final, yang berarti tidak dapat diwarisi atau di update.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/4af48ada-abda-408d-ac06-8925a6c0236c)

5. Variabel dan ArrayList
  breadList: Ini adalah ArrayList yang digunakan untuk menyimpan objek-objek roti. ArrayList ini dideklarasikan sebagai final, sehingga referensinya tidak dapat
  diubah, tetapi isi dari ArrayList dapat diubah.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/efafbcf5-2e6f-4577-aaae-590711951cd0)

7. Metode main()
  Ini adalah metode utama yang akan dijalankan saat program dijalankan. Metode ini memiliki loop tak terbatas yang memungkinkan pengguna untuk melakukan operasi
  CRUD pada daftar roti.
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/05eabf9d-47fa-4b2f-802e-7243ab7a97b3)

8. Menu Pilihan
  Program menampilkan menu pilihan kepada pengguna yang mencakup penambahan roti baru, melihat daftar roti, memperbarui roti, menghapus roti, dan keluar dari
  program.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/17469d9f-2c10-4add-be62-fbeace053e87)

10. Implementasi Pilihan
   - Program menggunakan switch-case untuk menangani pilihan pengguna.
   - Pilihan "1" memungkinkan pengguna untuk menambahkan roti baru ke dalam breadList.
   - Pilihan "2" memungkinkan pengguna untuk melihat daftar roti yang ada dalam breadList.
   - Pilihan "3" memungkinkan pengguna untuk memperbarui harga dan stok roti berdasarkan nomor roti.
   - Pilihan "4" memungkinkan pengguna untuk menghapus roti dari breadList.
   - Pilihan "5" akan mengakhiri program.
   - 
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/b86a3d9f-b23b-4ab7-a0f6-eaa3a0ae476b)

11. Input dan Output
   - Program menggunakan objek Scanner untuk menerima masukan dari pengguna.
   - Output ditampilkan ke layar untuk memberikan umpan balik kepada pengguna.
     
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/7c27445e-dedd-42eb-b2fe-d6f9111aba92)

11. switch (pilihan)
   Adalah konstruksi switch-case yang digunakan untuk memilih tindakan yang akan diambil berdasarkan nilai yang dimasukkan oleh pengguna dalam variabel pilihan.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/9edbd85e-6dde-42f7-b48a-60a309ca7520)

13. case "1" (UPDATE)
   Adalah salah satu kasus yang ditangani dalam switch-case. Ini adalah pilihan untuk menambahkan roti baru ke dalam daftar. Pengguna diminta untuk memasukkan
   beberapa informasi mengenai roti seperti nomor, nama, tipe, harga, dan stok. Kemudian, objek bread baru dibuat dan ditambahkan ke dalam breadList, yang mungkin
   adalah sebuah daftar yang berisi objek-objek roti. program mencetak pesan "Insert Bread Number:" dan kemudian menerima input dari pengguna melalui
   scanner.nextLine(). Input tersebut kemudian diubah menjadi tipe data Integer dan disimpan dalam variabel insertNumber. Kemudian program mencetak pesan "Insert
   Bread Name:" dan menerima input nama roti dari pengguna melalui scanner.nextLine(). Input ini disimpan dalam variabel insertName sebagai string. Proses yang
   sama dilakukan untuk "Insert Bread Type", "Insert Bread Price", dan "Insert Bread Stock". Setelah menerima input, nilai-nilai ini diubah menjadi tipe data yang
   sesuai (misalnya, Integer untuk harga dan stok) dan disimpan dalam variabel yang sesuai. Selanjutnya, program membuat objek baru dari kelas bread dengan
   menggunakan nilai-nilai yang telah dimasukkan oleh pengguna. Ini adalah langkah di mana objek bread baru dibuat dengan atribut-atribut yang sesuai, seperti
   nomor, nama, tipe, harga, dan stok. Terakhir, objek bread yang baru dibuat dimasukkan ke dalam breadList menggunakan metode add(). Dengan demikian, roti baru
   telah ditambahkan ke dalam daftar roti. Untuk Kata kunci 'break' digunakan untuk mengakhiri kasus "1" dalam konstruksi switch, sehingga program tidak akan
   melanjutkan untuk mengeksekusi kasus-kasus lain yang ada dalam switch.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/5bcfe209-5f0c-4bfd-8dd6-dff8de874071)

15. case "2" (READ)
    Adalah pilihan untuk menampilkan daftar roti yang telah ditambahkan. Jika breadList kosong, program akan memberikan pesan bahwa tidak ada roti dalam daftar.
    Jika tidak, program akan mencetak informasi tentang setiap roti dalam daftar. Pertama-tama memeriksa apakah breadList kosong atau tidak dengan menggunakan
    breadList.isEmpty(). Jika breadList kosong, artinya tidak ada roti dalam daftar, maka program mencetak pesan "There's no Bread in List" untuk memberi tahu
    pengguna bahwa daftar roti kosong. Jika breadList tidak kosong, program akan mengeksekusi blok kode di dalam else. Ini berarti bahwa daftar roti berisi satu
    atau lebih objek roti. Kemudian, program menggunakan loop for-each untuk mengiterasi melalui setiap objek bread dalam breadList. Dalam setiap iterasi,
    program mencetak informasi tentang setiap roti, seperti nomor, nama, tipe, harga, dan stok menggunakan metode-metode yang sesuai dari objek bread. Untuk Kata
    kunci break digunakan untuk mengakhiri kasus "2" dalam konstruksi switch, sehingga program tidak akan melanjutkan untuk mengeksekusi kasus-kasus lain yang
    ada dalam switch.
    
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/198b5158-d695-4a49-83c4-2842d1177842)

17. case "3" (UPDATE)
    Adalah pilihan untuk mengupdate harga dan stok roti berdasarkan nomor roti. Pengguna diminta untuk memasukkan nomor roti, harga baru, dan stok baru. Program      akan mencari roti dengan nomor yang sesuai dalam breadList dan mengubah harga dan stoknya sesuai dengan input pengguna. Pertama-tama mencetak pesan "Insert
    Bread Number:" dan menerima input nomor roti yang akan diubah dari pengguna. Input tersebut diubah menjadi tipe data Integer dan disimpan dalam variabel
    getbreadNo. Kemudian, program mencetak pesan "Insert New Price of Bread:" dan menerima input harga baru dari pengguna. Input ini diubah menjadi tipe data
    Integer dan disimpan dalam variabel updatePrice. Selanjutnya, program mencetak pesan "Insert New Stock of Bread:" dan menerima input stok baru dari pengguna.
    Input ini diubah menjadi tipe data Integer dan disimpan dalam variabel updateStock. Variabel findUpdate digunakan untuk melacak apakah roti dengan nomor yang
    sesuai ditemukan dalam breadList. Awalnya, variabel ini diatur ke false. Program menggunakan loop for-each untuk mengiterasi melalui setiap objek bread dalam
    breadList. Dalam setiap iterasi, program memeriksa apakah nomor roti dari objek saat ini sama dengan getbreadNo yang dimasukkan oleh pengguna. Jika ditemukan
    roti dengan nomor yang sesuai, program akan mengubah harga dan stok roti tersebut menggunakan metode setPrice() dan setStock() pada objek bread. Setelah itu,
    findUpdate diubah menjadi true dan loop dihentikan dengan menggunakan break. Setelah loop selesai, program memeriksa nilai findUpdate. Jika findUpdate masih
    false, artinya tidak ada roti dengan nomor yang sesuai, maka program mencetak pesan "bread not found" untuk memberi tahu pengguna bahwa roti yang akan diubah
    tidak ditemukan. Untuk Kata kunci break digunakan untuk mengakhiri kasus "3" dalam konstruksi switch, sehingga program tidak akan melanjutkan untuk
    mengeksekusi kasus-kasus lain yang ada dalam switch.
    
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/a3aab254-bae8-430a-905a-e2682ea924d0)

19. case "4" (DELETE)
    Adalah pilihan untuk menghapus roti dari daftar berdasarkan nomor roti. Pengguna diminta untuk memasukkan nomor roti yang akan dihapus. Program akan mencari
    roti dengan nomor yang sesuai dalam breadList dan menghapusnya jika ditemukan. Program pertama-tama mencetak pesan "Insert Bread Number to Delete:" dan
    menerima input nomor roti yang akan dihapus dari pengguna. Input tersebut diubah menjadi tipe data Integer dan disimpan dalam variabel deletebread. Variabel
    foundDelete digunakan untuk melacak apakah roti dengan nomor yang sesuai ditemukan dalam breadList. Awalnya, variabel ini diatur ke false. Program
    menggunakan iterator (Iterator<bread>) untuk mengiterasi melalui breadList. Iterator digunakan karena kita ingin menghapus elemen dari daftar selama iterasi.
    Dalam setiap iterasi, program memeriksa apakah nomor roti dari objek saat ini (mewakili roti dalam iterasi saat ini) sama dengan deletebread yang dimasukkan
    oleh pengguna. Jika ya, maka program menghapus roti tersebut dari breadList menggunakan metode iterator.remove(), mengubah nilai foundDelete menjadi true,
    dan menghentikan loop dengan menggunakan break. Setelah loop selesai, program memeriksa nilai foundDelete. Jika foundDelete masih false, artinya tidak ada
    roti dengan nomor yang sesuai, maka program mencetak pesan "Bread Not Found" untuk memberi tahu pengguna bahwa roti yang akan dihapus tidak ditemukan. Untuk
    Kata kunci break digunakan untuk mengakhiri kasus "4" dalam konstruksi switch, sehingga program tidak akan melanjutkan untuk mengeksekusi kasus-kasus lain
    yang ada dalam switch.

    ![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/49c9b492-cc0e-4854-8d9c-f386cb7610e5)

21. case "5"
    Case 5 ini adalah bagian dari konstruksi switch, yang menunjukkan bahwa aksi ini akan dijalankan jika pilihan adalah "5". Program mencetak pesan "Thank You!"
    untuk memberi tahu pengguna bahwa program telah selesai dijalankan dan mengucapkan terima kasih. Kemudian, program memanggil metode scanner.close() untuk
    menutup objek scanner. Terakhir, program menggunakan System.exit(0) untuk mengakhiri program dengan kode keluar 0, yang menunjukkan bahwa program telah
    berakhir dengan sukses.
    
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/cdae4402-bbf0-4fb2-868b-c2d8a0055260)

23. Default
    Adalah bagian yang akan dieksekusi jika pengguna memasukkan nilai yang tidak sesuai dengan pilihan yang tersedia. Dalam kasus ini, program mencetak pesan
    bahwa pilihan tidak valid dan meminta pengguna untuk memilih lagi.
    
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/33c26043-f575-43e5-ad39-5084fe2cc2e5)


C. PENJELASAN OUTPUT

1. Main Menu atau Menu Utama
  Disini tertampil pilihan Menu Utama yang terdiri dari 5 opsi yaitu Add new Bread, List of
  Bread, Update Bread, Delete Bread, dan yang terakhir ialah Exit.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/0fcf6211-cde0-43de-80e1-4e31a2920a71)

3. Memilih Opsi "1"
   Disini saya memasukkan Insert Bread Number yaitu 1, kemudian Insert Bread Name yaitu Zuppa
   Sup, kemudian Insert Bread Type yaitu Sup Pastry, kemudian Insert Bread Price yaitu 35000,
   dan yang terakhir Insert Bread Stock yaitu 3. Setelah itu akan kembali ke menu utama.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/e2863b9b-67ea-4b32-8b7a-acd35c1c4e13)

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/744bac3c-ddd3-4104-a5a3-5f1593212abf)

5. Memilih Opsi "2"
   Pada opsi ini, fungsinya yaitu untuk melihat List of Bread atau List roti. Setelah itu akan
   kembali ke menu utama.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/12e03c2f-8764-45ae-8159-8cd490c10d65)

7. Memilih Opsi "3"
   Fungsi utama pada opsi ini yaitu untuk memperbarui data yang sudah ada. Disini saya
   memasukkan inputan baru untuk Insert New Price of Bread sebesar 34000, lalu untuk Insert
   New Stock of Bread sebanyak 2 buah. Setelah itu akan kembali ke menu utama.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/e9d9a89d-bf7d-4fae-90d0-213d58672612)

9. Memilih Opsi "4"
   Fungsi utama pada opsi ini yaitu untuk menghapus data yang sudah ada. Disini disuru memasukan number of bread. Inputan yang tertampil yaitu Insert Bread
   Number to Delete lalu saya memasukan "1", Lalu data akan terhapus. Dan ketika memilih opsi "2" yaitu List of Bread, akan tertampil There's no Bread in List
   atau list kosong.
   
![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/ce89bcf2-098d-49ae-ae52-ff1474d5def3)

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/51c98c5a-1401-4db6-8c5f-e5ee7bc79ccc)

10. Memilih Opsi "5"
    Opsi ini yaitu untuk Exit atau Keluar dari program.

![image](https://github.com/allyyaanr/pbo-post-test-2/assets/122219678/84c49e88-0dc9-4ed1-8802-66ae8d9c8ae6)
