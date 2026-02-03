package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class deph extends Service implements denq, deoc, deoi, deoh, deog, deng, denh, denc, denb, deod {
    public ComponentName E;
    public deot F;
    public Intent G;
    public boolean I;
    private IBinder a;
    private Looper b;
    public final Object H = new Object();
    public final depx J = new depx(new deor(this));

    public defn d(String str, String str2, byte[] bArr) {
        throw null;
    }

    public void i(ChannelClient.Channel channel) {
        throw null;
    }

    public void j(denu denuVar) {
        throw null;
    }

    public void k(MessageEventParcelable messageEventParcelable) {
        throw null;
    }

    public void l(ChannelClient.Channel channel) {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            goto L74
        L4:
            java.lang.String r0 = r4.getAction()
            if (r0 == 0) goto L74
            int r1 = r0.hashCode()
            r2 = 3
            switch(r1) {
                case -1487371046: goto L4f;
                case -1140095138: goto L45;
                case -786751258: goto L3b;
                case 705066793: goto L31;
                case 915816236: goto L27;
                case 1003809169: goto L1d;
                case 1460975593: goto L13;
                default: goto L12;
            }
        L12:
            goto L59
        L13:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 0
            goto L5a
        L1d:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = r2
            goto L5a
        L27:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L31:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 2
            goto L5a
        L3b:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 5
            goto L5a
        L45:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 4
            goto L5a
        L4f:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r0 = 6
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L71;
                case 4: goto L71;
                case 5: goto L71;
                case 6: goto L71;
                default: goto L5d;
            }
        L5d:
            java.lang.String r0 = "WearableLS"
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L74
            java.lang.String r1 = "onBind: Provided bind intent ("
            java.lang.String r2 = ") is not allowed"
            java.lang.String r4 = defpackage.a.b(r4, r1, r2)
            android.util.Log.d(r0, r4)
            goto L74
        L71:
            android.os.IBinder r4 = r3.a
            return r4
        L74:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deph.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.E = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(String.valueOf(this.E))));
        }
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.b = handlerThread.getLooper();
        }
        this.F = new deot(this, this.b);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.G = intent;
        intent.setComponent(this.E);
        this.a = new depg(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(String.valueOf(this.E))));
        }
        synchronized (this.H) {
            this.I = true;
            deot deotVar = this.F;
            if (deotVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.E));
            }
            deotVar.getLooper().quit();
            deotVar.a("quit");
        }
        super.onDestroy();
    }

    @Override // defpackage.denh
    public final void m(Channel channel) {
    }

    @Override // defpackage.denh
    public final void n(Channel channel) {
    }

    @Override // defpackage.denh
    public final void o(Channel channel) {
    }

    @Override // defpackage.denh
    public final void p(Channel channel) {
    }
}
