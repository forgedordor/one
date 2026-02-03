package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephn extends ephf {
    public etfp a;

    public ephn(etfp etfpVar) {
        this.a = etfpVar;
    }

    @Override // defpackage.ephf
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.ephf
    public final long b() {
        return this.a.d;
    }

    @Override // defpackage.ephf
    public final String c() {
        return this.a.h;
    }

    @Override // defpackage.ephf
    public final void d(long j) {
        etfm etfmVar = (etfm) etfp.a.createBuilder(this.a);
        etfmVar.copyOnWrite();
        etfp etfpVar = (etfp) etfmVar.instance;
        etfpVar.b |= 2;
        etfpVar.d = j;
        this.a = (etfp) etfmVar.build();
    }

    @Override // defpackage.ephf
    public final boolean e() {
        return (this.a.b & 1) != 0;
    }

    @Override // defpackage.ephf
    public final boolean f() {
        return (this.a.b & 64) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    @Override // defpackage.ephf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            r11 = this;
            etfp r0 = r11.a
            int r0 = r0.i
            int r0 = defpackage.etfo.a(r0)
            r1 = 1
            if (r0 != 0) goto Lc
            r0 = r1
        Lc:
            java.lang.String r2 = "FROM_DEFAULT_COUNTRY"
            java.lang.String r3 = "FROM_NUMBER_WITHOUT_PLUS_SIGN"
            java.lang.String r4 = "FROM_NUMBER_WITH_IDD"
            java.lang.String r5 = "FROM_NUMBER_WITH_PLUS_SIGN"
            java.lang.String r6 = "UNSPECIFIED"
            r7 = 2
            if (r0 == r1) goto L31
            if (r0 == r7) goto L2f
            r8 = 6
            if (r0 == r8) goto L2d
            r8 = 11
            if (r0 == r8) goto L2b
            r8 = 21
            if (r0 == r8) goto L29
            java.lang.String r0 = "null"
            goto L32
        L29:
            r0 = r2
            goto L32
        L2b:
            r0 = r3
            goto L32
        L2d:
            r0 = r4
            goto L32
        L2f:
            r0 = r5
            goto L32
        L31:
            r0 = r6
        L32:
            int r8 = r0.hashCode()
            r9 = 4
            r10 = 3
            switch(r8) {
                case -1655163414: goto L5c;
                case -702235158: goto L54;
                case 526786327: goto L4c;
                case 1308390705: goto L44;
                case 1337199811: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L64
        L3c:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L64
            r0 = r9
            goto L65
        L44:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L64
            r0 = r7
            goto L65
        L4c:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L64
            r0 = 0
            goto L65
        L54:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L64
            r0 = r10
            goto L65
        L5c:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L64
            r0 = r1
            goto L65
        L64:
            r0 = -1
        L65:
            if (r0 == 0) goto L7a
            if (r0 == r1) goto L79
            if (r0 == r7) goto L78
            if (r0 == r10) goto L77
            if (r0 != r9) goto L71
            r0 = 5
            return r0
        L71:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L77:
            return r9
        L78:
            return r10
        L79:
            return r7
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ephn.g():int");
    }
}
