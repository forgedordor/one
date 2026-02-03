package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpw {
    public static final void a(hre hreVar, List list, hpz hpzVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = hreVar.a((hlv) list.get(i));
            int iN = hreVar.n(hreVar.b, hreVar.h(iA));
            Object obj = iN < hreVar.c(hreVar.b, hreVar.h(iA + 1)) ? hreVar.c[hreVar.d(iN)] : hmk.a;
            hpx hpxVar = obj instanceof hpx ? (hpx) obj : null;
            if (hpxVar != null) {
                hpxVar.b = hpzVar;
            }
        }
    }
}
