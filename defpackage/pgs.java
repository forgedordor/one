package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgs implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ pex b;
    final /* synthetic */ fdap c;

    public pgs(fdpm fdpmVar, pex pexVar, fdap fdapVar) {
        this.a = fdpmVar;
        this.b = pexVar;
        this.c = fdapVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pgr
            if (r0 == 0) goto L13
            r0 = r9
            pgr r0 = (defpackage.pgr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            pgr r0 = new pgr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L5d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            java.lang.Object r8 = r0.c
            defpackage.fctl.b(r9)
            goto L51
        L38:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            java.util.Set r8 = (java.util.Set) r8
            pex r8 = r7.b
            fdap r2 = r7.c
            r0.c = r9
            r0.b = r4
            r5 = 0
            java.lang.Object r8 = defpackage.phx.c(r8, r4, r5, r2, r0)
            if (r8 == r1) goto L60
            r6 = r9
            r9 = r8
            r8 = r6
        L51:
            r2 = 0
            r0.c = r2
            r0.b = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto L5d
            goto L60
        L5d:
            fctx r8 = defpackage.fctx.a
            return r8
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgs.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
