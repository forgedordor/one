package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxm implements iqp {
    public boolean a;
    private final dwx b;

    public dxm(dwx dwxVar, boolean z) {
        this.b = dwxVar;
        this.a = z;
    }

    @Override // defpackage.iqp
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        dyk dykVar = (dyk) this.b;
        if (dykVar.a.i()) {
            return 0L;
        }
        return dykVar.g(dykVar.b(dykVar.a.a(dykVar.b(dykVar.c(j2)))));
    }

    @Override // defpackage.iqp
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, long r7, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.dxl
            if (r5 == 0) goto L13
            r5 = r9
            dxl r5 = (defpackage.dxl) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L18
        L13:
            dxl r5 = new dxl
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.b
            fcyl r9 = defpackage.fcyl.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r7 = r5.a
            defpackage.fctl.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            boolean r6 = r4.a
            r2 = 0
            if (r6 == 0) goto L58
            dwx r6 = r4.b
            r0 = r6
            dyk r0 = (defpackage.dyk) r0
            boolean r0 = r0.h
            if (r0 == 0) goto L44
            goto L52
        L44:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 == r9) goto L57
        L4e:
            kjo r6 = (defpackage.kjo) r6
            long r2 = r6.a
        L52:
            long r2 = defpackage.kjo.c(r7, r2)
            goto L58
        L57:
            return r9
        L58:
            kjo r5 = new kjo
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxm.c(long, long, fcxy):java.lang.Object");
    }

    @Override // defpackage.iqp
    public final /* synthetic */ Object d(long j, fcxy fcxyVar) {
        return new kjo(0L);
    }
}
