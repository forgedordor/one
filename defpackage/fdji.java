package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdji {
    public static final Object a(Object obj, fcxy fcxyVar) {
        if (!(obj instanceof fdjg)) {
            return obj;
        }
        Throwable thA = ((fdjg) obj).b;
        if (fdkb.b && (fcxyVar instanceof fcyw)) {
            thA = fdzh.a(thA, (fcyw) fcxyVar);
        }
        return fctl.a(thA);
    }

    public static final Object b(Object obj) {
        Throwable thC = fctk.c(obj);
        return thC == null ? obj : new fdjg(thC);
    }
}
