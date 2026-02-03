package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvm extends fcyy implements fdat {
    int a;
    final /* synthetic */ fcyh b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvm(fcyh fcyhVar, fdat fdatVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fcyhVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvm) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: CancellationException -> 0x0024, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0024, blocks: (B:18:0x0036, B:20:0x0042, B:8:0x0018, B:11:0x0020), top: B:32:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ire, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [fdat] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004a -> B:16:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:16:0x002e). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r1 = r5.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r6)
            goto L2e
        L14:
            java.lang.Object r1 = r5.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r6)     // Catch: java.util.concurrent.CancellationException -> L24
            goto L2e
        L1c:
            java.lang.Object r1 = r5.d
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r6)     // Catch: java.util.concurrent.CancellationException -> L24
            goto L42
        L24:
            r6 = move-exception
            goto L4d
        L26:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.d
            r1 = r6
            ire r1 = (defpackage.ire) r1
        L2e:
            fcyh r6 = r5.b
            boolean r6 = defpackage.fdlw.h(r6)
            if (r6 == 0) goto L63
            fdat r6 = r5.c     // Catch: java.util.concurrent.CancellationException -> L24
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L24
            r5.a = r3     // Catch: java.util.concurrent.CancellationException -> L24
            java.lang.Object r6 = r6.a(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L24
            if (r6 == r0) goto L61
        L42:
            r5.d = r1     // Catch: java.util.concurrent.CancellationException -> L24
            r5.a = r2     // Catch: java.util.concurrent.CancellationException -> L24
            java.lang.Object r6 = defpackage.dvn.d(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L24
            if (r6 != r0) goto L2e
            goto L61
        L4d:
            fcyh r4 = r5.b
            boolean r4 = defpackage.fdlw.h(r4)
            if (r4 == 0) goto L62
            r5.d = r1
            r6 = 3
            r5.a = r6
            java.lang.Object r6 = defpackage.dvn.d(r1, r5)
            if (r6 == r0) goto L61
            goto L2e
        L61:
            return r0
        L62:
            throw r6
        L63:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvm dvmVar = new dvm(this.b, this.c, fcxyVar);
        dvmVar.d = obj;
        return dvmVar;
    }
}
