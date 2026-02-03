package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutj {
    public final dugs a;
    public final dunz b;
    public final ecev c;
    public final durk d;
    public final Context e;
    public final dtvq f;
    public final ejwi g;
    public final Executor h;

    public dutj(Context context, dugs dugsVar, dunz dunzVar, ecev ecevVar, durk durkVar, dtvq dtvqVar, ejwi ejwiVar, Executor executor) {
        this.e = context;
        this.a = dugsVar;
        this.b = dunzVar;
        this.c = ecevVar;
        this.d = durkVar;
        this.f = dtvqVar;
        this.g = ejwiVar;
        this.h = executor;
    }

    public static final String a(dtrw dtrwVar) {
        return dtrwVar.c + "|" + dtrwVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
