package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dwj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwf(dwj dwjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dwjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:14:0x0025, B:16:0x002f, B:18:0x003d), top: B:36:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:36:0x0025). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L11
            java.lang.Object r1 = r9.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L19
            goto L25
        L11:
            java.lang.Object r1 = r9.c
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L19
            goto L3d
        L19:
            r0 = move-exception
            r10 = r0
            r8 = r9
            goto L72
        L1d:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.c
            r1 = r10
            fdjx r1 = (defpackage.fdjx) r1
        L25:
            fcyh r10 = r1.hE()     // Catch: java.lang.Throwable -> L63
            boolean r10 = defpackage.fdlw.h(r10)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L69
            dwj r10 = r9.b     // Catch: java.lang.Throwable -> L63
            fdoa r10 = r10.c     // Catch: java.lang.Throwable -> L63
            r9.c = r1     // Catch: java.lang.Throwable -> L63
            r9.a = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r10 = r10.i(r9)     // Catch: java.lang.Throwable -> L63
            if (r10 == r0) goto L67
        L3d:
            r5 = r10
            dvw r5 = (defpackage.dvw) r5     // Catch: java.lang.Throwable -> L63
            dwj r3 = r9.b     // Catch: java.lang.Throwable -> L63
            kio r10 = r3.b     // Catch: java.lang.Throwable -> L63
            r4 = 1086324736(0x40c00000, float:6.0)
            float r6 = r10.en(r4)     // Catch: java.lang.Throwable -> L63
            kio r10 = r3.b     // Catch: java.lang.Throwable -> L63
            r4 = 1065353216(0x3f800000, float:1.0)
            float r7 = r10.en(r4)     // Catch: java.lang.Throwable -> L63
            dyk r4 = r3.a     // Catch: java.lang.Throwable -> L63
            r9.c = r1     // Catch: java.lang.Throwable -> L63
            r10 = 2
            r9.a = r10     // Catch: java.lang.Throwable -> L63
            r8 = r9
            java.lang.Object r10 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L61
            if (r10 != r0) goto L25
            goto L68
        L61:
            r0 = move-exception
            goto L65
        L63:
            r0 = move-exception
            r8 = r9
        L65:
            r10 = r0
            goto L72
        L67:
            r8 = r9
        L68:
            return r0
        L69:
            r8 = r9
            dwj r10 = r8.b
            defpackage.dwj.f(r10)
            fctx r10 = defpackage.fctx.a
            return r10
        L72:
            dwj r0 = r8.b
            defpackage.dwj.f(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dwf dwfVar = new dwf(this.b, fcxyVar);
        dwfVar.c = obj;
        return dwfVar;
    }
}
