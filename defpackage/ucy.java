package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ucz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucy(ucz uczVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uczVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r4.d(r3) == r0) goto L23;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)     // Catch: java.lang.Throwable -> L11
            goto L52
        Ld:
            defpackage.fctl.b(r4)     // Catch: java.lang.Throwable -> L11
            goto L3d
        L11:
            r4 = move-exception
            goto L5a
        L13:
            defpackage.fctl.b(r4)
            ejxr r4 = defpackage.cpxw.f
            java.lang.Object r4 = r4.get()
            cczi r4 = (defpackage.cczi) r4
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L68
            boolean r4 = defpackage.cpyl.a()
            if (r4 == 0) goto L68
            ucz r4 = r3.b     // Catch: java.lang.Throwable -> L11
            auso r4 = r4.b     // Catch: java.lang.Throwable -> L11
            r3.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.g(r3)     // Catch: java.lang.Throwable -> L11
            if (r4 != r0) goto L3d
            goto L51
        L3d:
            ausl r1 = defpackage.ausl.b     // Catch: java.lang.Throwable -> L11
            if (r4 == r1) goto L44
            fctx r4 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L11
            return r4
        L44:
            ucz r4 = r3.b     // Catch: java.lang.Throwable -> L11
            auso r4 = r4.b     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r3.a = r1     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.d(r3)     // Catch: java.lang.Throwable -> L11
            if (r4 != r0) goto L52
        L51:
            return r0
        L52:
            ucz r4 = r3.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "Bugle.Cms.Folsom.Conversion.Encrypt.Success"
            r4.f(r0)     // Catch: java.lang.Throwable -> L11
            goto L68
        L5a:
            ucz r0 = r3.b
            java.lang.String r1 = "Bugle.Cms.Folsom.Conversion.Encrypt.Failed"
            r0.f(r1)
            cqce r0 = defpackage.ucz.a
            java.lang.String r1 = "Exception thrown in EncryptCmsBackupSyncletTask"
            r0.s(r1, r4)
        L68:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucy(this.b, fcxyVar);
    }
}
