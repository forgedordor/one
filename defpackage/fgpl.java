package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpl implements fgqf, fgqd {
    protected final int a;
    protected final int b;
    private final fgmu c;

    protected fgpl(fgmu fgmuVar, int i, int i2) {
        this.c = fgmuVar;
        this.a = i;
        this.b = i2 > 18 ? 18 : i2;
    }

    @Override // defpackage.fgqd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        fgms fgmsVarA = this.c.a(fgpzVar.a);
        int iMin = Math.min(this.b, charSequence.length() - i);
        long jC = fgmsVarA.q().c() * 10;
        int i2 = 0;
        long j = 0;
        while (i2 < iMin) {
            char cCharAt = charSequence.charAt(i + i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            jC /= 10;
            j += (cCharAt - '0') * jC;
            i2++;
        }
        long j2 = j / 10;
        if (i2 == 0 || j2 > 2147483647L) {
            return ~i;
        }
        int i3 = i + i2;
        fgpzVar.c().c(new fgoy(fgmu.x, fgow.a, fgmsVarA.q()), (int) j2);
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[ADDED_TO_REGION, LOOP:4: B:48:0x00d0->B:49:0x00d2, LOOP_START, PHI: r12
      0x00d0: PHI (r12v5 int) = (r12v4 int), (r12v6 int) binds: [B:47:0x00ce, B:49:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.fgqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Appendable r7, long r8, defpackage.fgmq r10, int r11, defpackage.fgmz r12, java.util.Locale r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgpl.d(java.lang.Appendable, long, fgmq, int, fgmz, java.util.Locale):void");
    }
}
