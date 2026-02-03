package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhc extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdkf b;
    final /* synthetic */ cbhl c;
    final /* synthetic */ cbdg d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbhc(fcxy fcxyVar, fdkf fdkfVar, cbhl cbhlVar, cbdg cbdgVar) {
        super(2, fcxyVar);
        this.b = fdkfVar;
        this.c = cbhlVar;
        this.d = cbdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbhc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L16
            defpackage.fctl.b(r13)
            if (r1 == r2) goto L7c
            goto Ld5
        L16:
            java.lang.Object r1 = r12.e
            java.lang.Object r3 = r12.f
            cazg r3 = (defpackage.cazg) r3
            defpackage.fctl.b(r13)
            r10 = r3
            goto L68
        L21:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.f
            fdjx r13 = (defpackage.fdjx) r13
            fdkf r13 = r12.b
            if (r13 != 0) goto L41
            cbhl r13 = r12.c
            fcyi r1 = defpackage.fcyi.a
            fdjz r6 = defpackage.fdjz.a
            fcyh r1 = defpackage.eicg.a(r1)
            cbhh r7 = new cbhh
            r7.<init>(r5)
            fdjx r13 = r13.d
            fdkf r13 = defpackage.fdin.b(r13, r1, r6, r7)
        L41:
            r1 = r13
            cbhl r13 = r12.c
            cbdg r6 = r12.d
            cbaz r7 = r13.a
            java.lang.String r8 = r6.r()
            cazg r7 = r7.c(r8)
            r7.getClass()
            caya r8 = r7.a()
            caxl r8 = (defpackage.caxl) r8
            caze r8 = r8.b
            r12.f = r7
            r12.e = r1
            r12.a = r3
            java.lang.Object r13 = r13.h(r7, r6, r8, r12)
            if (r13 == r0) goto Ld6
            r10 = r7
        L68:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L7d
            r12.f = r5
            r12.e = r5
            r12.a = r2
            java.lang.Object r13 = r1.c(r12)
            if (r13 == r0) goto Ld6
        L7c:
            return r4
        L7d:
            fdjd r11 = new fdjd
            r11.<init>()
            cbhl r8 = r12.c
            fcyi r13 = defpackage.fcyi.a
            fdjz r2 = defpackage.fdjz.a
            fcyh r13 = defpackage.eicg.a(r13)
            cbdg r9 = r12.d
            cbhi r6 = new cbhi
            r7 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            fdjx r3 = r8.d
            fdkf r13 = defpackage.fdin.b(r3, r13, r2, r6)
            feaq r2 = new feaq
            fcyh r3 = r12.u()
            r2.<init>(r3)
            feam r13 = r13.f()
            cbhd r3 = new cbhd
            r3.<init>(r1, r5)
            r2.a(r13, r3)
            feam r13 = r11.T()
            cbhe r3 = new cbhe
            r3.<init>(r1, r5)
            r2.a(r13, r3)
            feam r13 = r1.f()
            cbhf r1 = new cbhf
            r1.<init>(r5)
            r2.a(r13, r1)
            r12.f = r5
            r12.e = r5
            r13 = 3
            r12.a = r13
            java.lang.Object r13 = defpackage.feaq.d(r2, r12)
            if (r13 != r0) goto Ld5
            goto Ld6
        Ld5:
            return r4
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbhc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbhc cbhcVar = new cbhc(fcxyVar, this.b, this.c, this.d);
        cbhcVar.f = obj;
        return cbhcVar;
    }
}
