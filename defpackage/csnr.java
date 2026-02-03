package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csnr extends fcyz implements fdat {
    int a;
    final /* synthetic */ csnv b;
    final /* synthetic */ csch c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csnr(fcxy fcxyVar, csnv csnvVar, csch cschVar) {
        super(2, fcxyVar);
        this.b = csnvVar;
        this.c = cschVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csnr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r13 == r0) goto L36;
     */
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
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L13
            defpackage.fctl.b(r13)
            if (r1 == r5) goto L28
            if (r1 == r3) goto L3f
            goto L86
        L13:
            defpackage.fctl.b(r13)
            java.lang.Object r13 = r12.d
            fdjx r13 = (defpackage.fdjx) r13
            csnv r13 = r12.b
            csch r1 = r12.c
            eoeo r6 = defpackage.eoeo.MESSAGE_RECEIPT
            r12.a = r5
            java.lang.Object r13 = r13.g(r1, r6, r4, r12)
            if (r13 == r0) goto Lc0
        L28:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L35
            csdd r13 = defpackage.csdc.a()
            return r13
        L35:
            csch r13 = r12.c
            r12.a = r3
            java.lang.Object r13 = r13.c(r12)
            if (r13 == r0) goto Lc0
        L3f:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection$classify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "BugleSpam"
            java.lang.String r7 = "StrangerDangerSpamProtection.kt"
            if (r13 == 0) goto La3
            int r8 = r13.length()
            if (r8 != 0) goto L52
            goto La3
        L52:
            int r8 = defpackage.csrb.f
            csch r8 = r12.c
            int r9 = r8.m
            int r9 = defpackage.csqm.b(r9)
            if (r9 != r5) goto L7b
            ekrg r13 = defpackage.csnv.a
            ekrw r13 = r13.e()
            ekrz r0 = defpackage.eksq.a
            r13.X(r0, r6)
            r0 = 64
            ekrw r13 = r13.h(r3, r1, r0, r7)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r0 = "Unknown message protocol, skipping StrangerDanger"
            r13.q(r0)
            csdd r13 = defpackage.csdc.a()
            return r13
        L7b:
            csnv r1 = r12.b
            r12.a = r2
            java.lang.Object r13 = r1.i(r8, r13, r9, r12)
            if (r13 != r0) goto L86
            goto Lc0
        L86:
            csnp r13 = (defpackage.csnp) r13
            if (r13 != 0) goto L9e
            csdd r5 = new csdd
            eoff r6 = defpackage.eoff.NO_VERDICT
            csdo r7 = defpackage.csdo.a
            ekrg r13 = defpackage.csnv.a
            java.lang.Integer r9 = defpackage.csno.b(r4, r2)
            r10 = 0
            r11 = 20
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L9e:
            csdd r13 = r13.a(r4)
            return r13
        La3:
            ekrg r13 = defpackage.csnv.a
            ekrw r13 = r13.j()
            ekrz r0 = defpackage.eksq.a
            r13.X(r0, r6)
            r0 = 58
            ekrw r13 = r13.h(r3, r1, r0, r7)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r0 = "Null E164 destination, skipping StrangerDanger"
            r13.q(r0)
            csdd r13 = defpackage.csdc.a()
            return r13
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csnr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csnr csnrVar = new csnr(fcxyVar, this.b, this.c);
        csnrVar.d = obj;
        return csnrVar;
    }
}
