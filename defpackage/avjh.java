package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjh extends fcyz implements fdat {
    int a;
    final /* synthetic */ avjj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjh(avjj avjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r5.d(r2, r1, r4) == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r5)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L60
        Ld:
            defpackage.fctl.b(r5)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L2d
        L11:
            r5 = move-exception
            goto L45
        L13:
            defpackage.fctl.b(r5)
            aviz r5 = defpackage.avjc.a     // Catch: android.database.sqlite.SQLiteException -> L11
            avjj r1 = r4.b     // Catch: android.database.sqlite.SQLiteException -> L11
            egsh r3 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            fcsu r1 = r1.d     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L11
            cmfo r1 = (defpackage.cmfo) r1     // Catch: android.database.sqlite.SQLiteException -> L11
            r4.a = r2     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r5 = r5.d(r3, r1, r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r5 != r0) goto L2d
            goto L44
        L2d:
            avkf r5 = defpackage.avki.a     // Catch: android.database.sqlite.SQLiteException -> L11
            avjj r1 = r4.b     // Catch: android.database.sqlite.SQLiteException -> L11
            egsh r2 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            fcsu r1 = r1.d     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r1 = r1.b()     // Catch: android.database.sqlite.SQLiteException -> L11
            cmfo r1 = (defpackage.cmfo) r1     // Catch: android.database.sqlite.SQLiteException -> L11
            r3 = 2
            r4.a = r3     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r5 = r5.d(r2, r1, r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r5 != r0) goto L60
        L44:
            return r0
        L45:
            avjj r0 = r4.b
            fcsu r0 = r0.c
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L63
            eksp r0 = defpackage.avjj.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Caught SQLiteException when enqueueing to WorkManager."
            defpackage.a.N(r0, r1, r5)
        L60:
            fctx r5 = defpackage.fctx.a
            return r5
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avjh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avjh(this.b, fcxyVar);
    }
}
