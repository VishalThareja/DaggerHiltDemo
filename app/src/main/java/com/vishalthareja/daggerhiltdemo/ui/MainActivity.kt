package com.vishalthareja.daggerhiltdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.vishalthareja.daggerhiltdemo.R
import com.vishalthareja.daggerhiltdemo.data.local.db.dao.UserDao
import com.vishalthareja.daggerhiltdemo.data.local.db.entity.User
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author Vishal Thareja
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //view model injection
    private val splashViewModel : MainActivityViewModel by viewModels()

    //room dao injection
    @Inject
    lateinit var userDao: UserDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(1,"999999999","Vishal")
        val insertUser = userDao.insertUser(user)
        Log.e("inserted user","id: "+insertUser)

        //viewmodel function call
        splashViewModel.hi()
    }
}