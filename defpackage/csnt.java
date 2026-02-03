package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnt extends fcyz implements fdat {
    int a;
    final /* synthetic */ csnv b;
    final /* synthetic */ csch c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csnt(fcxy fcxyVar, csnv csnvVar, csch cschVar, int i) {
        super(2, fcxyVar);
        this.b = csnvVar;
        this.c = cschVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csnt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r12 == r0) goto L32;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.fctl.b(r12)
            if (r1 == r3) goto L2c
            if (r1 == r2) goto L43
            goto L5e
        L10:
            defpackage.fctl.b(r12)
            java.lang.Object r12 = r11.e
            fdjx r12 = (defpackage.fdjx) r12
            csnv r12 = r11.b
            csch r1 = r11.c
            int r4 = r11.d
            eoeo r5 = defpackage.eoeo.RECLASSIFICATION
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            r11.a = r3
            java.lang.Object r12 = r12.g(r1, r5, r6, r11)
            if (r12 == r0) goto Lae
        L2c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L39
            csdd r12 = defpackage.csdc.a()
            return r12
        L39:
            csch r12 = r11.c
            r11.a = r2
            java.lang.Object r12 = r12.c(r11)
            if (r12 == r0) goto Lae
        L43:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L89
            int r1 = r12.length()
            if (r1 != 0) goto L4e
            goto L89
        L4e:
            csnv r1 = r11.b
            csch r2 = r11.c
            int r4 = r11.d
            r5 = 3
            r11.a = r5
            java.lang.Object r12 = r1.h(r2, r12, r4, r11)
            if (r12 != r0) goto L5e
            goto Lae
        L5e:
            csnp r12 = (defpackage.csnp) r12
            if (r12 != 0) goto L7d
            int r12 = r11.d
            csdd r4 = new csdd
            eoff r5 = defpackage.eoff.NO_VERDICT
            csdo r6 = defpackage.csdo.a
            ekrg r0 = defpackage.csnv.a
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            java.lang.Integer r8 = defpackage.csno.b(r0, r3)
            r9 = 0
            r10 = 20
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L7d:
            int r0 = r11.d
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            csdd r12 = r12.a(r1)
            return r12
        L89:
            ekrg r12 = defpackage.csnv.a
            ekrw r12 = r12.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleSpam"
            r12.X(r0, r1)
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = "StrangerDangerSpamProtection.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection$reclassify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            ekrw r12 = r12.h(r2, r3, r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r0 = "Null E164 destination, skipping StrangerDanger"
            r12.q(r0)
            csdd r12 = defpackage.csdc.a()
            return r12
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csnt csntVar = new csnt(fcxyVar, this.b, this.c, this.d);
        csntVar.e = obj;
        return csntVar;
    }
}
