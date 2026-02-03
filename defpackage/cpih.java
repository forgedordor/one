package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpih extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpih(cpii cpiiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpiiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpih) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r8.c(r7) == r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 1
            defpackage.fctl.b(r8)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L18
            goto Ld7
        Le:
            cpii r8 = r7.b
            r7.a = r2
            java.lang.Object r8 = r8.b(r7)
            if (r8 == r0) goto Lda
        L18:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Ld7
            cpii r8 = r7.b
            boolean r1 = r8.b
            if (r1 == 0) goto L28
            goto Lba
        L28:
            java.lang.String r1 = "BlockListResolver#initialize"
            eieu r1 = defpackage.eiiy.h(r1)
            bsbo r3 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = "BlockListResolver#initialize2"
            r3.A(r4)     // Catch: java.lang.Throwable -> Ld0
            cpib r4 = new cpib     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            r3.f(r4)     // Catch: java.lang.Throwable -> Ld0
            cpic r4 = new cpic     // Catch: java.lang.Throwable -> Ld0
            r4.<init>()     // Catch: java.lang.Throwable -> Ld0
            r3.h(r4)     // Catch: java.lang.Throwable -> Ld0
            bsbm r3 = r3.b()     // Catch: java.lang.Throwable -> Ld0
            brzh r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.c     // Catch: java.lang.Throwable -> Ld0
            brzi r4 = r4.f     // Catch: java.lang.Throwable -> Ld0
            dqqj r3 = r3.q(r4)     // Catch: java.lang.Throwable -> Ld0
            brzj r3 = (defpackage.brzj) r3     // Catch: java.lang.Throwable -> Ld0
            ekgb r4 = r3.l()     // Catch: java.lang.Throwable -> Lc6
            r3.close()     // Catch: java.lang.Throwable -> Ld0
            r4.getClass()     // Catch: java.lang.Throwable -> Ld0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld0
            r3.<init>()     // Catch: java.lang.Throwable -> Ld0
            ekqh r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld0
        L68:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Ld0
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L68
            int r6 = r6.length()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L68
            r3.add(r5)     // Catch: java.lang.Throwable -> Ld0
            goto L68
        L81:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld0
        L85:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld0
            fcsu r5 = r8.a     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> Ld0
            cpio r5 = (defpackage.cpio) r5     // Catch: java.lang.Throwable -> Ld0
            j$.util.Optional r5 = r5.a(r4)     // Catch: java.lang.Throwable -> Ld0
            boolean r6 = r5.isPresent()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L85
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Ld0
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld0
            if (r5 != 0) goto L85
            r5 = 0
            r8.e(r4, r5)     // Catch: java.lang.Throwable -> Ld0
            goto L85
        Lb4:
            r8.b = r2     // Catch: java.lang.Throwable -> Ld0
            r8 = 0
            defpackage.fczl.a(r1, r8)
        Lba:
            cpii r8 = r7.b
            r1 = 2
            r7.a = r1
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto Ld7
            goto Lda
        Lc6:
            r8 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lcb
            goto Lcf
        Lcb:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.lang.Throwable -> Ld0
        Lcf:
            throw r8     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            r0 = move-exception
            defpackage.fczl.a(r1, r8)
            throw r0
        Ld7:
            fctx r8 = defpackage.fctx.a
            return r8
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpih.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpih(this.b, fcxyVar);
    }
}
