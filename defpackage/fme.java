package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fme extends fhw {
    private final kew e;
    private final fda f;

    public fme(kew kewVar, kel kelVar, fda fdaVar, fno fnoVar) {
        super(kewVar.b, kewVar.c, fdaVar != null ? fdaVar.a : null, kelVar, fnoVar);
        this.e = kewVar;
        this.f = fdaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int B(defpackage.fda r11, int r12) {
        /*
            r10 = this;
            ivy r0 = r11.b
            if (r0 == 0) goto L10
            ivy r1 = r11.c
            if (r1 == 0) goto Ld
            ihu r0 = defpackage.ivx.a(r1, r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L12
        L10:
            ihu r0 = defpackage.ihu.a
        L12:
            kel r1 = r10.a
            kew r2 = r10.e
            long r2 = r2.c
            int r2 = defpackage.jyo.a(r2)
            jyi r11 = r11.a
            int r2 = r1.a(r2)
            ihu r2 = r11.n(r2)
            float r3 = r2.b
            float r2 = r2.c
            long r4 = r0.b()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            float r12 = (float) r12
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r12
            int r12 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r12
            float r2 = r2 + r0
            int r12 = java.lang.Float.floatToRawIntBits(r2)
            long r8 = (long) r12
            r12 = 32
            long r2 = r3 << r12
            long r4 = r8 & r6
            long r2 = r2 | r4
            int r11 = r11.k(r2)
            int r11 = r1.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.B(fda, int):int");
    }

    public final void A() {
        fda fdaVar;
        if (f().length() <= 0 || (fdaVar = this.f) == null) {
            return;
        }
        int iB = B(fdaVar, -1);
        g(iB, iB);
    }

    public final kew x() {
        return kew.b(this.e, this.d, this.c, 4);
    }

    public final List y(fdap fdapVar) {
        if (!jyo.i(this.c)) {
            return fcva.g(new kde("", 0), new ket(jyo.d(this.c), jyo.d(this.c)));
        }
        kdm kdmVar = (kdm) fdapVar.invoke(this);
        if (kdmVar == null) {
            return null;
        }
        return fcva.b(kdmVar);
    }

    public final void z() {
        fda fdaVar;
        if (f().length() <= 0 || (fdaVar = this.f) == null) {
            return;
        }
        int iB = B(fdaVar, 1);
        g(iB, iB);
    }
}
