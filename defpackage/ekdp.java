package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdp extends ekdr {
    static final ekdr g(int i) {
        return i < 0 ? ekdr.c : i > 0 ? ekdr.d : ekdr.b;
    }

    @Override // defpackage.ekdr
    public final int a() {
        return 0;
    }

    @Override // defpackage.ekdr
    public final ekdr b(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.ekdr
    public final ekdr c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.ekdr
    public final ekdr d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.ekdr
    public final ekdr e(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.ekdr
    public final ekdr f(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}
