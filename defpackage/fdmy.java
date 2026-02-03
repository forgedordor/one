package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdmy extends fdze implements Runnable {
    public final long b;

    public fdmy(long j, fcxy fcxyVar) {
        super(fcxyVar.u(), fcxyVar);
        this.b = j;
    }

    @Override // defpackage.fdic, defpackage.fdme
    public final String h() {
        return super.h() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r5 = this;
            fcyh r0 = r5.a
            fdkh r0 = defpackage.fdkj.e(r0)
            boolean r1 = r0 instanceof defpackage.fdkk
            if (r1 == 0) goto Ld
            fdkk r0 = (defpackage.fdkk) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.fdhi.a
            fdhl r3 = defpackage.fdhl.c
            defpackage.fdhk.g(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.a.A(r1, r0, r3)
        L27:
            fdmx r1 = new fdmx
            r1.<init>(r0, r5)
            r5.O(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdmy.run():void");
    }
}
