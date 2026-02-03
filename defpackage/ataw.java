package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ataw {
    public static atav a(cbcw cbcwVar) {
        return cbcwVar.e() ? atav.SUCCESS : cbcwVar.f() ? atav.FAIL_RETRY : atav.FAIL_NO_RETRY;
    }

    public static cbcw b(atav atavVar) {
        int iOrdinal = atavVar.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? cbcw.k() : cbcw.m() : cbcw.i();
    }
}
