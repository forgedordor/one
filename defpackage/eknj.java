package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eknj implements eknh {
    public final boolean equals(Object obj) {
        if (obj instanceof eknh) {
            eknh eknhVar = (eknh) obj;
            if (a() == eknhVar.a() && ejwh.a(b(), eknhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object objB = b();
        return (objB == null ? 0 : objB.hashCode()) ^ a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(b());
        int iA = a();
        return iA == 1 ? strValueOf : a.f(iA, strValueOf, " x ");
    }
}
