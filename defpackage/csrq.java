package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrq extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ csrt d;
    final /* synthetic */ csoc e;
    final /* synthetic */ csny f;
    final /* synthetic */ eykc g;
    final /* synthetic */ cspj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrq(csrt csrtVar, csoc csocVar, csny csnyVar, eykc eykcVar, cspj cspjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = csrtVar;
        this.e = csocVar;
        this.f = csnyVar;
        this.g = eykcVar;
        this.h = cspjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (((defpackage.csrb) r1).p(r2, (defpackage.csrn) r9, r4, r5, r8) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L11
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> Le
            goto L79
        Le:
            r0 = move-exception
            r9 = r0
            goto L53
        L11:
            java.lang.Object r1 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> Le
            r7 = r2
            r2 = r1
            r1 = r7
            goto L3a
        L1c:
            defpackage.fctl.b(r9)
            csrt r9 = r8.d     // Catch: java.lang.Throwable -> Le
            fcsu r1 = r9.d     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Le
            csrb r1 = (defpackage.csrb) r1     // Catch: java.lang.Throwable -> Le
            csoc r3 = r8.e     // Catch: java.lang.Throwable -> Le
            csny r4 = r8.f     // Catch: java.lang.Throwable -> Le
            r8.a = r1     // Catch: java.lang.Throwable -> Le
            r8.b = r3     // Catch: java.lang.Throwable -> Le
            r8.c = r2     // Catch: java.lang.Throwable -> Le
            java.lang.Object r9 = r9.b(r4, r3, r8)     // Catch: java.lang.Throwable -> Le
            if (r9 == r0) goto L52
            r2 = r3
        L3a:
            r3 = r9
            csrn r3 = (defpackage.csrn) r3     // Catch: java.lang.Throwable -> Le
            eykc r4 = r8.g     // Catch: java.lang.Throwable -> Le
            cspj r5 = r8.h     // Catch: java.lang.Throwable -> Le
            r9 = 0
            r8.a = r9     // Catch: java.lang.Throwable -> Le
            r8.b = r9     // Catch: java.lang.Throwable -> Le
            r9 = 2
            r8.c = r9     // Catch: java.lang.Throwable -> Le
            csrb r1 = (defpackage.csrb) r1     // Catch: java.lang.Throwable -> Le
            r6 = r8
            java.lang.Object r9 = r1.p(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Le
            if (r9 != r0) goto L79
        L52:
            return r0
        L53:
            ekrg r0 = defpackage.csrt.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "BugleSpam"
            r0.X(r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r9 = r0.g(r9)
            r0 = 178(0xb2, float:2.5E-43)
            java.lang.String r1 = "TachyonSpamReporter.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamReporter$sendActionEnforcedSignal$2"
            java.lang.String r3 = "invokeSuspend"
            ekrw r9 = r9.h(r2, r3, r0, r1)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Failed to send enforcement signal to Tachyon"
            r9.q(r0)
        L79:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csrq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csrq(this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
