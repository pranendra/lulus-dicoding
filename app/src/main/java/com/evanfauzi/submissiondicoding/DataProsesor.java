package com.evanfauzi.submissiondicoding;

import java.util.ArrayList;

public class DataProsesor {
    private static String[] prosesorNames = {
            "AMD A10-5800K",
            "AMD FX-9590",
            "Intel Core i3-6100",
            "AMD Sempron 3850",
            "Intel Pentium G3258",
            "Intel Core i7-6700K",
            "Intel Core i5-4690K",
            "AMD FX-8320E",
            "Intel Core i7-5820K",
            "AMD A10-7870K"
    };

    private static String[] prosesorDetails = {
            "Socket FM2 dan Speknya 4C/4T, 4MB cache, boxed, 3.8GHz. Keunggulannya Baik untuk FM2 user, sangat baik untuk penggunaan system komputer supaya tahan lama. Pilihan yang sangat kontroversial mungkin, karena harga dari AMD A10-5800K kurang dari satu juta.",
            "Sangat baik, karena Processor komputer PC terbaik ini mampu tetap dingin dalam penggunaan yang lama. Dengan total 16MB cache (8MB L2 dan 8MB L3) dengan socket AM3+ dan kecepatan clock dasar dari 4.7GHz (turbo hingga 5GHz) sudah cukup membuktikan kecepatan dari CPU ini.",
            "Socket 1151 dan Speknya 2C/4T, 3MB cache, boxed, 3.7GHz. Intel Core i3-6100 adalah Processor komputer PC terbaik yang termurah dari generasi core, saya memasukan prosesor ini ke daftar karena alasan harganya.",
            "Saya memasukan AMD Sempron 3850 karena Processor komputer PC terbaik ini harganya yang sangat murah, di amazon harganya sekitar $25, atau jika dirupiahkan sekitar 400 ribuan sudah termasuk heatsink dan fan.",
            "Keunggulan dari Processor komputer PC terbaik Intel Pentium G3258 adalah kemampuan overclock gaming dengan harga yang murah dibanding dengan prosesor intel lainnya.",
            "Kelebihan dari Processor komputer PC terbaik Intel Core i7-6700K adalah pada performa yang cepat dan mampu overclock speed dengan kecepatan berlipat ganda, kelemahannya adalah pada harga yang mahal.",
            "Processor komputer PC terbaik ini sangat baik untuk sistem kelas menegah, dengan pilihan overclock speed yang sama seperti prosesor intel core i7 di urutan ke 6 tadi.",
            "Socket AM3+ dan Speknya 8C/8T, 8MB cache, boxed, 3.5GHz. Processor komputer PC terbaik termurah yang memiliki 8 inti, di amazon harganya adalah $100 dolar, atau jika dirupiahkan sekitar 1.4 jutaan.",
            "Sangat baik untuk penggunaan PC kebutuhan gaming, Processor komputer PC terbaik ini harganya sekitar 4 jutaan, ini kelemahannya. Menggunakan socket LGA20011-v3 dan Speknya 6C/12T, 15MB cache, boxed, 3.3GHz.",
            "Sangat baik untuk AMD user yang membutuhkan PC dengan performa cepat untuk kebutuhan gaming, namun dengan harga yang tergolong mahal untuk sebuah CPU AMD. Menggunakan socket FM2+ dan Speknya 4C/4T, 4MB cache, boxed, 3.9GHz."
    };

    private static int[] prosesorImages = {
            R.drawable.amd,
            R.drawable.amd,
            R.drawable.intel,
            R.drawable.amd,
            R.drawable.intel,
            R.drawable.intel,
            R.drawable.intel,
            R.drawable.amd,
            R.drawable.intel,
            R.drawable.amd
    };

    private static String[] prosesorSpek = {
            "4C/4T, 4MB cache, boxed, 3.8GHz",
            "8C/8T, 16MB cache, CPU only, 4.7GHz",
            "2C/4T, 3MB cache, boxed, 3.7GHz",
            "4C/4T, 2MB cache, boxed, 1.3GHz",
            "2C/2T, 3MB cache, boxed, 3.2GHz",
            "4C/8T, 8MB cache, boxed, 4GHz",
            "4C/4T, 6MB cache, boxed, 3.5GHz",
            "8C/8T, 8MB cache, boxed, 3.5GHz",
            "6C/12T, 15MB cache, boxed, 3.3GHz",
            "4C/4T, 4MB cache, boxed, 3.9GHz"
    };

    static ArrayList<Prosesor> getListData(){
        ArrayList<Prosesor> list = new ArrayList<>();
        for (int position = 0; position < prosesorNames.length; position++){
            Prosesor prosesor = new Prosesor();
            prosesor.setName(prosesorNames[position]);
            prosesor.setDetail(prosesorDetails[position]);
            prosesor.setPhoto(prosesorImages[position]);
            prosesor.setSpek(prosesorSpek[position]);
            list.add(prosesor);
        }
        return list;
    }
}
