package br.com.app.repositories.core

import android.app.Application
import br.com.app.repositories.core.data.di.DataModule
import br.com.app.repositories.core.domain.di.DomainModule
import br.com.app.repositories.core.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}