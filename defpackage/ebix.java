package defpackage;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebix {
    public static final dhip a = new dhip("MsrpConnection");
    public ebjl d;
    public ebjx e;
    public final ebfw f;
    public final Context g;
    public final int h;
    private OutputStream i = null;
    public InputStream b = null;
    public final Object c = new Object();

    public ebix(Context context, ebfw ebfwVar, int i) {
        this.g = context;
        this.f = ebfwVar;
        this.h = i;
    }

    public final OutputStream a() {
        OutputStream outputStream = this.i;
        if (outputStream != null) {
            return outputStream;
        }
        throw new IllegalStateException("expected outputStream to be non-null");
    }

    public final void b() {
        ebfw ebfwVar = this.f;
        ebfwVar.d();
        Object obj = this.c;
        synchronized (obj) {
            this.b = new BufferedInputStream(ebfwVar.a(), 4096);
            this.i = ebfwVar.b();
            obj.notifyAll();
        }
    }

    final boolean c() {
        int i = this.h;
        return i == 1 || i == 3;
    }

    public final String toString() {
        int i = this.h;
        return "MsrpConnection of type ".concat(i != 1 ? i != 2 ? i != 3 ? "SECURE_SERVER_CONNECTION" : "SECURE_CLIENT_CONNECTION" : "INSECURE_SERVER_CONNECTION" : "INSECURE_CLIENT_CONNECTION");
    }
}
