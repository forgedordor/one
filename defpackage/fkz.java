package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkz implements Comparator {
    final /* synthetic */ cuk a;

    public fkz(cuk cukVar) {
        this.a = cukVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        cuk cukVar = this.a;
        return fcxl.a(Integer.valueOf(cukVar.b(jLongValue)), Integer.valueOf(cukVar.b(((Number) obj2).longValue())));
    }
}
