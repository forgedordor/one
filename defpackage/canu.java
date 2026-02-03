package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canu implements cajw {
    private static final cqce b = cqce.g("BugleCms", "CmsRestoreBackupKeyDelegate");
    public final aukz a;
    private final cpup c;
    private final fcyh d;

    public canu(cpup cpupVar, aukz aukzVar, fcyh fcyhVar) {
        cpupVar.getClass();
        aukzVar.getClass();
        fcyhVar.getClass();
        this.c = cpupVar;
        this.a = aukzVar;
        this.d = fcyhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cajw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Exception r8, defpackage.cajn r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cant
            if (r0 == 0) goto L13
            r0 = r10
            cant r0 = (defpackage.cant) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cant r0 = new cant
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            cajn r9 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r10)
            goto L6f
        L3e:
            defpackage.fctl.b(r10)
            return r10
        L42:
            defpackage.fctl.b(r10)
            boolean r10 = r8 instanceof defpackage.cpyy
            if (r10 == 0) goto L57
            cpyy r8 = (defpackage.cpyy) r8
            int r9 = r9.b
            r0.d = r5
            java.lang.Object r8 = r7.d(r8, r9, r0)
            if (r8 != r1) goto L56
            goto L7f
        L56:
            return r8
        L57:
            fcyh r10 = r7.d
            fcyh r10 = defpackage.eicg.a(r10)
            cans r2 = new cans
            r2.<init>(r6, r7, r9, r8)
            r0.a = r8
            r0.e = r9
            r0.d = r4
            java.lang.Object r10 = defpackage.fdin.a(r10, r2, r0)
            if (r10 != r1) goto L6f
            goto L7f
        L6f:
            cajv r10 = defpackage.cajv.a
            r0.a = r6
            r0.e = r6
            r0.d = r3
            java.lang.Exception r8 = (java.lang.Exception) r8
            java.lang.Object r8 = r10.a(r8, r9, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.canu.a(java.lang.Exception, cajn, fcxy):java.lang.Object");
    }

    @Override // defpackage.cajw
    public final Object b(boolean z, cajn cajnVar, fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.cajw
    public final Object c(cpvs cpvsVar) {
        int size = cpvsVar.a.size();
        if (size == 0) {
            b.p("No BACKUP_KEY in CMS. This is a fresh backup or Backup Key may not been backed up successfully.");
            return fctx.a;
        }
        if (size == 1) {
            return fctx.a;
        }
        if (!((Boolean) ((cczi) cpyl.X.get()).e()).booleanValue()) {
            b.n("Attempted to restore more than 1 BACKUP_KEY");
        }
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cpyy r6, int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.canr
            if (r0 == 0) goto L13
            r0 = r8
            canr r0 = (defpackage.canr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            canr r0 = new canr
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r7 = r0.a
            cpyy r6 = r0.e
            defpackage.fctl.b(r8)
            goto L51
        L3a:
            defpackage.fctl.b(r8)
            cpup r8 = r5.c
            int r2 = r6.a
            eiju r8 = r8.a(r2)
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto L74
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            cpyz r6 = defpackage.cpyz.NO_RETRY
            return r6
        L5c:
            fcyh r8 = r5.d
            fcyh r8 = defpackage.eicg.a(r8)
            canq r2 = new canq
            r4 = 0
            r2.<init>(r4, r5, r7, r6)
            r0.e = r4
            r0.d = r3
            java.lang.Object r6 = defpackage.fdin.a(r8, r2, r0)
            if (r6 != r1) goto L73
            goto L74
        L73:
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.canu.d(cpyy, int, fcxy):java.lang.Object");
    }
}
