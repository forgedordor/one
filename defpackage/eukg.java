package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eukg {
    static {
        int i = eukd.a;
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Must not be on main thread");
        }
    }

    public eukb a(euka eukaVar) {
        c();
        return eukb.a;
    }

    public eult b(eulp eulpVar) {
        throw null;
    }
}
