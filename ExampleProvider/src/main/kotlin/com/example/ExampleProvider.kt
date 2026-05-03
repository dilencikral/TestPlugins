package com.example

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.Qualities

@CloudstreamPlugin
class SinemaOdamPlugin: Plugin() {
    override fun load(context: Context) {
        registerApi(BenimListemAPI())
    }
}

class BenimListemAPI : MainAPI() {
    override var name = "Benim Listem"
    override var mainUrl = "https://githubusercontent.com"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun getMainPage(page: Int, request: String?): List<com.lagradost.cloudstream3.HomePageList> {
        val list = mutableListOf<com.lagradost.cloudstream3.SearchResponse>()
        
        // Bu kod GitHub'daki liste.txt dosyanızı çeker
        val lines = app.get("$mainUrl/liste.txt").text.lines()
        
        for (line in lines) {
            if (line.contains("|")) {
                val parts = line.split("|")
                val ad = parts[0].trim()
                list.add(com.lagradost.cloudstream3.MovieSearchResponse(ad, "api_url", this.name, TvType.Movie, null, null))
            }
        }
        
        return listOf(com.lagradost.cloudstream3.HomePageList("Filmlerim", list))
    }
}
