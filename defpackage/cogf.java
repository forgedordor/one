package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cogf extends fcyz implements fdap {
    int a;
    final /* synthetic */ cogh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cogf(cogh coghVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = coghVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c2, code lost:
    
        if (r2.h(r5, r18) == r0) goto L26;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            fcyl r0 = defpackage.fcyl.a
            int r2 = r1.a
            r3 = 2
            r4 = 0
            java.lang.String r5 = "TelephonyDatabaseUpdater.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater"
            java.lang.String r7 = "BugleTelephony"
            r8 = 1
            defpackage.fctl.b(r19)
            if (r2 == 0) goto L1b
            if (r2 == r8) goto L18
            goto Lc5
        L18:
            r2 = r19
            goto L7d
        L1b:
            cogh r2 = r1.b
            ekrg r9 = defpackage.cogh.a
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            r9.X(r10, r7)
            java.lang.String r10 = "queryTextPartsWithZeroOrNullCharsets"
            r11 = 417(0x1a1, float:5.84E-43)
            ekrw r9 = r9.h(r6, r10, r11, r5)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Querying pdus for update"
            r9.q(r10)
            java.util.Locale r9 = java.util.Locale.US
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = "ct"
            r11[r4] = r12
            java.lang.String r12 = "text/plain"
            r11[r8] = r12
            java.lang.String r12 = "chset"
            r11[r3] = r12
            r13 = 3
            r11[r13] = r12
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r10)
            java.lang.String r11 = "%s == '%s' AND (%s IS NULL OR %s == 0)"
            java.lang.String r15 = java.lang.String.format(r9, r11, r10)
            r15.getClass()
            fcsu r9 = r2.d
            java.lang.Object r9 = r9.b()
            r12 = r9
            egxv r12 = (defpackage.egxv) r12
            android.net.Uri r13 = defpackage.cogh.c
            java.lang.String[] r14 = defpackage.cogh.b
            r16 = 0
            r17 = 0
            eopy r9 = r12.b(r13, r14, r15, r16, r17)
            fdjx r2 = r2.e
            fdkf r2 = defpackage.auus.b(r9, r2)
            r1.a = r8
            fdme r2 = (defpackage.fdme) r2
            java.lang.Object r2 = r2.hJ(r1)
            if (r2 == r0) goto Ld0
        L7d:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r8 = r2
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> Lc8
            int r9 = r8.getCount()     // Catch: java.lang.Throwable -> Lc8
            ekrg r10 = defpackage.cogh.a     // Catch: java.lang.Throwable -> Lc8
            ekrw r10 = r10.h()     // Catch: java.lang.Throwable -> Lc8
            ekrz r11 = defpackage.eksq.a     // Catch: java.lang.Throwable -> Lc8
            r10.X(r11, r7)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r7 = "processCharsets"
            r11 = 444(0x1bc, float:6.22E-43)
            ekrw r5 = r10.h(r6, r7, r11, r5)     // Catch: java.lang.Throwable -> Lc8
            ekrd r5 = (defpackage.ekrd) r5     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = "Found [%s] null or 0 valued charset values in the parts table"
            r5.r(r6, r9)     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc8
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8
        La5:
            boolean r6 = r8.moveToNext()     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lb6
            java.lang.String r6 = r8.getString(r4)     // Catch: java.lang.Throwable -> Lc8
            r6.getClass()     // Catch: java.lang.Throwable -> Lc8
            r5.add(r6)     // Catch: java.lang.Throwable -> Lc8
            goto La5
        Lb6:
            r4 = 0
            defpackage.fczl.a(r2, r4)
            cogh r2 = r1.b
            r1.a = r3
            java.lang.Object r2 = r2.h(r5, r1)
            if (r2 != r0) goto Lc5
            goto Ld0
        Lc5:
            fctx r0 = defpackage.fctx.a
            return r0
        Lc8:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r0 = move-exception
            defpackage.fczl.a(r2, r3)
            throw r0
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cogf(this.b, (fcxy) obj).b(fctx.a);
    }
}
