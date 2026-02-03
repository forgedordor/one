package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwfq b;
    final /* synthetic */ ekot c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfk(fcxy fcxyVar, bwfq bwfqVar, ekot ekotVar) {
        super(2, fcxyVar);
        this.b = bwfqVar;
        this.c = ekotVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r10.b(1, r14, r13) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r14.b(0, r1, r13) != r0) goto L33;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 0
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl$doSetupScytaleSessions$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "BugleE2eeEtouffee"
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r9 = "EtouffeeSessionSetupImpl.kt"
            if (r1 == 0) goto L29
            if (r1 == r8) goto L22
            if (r1 == r7) goto L1d
            if (r1 == r6) goto L1d
            defpackage.fctl.b(r14)
            goto Ldb
        L1d:
            defpackage.fctl.b(r14)     // Catch: java.lang.RuntimeException -> L26
            goto Ldb
        L22:
            defpackage.fctl.b(r14)     // Catch: java.lang.RuntimeException -> L26
            goto L4e
        L26:
            r14 = move-exception
            goto La2
        L29:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.d
            fdjx r14 = (defpackage.fdjx) r14
            bwfq r14 = r13.b     // Catch: java.lang.RuntimeException -> L26
            ekot r1 = r13.c     // Catch: java.lang.RuntimeException -> L26
            r13.a = r8     // Catch: java.lang.RuntimeException -> L26
            fcyh r10 = r14.i     // Catch: java.lang.RuntimeException -> L26
            fcyh r10 = defpackage.eicg.a(r10)     // Catch: java.lang.RuntimeException -> L26
            bwfj r11 = new bwfj     // Catch: java.lang.RuntimeException -> L26
            r12 = 0
            r11.<init>(r12, r14, r1)     // Catch: java.lang.RuntimeException -> L26
            java.lang.Object r14 = defpackage.fdin.a(r10, r11, r13)     // Catch: java.lang.RuntimeException -> L26
            if (r14 == r0) goto L4a
            fctx r14 = defpackage.fctx.a     // Catch: java.lang.RuntimeException -> L26
        L4a:
            if (r14 != r0) goto L4e
            goto Lda
        L4e:
            ekrg r14 = defpackage.bwfq.a     // Catch: java.lang.RuntimeException -> L26
            ekrw r14 = r14.e()     // Catch: java.lang.RuntimeException -> L26
            ekrz r1 = defpackage.eksq.a     // Catch: java.lang.RuntimeException -> L26
            r14.X(r1, r5)     // Catch: java.lang.RuntimeException -> L26
            ekrd r14 = (defpackage.ekrd) r14     // Catch: java.lang.RuntimeException -> L26
            ekrz r1 = defpackage.cqnc.I     // Catch: java.lang.RuntimeException -> L26
            bwfq r10 = r13.b     // Catch: java.lang.RuntimeException -> L26
            aubq r11 = r10.l     // Catch: java.lang.RuntimeException -> L26
            java.lang.String r11 = r11.d     // Catch: java.lang.RuntimeException -> L26
            r14.X(r1, r11)     // Catch: java.lang.RuntimeException -> L26
            r1 = 131(0x83, float:1.84E-43)
            ekrw r14 = r14.h(r4, r3, r1, r9)     // Catch: java.lang.RuntimeException -> L26
            ekrd r14 = (defpackage.ekrd) r14     // Catch: java.lang.RuntimeException -> L26
            java.lang.String r1 = "Scytale sessions were established"
            r14.q(r1)     // Catch: java.lang.RuntimeException -> L26
            fcsu r14 = r10.j     // Catch: java.lang.RuntimeException -> L26
            java.lang.Object r14 = r14.b()     // Catch: java.lang.RuntimeException -> L26
            bwbo r14 = (defpackage.bwbo) r14     // Catch: java.lang.RuntimeException -> L26
            android.content.Context r14 = r14.a     // Catch: java.lang.RuntimeException -> L26
            boolean r1 = defpackage.dhka.k(r14)     // Catch: java.lang.RuntimeException -> L26
            if (r1 == 0) goto L97
            java.lang.String r1 = "FileTransferServiceVersions"
            boolean r14 = defpackage.dhka.g(r14, r1, r7)     // Catch: java.lang.RuntimeException -> L26
            if (r14 == 0) goto L8c
            goto L97
        L8c:
            bwvi r14 = defpackage.bwvi.DOWNGRADE_FILE_UPLOAD_NOT_SUPPORTED     // Catch: java.lang.RuntimeException -> L26
            r13.a = r6     // Catch: java.lang.RuntimeException -> L26
            java.lang.Object r14 = r10.b(r2, r14, r13)     // Catch: java.lang.RuntimeException -> L26
            if (r14 != r0) goto Ldb
            goto Lda
        L97:
            bwvi r14 = defpackage.bwvi.DEFAULT     // Catch: java.lang.RuntimeException -> L26
            r13.a = r7     // Catch: java.lang.RuntimeException -> L26
            java.lang.Object r14 = r10.b(r8, r14, r13)     // Catch: java.lang.RuntimeException -> L26
            if (r14 != r0) goto Ldb
            goto Lda
        La2:
            ekrg r1 = defpackage.bwfq.a
            ekrw r1 = r1.j()
            ekrz r6 = defpackage.eksq.a
            r1.X(r6, r5)
            ekrd r1 = (defpackage.ekrd) r1
            ekrw r14 = r1.g(r14)
            r1 = 144(0x90, float:2.02E-43)
            ekrw r14 = r14.h(r4, r3, r1, r9)
            ekrd r14 = (defpackage.ekrd) r14
            java.lang.String r1 = "Failed to establish Scytale session"
            r14.q(r1)
            bwfq r14 = r13.b
            fcsu r1 = r14.k
            java.lang.Object r1 = r1.b()
            ains r1 = (defpackage.ains) r1
            java.lang.String r3 = "Bugle.Etouffee.Session.Failure.Count"
            r1.c(r3)
            bwvi r1 = defpackage.bwvi.DOWNGRADE_FAILED_TO_SETUP_SCYTALE
            r3 = 4
            r13.a = r3
            java.lang.Object r14 = r14.b(r2, r1, r13)
            if (r14 != r0) goto Ldb
        Lda:
            return r0
        Ldb:
            fctx r14 = defpackage.fctx.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwfk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfk bwfkVar = new bwfk(fcxyVar, this.b, this.c);
        bwfkVar.d = obj;
        return bwfkVar;
    }
}
