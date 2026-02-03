package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrq {
    public static final dcmc a = new dcmc("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        dbrs.a(context).b();
        Iterator it = dcfq.a().iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        synchronized (dchp.c) {
            dchp dchpVar = dchp.d;
            if (dchpVar != null) {
                dchpVar.k.incrementAndGet();
                Handler handler = dchpVar.o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
