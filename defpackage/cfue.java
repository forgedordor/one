package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfue extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cfut c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfue(cfut cfutVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cfutVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfue) c((ezlb) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r11.j.fO(r3, r10) == r0) goto L15;
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
            r4 = 0
            if (r1 == 0) goto L18
            if (r1 == r3) goto L10
            defpackage.fctl.b(r11)
            goto L89
        L10:
            java.lang.Object r1 = r10.b
            ezlb r1 = (defpackage.ezlb) r1
            defpackage.fctl.b(r11)
            goto L75
        L18:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.b
            r1 = r11
            ezlb r1 = (defpackage.ezlb) r1
            int r11 = r1.b
            if (r11 != r2) goto L75
            cfut r11 = r10.c
            r10.b = r1
            r10.a = r3
            fdue r3 = r11.j
            fdvc r5 = r3.b()
            cfur r6 = new cfur
            r6.<init>(r3, r11, r4)
            fdtm r3 = new fdtm
            r3.<init>(r5, r6)
            cfuq r5 = new cfuq
            r5.<init>(r3)
            evrj r11 = r11.f
            j$.time.Duration r11 = defpackage.evxd.c(r11)
            long r6 = r11.getSeconds()
            fdhl r3 = defpackage.fdhl.d
            long r6 = defpackage.fdhk.g(r6, r3)
            int r11 = r11.getNano()
            fdhl r3 = defpackage.fdhl.a
            long r8 = defpackage.fdhk.f(r11, r3)
            long r6 = defpackage.fdhi.j(r6, r8)
            fdpl r11 = defpackage.fdqn.a(r5, r6)
            cfus r3 = new cfus
            r3.<init>(r4)
            fdrc r5 = new fdrc
            r5.<init>(r11, r3)
            java.lang.Object r11 = defpackage.fdtc.a(r5, r10)
            if (r11 == r0) goto L73
            fctx r11 = defpackage.fctx.a
        L73:
            if (r11 == r0) goto L88
        L75:
            cfut r11 = r10.c
            fctk r3 = new fctk
            r3.<init>(r1)
            r10.b = r4
            r10.a = r2
            fdue r11 = r11.j
            java.lang.Object r11 = r11.fO(r3, r10)
            if (r11 != r0) goto L89
        L88:
            return r0
        L89:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfue.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cfue cfueVar = new cfue(this.c, fcxyVar);
        cfueVar.b = obj;
        return cfueVar;
    }
}
