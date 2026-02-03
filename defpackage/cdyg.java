package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdyg extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cdyj d;
    final /* synthetic */ cdyh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdyg(cdyj cdyjVar, cdyh cdyhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = cdyjVar;
        this.e = cdyhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdyg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.c
            java.lang.String r2 = "DeletePartCmsAttachmentHandler.kt"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L19
            if (r1 == r3) goto L14
            java.lang.Object r1 = r10.a
            defpackage.fctl.b(r11)
            goto L30
        L14:
            java.lang.Object r1 = r10.b
            java.lang.Object r5 = r10.a
            goto L1d
        L19:
            java.lang.Object r1 = r10.b
            java.lang.Object r5 = r10.a
        L1d:
            defpackage.fctl.b(r11)     // Catch: java.lang.Exception -> L22
        L20:
            r1 = r5
            goto L30
        L22:
            r11 = move-exception
            goto Lbd
        L25:
            defpackage.fctl.b(r11)
            cdyj r11 = r10.d
            evtg r11 = r11.b
            java.util.Iterator r1 = r11.iterator()
        L30:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto Ld7
            java.lang.Object r11 = r1.next()
            java.lang.String r11 = (java.lang.String) r11
            android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> Lb8
            r5.getClass()     // Catch: java.lang.Exception -> Lb8
            boolean r6 = defpackage.cdyf.a(r5)     // Catch: java.lang.Exception -> Lb8
            if (r6 != 0) goto L5e
            cdyh r5 = r10.e     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "Invalid content uri for cms attachment deletion."
            r11.getClass()     // Catch: java.lang.Exception -> Lb8
            r10.a = r1     // Catch: java.lang.Exception -> Lb8
            r10.b = r11     // Catch: java.lang.Exception -> Lb8
            r10.c = r4     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r11 = defpackage.cdyh.l(r5, r6, r11, r10)     // Catch: java.lang.Exception -> Lb8
            if (r11 != r0) goto L30
            goto Ld6
        L5e:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> Lb8
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.Exception -> Lb8
            r5.getClass()     // Catch: java.lang.Exception -> Lb8
            r6.<init>(r5)     // Catch: java.lang.Exception -> Lb8
            boolean r5 = r6.exists()     // Catch: java.lang.Exception -> Lb8
            if (r5 != 0) goto L84
            cdyh r5 = r10.e     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "Skipped local cms attachment file deletion (file not present)."
            r11.getClass()     // Catch: java.lang.Exception -> Lb8
            r10.a = r1     // Catch: java.lang.Exception -> Lb8
            r10.b = r11     // Catch: java.lang.Exception -> Lb8
            r10.c = r3     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r11 = defpackage.cdyh.l(r5, r6, r11, r10)     // Catch: java.lang.Exception -> Lb8
            if (r11 != r0) goto L30
            goto Ld6
        L84:
            boolean r5 = r6.delete()     // Catch: java.lang.Exception -> Lb8
            if (r5 == 0) goto Lb0
            ekrg r5 = defpackage.cdyh.a     // Catch: java.lang.Exception -> Lb8
            java.util.logging.Level r6 = java.util.logging.Level.INFO     // Catch: java.lang.Exception -> Lb8
            ekrd r5 = r5.a(r6)     // Catch: java.lang.Exception -> Lb8
            ekrz r6 = defpackage.eksq.a     // Catch: java.lang.Exception -> Lb8
            java.lang.String r7 = "BugleCmsMedia"
            r5.X(r6, r7)     // Catch: java.lang.Exception -> Lb8
            ekrz r6 = defpackage.bzmz.k     // Catch: java.lang.Exception -> Lb8
            r5.X(r6, r11)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "com/google/android/apps/messaging/shared/message/delete/DeletePartCmsAttachmentHandler$processPendingWorkItemAsync$1"
            java.lang.String r7 = "invokeSuspend"
            r8 = 81
            ekrw r5 = r5.h(r6, r7, r8, r2)     // Catch: java.lang.Exception -> Lb8
            ekrd r5 = (defpackage.ekrd) r5     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "Deleted local cms attachment file."
            r5.q(r6)     // Catch: java.lang.Exception -> Lb8
            goto L30
        Lb0:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = "File.delete returned false"
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lb8
            throw r5     // Catch: java.lang.Exception -> Lb8
        Lb8:
            r5 = move-exception
            r9 = r1
            r1 = r11
            r11 = r5
            r5 = r9
        Lbd:
            r1.getClass()
            r10.a = r5
            r6 = 0
            r10.b = r6
            r6 = 3
            r10.c = r6
            java.lang.String r1 = (java.lang.String) r1
            cdyh r6 = r10.e
            java.lang.String r7 = "Unable to delete local cms attachment file."
            java.lang.Object r11 = r6.k(r7, r1, r11, r10)
            if (r11 == r0) goto Ld6
            goto L20
        Ld6:
            return r0
        Ld7:
            cbcw r11 = defpackage.cbcw.i()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdyg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdyg(this.d, this.e, fcxyVar);
    }
}
