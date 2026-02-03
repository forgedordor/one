package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdwa extends fdvt {
    protected final fdpl d;

    public fdwa(fdpl fdplVar, fcyh fcyhVar, int i, int i2) {
        super(fcyhVar, i, i2);
        this.d = fdplVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // defpackage.fdvt, defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L53
            fcyh r0 = r6.u()
            fcyh r1 = r4.a
            fcyh r1 = defpackage.fdjn.a(r0, r1)
            boolean r2 = defpackage.fdbq.f(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r4.g(r5, r6)
            fcyl r6 = defpackage.fcyl.a
            if (r5 != r6) goto L5c
            return r5
        L1e:
            fcxz r2 = defpackage.fcya.k
            fcyf r3 = r1.get(r2)
            fcyf r0 = r0.get(r2)
            boolean r0 = defpackage.fdbq.f(r3, r0)
            if (r0 == 0) goto L53
            fcyh r0 = r6.u()
            boolean r2 = r5 instanceof defpackage.fdxf
            if (r2 != 0) goto L40
            boolean r2 = r5 instanceof defpackage.fdwy
            if (r2 != 0) goto L40
            fdxj r2 = new fdxj
            r2.<init>(r5, r0)
            r5 = r2
        L40:
            fdvz r0 = new fdvz
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r2 = defpackage.fdzp.a(r1)
            java.lang.Object r5 = defpackage.fdvu.a(r1, r5, r2, r0, r6)
            fcyl r6 = defpackage.fcyl.a
            if (r5 != r6) goto L5c
            return r5
        L53:
            java.lang.Object r5 = defpackage.fdvt.h(r4, r5, r6)
            fcyl r6 = defpackage.fcyl.a
            if (r5 != r6) goto L5c
            return r5
        L5c:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdwa.a(fdpm, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdvt
    protected final Object b(fdos fdosVar, fcxy fcxyVar) {
        Object objG = g(new fdxf(fdosVar), fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    protected abstract Object g(fdpm fdpmVar, fcxy fcxyVar);

    @Override // defpackage.fdvt
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
