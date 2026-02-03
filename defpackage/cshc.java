package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cshc extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dhuu d;
    final /* synthetic */ cshw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cshc(cshw cshwVar, dhuu dhuuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = cshwVar;
        this.d = dhuuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cshc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r2.a() != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0012, B:31:0x007d, B:9:0x001e, B:25:0x0055, B:27:0x006d), top: B:44:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            if (r1 == r2) goto L16
            java.lang.Object r0 = r5.b
            dhvp r0 = (defpackage.dhvp) r0
            java.lang.Object r1 = r5.a
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L22
            goto L7b
        L16:
            java.lang.Object r1 = r5.b
            java.io.Closeable r1 = (java.io.Closeable) r1
            java.lang.Object r2 = r5.a
            cshw r2 = (defpackage.cshw) r2
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L22
            goto L55
        L22:
            r6 = move-exception
            goto L8d
        L25:
            defpackage.fctl.b(r6)
            cshw r6 = r5.e
            dhuu r1 = r5.d
            fcyh r4 = r5.u()
            boolean r4 = defpackage.eicg.b(r4)
            if (r4 == 0) goto L93
            java.lang.String r4 = "BugleMoiraiApiV2Impl#classify"
            eieu r4 = defpackage.eiiy.h(r4)
            r5.a = r6     // Catch: java.lang.Throwable -> L8b
            r5.b = r4     // Catch: java.lang.Throwable -> L8b
            r5.c = r2     // Catch: java.lang.Throwable -> L8b
            dhov r2 = r6.a     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L4f
            java.lang.Object r1 = r2.b(r1, r5)     // Catch: java.lang.Throwable -> L8b
            if (r1 == r0) goto L50
            dhvp r1 = (defpackage.dhvp) r1     // Catch: java.lang.Throwable -> L8b
            goto L50
        L4f:
            r1 = r3
        L50:
            if (r1 == r0) goto L8a
            r2 = r6
            r6 = r1
            r1 = r4
        L55:
            dhvp r6 = (defpackage.dhvp) r6     // Catch: java.lang.Throwable -> L22
            cczi r4 = defpackage.crtr.a     // Catch: java.lang.Throwable -> L22
            ejxr r4 = defpackage.crtr.Q     // Catch: java.lang.Throwable -> L22
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L22
            cczi r4 = (defpackage.cczi) r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L22
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L7a
            r5.a = r1     // Catch: java.lang.Throwable -> L22
            r5.b = r6     // Catch: java.lang.Throwable -> L22
            r4 = 2
            r5.c = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r0) goto L8a
        L7a:
            r0 = r6
        L7b:
            if (r0 != 0) goto L87
            dhvp r6 = new dhvp     // Catch: java.lang.Throwable -> L22
            r0 = 7
            r6.<init>(r3, r3, r0)     // Catch: java.lang.Throwable -> L22
            defpackage.fczl.a(r1, r3)
            return r6
        L87:
            defpackage.fczl.a(r1, r3)
        L8a:
            return r0
        L8b:
            r6 = move-exception
            r1 = r4
        L8d:
            throw r6     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.fczl.a(r1, r6)
            throw r0
        L93:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cshc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cshc(this.e, this.d, fcxyVar);
    }
}
