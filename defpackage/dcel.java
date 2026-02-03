package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcel {
    public static final dcel a = new dcel(true, null, null);
    public final boolean b;
    final String c;
    final Throwable d;

    public dcel(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public String a() {
        return this.c;
    }

    public final void b() {
        if (this.b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.d;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        String str = "GoogleCertificatesRslt: " + a() + " (go/gsrlt)";
        Throwable th = this.d;
        if (th == null) {
            throw new SecurityException(str);
        }
        throw new SecurityException(str, th);
    }
}
