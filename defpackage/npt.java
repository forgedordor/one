package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npt extends nne {
    public npt(final noc nocVar, int i, long j, long j2) {
        long j3;
        nocVar.getClass();
        nnb nnbVar = new nnb() { // from class: npr
            @Override // defpackage.nnb
            public final long a(long j4) {
                return nocVar.b(j4);
            }
        };
        nps npsVar = new nps(nocVar, i);
        long jA = nocVar.a();
        long j4 = nocVar.j;
        int i2 = nocVar.d;
        if (i2 > 0) {
            j3 = ((i2 + nocVar.c) / 2) + 1;
        } else {
            int i3 = nocVar.a;
            long j5 = 4096;
            if (i3 == nocVar.b && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * nocVar.g) * nocVar.h) / 8) + 64;
        }
        super(nnbVar, npsVar, jA, j4, j, j2, j3, Math.max(6, nocVar.c));
    }
}
