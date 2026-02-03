package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nei extends ngq {
    public neg d;
    private final boolean f;
    private final mck g;
    private final mcj h;
    private nef i;
    private boolean j;
    private boolean k;
    private boolean l;

    public nei(nep nepVar, boolean z) {
        boolean z2;
        super(nepVar);
        if (z) {
            nepVar.s();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.g = new mck();
        this.h = new mcj();
        nepVar.r();
        this.d = neg.s(nepVar.F());
    }

    private final Object H(Object obj) {
        neg negVar = this.d;
        Object obj2 = neg.c;
        return (negVar.d == null || !obj.equals(neg.c)) ? obj : this.d.d;
    }

    private final boolean I(long j) {
        nef nefVar = this.i;
        int iA = this.d.a(nefVar.a.a);
        if (iA == -1) {
            return false;
        }
        long j2 = this.d.n(iA, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        nefVar.e = j;
        return true;
    }

    @Override // defpackage.ngq
    protected final nen C(nen nenVar) {
        neg negVar = this.d;
        Object obj = neg.c;
        Object obj2 = negVar.d;
        Object obj3 = nenVar.a;
        if (obj2 != null && this.d.d.equals(obj3)) {
            obj3 = neg.c;
        }
        return nenVar.a(obj3);
    }

    @Override // defpackage.ngq
    public final void D() {
        if (this.f) {
            return;
        }
        this.j = true;
        G();
    }

    @Override // defpackage.ngq, defpackage.nep
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final nef w(nen nenVar, niu niuVar, long j) {
        nef nefVar = new nef(nenVar, niuVar, j);
        mee.c(nefVar.c == null);
        nefVar.c = this.e;
        if (this.k) {
            nefVar.m(nenVar.a(H(nenVar.a)));
            return nefVar;
        }
        this.i = nefVar;
        if (!this.j) {
            this.j = true;
            G();
        }
        return nefVar;
    }

    @Override // defpackage.ndq, defpackage.ndd
    public final void n() {
        this.k = false;
        this.j = false;
        super.n();
    }

    @Override // defpackage.ngq, defpackage.ndd, defpackage.nep
    public final void q(mbo mboVar) {
        if (this.l) {
            this.d = this.d.r(new ngm(this.d.b, mboVar));
        } else {
            this.d = neg.s(mboVar);
        }
        this.e.q(mboVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // defpackage.ngq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void u(defpackage.mcl r12) {
        /*
            r11 = this;
            boolean r0 = r11.k
            r1 = 0
            if (r0 == 0) goto L18
            neg r0 = r11.d
            neg r12 = r0.r(r12)
            r11.d = r12
            nef r12 = r11.i
            if (r12 == 0) goto L9c
            long r2 = r12.e
            r11.I(r2)
            goto L9c
        L18:
            boolean r0 = r12.q()
            if (r0 == 0) goto L36
            boolean r0 = r11.l
            if (r0 == 0) goto L29
            neg r0 = r11.d
            neg r12 = r0.r(r12)
            goto L33
        L29:
            java.lang.Object r0 = defpackage.mck.a
            java.lang.Object r2 = defpackage.neg.c
            neg r3 = new neg
            r3.<init>(r12, r0, r2)
            r12 = r3
        L33:
            r11.d = r12
            goto L9c
        L36:
            mck r3 = r11.g
            r0 = 0
            r12.p(r0, r3)
            long r4 = r3.l
            java.lang.Object r8 = r3.b
            nef r2 = r11.i
            if (r2 == 0) goto L61
            neg r6 = r11.d
            mcj r7 = r11.h
            nen r9 = r2.a
            java.lang.Object r9 = r9.a
            r6.o(r9, r7)
            long r6 = r7.e
            long r9 = r2.b
            long r6 = r6 + r9
            neg r2 = r11.d
            mck r0 = r2.p(r0, r3)
            long r9 = r0.l
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L61
            goto L62
        L61:
            r6 = r4
        L62:
            mcj r4 = r11.h
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.l(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.l
            if (r12 == 0) goto L7f
            neg r12 = r11.d
            neg r12 = r12.r(r2)
            goto L84
        L7f:
            neg r12 = new neg
            r12.<init>(r2, r8, r0)
        L84:
            r11.d = r12
            nef r12 = r11.i
            if (r12 == 0) goto L9c
            boolean r0 = r11.I(r3)
            if (r0 == 0) goto L9c
            nen r12 = r12.a
            java.lang.Object r0 = r12.a
            java.lang.Object r0 = r11.H(r0)
            nen r1 = r12.a(r0)
        L9c:
            r12 = 1
            r11.l = r12
            r11.k = r12
            neg r12 = r11.d
            r11.l(r12)
            if (r1 == 0) goto Lb0
            nef r12 = r11.i
            defpackage.mee.f(r12)
            r12.m(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nei.u(mcl):void");
    }

    @Override // defpackage.ngq, defpackage.nep
    public final void v(nel nelVar) {
        nef nefVar = (nef) nelVar;
        if (nefVar.d != null) {
            nep nepVar = nefVar.c;
            mee.f(nepVar);
            nepVar.v(nefVar.d);
        }
        if (nelVar == this.i) {
            this.i = null;
        }
    }
}
