package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcz {
    public static final float a(jyi jyiVar, int i) {
        if (i < 0 || jyiVar.a.a.a() == 0) {
            return 0.0f;
        }
        jvc jvcVar = jyiVar.b;
        int iMin = Math.min(jvcVar.f(i), Math.min(jvcVar.b - 1, jvcVar.f - 1));
        if (i <= jvcVar.e(iMin, false)) {
            return jvcVar.b(iMin);
        }
        return 0.0f;
    }
}
