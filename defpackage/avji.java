package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avji extends fcyz implements fdat {
    int a;
    final /* synthetic */ avjj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avji(avjj avjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r4.a(r1, r3) == r0) goto L16;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L50
        Ld:
            defpackage.fctl.b(r4)     // Catch: android.database.sqlite.SQLiteException -> L11
            goto L25
        L11:
            r4 = move-exception
            goto L35
        L13:
            defpackage.fctl.b(r4)
            aviz r4 = defpackage.avjc.a     // Catch: android.database.sqlite.SQLiteException -> L11
            avjj r1 = r3.b     // Catch: android.database.sqlite.SQLiteException -> L11
            egsh r1 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            r3.a = r2     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r4 = r4.a(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r4 != r0) goto L25
            goto L34
        L25:
            avkf r4 = defpackage.avki.a     // Catch: android.database.sqlite.SQLiteException -> L11
            avjj r1 = r3.b     // Catch: android.database.sqlite.SQLiteException -> L11
            egsh r1 = r1.b     // Catch: android.database.sqlite.SQLiteException -> L11
            r2 = 2
            r3.a = r2     // Catch: android.database.sqlite.SQLiteException -> L11
            java.lang.Object r4 = r4.a(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L11
            if (r4 != r0) goto L50
        L34:
            return r0
        L35:
            avjj r0 = r3.b
            fcsu r0 = r0.c
            java.lang.Object r0 = r0.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            eksp r0 = defpackage.avjj.a
            ekrw r0 = r0.j()
            java.lang.String r1 = "Caught SQLiteException when enqueueing to WorkManager."
            defpackage.a.N(r0, r1, r4)
        L50:
            fctx r4 = defpackage.fctx.a
            return r4
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avji.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avji(this.b, fcxyVar);
    }
}
