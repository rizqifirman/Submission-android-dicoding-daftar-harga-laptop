package com.example.daftarhargalaptop.model;

import java.util.ArrayList;

public class LaptopData {
    public static String[][] data = new String[][] {
            {"ASUS ROG Strix III G531GD-I505G1T", "Jenis laptop ASUS ROG Strix III G531GD-I505G1T  " +
                    "merupakan seri dari varian laptop gaming yang terbaru. laptop yang merupakan generasi " +
                    "terbaru dari intel core i5 memiliki performa yang tangguh dan kuat. Wajar saja laptop " +
                    "yang satu ini cocok untuk aplikasi berat seperti gaming ataupun aplikasi editor. " +
                    "RAM ASUS ROG Strix III ini sebesar 8Gb. Tidak perlu ragu dengan layarnya, karena mencapai 15.6 inch.","ASUS","Rp 14.201.000",
                    "https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/ASUS-ROG-Strix-III-G531GD-I505G1T.jpg"},
            {"Apple MacBook Air","Jika Anda sedang mencari laptop yang spesifikasinya cocok dengan kegemaran" +
                    " Anda dalam melakukan desain, Anda bisa masukkan Apple Macbook Air MREE2ID/A ke dalam daftar" +
                    " Anda. Macbook yang baru dirilis sekitar tahun 2018 lalu ini dibekali sistem intel core i5 " +
                    "dan RAM 8 Gb. Bentuknya lumayan tipis dan ringan sehingga mudah untuk dibawa kemanapun.","APPLE","Rp 15.069.000",
                    "https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Apple-MacBook-Air.jpg"},
            {"HP Notebook 14s-cf0013TX","Jenis laptop yang satu ini cocok bagi Anda yang seorang editor." +
                    " Tidak hanya diperkuat dengan RAM 8 Gb saja, laptop yang satu ini juga dilengkapi kartu " +
                    "grafis AMD Radeon sebesar 2 Gb.","HP","Rp 11.899.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/HP-Notebook-14s-cf0013TX.jpg"},
            {"Lenovo Thinkbook 20R9006XID","Laptop yang satu ini termasuk salah satu laptop yang ringan" +
                    " dan sangat tipis. Lenovo Thinkbook ini berbody tipis dengan ketebalan nyaris 1 cm. " +
                    "Bobotnya juga hanya dibawah 1 kg, prosesornya juga sudah tinggi yakni Intel Core i5" +
                    " dengan SSD 256 Gb dan RAM 8gb. Laptop ringan yang satu ini bisa loh Anda masukkan ke " +
                    "dalam daftar laptop terbaik terbaru yang akan menjadi incaran Anda.","LENOVO","Rp 14.550.000",
                    "https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Lenovo-Thinkbook-20R9006XID.jpg"},
            {"HP Pavilion X360 14-dh0035TX","Laptop yang satu ini termasuk yang mini dan fleksibel. Model laptop" +
                    " yang satu ini punya 2 versi, bisa Anda jadikan laptop maupun dalam bentuk tablet. Hal " +
                    "ini memungkinkan karena engsel laptop bisa 360 derajat. Produk ini  memiliki RAM 4 Gb " +
                    "dengan internal 1 terabyte.","HP","Rp 8.950.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/HP-Pavilion-X360-14-dh0035TX.jpg"},
            {"Asus Chromebook C204MA-BU1430","Asus tidak hanya terkenal dengan keluaran smartphone nya saja," +
                    " akan tetapi untuk urusan laptop pun bisa dibilang unggul. Laptop yang satu ini cocok untuk " +
                    "dikenakan anak sekolahan.  Sistem operasi untuk windows 10.","ASUS","Rp5.630.000",
                    "https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Asus-Chromebook-C204MA-BU1430-2.jpg"},
            {"Lenovo Yoga 530-14ARR","Lenovo Yoga 530 merupakan laptop jenis hybrid yang memiliki keyboard" +
                    " nyaman dengan travel distance yang oke punya. Laptop ini cocok untuk keperluan bisnis " +
                    "dan penulis yang suka mengetik. Ukurannya juga memudahkannya untuk dibawa kemana saja.",
                    "LENOVO","Rp 10.049.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Lenovo-Yoga-530-14ARR.jpg"},
            {"Acer Aspire 5 A514-51G","Laptop yang satu ini termasuk laptop gaming yang digunakan para gamer, " +
                    "akan tetapi, sebenarnya laptop ini tidak didesain untuk gaming. Walaupun demikian, spesifikasinya" +
                    " sanggup digunakan untuk gaming. Bagaimana tidak? sistem prosesor yang mencapai intel core i5 dan " +
                    "memori internal sebesar 1 terabyte membuatnya cocok digunakan bermain game.","ACER",
                    "Rp 10.499.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Acer-Aspire-5-A514-51G.jpg"
            },
            {"Dell XPS 13 9370","Laptop yang satu ini juga termasuk laptop tipis selain versi HP yang di atas. " +
                    "Laptop super tipis ini memiliki layar 13.3 inci, tapi secara kasat mata, layarnya akan terasa " +
                    "seperti 14 inci karena bezelnya tipis. Proses booting nya juga tergolong cepat karena memiliki" +
                    " SSD mencapai 256 Gb","DELL","Rp 28.253.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Dell-XPS-13-9370-1.jpg"
            },
            {"Xiaomi Mi Notebook Air 13.3 inch","Tidak hanya memproduksi HP maupun Watch, kini xiaomi juga merambah" +
                    " dunia elektronik laptop. Jenis notebook air yang satu ini termasuk generasi ketiga yang memiliki" +
                    " spesifikasi RAM sebesar 8 Gb dan SSD sebesar 256 Gb.","XIAOMI","Rp9.500.000","https://i0.wp.com/blog.dimensidata.com/wp-content/uploads/Xiaomi-Mi-Notebook-Air-13.3-inch.jpg"
            }

    };

    public static ArrayList<Laptop> getListdata(){
        ArrayList<Laptop> list = new ArrayList<>();
        for (String[] aData : data) {
            Laptop laptop = new Laptop();
            laptop.setJenis(aData[0]);
            laptop.setDeskripsi(aData[1]);
            laptop.setMerk(aData[2]);
            laptop.setHarga(aData[3]);
            laptop.setPhoto(aData[4]);

            list.add(laptop);
        }
        return list;
    }
}
