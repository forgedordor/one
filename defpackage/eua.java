package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eua {
    public static final etd a = new etd(fcvo.a, 0, 0, 0, dwm.b, 0, 0, 0, eav.a, new ety(), fdjy.b(fcyi.a));
    public static final etz b = new etz();

    public static final long a(etd etdVar, int i) {
        int i2 = etdVar.c;
        int i3 = i2 + etdVar.b;
        long jA = etdVar.a();
        long j = etdVar.d;
        long j2 = i2;
        int iB = (int) (etdVar.e == dwm.b ? etdVar.b() >> 32 : etdVar.b() & 4294967295L);
        return fddu.j(((((i * i3) + jA) + j) - j2) - (iB - fddu.i(etdVar.n.a(iB, r2, etdVar.a(), r4, i - 1, i), 0, iB)), 0L);
    }

    public static final etv b(final int i, final fdae fdaeVar, hml hmlVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        hyr hyrVar = erl.a;
        boolean zB = hmlVar.B(i) | hmlVar.A(0.0f) | hmlVar.D(fdaeVar);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zB || objS == hmk.a) {
            objS = new fdae() { // from class: etw
                @Override // defpackage.fdae
                public final Object invoke() {
                    etd etdVar = eua.a;
                    return new erl(i, 0.0f, fdaeVar);
                }
            };
            hmwVar.af(objS);
        }
        erl erlVar = (erl) hxy.b(objArr, hyrVar, (fdae) objS, hmlVar, 0);
        erlVar.b.b(fdaeVar);
        return erlVar;
    }
}
