package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foc {
    public static final void a(ics icsVar, long j, float f, fdat fdatVar, hml hmlVar, int i, int i2) {
        hml hmlVar2;
        long jA;
        if ((i2 & 1) != 0) {
            icsVar = ics.e;
        }
        ics icsVar2 = icsVar;
        eve eveVar = (i2 & 2) != 0 ? fqq.b(hmlVar).b : null;
        if ((i2 & 4) != 0) {
            j = fqq.a(hmlVar).l();
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            hmlVar2 = hmlVar;
            jA = fof.a(j2, hmlVar2);
        } else {
            hmlVar2 = hmlVar;
            jA = 0;
        }
        long j3 = jA;
        if ((i2 & 32) != 0) {
            f = 1.0f;
        }
        fuh.a(icsVar2, eveVar, j2, j3, f, fdatVar, hmlVar2, (i & 524286) | 1572864, 0);
    }
}
