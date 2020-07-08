package com.example.juyaeintroduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vansuita.materialabout.builder.AboutBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var view = AboutBuilder.with(this)
                .setPhoto(R.drawable.juyaeprofile)
                .setCover(R.mipmap.profile_cover)
                .setName("Ju Yae Park")
                .setSubTitle("OUNCE Android Developer")
                .setBrief("Sangkum Ballar Freshy JuYae")
                .setAppIcon(R.id.app_icon)
                .setAppName("Joo Yae")
                .addGitHubLink("https://github.com/jooyae")
                .addInstagramLink("https://www.instagram.com/ju_yae")
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        addContentView(view, view.layoutParams);

    }
}