package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esah {
    private static WeakReference a;

    public static synchronized esah a(Context context) {
        dclh.m(context);
        WeakReference weakReference = a;
        esah esahVar = weakReference == null ? null : (esah) weakReference.get();
        if (esahVar != null) {
            return esahVar;
        }
        esbj esbjVar = new esbj(context.getApplicationContext());
        a = new WeakReference(esbjVar);
        return esbjVar;
    }
}
