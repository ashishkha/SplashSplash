package project.async.com.event

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.content.Context.NOTIFICATION_SERVICE
import androidx.core.content.ContextCompat.getSystemService
import android.app.NotificationManager
import android.R
import android.media.RingtoneManager
import android.app.PendingIntent
import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.example.splashsplash.NotiActivity


class FirebaseToken : FirebaseMessagingService() {

    companion object {
        private val TAG = FirebaseToken::class.qualifiedName
    }

    /*override fun onNewToken(p0: String?) {
        super.onNewToken(p0)

        Log.d(TAG, "Token ak:" + p0)
    }

    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d(TAG, "Token ak message received:" + p0)
    }*/

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d("TAG", "called ak chekc:" + p0)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        Log.d("TAG","called ak chekc data:"+remoteMessage.notification?.body)

       /* var intent = Intent(this, NotiActivity::class.java)
        intent.putExtra("intent_backchat", 1)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        var pendingIntent = PendingIntent.getActivity(this, 0 *//* Request code *//*, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        startActivity(intent)*/

        /*if (foregroud) { //app in foreground
            intent = Intent(this, ChatAdminActivity::class.java)
            intent.putExtra("intent_backchat", 1)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            pendingIntent = PendingIntent.getActivity(this, Integer.valueOf(random) *//* Request code *//*, intent, PendingIntent.FLAG_UPDATE_CURRENT)
            startActivity(intent)      // to directly open activity if app is foreground
        } else { //app in background
            intent = Intent(this, ChatAdminActivity::class.java)
            intent.putExtra("intent_backchat", 1)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            pendingIntent = PendingIntent.getActivity(this, Integer.valueOf(random) *//* Request code *//*, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        }*/

        var intent = Intent(this, NotiActivity::class.java)
        intent.putExtra("intent_backchat", 1)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        var pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        startActivity(intent)      // to directly open activity if app is foreground

    }

}