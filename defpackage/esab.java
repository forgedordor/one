package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class esab {
    private static WeakReference a;

    public static synchronized esab d(Context context) {
        dclh.m(context);
        WeakReference weakReference = a;
        esab esabVar = weakReference == null ? null : (esab) weakReference.get();
        if (esabVar != null) {
            return esabVar;
        }
        esbh esbhVar = new esbh(context.getApplicationContext());
        a = new WeakReference(esbhVar);
        return esbhVar;
    }

    public abstract defn a(String... strArr);

    public abstract defn b();

    public abstract defn c(esal... esalVarArr);
}
