package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dghi b;
    final /* synthetic */ cmmh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghd(fcxy fcxyVar, dghi dghiVar, cmmh cmmhVar) {
        super(2, fcxyVar);
        this.b = dghiVar;
        this.c = cmmhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r12 == r0) goto L23;
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
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/ims/provisioning/api/identitymapping/IdentityMappingProducerImpl$getAvailableIdentity$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "IdentityMappingPopulator"
            r6 = 0
            java.lang.String r7 = "IdentityMappingProducerImpl.kt"
            defpackage.fctl.b(r12)
            if (r1 == 0) goto L16
            if (r1 == r2) goto L36
            goto L6e
        L16:
            java.lang.Object r12 = r11.d
            fdjx r12 = (defpackage.fdjx) r12
            dghi r12 = r11.b
            cmmh r1 = r11.c
            java.lang.String r1 = r1.c
            r1.getClass()
            r11.a = r2
            fcyh r2 = r12.f
            fcyh r2 = defpackage.eicg.a(r2)
            dghg r8 = new dghg
            r8.<init>(r6, r12, r1)
            java.lang.Object r12 = defpackage.fdin.a(r2, r8, r11)
            if (r12 == r0) goto Lc9
        L36:
            dgiq r12 = (defpackage.dgiq) r12
            if (r12 != 0) goto L57
            ekrg r12 = defpackage.dghi.a
            ekrw r12 = r12.j()
            ekrz r0 = defpackage.eksq.a
            r12.X(r0, r5)
            r0 = 60
            ekrw r12 = r12.h(r4, r3, r0, r7)
            ekrd r12 = (defpackage.ekrd) r12
            cmmh r0 = r11.c
            java.lang.String r1 = "No RCS configuration found for sim id: %s"
            java.lang.String r0 = r0.c
            r12.t(r1, r0)
            return r6
        L57:
            dghi r1 = r11.b
            r2 = 2
            r11.a = r2
            fcyh r2 = r1.f
            fcyh r2 = defpackage.eicg.a(r2)
            dghf r8 = new dghf
            r8.<init>(r6, r1, r12)
            java.lang.Object r12 = defpackage.fdin.a(r2, r8, r11)
            if (r12 != r0) goto L6e
            goto Lc9
        L6e:
            dggk r12 = (defpackage.dggk) r12
            if (r12 != 0) goto Lb5
            ekrg r0 = defpackage.dghi.a
            ekrw r1 = r0.h()
            ekrz r2 = defpackage.eksq.a
            r1.X(r2, r5)
            r8 = 65
            ekrw r1 = r1.h(r4, r3, r8, r7)
            ekrd r1 = (defpackage.ekrd) r1
            cmmh r8 = r11.c
            java.lang.String r9 = "No phone number found for sim id: %s"
            java.lang.String r10 = r8.c
            r1.t(r9, r10)
            dghi r1 = r11.b
            fcsu r1 = r1.d
            java.lang.Object r1 = r1.b()
            dhkw r1 = (defpackage.dhkw) r1
            int r8 = r8.d
            boolean r1 = r1.b(r8)
            if (r1 != 0) goto Lb5
            ekrw r12 = r0.j()
            r12.X(r2, r5)
            r0 = 67
            ekrw r12 = r12.h(r4, r3, r0, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "No phone number found for non-single registration transport."
            r12.q(r0)
            return r6
        Lb5:
            cmmh r0 = r11.c
            dgha r1 = new dgha
            dggp r2 = new dggp
            java.lang.String r3 = r0.c
            r3.getClass()
            r2.<init>(r3)
            int r0 = r0.d
            r1.<init>(r2, r12, r0)
            return r1
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dghd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghd dghdVar = new dghd(fcxyVar, this.b, this.c);
        dghdVar.d = obj;
        return dghdVar;
    }
}
