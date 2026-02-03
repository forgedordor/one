package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class hue {
    public static final void a(huf hufVar, int i, Object obj) {
        hufVar.e[(hufVar.f - hufVar.a[hufVar.b - 1].c) + i] = obj;
    }

    public static final void b(huf hufVar, int i, Object obj, int i2, Object obj2) {
        int i3 = hufVar.f - hufVar.a[hufVar.b - 1].c;
        Object[] objArr = hufVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(huf hufVar, Object obj, Object obj2, Object obj3) {
        int i = hufVar.f - hufVar.a[hufVar.b - 1].c;
        Object[] objArr = hufVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
