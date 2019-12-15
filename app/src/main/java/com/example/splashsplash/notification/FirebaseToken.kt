package project.async.com.event

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


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
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
    }
}