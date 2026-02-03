package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbeh extends fcmy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbeh(fbnd fbndVar, fbnc fbncVar) {
        super(fbndVar, fbncVar);
        fbncVar.getClass();
    }

    @Override // defpackage.fcrn
    public final /* bridge */ /* synthetic */ fcrn a(fbnd fbndVar, fbnc fbncVar) {
        return new dbeh(fbndVar, fbncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dbdf r8, defpackage.fbrg r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dbeg
            if (r0 == 0) goto L13
            r0 = r10
            dbeg r0 = (defpackage.dbeg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dbeg r0 = new dbeg
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r10)
            goto L83
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.fctl.b(r10)
            fbnd r1 = r7.a
            fbrk r10 = defpackage.dbef.a
            if (r10 != 0) goto L75
            java.lang.Class<dbef> r3 = defpackage.dbef.class
            monitor-enter(r3)
            fbrk r10 = defpackage.dbef.a     // Catch: java.lang.Throwable -> L71
            if (r10 != 0) goto L6f
            fbrh r10 = defpackage.fbrk.a()     // Catch: java.lang.Throwable -> L71
            fbrj r4 = defpackage.fbrj.UNARY     // Catch: java.lang.Throwable -> L71
            r10.c = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "stargate.QuestionnaireService"
            java.lang.String r5 = "GetQuestionnaire"
            java.lang.String r4 = defpackage.fbrk.c(r4, r5)     // Catch: java.lang.Throwable -> L71
            r10.d = r4     // Catch: java.lang.Throwable -> L71
            r10.b()     // Catch: java.lang.Throwable -> L71
            dbdf r4 = defpackage.dbdf.a     // Catch: java.lang.Throwable -> L71
            evrr r5 = defpackage.fcrj.a     // Catch: java.lang.Throwable -> L71
            fcrh r5 = new fcrh     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.a = r5     // Catch: java.lang.Throwable -> L71
            dbdh r4 = defpackage.dbdh.a     // Catch: java.lang.Throwable -> L71
            fcrh r5 = new fcrh     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.b = r5     // Catch: java.lang.Throwable -> L71
            fbrk r10 = r10.a()     // Catch: java.lang.Throwable -> L71
            defpackage.dbef.a = r10     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r0 = move-exception
            r8 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r8
        L75:
            fbnc r4 = r7.b
            r6.c = r2
            r3 = r8
            r5 = r9
            r2 = r10
            java.lang.Object r10 = defpackage.fcnh.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L83
            return r0
        L83:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbeh.b(dbdf, fbrg, fcxy):java.lang.Object");
    }
}
