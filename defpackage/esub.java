package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esub {
    private final fcsu a;
    private final Context b;

    public esub(fcsu fcsuVar, Context context) {
        this.a = fcsuVar;
        this.b = context;
    }

    public final fbut a(boolean z) {
        HashMap map = new HashMap();
        if (z) {
            for (String str : ((Map) this.a.b()).keySet()) {
                Context context = this.b;
                Object obj = espi.a;
                fbus.b(str, new esph(context), map);
            }
        }
        return fbus.a(map);
    }
}
