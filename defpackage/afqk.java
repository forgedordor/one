package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqk extends fcyz implements fdat {
    int a;
    final /* synthetic */ afqm b;
    final /* synthetic */ dzub c;
    final /* synthetic */ fhaz d;
    final /* synthetic */ vvw e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqk(afqm afqmVar, dzub dzubVar, fhaz fhazVar, vvw vvwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afqmVar;
        this.c = dzubVar;
        this.d = fhazVar;
        this.e = vvwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008b, code lost:
    
        if (defpackage.fdpy.a(r12, r11) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L17
            if (r1 == r2) goto Lf
            defpackage.fctl.b(r12)
            goto L8e
        Lf:
            java.lang.Object r1 = r11.f
            fdjx r1 = (defpackage.fdjx) r1
            defpackage.fctl.b(r12)
            goto L33
        L17:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.f
            r1 = r12
            fdjx r1 = (defpackage.fdjx) r1
            afqm r12 = r11.b
            fcsu r12 = r12.q
            java.lang.Object r12 = r12.b()
            wrd r12 = (defpackage.wrd) r12
            r11.f = r1
            r11.a = r2
            java.lang.Object r12 = r12.e(r11)
            if (r12 == r0) goto Lab
        L33:
            r5 = r1
            afqm r6 = r11.b
            afmz r12 = r6.i
            afmy r12 = r12.a()
            java.util.List r12 = r12.c()
            fcsu r1 = r6.o
            java.lang.Object r1 = r1.b()
            afxx r1 = (defpackage.afxx) r1
            r2 = 0
            int r4 = r12.size()
            r7 = 10
            r10 = 2
            defpackage.afxx.d(r1, r7, r2, r4, r10)
            fdpr r1 = new fdpr
            r1.<init>(r12)
            afqh r12 = new afqh
            r12.<init>(r6, r3)
            fdpl r12 = defpackage.ejap.a(r1, r12)
            afqi r1 = new afqi
            r1.<init>(r3)
            afqe r2 = new afqe
            r2.<init>(r12, r1, r3)
            fdui r12 = new fdui
            r12.<init>(r2)
            fdtr r1 = new fdtr
            r1.<init>(r12)
            fhaz r7 = r11.d
            vvw r8 = r11.e
            afqj r4 = new afqj
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            fdpl r12 = defpackage.ejap.a(r1, r4)
            r11.f = r3
            r11.a = r10
            java.lang.Object r12 = defpackage.fdpy.a(r12, r11)
            if (r12 != r0) goto L8e
            goto Lab
        L8e:
            afqm r12 = r11.b
            dzub r0 = r11.c
            dzuc r12 = r12.p
            dzfh r1 = defpackage.afxy.f
            dzua r2 = defpackage.dzua.SUCCESS
            r12.f(r0, r1, r3, r2)
            eksp r12 = defpackage.afqm.a
            ekrw r12 = r12.e()
            eksl r12 = (defpackage.eksl) r12
            java.lang.String r0 = "Done sending message individually."
            r12.q(r0)
            fctx r12 = defpackage.fctx.a
            return r12
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqk afqkVar = new afqk(this.b, this.c, this.d, this.e, fcxyVar);
        afqkVar.f = obj;
        return afqkVar;
    }
}
