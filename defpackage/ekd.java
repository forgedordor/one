package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekd extends icr implements jcd {
    public float a = 1.0f;
    public hsf b;

    public ekd(hsf hsfVar) {
        this.b = hsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixn b(defpackage.ixp r5, defpackage.ixk r6, long r7) {
        /*
            r4 = this;
            hsf r0 = r4.b
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L23
            hri r0 = (defpackage.hri) r0
            java.lang.Integer r2 = r0.a()
            int r2 = r2.intValue()
            if (r2 == r1) goto L23
            java.lang.Integer r0 = r0.a()
            float r0 = r0.floatValue()
            float r2 = r4.a
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == r1) goto L28
            r2 = r0
            goto L2c
        L28:
            int r2 = defpackage.kil.d(r7)
        L2c:
            int r3 = defpackage.kil.c(r7)
            if (r0 != r1) goto L36
            int r0 = defpackage.kil.b(r7)
        L36:
            int r7 = defpackage.kil.a(r7)
            long r7 = defpackage.kim.d(r2, r0, r3, r7)
            iyl r6 = r6.e(r7)
            int r7 = r6.a
            int r8 = r6.b
            ekc r0 = new ekc
            r0.<init>()
            ixn r5 = defpackage.ixo.b(r5, r7, r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekd.b(ixp, ixk, long):ixn");
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
