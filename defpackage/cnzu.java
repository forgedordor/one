package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnzu {
    public static final int a(cnxt cnxtVar) {
        int iLongValue;
        Long l = (Long) cnrt.c.e();
        Object objE = cnrt.g.e();
        objE.getClass();
        int iF = fddu.f(((Number) objE).intValue(), 1);
        Object objE2 = cnrt.f.e();
        objE2.getClass();
        int iF2 = fddu.f(((Number) objE2).intValue(), iF + 1);
        if (cnxtVar != null) {
            iLongValue = (int) (cnxtVar.e * (l.longValue() / cnxtVar.f.toMillis()));
        } else {
            iLongValue = iF;
        }
        return fddu.i(iLongValue, iF, iF2);
    }
}
