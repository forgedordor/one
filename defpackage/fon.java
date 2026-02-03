package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fon {
    public static final float a(hml hmlVar) {
        return d(0.38f, 0.38f, hmlVar);
    }

    public static final float b(hml hmlVar) {
        return d(1.0f, 0.87f, hmlVar);
    }

    public static final float c(hml hmlVar) {
        return d(0.74f, 0.6f, hmlVar);
    }

    private static final float d(float f, float f2, hml hmlVar) {
        long j = ((ije) hmlVar.e(C0001for.a)).i;
        return (!fqq.a(hmlVar).m() ? ((double) ijg.a(j)) >= 0.5d : ((double) ijg.a(j)) <= 0.5d) ? f : f2;
    }
}
