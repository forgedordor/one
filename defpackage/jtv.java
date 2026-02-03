package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtv implements Comparator {
    final /* synthetic */ Comparator a;

    public jtv(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : fcxl.a(Integer.valueOf(((jsl) obj).e), Integer.valueOf(((jsl) obj2).e));
    }
}
