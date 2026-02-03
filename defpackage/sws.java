package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sws extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdoa c;
    final /* synthetic */ fdos d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sws(fdoa fdoaVar, fdos fdosVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdoaVar;
        this.d = fdosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sws) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:24:0x004f, B:21:0x0040], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0081, Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:7:0x000e, B:15:0x0024, B:17:0x002e, B:19:0x0036, B:21:0x0040, B:24:0x004f, B:26:0x0053, B:29:0x007b, B:30:0x0080, B:11:0x0017, B:14:0x001e), top: B:41:0x0006, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004c -> B:15:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:15:0x0024). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L15
            if (r1 == r2) goto L12
            java.lang.Object r1 = r9.a
        Le:
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            goto L24
        L12:
            java.lang.Object r1 = r9.a
            goto Le
        L15:
            java.lang.Object r1 = r9.a
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            goto L2e
        L1b:
            defpackage.fctl.b(r10)
            fdoa r10 = r9.c     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            fdoc r1 = r10.r()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
        L24:
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.b = r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r1.a(r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 == r0) goto L85
        L2e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r1.b()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            swm r10 = (defpackage.swm) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            boolean r4 = r10 instanceof defpackage.swk     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r4 == 0) goto L4f
            fdos r10 = r9.d     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            swg r4 = defpackage.swg.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.b = r2     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r10.a(r4, r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 != r0) goto L24
            goto L85
        L4f:
            boolean r4 = r10 instanceof defpackage.swl     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r4 == 0) goto L7b
            fdos r4 = r9.d     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            swh r5 = new swh     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            swl r10 = (defpackage.swl) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            android.os.Bundle r10 = r10.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.String r6 = "soda_event"
            exxw r7 = defpackage.exxw.a     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            evrr r8 = defpackage.evrr.a()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            evuh r10 = com.google.protobuf.contrib.android.ProtoParsers.d(r10, r6, r7, r8)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10.getClass()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            exxw r10 = (defpackage.exxw) r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r9.a = r1     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10 = 3
            r9.b = r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.Object r10 = r4.a(r5, r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            if (r10 != r0) goto L24
            goto L85
        L7b:
            fctg r10 = new fctg     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            throw r10     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
        L81:
            r10 = move-exception
            goto L93
        L83:
            r10 = move-exception
            goto L86
        L85:
            return r0
        L86:
            fdos r0 = r9.d     // Catch: java.lang.Throwable -> L81
            r0.e(r10)     // Catch: java.lang.Throwable -> L81
        L8b:
            fdos r10 = r9.d
            defpackage.fdov.a(r10)
            fctx r10 = defpackage.fctx.a
            return r10
        L93:
            fdos r0 = r9.d
            defpackage.fdov.a(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sws.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new sws(this.c, this.d, fcxyVar);
    }
}
