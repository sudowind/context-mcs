package com.example.wangfeng.csapp

import android.net.Uri
import java.text.SimpleDateFormat
import java.util.*
import android.provider.MediaStore
import java.io.File


class Utils {
    val baseUrl = "http://www.sudowind.com:8000"
//    val baseUrl = "http://192.168.1.174:8000"
    init {}
    public fun getTimeStr(second: Long): String {
        val date = Date(second * 1000)
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return format.format(date)
    }

}