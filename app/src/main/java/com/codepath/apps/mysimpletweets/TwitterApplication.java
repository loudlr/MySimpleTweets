package com.codepath.apps.mysimpletweets;
// Jenkins PR build testing
// Test 1

import android.content.Context;

/*
 * This is the Android application itself and is used to configure various settings
 * including the image cache in memory and on disk. This also adds a singleton
 * for accessing the relevant rest client.
 *
 *     TwitterClient client = TwitterApplication.getRestClient();
 *     // use client to send requests to API
 *
 */
public class TwitterApplication extends com.activeandroid.app.Application {
	private static Context context;

	@Override
	public void onCreate() {
		super.onCreate();
		com.codepath.apps.mysimpletweets.TwitterApplication.context = this;
	}

	public static TwitterClient getRestClient() {
		return (TwitterClient) com.codepath.apps.mysimpletweets.TwitterClient.getInstance(TwitterClient.class, com.codepath.apps.mysimpletweets.TwitterApplication.context);
	}
}