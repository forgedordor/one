package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddeq extends ddmy {
    final /* synthetic */ ddes a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddeq(ddes ddesVar, Looper looper) {
        super(looper);
        this.a = ddesVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        if (!(message.obj instanceof Intent)) {
            Log.w("InstanceID", "Dropping invalid message");
            return;
        }
        ddes ddesVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                ddesVar.i = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                ddesVar.h = (Messenger) parcelableExtra;
            }
        }
        ddesVar.d((Intent) message.obj);
    }
}
