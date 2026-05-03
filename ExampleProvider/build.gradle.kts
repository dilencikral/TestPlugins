dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Eklentinizin versiyonu (Guncelleme yaptikca bu sayiyi artirabilirsiniz)
version = 1

cloudstream {
    // TV'de eklentiler listesinde gorunecek aciklama
    description = "Benim ozel film ve dizi arsivim"
    
    // Buraya kendi adinizi veya rumuzunuzu yazabilirsiniz
    authors = listOf("Ahmet") 

    status = 1 

    // Eklentinizin hangi turde icerikler barindirdigini belirtir
    tvTypes = listOf("Movie", "TvSeries")

    requiresResources = true
    
    // Uygulamada Turkce olarak listelenmesi icin "tr" yapiyoruz
    language = "tr"

    // TV'de eklentinizin yaninda duracak olan logo resmi (Isterseniz degistirebilirsiniz)
    iconUrl = "https://wikimedia.org"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}
