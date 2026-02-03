package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffj extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ ffl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffj(fdlr fdlrVar, ffl fflVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = fflVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0014, B:28:0x0062, B:23:0x004b, B:25:0x0053, B:8:0x0018, B:9:0x001c, B:21:0x0045, B:22:0x004a, B:16:0x0033, B:18:0x003c), top: B:35:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005f -> B:28:0x0062). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L24
            if (r1 == r8) goto L20
            if (r1 == r7) goto L1c
            if (r1 == r6) goto L18
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L68
            goto L62
        L18:
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L68
            goto L53
        L1c:
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L68
            goto L45
        L20:
            defpackage.fctl.b(r10)
            goto L33
        L24:
            defpackage.fctl.b(r10)
            fdlr r10 = r9.b
            if (r10 == 0) goto L33
            r9.a = r8
            java.lang.Object r10 = defpackage.fdlw.a(r10, r9)
            if (r10 == r0) goto L6a
        L33:
            ffl r10 = r9.c     // Catch: java.lang.Throwable -> L68
            r10.a(r5)     // Catch: java.lang.Throwable -> L68
            boolean r10 = r10.a     // Catch: java.lang.Throwable -> L68
            if (r10 != 0) goto L4b
            r9.a = r7     // Catch: java.lang.Throwable -> L68
            java.lang.Object r10 = defpackage.fdkj.b(r9)     // Catch: java.lang.Throwable -> L68
            if (r10 != r0) goto L45
            goto L6a
        L45:
            fcta r10 = new fcta     // Catch: java.lang.Throwable -> L68
            r10.<init>()     // Catch: java.lang.Throwable -> L68
            throw r10     // Catch: java.lang.Throwable -> L68
        L4b:
            r9.a = r6     // Catch: java.lang.Throwable -> L68
            java.lang.Object r10 = defpackage.fdkj.c(r2, r9)     // Catch: java.lang.Throwable -> L68
            if (r10 == r0) goto L6a
        L53:
            ffl r10 = r9.c     // Catch: java.lang.Throwable -> L68
            r10.a(r4)     // Catch: java.lang.Throwable -> L68
            r10 = 4
            r9.a = r10     // Catch: java.lang.Throwable -> L68
            java.lang.Object r10 = defpackage.fdkj.c(r2, r9)     // Catch: java.lang.Throwable -> L68
            if (r10 != r0) goto L62
            goto L6a
        L62:
            ffl r10 = r9.c     // Catch: java.lang.Throwable -> L68
            r10.a(r5)     // Catch: java.lang.Throwable -> L68
            goto L4b
        L68:
            r10 = move-exception
            goto L6b
        L6a:
            return r0
        L6b:
            ffl r0 = r9.c
            r0.a(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ffj(this.b, this.c, fcxyVar);
    }
}
