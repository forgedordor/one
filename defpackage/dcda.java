package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcda extends ddmy {
    final /* synthetic */ dcdb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcda(dcdb dcdbVar, Looper looper) {
        super(looper);
        this.a = dcdbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        dcdb dcdbVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new dcca());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                dcdbVar.g = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                dcdbVar.f = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (Log.isLoggable("Rpc", 3)) {
                Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                return;
            }
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = dcdb.b.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                dcdbVar.c(strGroup, extras);
                return;
            }
            return;
        }
        String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
            return;
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
        }
        if (!stringExtra2.startsWith("|")) {
            cvw cvwVar = dcdbVar.c;
            synchronized (cvwVar) {
                for (int i = 0; i < cvwVar.d; i++) {
                    dcdbVar.c((String) cvwVar.d(i), intent2.getExtras());
                }
            }
            return;
        }
        String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
            Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
            return;
        }
        String str = strArrSplit[2];
        String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(":")) {
            strSubstring = strSubstring.substring(1);
        }
        dcdbVar.c(str, intent2.putExtra("error", strSubstring).getExtras());
    }
}
