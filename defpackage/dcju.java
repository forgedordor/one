package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcju extends ddmy {
    final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcju(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
    }

    private static final void a(Message message) {
        dcjv dcjvVar = (dcjv) message.obj;
        if (dcjvVar != null) {
            dcjvVar.e();
        }
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        BaseGmsClient baseGmsClient = this.a;
        if (baseGmsClient.r.get() != message.arg1) {
            if (c(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !baseGmsClient.q()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            baseGmsClient.o = new ConnectionResult(message.arg2);
            if (!baseGmsClient.p && !TextUtils.isEmpty(baseGmsClient.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.c());
                    BaseGmsClient baseGmsClient2 = this.a;
                    if (!baseGmsClient2.p) {
                        baseGmsClient2.gp(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            BaseGmsClient baseGmsClient3 = this.a;
            ConnectionResult connectionResult = baseGmsClient3.o;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            baseGmsClient3.i.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            BaseGmsClient baseGmsClient4 = this.a;
            ConnectionResult connectionResult2 = baseGmsClient4.o;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            baseGmsClient4.i.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.i.a(new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            BaseGmsClient baseGmsClient5 = this.a;
            baseGmsClient5.gp(5, null);
            dckm dckmVar = baseGmsClient5.s;
            if (dckmVar != null) {
                dckmVar.a.onConnectionSuspended(message.arg2);
            }
            int i = message.arg2;
            baseGmsClient5.K();
            baseGmsClient5.F(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.p()) {
            a(message);
            return;
        }
        if (!c(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        dcjv dcjvVar = (dcjv) message.obj;
        synchronized (dcjvVar) {
            obj = dcjvVar.d;
            if (dcjvVar.e) {
                Log.w("GmsClient", a.b(dcjvVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            dcjvVar.c();
        }
        synchronized (dcjvVar) {
            dcjvVar.e = true;
        }
        dcjvVar.e();
    }
}
