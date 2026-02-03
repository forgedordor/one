package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukc {
    private static final Object b = new Object();
    private static final WeakHashMap c = new WeakHashMap();
    public final eukg a;

    public eukc(Context context) {
        int i = eujn.b;
        this.a = new eujn(context, iy$$ExternalSyntheticApiModelOutline1.m512m(context.getSystemService("textclassification")).getTextClassifier());
    }

    public static eukc a(Context context) {
        eukc eukcVar;
        synchronized (b) {
            WeakHashMap weakHashMap = c;
            WeakReference weakReference = (WeakReference) weakHashMap.get(context);
            eukcVar = weakReference != null ? (eukc) weakReference.get() : null;
            if (eukcVar == null) {
                eukcVar = new eukc(context);
                weakHashMap.put(context, new WeakReference(eukcVar));
            }
        }
        return eukcVar;
    }
}
