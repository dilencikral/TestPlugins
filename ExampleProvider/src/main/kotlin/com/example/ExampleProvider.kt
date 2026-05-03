package com.example

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class SinemaOdamPlugin: Plugin() {
    override fun load(context: Context) {
        // Bu alana daha sonra film linklerimizi ekleyecegiz
    }
}
