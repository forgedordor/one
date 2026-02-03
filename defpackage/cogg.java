package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cogg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cogh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cogg(cogh coghVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = coghVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cogg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r1.c(r10) == r0) goto L16;
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
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateZeroOrNullCharsetForTextParts$1"
            java.lang.String r4 = "BugleTelephony"
            r5 = 1
            java.lang.String r6 = "TelephonyDatabaseUpdater.kt"
            if (r1 == 0) goto L1b
            if (r1 == r5) goto L15
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L19
            goto L7d
        L15:
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L19
            goto L33
        L19:
            r11 = move-exception
            goto L5f
        L1b:
            defpackage.fctl.b(r11)
            ayrq r11 = defpackage.ayrq.a     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "PduPartUpdater#updateZeroOrNullCharsetForTextParts"
            cogf r7 = new cogf     // Catch: java.lang.Exception -> L19
            cogh r8 = r10.b     // Catch: java.lang.Exception -> L19
            r9 = 0
            r7.<init>(r8, r9)     // Catch: java.lang.Exception -> L19
            r10.a = r5     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = r11.a(r1, r7, r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r0) goto L33
            goto L5e
        L33:
            cogh r1 = r10.b     // Catch: java.lang.Exception -> L19
            fdhi r11 = (defpackage.fdhi) r11     // Catch: java.lang.Exception -> L19
            long r7 = r11.c     // Catch: java.lang.Exception -> L19
            ekrg r11 = defpackage.cogh.a     // Catch: java.lang.Exception -> L19
            ekrw r11 = r11.e()     // Catch: java.lang.Exception -> L19
            ekrz r5 = defpackage.eksq.a     // Catch: java.lang.Exception -> L19
            r11.X(r5, r4)     // Catch: java.lang.Exception -> L19
            r5 = 82
            ekrw r11 = r11.h(r3, r2, r5, r6)     // Catch: java.lang.Exception -> L19
            ekrd r11 = (defpackage.ekrd) r11     // Catch: java.lang.Exception -> L19
            java.lang.String r5 = "TelephonyDatabaseUpdater#updateZeroOrNullCharsetForTextParts time: [%s]ms"
            long r7 = defpackage.fdhi.g(r7)     // Catch: java.lang.Exception -> L19
            r11.s(r5, r7)     // Catch: java.lang.Exception -> L19
            r11 = 2
            r10.a = r11     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = r1.c(r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r0) goto L7d
        L5e:
            return r0
        L5f:
            ekrg r0 = defpackage.cogh.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r4)
            ekrd r0 = (defpackage.ekrd) r0
            ekrw r11 = r0.g(r11)
            r0 = 89
            ekrw r11 = r11.h(r3, r2, r0, r6)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Error thrown during MMS charset update!"
            r11.q(r0)
        L7d:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cogg(this.b, fcxyVar);
    }
}
