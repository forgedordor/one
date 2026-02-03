package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kin {
    public static float a(kio kioVar, float f) {
        return f / kioVar.ed();
    }

    public static float b(kio kioVar, int i) {
        return i / kioVar.ed();
    }

    public static float c(kio kioVar, long j) {
        if (!kjn.b(kjl.c(j), 4294967296L)) {
            kiz.b("Only Sp can convert to Px");
        }
        return kioVar.en(kioVar.eg(j));
    }

    public static float d(kio kioVar, float f) {
        return f * kioVar.ed();
    }

    public static int e(kio kioVar, long j) {
        return Math.round(kioVar.em(j));
    }

    public static int f(kio kioVar, float f) {
        float fEn = kioVar.en(f);
        return Float.isInfinite(fEn) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(fEn);
    }

    public static long g(kio kioVar, long j) {
        if (j != 9205357640488583168L) {
            return kis.a(kioVar.eh(Float.intBitsToFloat((int) (j >> 32))), kioVar.eh(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long h(kio kioVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fEn = kioVar.en(kiw.b(j));
        float fEn2 = kioVar.en(kiw.a(j));
        return (Float.floatToRawIntBits(fEn) << 32) | (Float.floatToRawIntBits(fEn2) & 4294967295L);
    }

    public static long i(kio kioVar, float f) {
        return kioVar.es(kioVar.eh(f));
    }
}
