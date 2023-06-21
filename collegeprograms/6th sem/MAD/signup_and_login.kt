SignupActivity.kt

package com.example.signup
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import java.util.regex.*
import kotlinx.android.synthetic.main.signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        supportActionBar?.setTitle("Sign Up")

        val db = Room.databaseBuilder(applicationContext, AppDB::class.java, "app-database").allowMainThreadQueries().build()
        val userDao = db.userDao()

        signUpButton.setOnClickListener {
            if(signUp_password.text.toString().length<8 && !isValidPassword(signUp_password.text.toString())){
                Toast.makeText(baseContext,"Invalid Password", Toast.LENGTH_SHORT).show()
            }
            else{
                val newUser = User(signUp_username.text.toString(), signUp_password.text.toString())
                userDao.insert(newUser)
                Toast.makeText(baseContext,"Sign Up Sucessful", Toast.LENGTH_LONG).show()
            }
        }

        signUp_to_logIn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun isValidPassword(password: String?): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        matcher = pattern.matcher(password)
        return matcher.matches() //0 or 1
    }
}

LoginActivity.kt

package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isInvisible
import androidx.room.Room
import kotlinx.android.synthetic.main.login.*
import java.lang.Exception

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.setTitle("Log In")

        val db = Room.databaseBuilder(applicationContext, AppDB::class.java, "app-database").allowMainThreadQueries().build()
        val userDao = db.userDao()

        var count = 0

        logInButton.setOnClickListener {
            try{
                val tempUser = userDao.getUser(login_username.text.toString())
                if(tempUser.password.equals(login_password.text.toString()))  {
                    Toast.makeText(baseContext,"Login successful",Toast.LENGTH_SHORT).show()
                    count = 0
                }
                else{
                    if(count<3){
                        Toast.makeText(baseContext,"Invalid Username Or Password",Toast.LENGTH_SHORT).show()
                        count++
                    }
                    else{
                        Toast.makeText(baseContext,"Failed, Log in disabled",Toast.LENGTH_SHORT).show()
                        logInButton.isEnabled = false
                    }
                }
            }
            catch (e: Exception) {
                Toast.makeText(baseContext, "Invalid Username", Toast.LENGTH_SHORT).show()
            }
        }

        login_to_signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}

AndroidManifest.xml
<activity android:name=".LoginActivity">
        </activity>

User.kt

package com.example.signup

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val username: String,
    val password: String?
)

UserDAO.kt
package com.example.signup

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao    //Data Access object
interface UserDao {
    @Query("SELECT * FROM user WHERE username == :username")
    fun getUser(username: String): User
    @Insert
    fun insert(user: User)
}

AppDB.kt
package com.example.signup

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun userDao(): UserDao
}

build.gradle

plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-android-extensions'
    id 'kotlin-kapt'

}

android {
    compileSdk 32

    defaultConfig {
        applicationId "com.example.login"
        minSdk 29
        targetSdk 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {

    implementation "androidx.room:room-runtime:2.2.6"
    kapt "androidx.room:room-compiler:2.2.6"
    implementation "androidx.room:room-ktx:2.2.6"
    implementation 'androidx.core:core-ktx:1.7.0'
    //implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}