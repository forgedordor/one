package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfn extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwfq b;
    final /* synthetic */ ekhx c;
    final /* synthetic */ elyd d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfn(fcxy fcxyVar, bwfq bwfqVar, ekhx ekhxVar, elyd elydVar) {
        super(2, fcxyVar);
        this.b = bwfqVar;
        this.c = ekhxVar;
        this.d = elydVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl$downloadRemoteInstances$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleE2eeEtouffee"
            r5 = 1
            java.lang.String r6 = "EtouffeeSessionSetupImpl.kt"
            if (r1 == 0) goto L1c
            if (r1 == r5) goto L15
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L59
        L15:
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L41
        L19:
            r9 = move-exception
            goto L94
        L1c:
            defpackage.fctl.b(r9)
            java.lang.Object r9 = r8.e
            fdjx r9 = (defpackage.fdjx) r9
            bwfq r9 = r8.b     // Catch: java.lang.Throwable -> L19
            fcsu r1 = r9.c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L19
            bvut r1 = (defpackage.bvut) r1     // Catch: java.lang.Throwable -> L19
            aubq r9 = r9.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r9 = r9.d     // Catch: java.lang.Throwable -> L19
            eiju r9 = r1.e(r9)     // Catch: java.lang.Throwable -> L19
            r9.getClass()     // Catch: java.lang.Throwable -> L19
            r8.a = r5     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = defpackage.fdxs.c(r9, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L41
            goto L58
        L41:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L5c
            bwfq r9 = r8.b     // Catch: java.lang.Throwable -> L19
            ekhx r1 = r8.c     // Catch: java.lang.Throwable -> L19
            elyd r5 = r8.d     // Catch: java.lang.Throwable -> L19
            r7 = 2
            r8.a = r7     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r9.d(r1, r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r0) goto L59
        L58:
            return r0
        L59:
            qap r9 = (defpackage.qap) r9     // Catch: java.lang.Throwable -> L19
            return r9
        L5c:
            bwfq r9 = r8.b     // Catch: java.lang.Throwable -> L19
            fcsu r0 = r9.k     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L19
            ains r0 = (defpackage.ains) r0     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "Bugle.Etouffee.Session.Not.Provisioned.Count"
            r0.c(r1)     // Catch: java.lang.Throwable -> L19
            ekrg r0 = defpackage.bwfq.a     // Catch: java.lang.Throwable -> L19
            ekrw r0 = r0.j()     // Catch: java.lang.Throwable -> L19
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L19
            r0.X(r1, r4)     // Catch: java.lang.Throwable -> L19
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L19
            ekrz r1 = defpackage.cqnc.I     // Catch: java.lang.Throwable -> L19
            aubq r9 = r9.l     // Catch: java.lang.Throwable -> L19
            java.lang.String r9 = r9.d     // Catch: java.lang.Throwable -> L19
            r0.X(r1, r9)     // Catch: java.lang.Throwable -> L19
            r9 = 87
            ekrw r9 = r0.h(r3, r2, r9, r6)     // Catch: java.lang.Throwable -> L19
            ekrd r9 = (defpackage.ekrd) r9     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "E2EE is not provisioned when trying to download remote instance."
            r9.q(r0)     // Catch: java.lang.Throwable -> L19
            qam r9 = new qam     // Catch: java.lang.Throwable -> L19
            r9.<init>()     // Catch: java.lang.Throwable -> L19
            return r9
        L94:
            ekrg r0 = defpackage.bwfq.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r4)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r0 = r0.g(r9)
            r1 = 91
            ekrw r0 = r0.h(r3, r2, r1, r6)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Failed to download registration IDs."
            r0.q(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfn bwfnVar = new bwfn(fcxyVar, this.b, this.c, this.d);
        bwfnVar.e = obj;
        return bwfnVar;
    }
}
