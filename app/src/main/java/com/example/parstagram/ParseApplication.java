package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            ParseObject.registerSubclass(Post.class);
            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("oD5kpMmcbUO0PeAx6D1vCFyAVZLdnb2eILP81si8")
                    .clientKey("EfRX5op1PoHnxLfjBDbgKUdmH6FkCy1fAsr0wFfI")
                    .server("https://parseapi.back4app.com")
                    .build()
            );
        }
    }
