package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqb {
    private static final cczi b = cdag.e(cdag.b, "tachyon_streaming_grpc_deadline_seconds", 900);
    static final cczi a = cdag.e(cdag.b, "tachyon_grpc_deadline_seconds", 30);

    public static fcrn a(fcrn fcrnVar, boolean z, int i) {
        return z ? fcrnVar.n(estq.b, Integer.valueOf(i)) : fcrnVar;
    }

    public static fcrn b(fcrn fcrnVar, boolean z) {
        if (((Boolean) ccze.h.e()).booleanValue()) {
            fcrnVar = fcrnVar.j("gzip");
        }
        int iIntValue = z ? ((Integer) b.e()).intValue() : ((Integer) a.e()).intValue();
        return iIntValue > 0 ? fcrnVar.k(iIntValue, TimeUnit.SECONDS) : fcrnVar;
    }

    public static fcrn c(fcrn fcrnVar, fbrg fbrgVar, boolean z) {
        return b(fcrnVar.m(new fcrz(fbrgVar)), z);
    }

    public static fcrn d(fcrn fcrnVar, fbrg fbrgVar, String str) {
        return b(fcrnVar.m(new fcrz(fbrgVar)).n(esoc.a, str), false);
    }
}
