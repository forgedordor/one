package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucg extends fcyz implements fdat {
    int a;
    final /* synthetic */ ucf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucg(ucf ucfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ucfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ucg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r5.a(r4) == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)
            goto L64
        Ld:
            defpackage.fctl.b(r5)     // Catch: defpackage.axlg -> L67
            goto L38
        L11:
            defpackage.fctl.b(r5)
            ucf r5 = r4.b
            eksp r1 = r5.c
            ekrw r1 = r1.h()
            eksl r1 = (defpackage.eksl) r1
            java.lang.String r3 = "CmsDailySynclet retrieving linked account."
            r1.q(r3)
            fcsu r5 = r5.a     // Catch: defpackage.axlg -> L67
            java.lang.Object r5 = r5.b()     // Catch: defpackage.axlg -> L67
            axky r5 = (defpackage.axky) r5     // Catch: defpackage.axlg -> L67
            eiju r5 = r5.a()     // Catch: defpackage.axlg -> L67
            r4.a = r2     // Catch: defpackage.axlg -> L67
            java.lang.Object r5 = defpackage.fdxs.c(r5, r4)     // Catch: defpackage.axlg -> L67
            if (r5 != r0) goto L38
            goto L63
        L38:
            r5.getClass()     // Catch: defpackage.axlg -> L67
            efwo r5 = (defpackage.efwo) r5     // Catch: defpackage.axlg -> L67
            ucf r1 = r4.b
            eksp r2 = r1.c
            ekrw r2 = r2.h()
            eksl r2 = (defpackage.eksl) r2
            java.lang.String r3 = "CmsDailySynclet running tasks."
            r2.q(r3)
            android.content.Context r1 = r1.b
            java.lang.Class<ucf$a> r2 = ucf.a.class
            java.lang.Object r5 = defpackage.ehlh.a(r1, r2, r5)
            ucf$a r5 = (ucf.a) r5
            ucm r5 = r5.d()
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L64
        L63:
            return r0
        L64:
            fctx r5 = defpackage.fctx.a
            return r5
        L67:
            ucf r5 = r4.b
            eksp r5 = r5.c
            ekrw r5 = r5.h()
            eksl r5 = (defpackage.eksl) r5
            java.lang.String r0 = "CmsDailySynclet retrieving linked account failed. Aborting."
            r5.q(r0)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ucg(this.b, fcxyVar);
    }
}
