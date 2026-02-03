package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etem {
    private static etem c;
    public final etfk a;
    public final etfi b;
    private final etez d = new etez();
    private final etdu e;

    private etem(Context context) {
        etex etexVar = new etex(context.getAssets());
        this.e = etexVar;
        this.b = new etfi(new etfj("Metadata"), etexVar);
        this.a = new etfl(new etfj("ShortNums"), etexVar);
        new etfa(etexVar, etff.c());
    }

    public static etem a() {
        etem etemVar = c;
        if (etemVar != null) {
            return etemVar;
        }
        throw new IllegalStateException("Context not configured");
    }

    public static synchronized void b(Context context) {
        if (c != null) {
            throw new IllegalStateException("Context already configured");
        }
        c = new etem(context);
    }
}
