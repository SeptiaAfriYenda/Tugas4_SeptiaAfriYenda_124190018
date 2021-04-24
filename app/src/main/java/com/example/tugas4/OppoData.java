package com.example.tugas4;
import java.util.ArrayList;

//melakukan load data terhadap apa yg mau ditampilkan di dalam recycle
public class OppoData {
    //menyesuaikan data yg akan ditampilkan
    private static String[] title = new String[]{"OPPO RENO 10X ZOOM", "OPPO RENO 2F", "OPPO RENO 3",
            "OPPO RENO 4", "OPPO RENO 5", "OPPO RENO 5 MARVEL EDITION"};
    private static int[] thumbnail = new int[]{R.drawable.reno10x, R.drawable.reno2f, R.drawable.reno3,
            R.drawable.reno4, R.drawable.reno5, R.drawable.reno5marvel};
    private static String[] spec = new String[]{
            "Dimensions/Weight\n" +
                    "Height: 16.2cm / 162.0mm\n" +
                    "Width: 7.72cm / 77.2mm\n" +
                    "Thickness: 0.93cm / 9.3mm\n" +
                    "Weight: About 215g\n" +
                    "Basic Parameters\n" +
                    "Color: Ocean Blue\n" +
                    "Operating System: ColorOS 6, based on Android 9\n" +
                    "Processor: SM8150\n" +
                    "GPU: Adreno™ 640\n" +
                    "Battery: 4065mAh (TYP), 3975mAh (MIN)\n" +
                    "RAM: Custermized\n" +
                    "Storage: 256GB\n" +
                    "Display\n" +
                    "Size: 6.6''\n" +
                    "Touchscreen: Multi-touch, Capacitive Screen\n" +
                    "Resolution: 2340 by 1080 pixels at 387 ppi\n" +
                    "Colors: 16.7 million colors\n" +
                    "Screen Ratio: 93.1%\n" +
                    "Type: AMOLED on-cell\n" +
                    "Camera\n" +
                    "Rear Sensor: 48MP + 8MP + 13MP\n" +
                    "Front Sensor: 16MP\n" +
                    "Aperture:\n" +
                    "Front: 16MP F2.0\n" +
                    "Rear: 48MP F1.7 + 8MP F2.2 + 13MP F3.0\n" +
                    "Features:\n" +
                    "Rear 6P camera of 48MP, PDAF, dual OIS;\n" +
                    "Front 5P camera of 16MP with beauty function\n" +
                    "Camera Mode:\n" +
                    "Photo, Video, Expert, Time-lapse, Pano, Night, and Portrait\n" +
                    "Video:\n" +
                    "Front camera: 1080P/720P@30fps\n" +
                    "Rear camera: 4K@60fps/30fps, 1080P@60fps/30fps, 720P@60fps/30fps\n" +
                    "Connectivity\n" +
                    "Frequencies:\n" +
                    "GSM: 850/900/1800/1900MHz\n" +
                    "WCDMA: Bands 1/2/4/5/6/8/19\n" +
                    "FDD-LTE: Bands 1/2/3/4/5/7/8/12/13/17/18/19/20/25/26/28/29/32/66\n" +
                    "TD-LTE: Bands 34/38/39/40/41\n" +
                    "SIM Card Type: Nano+Nano/Micro SD, 2 of 3\n" +
                    "WLAN Function: WLAN 2.4G / WLAN 5G, WLAN Display\n" +
                    "OTG: Supported\n" +
                    "NFC: Supported\n" +
                    "Sensors\n" +
                    "Geomagnetic Sensor\n" +
                    "Light Sensor    \n" +
                    "Proximity Sensor    \n" +
                    "Accelerometer\n" +
                    "Gyro Sensor\n" +
                    "Laser Focus\n" +
                    "In the Box\n" +
                    "OPPO Reno 10x Zoom (12GB Ram Special Edition) *1\n" +
                    "Adapter*1\n" +
                    "Headset *1\n" +
                    "USB-C Charge Cable*1\n" +
                    "Important Info. Booklet with Warranty Card *1\n" +
                    "Quick Start Guide *1\n" +
                    "SIM Card Ejector *1\n" +
                    "Case *1\n",

            "Dimensions/Weight\n" +
                    "Height: 16.18cm / 161.8mm\n" +
                    "Width: 7.58cm / 75.8mm\n" +
                    "Thickness: 0.87cm / 8.7mm\n" +
                    "Weight: About 195g\n" +
                    "Basic Parameters\n" +
                    "Color: Lake Blue, Sky White\n" +
                    "Operating System: ColorOS 6.1, based on Android 9\n" +
                    "Processor: MTK MT6771V (P70)\n" +
                    "GPU: ARM Mali-G72 MP3 900MHz\n" +
                    "Battery: 3900/4000mAh(Min/Typ)\n" +
                    "RAM: 8GB\n" +
                    "Storage: 128GB (Expandable up to 256GB)\n" +
                    "VOOC Flash Charge: 3.0\n" +
                    "Display\n" +
                    "Size: 16.5cm (6.5'')\n" +
                    "Touchscreen: Multi-touch, Capacitive Screen\n" +
                    "Resolution: 2340 by 1080 pixels at 394 ppi\n" +
                    "Colors: 16 million colors\n" +
                    "Screen Ratio: 91.1%\n" +
                    "Contrast: 60000:1 (Min)\n" +
                    "Type: AMOLED on-cell\n" +
                    "Brightness: Typical value 430nit\n" +
                    "Camera\n" +
                    "Rear Sensor: 48MP & 8MP & 2MP & 2MP\n" +
                    "Front Sensor: 16MP\n" +
                    "Flash: LED Flash\n" +
                    "Aperture:\n" +
                    "Front F2.0\n" +
                    "Main camera F1.79; secondary camera F2.2; mono F2.4; mono F2.4\n" +
                    "Sensor Size:\n" +
                    "Front 1/3.1', 1.0um\n" +
                    "Main camera 1/2.25', 0.8um; secondary camera 1/4.0', 1.12um; mono 1/5.0', 1.75um;\n" +
                    "Features:\n" +
                    "Rear 6P camera of 48MP;\n" +
                    "Front 5P camera of 16MP;\n" +
                    "Camera Mode:\n" +
                    "Photo, video, professional mode, panorama, portrait, night scene,\n" +
                    "time-lapse photography, slow motion, etc.\n" +
                    "Video:\n" +
                    "Front 1080P/720P@30fps\n" +
                    "The rear camera supports up to 1080P @30fps, 720P@30fps; Smart Video Editor;\n" +
                    "Connectivity\n" +
                    "Frequencies:\n" +
                    "GSM: 850/900/1800/1900MHz\n" +
                    "WCDMA: Bands 1/5/8\n" +
                    "FDD-LTE: Bands 1/3/5/8\n" +
                    "TD-LTE: Bands 38/40/41\n" +
                    "SIM Card Type: Nano-SIM/Nano-SIM three-to-three\n" +
                    "GPS: Built-in GPS/A-GPS/Beidou/Glonass\n" +
                    "Bluetooth: 4.2\n" +
                    "WLAN Function: 2.4/5GHz 802.11 a/b/g/n/ac\n" +
                    "OTG: Support\n" +
                    "Sensors\n" +
                    "Gyro-meter\n" +
                    "E-Compass\n" +
                    "Hall Sensor\n" +
                    "Light Sensor\n" +
                    "Proximity Sensor\n" +
                    "G-sensor/Acceleration Sensor\n" +
                    "In the Box\n" +
                    "OPPO Reno2 F *1\n" +
                    "Adaptor Daya *1\n" +
                    "Headset *1\n" +
                    "Kabel USB Tipe-C *1\n" +
                    "Info Penting. Buklet dengan Kartu Garansi *1\n" +
                    "Buku Panduan *1\n" +
                    "Alat Kartu SIM *1\n" +
                    "Pelindung layar, sudah terpasang *1\n" +
                    "Casing *1\n" +
                    "Perlindungan baterai termasuk dalam daftar kemasan.\n",

            "Dimensions/Weight\n" +
                    "Height: 160.2 mm\n" +
                    "Width: 73.3 mm\n" +
                    "Thickness: 7.9 mm\n" +
                    "Weight: Approximately 170 g\n" +
                    "Basic Parameters\n" +
                    "Color: Sky White, Midnight Black, Auroral Blue\n" +
                    "Operating System: ColorOS 7, based on Android 10\n" +
                    "CPU: MTK MT6779V (MTK P90)\n" +
                    "Battery: 3935/4025 mAh (min/typ)\n" +
                    "RAM: 8GB\n" +
                    "Storage: 128GB (SD card is expandable up to 256GB)\n" +
                    "Display\n" +
                    "Size: 16.2cm (6.4'')\n" +
                    "Touchscreen: Multi-touch, Capacitive Screen\n" +
                    "Resolution: 2400 by 1080 pixels\n" +
                    "Colors: 16 million colors\n" +
                    "Screen Ratio: 90.8%\n" +
                    "Camera\n" +
                    "Rear Sensor: 13M + 48M + 8M + 2M\n" +
                    "Front Sensor: 44MP\n" +
                    "Flash: LED Flash\n" +
                    "Aperture:\n" +
                    "Front: 44MP F2.4\n" +
                    "Rear: 48MP F1.8 + 13MP F2.4 + 8MP F2.2 + 2MP F2.4\n" +
                    "Sensor Size:\n" +
                    "48MP main camera 1/2.0';\n" +
                    "13MP telephoto lens 1/3.4', 1.0um;\n" +
                    "8MP wide-angle lens 1/4',1.12um;\n" +
                    "2MP mono lens 1/5',1.75um;\n" +
                    "Front camera 1/2.8', 0.8um\n" +
                    "Pixel Size:\n" +
                    "Rear camera: 4000*3000 (normal mode); 8000*6000 (48MP output mode)\n" +
                    "Front camera: 7680*5760 (44MP output mode); 7296* 5472 (normal mode)\n" +
                    "Video:\n" +
                    "Front Camera: 1080P/720P@30fps\n" +
                    "Rear Camera: 4K/30fps; 1080P@60fps/30fps; 720P@60fps/30fps\n" +
                    "Connectivity\n" +
                    "Frequencies:\n" +
                    "GSM: 850/900/1800/1900MHz\n" +
                    "WCDMA: Bands 1/5/8\n" +
                    "FDD-LTE: Bands 1/3/5/7/8\n" +
                    "TD-LTE: Bands 38/40/41\n" +
                    "Note: B41: 2535-2655 MHz\n" +
                    "SIM Card Type: Nano-SIM / Nano-USIM\n" +
                    "GPS: Built-in GPS; supports A-GPS, Beidou, Glonass\n" +
                    "Bluetooth: 5.0\n" +
                    "WLAN Function: WLAN 2.4G / WLAN 5.1G / WLAN 5.8G, WLAN Display\n" +
                    "In the Box\n" +
                    "OPPO Reno3 *1\n" +
                    "Adapter*1\n" +
                    "Earphones*1 \n" +
                    "USB Cable*1\n" +
                    "Important Info. Booklet with Warranty Card *1\n" +
                    "Quick Start Guide *1\n" +
                    "SIM Card Tool *1\n" +
                    "Protective Film, pre-applied *1\n" +
                    "Case *1\n",

            "Size and Weight\n" +
                    "Height: about 160.3mmWidth: about 73.9mmThickness: about 7.7mmWeight: about 165g*Product size and weight may vary by configuration, manufacturing process and measurements. All specifications are subject to the actual product.\n" +
                    "Memory and Storage\n" +
                    "8GB RAM +128GB ROMExternal Memory: Expandable up to 256GBUSB OTG: supported*The available internal storage may be smaller as part of the internal storage is occupied by software. Actual memory space may change due to application updates, user operations, and other related factors.\n" +
                    "Display\n" +
                    "Size: 16.34cm/6.4” (diagonal)Screen Ratio: 90.7%Resolution: 2400*1080 pixels (FHD+)Refresh Rate: 60HzColour Gamut: 96% NTSCPixel Density: 409 PPIBrightness: Normal: 430nit (typical), overall peak brightness 600 nits (typical) , local peak brightness 800 nits (typical)Panel: OLED\n" +
                    "Camera\n" +
                    "Rear: Innovative Quadcam48MP Wide Angle CameraSony IMX586 sensor, 1/2\" sensor size, f/1.7 aperture, 6P lens, support auto focus, Ultra Night Mode, Ultra Steady Video8MP Ultra Wide Angle CameraHi846 sensor, 1/4\" sensor size, f/2.2 aperture, 5P lens, 119° field of view, Ultra Steady Video Pro2MP Macro Cameraf/2.4 aperture, 3P lens2MP Mono Cameraf/2.4 aperture, 3P lens\n" +
                    "Front: 32MP Selfie Cameraf/2.4 aperture, 5P lens, AI beautification, support night mode algorithms\n" +
                    "Shooting Mode: Photo, video, night, expert, pano, portrait, time lapse, slow motion, text scanner, sticker, Google Lens(need to log in Google account to activate voice assistant)Image Size: the rear cameras support up to 8000*6000 resolution (48MP mode) and 4000*3000 resolution (ordinary mode); the front camera supports up to 6560*4928 resolution\n" +
                    "Video\n" +
                    "Rear4K@30fps/1080P@60fps or 30fps; 720P@60fps or 30fpsSupport digital video zoomSupport slow-motion video\n" +
                    "Front1080P/720P@30fps default 720P@30fpsNot support video zoomSupport slow-motion video\n" +
                    "Chips\n" +
                    "CPU: Qualcomm Snapdragon 720GCPU Speed: up to 2.3GHzCPU Cores: 8 coresGPU: Adreno™ 618\n" +
                    "Battery\n" +
                    "4015mAh(typical) / 3920mAh(minimum)VOOC 4.0(5V6A), PD(5V3A), QC(5V2A)\n" +
                    "Biometrics\n" +
                    "Support Hidden Fingerprint Unlock and Face Unlock\n" +
                    "Sensors\n" +
                    "Support Geomagnetic sensor,Proximity sensor,Light sensor,G-sensor,Acceleration sensor,Gyroscope,Supports step counting\n" +
                    "Cellular Network\n" +
                    "SIM 2: SupportedSIM Card Type:Dual Nano-SIM card\n" +
                    "GSM: 850/900/1800/1900WCDMA: B1/5/8FDD-LTE: B1/3/5/7/8TDD-LTE: B38/40/41Note: B41:2535MHz~2655MHzSame for SIM 1 and SIM 2*Functions available on the live network depend on the situations of carrier's network and related services deployment.\n" +
                    "Connectivity\n" +
                    "WLAN: WLAN 2.4GHz / WLAN 5.1GHz / WLAN 5.4GHz / WLAN 5.8GHzBluetooth Version: Bluetooth v5.1Bluetooth Audio Codec: Support SBC, AAC, APTX, LDAC, APTX-HD & APTX-TWS+USB Interface: Type-CEarphone Jack: 3.5mm standard earphoneNFC: not supported\n" +
                    "Operating System\n" +
                    "ColorOS 7.2, based on Android 10\n" +
                    "Location Technology\n" +
                    "GNSS: Built-in GPS; Beidou, Glonass, Galileo, QZSSFrequency Antenna: Not supportedOthers: Support wireless local area network/cellular network positioning; Supports electronic compassMaps: Support 3rd party Map APPs\n" +
                    "In the box\n" +
                    "OPPO Reno4 * 1Earphones * 1Data cable * 1Charger * 1SIM card tool * 1Case * 1Quick Start Guide * 1Safety Guide (including warranty card) * 1\n",

            "Ukuran dan Berat\n" +
                    "Tinggi: 159.1mmLebar: 73.3mmTebal: 7,7 mm (Starry Black); 7,8 mm (Fantasy Silver)Berat: 171 g * Ukuran dan berat produk dapat bervariasi berdasarkan konfigurasi, proses produksi, dan pengukuran. Semua spesifikasi tunduk pada produk sebenarnya.\n" +
                    "Penyimpanan\n" +
                    "RAM 8 GB + ROM 128 GBJenis RAM: LPDDR4x @1866MHzMemori Eksternal: DidukungVersi USB: USB 2.0USB OTG：Didukung* Penyimpanan internal yang tersedia mungkin lebih kecil karena bagian dari penyimpanan internal ditempati oleh perangkat lunak. Ruang memori yang sebenarnya dapat berubah karena pembaruan aplikasi, operasi pengguna, dan faktor terkait lainnya.\n" +
                    "Tampilan\n" +
                    " Ukuran: 6.4\"(16.33 cm)Rasio Layar: 91,70%Resolusi: 2400 x 1080 (FHD +)Tingkat Refresh: Maksimum: 90 Hz, Pilihan: 90 Hz atau 60 HzTingkat Sentuh: Maksimum: 180 Hz (2 jari), Default: 120 Hz (5 jari) \"Gamut Warna: Mode Tajam 93,28% DCI-P3 ，135,13% sRGB; Mode lembut 73,72% DCI-P3 ， 100% sRGBPixel Density: 410 PPIRasio Kontras: Maksimum statis: 1000000: 1 (umum); Maksimum dinamis: 200000: 1 (umum)Kecerahan: 430 nits (umum); dengan maksimum 600 nits di bawah sinar matahari (umum)Panel: AMOLED (layar kaku)\n" +
                    "Camera\n" +
                    "Belakang64MP Kamera Utama : f / 1.7; FOV 79.5 °; motor fokus loop tertutup8MP Kamera Sudut Ultra Lebar : f / 2.2; FOV 119 °; fokus tetap2MP Kamera Makro : f / 2.4; FOV 89 °; fokus tetap2MP Kamera Mono : f / 2.4; FOV 89 °; fokus tetap\n" +
                    "Depan44MP (f / 2.4); FOV 85 °\n" +
                    "Mode PemotretanBelakang: Mode Malam, video, foto, potret, dual-view video, gerak lambat, selang waktu, AI mixed portrait, ahli, ekstra HD, pano, pemindai teks, makro, stiker, templat soloop, lensa GoogleDepan: Mode Malam, video, foto, potret, dual-view video, gerak lambat, selang waktu, AI mixed portrait, pano, stiker\n" +
                    "Ukuran GambarBelakang: Ukuran maksimal: 6936 x 9248 (64 MP); Mode foto normal 3468 x 4624 (4: 3) 2608 x 4624 (16: 9) 3468 x 3468 (1: 1) 2080 x 4624 (layar penuh)Depan: Ukuran maksimal: 7680 x 5760 (44 MP); Mode foto normal 5472 x 7296 (4: 3) 5472 x 5472 (1: 1) 3280 x 7296 (layar penuh) 4112 x 7296 (16: 9)\n" +
                    "Video\n" +
                    "BelakangKamera belakang: 4K (30fps), 1080P (60fps / 30fps), 720P (60fps / 30fps)Video gerak lambat: 1080P (480fps / 120fps), 720P (960fps / 240fps)Zoom video: 4K (30fps), 1080P (60fps / 30fps), 720P (60fps / 30fps) \"\n" +
                    "DepanKamera depan: 1080P / 720P 30fps (default: 720P (30fps))Gerak lambat: 1080P (120fps), 720P (240fps)Kamera depan: stabilisasi video 1080P (30fps), 720P (30fps)\n" +
                    "Chipset\n" +
                    "Qualcomm® Snapdragon™ 720GKecepatan CPU: 8 core dengan frekuensi maksimum 2.3GHzInti CPU: 8 intiGPU: Adreno ™ 618 @ 750 MHz\n" +
                    "Baterai\n" +
                    "4220 mAh / 16,33 Wh (Min)4310 mAh / 16,67 Wh (Typ）Baterai polimer ion litium\n" +
                    "Pengisian CepatMendukung 50W Flash Charge, VOOC 4.0\n" +
                    "Biometrik\n" +
                    "Mendukung Buka Sidik Jari Tersembunyi dan Buka Kunci Wajah\n" +
                    "Sensor\n" +
                    "Sensor geomagnetikSensor jarakSensor optikAkselerometerSensor gravitasiGiroskopAlat pengukur langkah\n" +
                    "Jaringan seluler\n" +
                    "SIM 2: DidukungJenis Kartu SIM: Kartu Nano-SIM* Fungsi yang tersedia di jaringan langsung bergantung pada situasi jaringan operator dan penyebaran layanan terkait.\n" +
                    "Kartu SIM 12G: GSM 850/900/1800/1900 MHz3G: pita WCDMA 1/5/84G: TD-LTE band 38/40/41 (120 MHz)4G: LTE FDD band 1/3/5/7/8\n" +
                    "Kartu SIM 22G: GSM 850/900/1800/1900 MHz3G: WCDMA bands 1/5/83G: pita WCDMA 1/5/84G: TD-LTE band 38/40/41 (120 MHz)\n" +
                    "Konektivitas\n" +
                    "WLANWi-Fi 2,4 GHz, Wi-Fi 5,1 GHz, Wi-Fi 5,4 GHz, Wi-Fi 5,8 GHz, layar Wi-Fi\n" +
                    "Versi Bluetooth: Bluetooth v2.1 + EDR, Bluetooth v5.1Codec Audio Bluetooth: SBC, AAC, aptx HD, LDACAntarmuka USB: USB Tipe CJack Earphone: 3,5 mmNFC: Didukung; Membaca dan menulis kartu; mendukung Android Beam; mendukung HCE dan UICC\n" +
                    "Sistem operasi\n" +
                    "ColorOS 11.1 berbasis Android 11.0\n" +
                    "Teknologi Lokasi\n" +
                    "GNSS: Mendukung GPS, BeiDou, GLONASS, Galileo, dan QZSSAntena Frekuensi: Tidak didukungLainnya: Penentuan posisi satelit mendukung GPS, BeiDou, GLONASS, Galileo, dan QZSSMetode pemosisian lainnya: mendukung A-GPS, Wi-Fi, jaringan seluler, dan kompas elektronikMaps: Mendukung Google Map dan aplikasi peta pihak ketiga lainnya\n" +
                    "Dalam kotak\n" +
                    "OPPO Reno5 × 1Pengisi daya × 1Earphone × 1Kabel data USB × 1Alat ejektor SIM × 1Panduan keamanan × 1Panduan cepat × 1Case pelindung × 1* OPPO Reno5 dilengkapi dengan adaptor pengisian daya SuperVOOC 65W, yang mendukung Pengisian Daya Flash 50W dari OPPO Reno5 tanpa mempengaruhi tingkat pengisian dan kinerja keselamatan.\n",

            "Ukuran dan Berat\n" +
                    "Tinggi: 159.1mmLebar: 73.3mmTebal: 7.8mmBerat: 171g* Ukuran dan berat produk dapat bervariasi berdasarkan konfigurasi, proses produksi, dan pengukuran. Semua spesifikasi tunduk pada produk sebenarnya. \n" +
                    "Penyimpanan\n" +
                    "RAM 8 GB + ROM 128 GBJenis RAM: LPDDR4x @ 1866MHzMemori Eksternal: DidukungVersi USB: USB 2.0USB OTG：Didukung* Penyimpanan internal yang tersedia mungkin lebih kecil karena bagian dari penyimpanan internal ditempati oleh perangkat lunak. Ruang memori yang sebenarnya dapat berubah karena pembaruan aplikasi, operasi pengguna, dan faktor terkait lainnya.\n" +
                    "Layar\n" +
                    " Ukuran: 6,4 \"(16,33 cm)Rasio Layar: 91.7%Resolusi: 2400 x 1080 (FHD +)Kecepatan Refresh: Maksimum: 90Hz, Opsi: 90Hz atau 60HzSentuh Sampling Rate: Maksimum: 180Hz (2 jari), Default: 120Hz (5 jari)Gamut Warna: Mode Vivid: 93,28% DCI-P3, 135,13% sRGB; Mode Halus: 73,72% DCI-P3, 100% sRGBPixel Density: 410 PPIRasio Kontras: Maksimum statis: 1000000: 1 (umum); Maksimum dinamis: 200000: 1 (umum)Kecerahan: 430 nits (umum); dengan maksimum 600 nits di bawah sinar matahari (umum)Panel: AMOLED\n" +
                    "Kamera\n" +
                    "Belakang6Kamera Utama 64MP: f / 1.7; FOV 79.5 °; closed-loop focus motorKamera Sudut Ultra Lebar 8MP: f / 2.2; FOV 119 °; fokus tetapKamera Makro 2MP: f / 2.4; FOV 89 °; fokus tetapKamera Mono 2MP: f / 2.4; FOV 89 °; fokus tetap\n" +
                    "Depan44MP (f / 2.4); FOV 85 °\n" +
                    "Mode PemotretanBelakang: mode malam, video, foto, potret, dual-view video, gerak lambat, selang waktu, AI mixed portrait, pakar, HD ekstra, panorama, pemindai teks, makro, stiker, templat soloop, lensa GoogleDepan: mode malam, video, foto, potret, dual-view video, gerak lambat, selang waktu, AI mixed portrait, pano, stiker\n" +
                    "Ukuran GambarBelakang: Ukuran maksimum: 6936 x 9248 (64MP); Mode foto normal: 3468 x 4624 (4: 3) 2608 x 4624 (16: 9) 3468 x 3468 (1: 1) 2080 x 4624 (layar penuh)Depan: Ukuran maksimum: 7680 x 5760 (44MP); Mode foto normal: 5472 x 7296 (4: 3) 5472 x 5472 (1: 1) 3280 x 7296 (layar penuh) 4112 x 7296 (16: 9)\n" +
                    "Video\n" +
                    "BelakangKamera belakang: 4K (30fps), 1080P (60fps / 30fps), 720P (60fps / 30fps)Video gerak lambat: 1080P (480fps / 120fps), 720P (960fps / 240fps)Zoom video: 4K (30fps), 1080P (60fps / 30fps), 720P (60fps / 30fps)\n" +
                    "DepanKamera depan: 1080P / 720P 30fps (default: 720P (30fps))Slo-mo: 1080P (120fps), 720P (240fps)Kamera depan: stabilisasi video 1080P (30fps), 720P (30fps)\n" +
                    "Chipset\n" +
                    "Qualcomm® Snapdragon ™ 720GKecepatan CPU: 8 inti dengan frekuensi maksimum 2.3GHzInti CPU: 8 intiGPU: Adreno™ 618 @ 750MHz\n" +
                    "Baterai\n" +
                    "4220mAh / 16.33Wh (Min)4310mAh / 16.67Wh (Tip）Baterai polimer ion litium\n" +
                    "Pengisian CepatMendukung VOOC 4.0, SuperVOOC, PD2.0, QC2.0\n" +
                    "Biometrik\n" +
                    "Mendukung Buka Sidik Jari Tersembunyi dan Buka Kunci Wajah\n" +
                    "Sensor\n" +
                    "Sensor geomagnetikSensor jarakSensor optikAkselerometerSensor gravitasiGiroskopAlat pengukur langkah\n" +
                    "Jaringan Selular\n" +
                    "SIM 2: DidukungJenis Kartu SIM: Kartu Nano-SIM* Fungsi yang tersedia di jaringan langsung bergantung pada situasi jaringan operator dan penyebaran layanan terkait.\n" +
                    "Kartu SIM 12G: GSM 850/900/1800 / 1900MHz3G: pita WCDMA 1/5/84G: TD-LTE band 38/40/41 (194MHz)4G: LTE FDD band 1/3/5/7/8/20/28\n" +
                    "Kartu SIM 22G: GSM 850/900/1800 / 1900MHz3G: WCDMA band 1/5/84G: TD-LTE band 38/40/41 (120MHz)4G: LTE FDD band 1/3/5/7/8/20/28\n" +
                    "Konektivitas\n" +
                    "WLAN:Wi-Fi 2,4 GHz, Wi-Fi 5,1 GHz, Wi-Fi 5,4 GHz, Wi-Fi 5,8 GHz, tampilan Wi-FiVersi Bluetooth: Bluetooth v2.1 + EDR, Bluetooth v5.1Codec Audio Bluetooth: SBC, AAC, aptx HD, LDACAntarmuka USB: USB Tipe CJack Earphone: 3,5 mmNFC: Tidak didukung\n" +
                    "Sistem Operasi\n" +
                    "ColorOS 11.1 berbasis Android 11.0\n" +
                    "Teknologi Lokasi\n" +
                    "GNSS: Mendukung GPS, BeiDou, GLONASS, Galileo, dan QZSSAntena Frekuensi: Tidak didukungLainnya: Penentuan posisi satelit mendukung GPS, BeiDou, GLONASS, Galileo, dan QZSS Metode pemosisian lainnya: mendukung A-GPS, Wi-Fi, jaringan seluler, dan kompas elektronikPeta: Mendukung Google Map dan aplikasi peta pihak ketiga lainnya\n" +
                    "Dalam Kotak\n" +
                    "OPPO Reno5 Marvel Edition × 1Charger ×1Earphone × 1USB Data Cable ×1Alat Ejektor SIM × 1Panduan Keamanan × 1Panduan Cepat × 1Case Pelindung × 1* OPPO Reno5 Marvel Edition hadir dengan 65W SuperVOOC flash charging adapter, yang mendukung 50W Flash Charge dari OPPO Reno5 Marvel Edition tanpa mempengaruhi tingkat pengisian dan kinerja keselamatan.\n"
    };

    //menyimpan value ke variabel tunggal
    public static ArrayList<OppoModel> getListData(){
        OppoModel oppoModel = null;
        ArrayList<OppoModel> list = new ArrayList<>();

        for (int i = 0; i<title.length; i++){
            //menghubungkan dengan file model
            oppoModel = new OppoModel();
            oppoModel.setFoto(thumbnail[i]);
            oppoModel.setTipe(title[i]);
            oppoModel.setSpek(spec[i]);
            list.add(oppoModel);
        }
        return list;
    }
}
