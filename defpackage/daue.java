package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daue extends fcyz implements fdat {
    int a;
    final /* synthetic */ daud b;
    final /* synthetic */ efwo c;
    final /* synthetic */ ctcj d;
    final /* synthetic */ chnc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daue(daud daudVar, efwo efwoVar, ctcj ctcjVar, chnc chncVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daudVar;
        this.c = efwoVar;
        this.d = ctcjVar;
        this.e = chncVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daue) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 == r4) goto L17
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L62
            if (r1 == r2) goto Laa
            goto Lc6
        L17:
            defpackage.fctl.b(r8)
            goto L4e
        L1b:
            defpackage.fctl.b(r8)
            goto L3e
        L1f:
            defpackage.fctl.b(r8)
            daud r8 = r7.b
            efwo r1 = r7.c
            android.content.Context r8 = r8.a
            java.lang.Class<daud$a> r6 = daud.a.class
            java.lang.Object r8 = defpackage.ehlh.a(r8, r6, r1)
            daud$a r8 = (daud.a) r8
            egrv r8 = r8.gi()
            dawh r6 = defpackage.dawk.a
            r7.a = r5
            java.lang.Object r8 = r6.a(r1, r8, r7)
            if (r8 == r0) goto Le2
        L3e:
            java.util.UUID r8 = (java.util.UUID) r8
            daud r8 = r7.b
            efwo r1 = r7.c
            ctcj r6 = r7.d
            r7.a = r4
            java.lang.Object r8 = r8.c(r1, r6, r7)
            if (r8 == r0) goto Le2
        L4e:
            daud r8 = r7.b
            fcsu r8 = r8.b
            java.lang.Object r8 = r8.b()
            chna r8 = (defpackage.chna) r8
            chnc r1 = r7.e
            r7.a = r3
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 == r0) goto Le2
        L62:
            ejxr r8 = defpackage.crbf.bt
            java.lang.Object r8 = r8.get()
            cczi r8 = (defpackage.cczi) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc8
            daud r8 = r7.b
            fcsu r1 = r8.c
            java.lang.Object r3 = r1.b()
            j$.util.Optional r3 = (j$.util.Optional) r3
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Lc8
            j$.util.Optional r8 = r8.d
            boolean r8 = r8.isPresent()
            if (r8 == 0) goto Lc8
            ctcj r8 = r7.d
            ctcj r3 = defpackage.ctcj.WELCOME_FLOW_ACCOUNT_SWITCH
            if (r8 != r3) goto Lc8
            java.lang.Object r8 = r1.b()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = r8.get()
            cgte r8 = (defpackage.cgte) r8
            efwo r1 = r7.c
            r7.a = r2
            java.lang.Object r8 = r8.h(r1, r7)
            if (r8 == r0) goto Le2
        Laa:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lc8
            daud r8 = r7.b
            j$.util.Optional r8 = r8.d
            java.lang.Object r8 = r8.get()
            cgus r8 = (defpackage.cgus) r8
            r1 = 5
            r7.a = r1
            java.lang.Object r8 = r8.g(r7)
            if (r8 != r0) goto Lc6
            goto Le2
        Lc6:
            eyyz r8 = (defpackage.eyyz) r8
        Lc8:
            ctcj r8 = r7.d
            ctcj r0 = defpackage.ctcj.WELCOME_FLOW_EXPRESS_SIGN_IN_NEW_USER
            if (r8 == r0) goto Ld2
            ctcj r0 = defpackage.ctcj.WELCOME_FLOW_EXPRESS_SIGN_IN_EXISTING_USER
            if (r8 != r0) goto Ldf
        Ld2:
            daud r8 = r7.b
            fcsu r8 = r8.e
            java.lang.Object r8 = r8.b()
            cdku r8 = (defpackage.cdku) r8
            r8.c(r5)
        Ldf:
            fctx r8 = defpackage.fctx.a
            return r8
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daue.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daue(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
