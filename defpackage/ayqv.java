package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqv implements Comparator {
    final /* synthetic */ Comparator a;

    public ayqv(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : fcxl.a(Long.valueOf(((bojh) obj).x()), Long.valueOf(((bojh) obj2).x()));
    }
}
