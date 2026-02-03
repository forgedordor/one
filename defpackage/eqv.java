package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqv implements epi, eqy, epg {
    public boolean a;
    final /* synthetic */ eqw b;
    private final int c;
    private final eqx d;
    private final erc e;
    private final fdap f;
    private kil g;
    private izh h;
    private boolean i;
    private boolean j;
    private Object k;
    private boolean l;
    private equ m;
    private boolean n;
    private long o;
    private long p;
    private long q;

    public eqv(eqw eqwVar, int i, long j, eqx eqxVar, erc ercVar, fdap fdapVar) {
        this(eqwVar, i, eqxVar, ercVar, fdapVar);
        this.g = new kil(j);
    }

    private final void f() {
        izh izhVar = this.h;
        if (izhVar != null) {
            izhVar.b();
        }
        this.h = null;
        this.m = null;
    }

    private final void g() {
        int i = fdhq.a;
        long jB = fdhq.b();
        long jC = fdhr.c(jB, this.q);
        long jI = fdhi.i(jC);
        if (!fdhi.r(jC)) {
            jI = jI > 9223372036854L ? Long.MAX_VALUE : jI < -9223372036854L ? Long.MIN_VALUE : fdhk.d(jI);
        }
        this.p = jI;
        long j = this.o - jI;
        this.o = j;
        this.q = jB;
        kjv.a("compose:lazy:prefetch:available_time_nanos", j);
    }

    private final boolean h() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0197 A[Catch: all -> 0x01d2, TryCatch #0 {all -> 0x01d2, blocks: (B:73:0x014b, B:75:0x0153, B:77:0x015b, B:80:0x0164, B:82:0x0170, B:84:0x0186, B:83:0x0173, B:85:0x0188, B:86:0x018f, B:88:0x0197, B:90:0x01a1, B:92:0x01a5, B:95:0x01ac, B:96:0x01af, B:98:0x01b9, B:103:0x01c5), top: B:170:0x014b }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eoi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean i(defpackage.emp r19) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqv.i(emp):boolean");
    }

    private final boolean j(long j, long j2) {
        erc ercVar;
        if (this.n || ((ercVar = this.e) != null && ercVar.d())) {
            j2 = 0;
        }
        return j > j2;
    }

    @Override // defpackage.epi
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        f();
    }

    @Override // defpackage.epi
    public final void b() {
        this.n = true;
    }

    @Override // defpackage.epg
    public final int c() {
        izh izhVar = this.h;
        if (izhVar != null) {
            return izhVar.a();
        }
        return 0;
    }

    @Override // defpackage.epg
    public final void d(int i) {
        izh izhVar = this.h;
        if (izhVar != null) {
            izhVar.e(i);
        }
    }

    @Override // defpackage.eqy
    public final boolean e(emp empVar) {
        boolean zI;
        if (!this.b.d) {
            return false;
        }
        if (this.n) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zI = i(empVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zI = i(empVar);
        }
        kjv.a("compose:lazy:prefetch:execute:item", -1L);
        return zI;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.c + ", constraints = " + this.g + ", isComposed = " + h() + ", isMeasured = " + this.i + ", isCanceled = " + this.a + " }";
    }

    public eqv(eqw eqwVar, int i, eqx eqxVar, erc ercVar, fdap fdapVar) {
        this.b = eqwVar;
        this.c = i;
        this.d = eqxVar;
        this.e = ercVar;
        this.f = fdapVar;
        int i2 = fdhq.a;
        this.q = fdhq.b();
    }
}
