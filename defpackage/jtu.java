package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtu implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    public jtu(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.b.compare(((jsl) obj).b, ((jsl) obj2).b);
    }
}
