package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbts extends fbqm {
    public final fbqm a;
    public final Context b;
    public final ConnectivityManager c;
    private final Object d = new Object();
    private Runnable e;

    public fbts(fbqm fbqmVar, Context context) {
        this.a = fbqmVar;
        this.b = context;
        if (context == null) {
            this.c = null;
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = connectivityManager;
        try {
            if (connectivityManager != null) {
                fbtq fbtqVar = new fbtq(this);
                connectivityManager.registerDefaultNetworkCallback(fbtqVar);
                this.e = new fbto(this, fbtqVar);
            } else {
                fbtr fbtrVar = new fbtr(this);
                context.registerReceiver(fbtrVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.e = new fbtp(this, fbtrVar);
            }
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // defpackage.fbnd
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar) {
        return this.a.a(fbrkVar, fbncVar);
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.fbqm
    public final fbqm d() {
        synchronized (this.d) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
        return this.a.d();
    }

    @Override // defpackage.fbqm
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.fbqm
    public final boolean f(TimeUnit timeUnit) {
        return this.a.f(timeUnit);
    }

    @Override // defpackage.fbqm
    public final fbnv g() {
        return this.a.g();
    }
}
