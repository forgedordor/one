package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tft implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ tfx b;

    public tft(fdpm fdpmVar, tfx tfxVar) {
        this.a = fdpmVar;
        this.b = tfxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.tfs
            if (r0 == 0) goto L13
            r0 = r11
            tfs r0 = (defpackage.tfs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tfs r0 = new tfs
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r11)
            goto L8a
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.fctl.b(r11)
            fdpm r11 = r9.a
            ekgb r10 = (defpackage.ekgb) r10
            java.util.Iterator r2 = r10.iterator()
        L3a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L63
            java.lang.Object r4 = r2.next()
            r6 = r4
            akcf r6 = (defpackage.akcf) r6
            aukf r7 = r6.a
            aukf r8 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY
            if (r7 != r8) goto L3a
            java.lang.String r6 = r6.d
            tfx r7 = r9.b
            cogw r7 = r7.a
            j$.time.MonthDay r7 = defpackage.tep.c(r7)
            java.lang.String r7 = r7.toString()
            boolean r6 = defpackage.fdbq.f(r6, r7)
            if (r6 == 0) goto L3a
            goto L64
        L63:
            r4 = r5
        L64:
            java.util.Iterator r10 = r10.iterator()
        L68:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r10.next()
            r6 = r2
            akcf r6 = (defpackage.akcf) r6
            aukf r6 = r6.a
            aukf r7 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY
            if (r6 != r7) goto L68
            r5 = r2
        L7c:
            fcti r10 = new fcti
            r10.<init>(r4, r5)
            r0.b = r3
            java.lang.Object r10 = r11.fO(r10, r0)
            if (r10 != r1) goto L8a
            return r1
        L8a:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tft.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
