package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eae {
    public static final int a(kio kioVar, float f) {
        if (Math.abs(f) < kioVar.en(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static final int b(eja ejaVar) {
        return (int) (ejaVar.h() == dwm.a ? ejaVar.g() & 4294967295L : ejaVar.g() >> 32);
    }
}
