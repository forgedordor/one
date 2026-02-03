package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ dmhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmfk(ddp ddpVar, dmhi dmhiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = dmhiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r11.f(r10) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 2
            r3 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Lf
            r8 = r10
            if (r1 == r3) goto L2c
            goto L3b
        Lf:
            ddp r4 = r10.b
            java.lang.Float r5 = new java.lang.Float
            r11 = 0
            r5.<init>(r11)
            r11 = 0
            des r1 = defpackage.dev.d
            r6 = 200(0xc8, float:2.8E-43)
            dia r6 = defpackage.dea.c(r6, r11, r1, r2)
            r10.a = r3
            r7 = 0
            r9 = 12
            r8 = r10
            java.lang.Object r11 = defpackage.ddp.k(r4, r5, r6, r7, r8, r9)
            if (r11 == r0) goto L3e
        L2c:
            dmhi r11 = r8.c
            dmgw r11 = (defpackage.dmgw) r11
            dmgo r11 = r11.a
            r8.a = r2
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L3b
            goto L3e
        L3b:
            fctx r11 = defpackage.fctx.a
            return r11
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmfk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmfk(this.b, this.c, fcxyVar);
    }
}
