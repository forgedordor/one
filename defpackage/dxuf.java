package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxuf {
    public static final String a(Object obj) {
        if (obj instanceof Iterable) {
            return b((Iterable) obj);
        }
        if (obj instanceof Object[]) {
            return b(fcur.G((Object[]) obj));
        }
        String strValueOf = String.valueOf(obj);
        return (obj == null || strValueOf.length() == 0 || fbcw.a.get().a()) ? strValueOf : String.valueOf(strValueOf.hashCode());
    }

    public static final String b(Iterable iterable) {
        iterable.getClass();
        return fcva.aF(iterable, null, "[", "]", new fdap() { // from class: dxue
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return dxuf.a(obj);
            }
        }, 25);
    }
}
