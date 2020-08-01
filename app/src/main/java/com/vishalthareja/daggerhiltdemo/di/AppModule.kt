package com.vishalthareja.daggerhiltdemo.di

import android.content.Context
import androidx.room.Room
import com.vishalthareja.daggerhiltdemo.BuildConfig
import com.vishalthareja.daggerhiltdemo.data.TestingDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * @author Vishal Thareja
 */
@InstallIn(ApplicationComponent::class)
@Module
class AppModule {

    @Provides
    fun provideBaseUrl() = BuildConfig.API_BASE_URL

    //database providing
    @Singleton
    @Provides
    fun provideYourDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        TestingDatabase::class.java,
        "testing"
    )
        .allowMainThreadQueries().build()

    //dao instance providing
    @Singleton
    @Provides
    fun provideYourDao(db: TestingDatabase) = db.getUserDao()
}