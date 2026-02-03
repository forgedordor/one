package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygy implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ yhw b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ fdpl d;

    public ygy(fdpm fdpmVar, yhw yhwVar, fdjx fdjxVar, fdpl fdplVar) {
        this.a = fdpmVar;
        this.b = yhwVar;
        this.c = fdjxVar;
        this.d = fdplVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [dlpy] */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ygx
            if (r0 == 0) goto L13
            r0 = r14
            ygx r0 = (defpackage.ygx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ygx r0 = new ygx
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r14)
            goto Le6
        L28:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L30:
            defpackage.fctl.b(r14)
            fdpm r14 = r12.a
            ekgb r13 = (defpackage.ekgb) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r13, r4)
            r2.<init>(r4)
            java.util.Iterator r4 = r13.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r4.next()
            ajld r5 = (defpackage.ajld) r5
            yhw r6 = r12.b
            fcsu r6 = r6.e
            java.lang.Object r6 = r6.b()
            cphz r6 = (defpackage.cphz) r6
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = r5.a()
            dkpf r5 = r6.c(r5)
            r2.add(r5)
            goto L46
        L68:
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 != 0) goto Ldd
            yhw r4 = r12.b
            dlpy r6 = new dlpy
            boolean r7 = r13.isEmpty()
            if (r7 == 0) goto L7a
            goto Ld0
        L7a:
            java.lang.Object r5 = defpackage.fcva.N(r13)
            ajld r5 = (defpackage.ajld) r5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = r5.a()
            r7 = 0
            java.lang.String r5 = r5.x(r7)
            boolean r8 = defpackage.aqbw.a()
            if (r8 == 0) goto L94
            java.lang.String r5 = defpackage.cssf.a(r5)
            goto L9a
        L94:
            cssf r8 = r4.f
            java.lang.String r5 = r8.d(r5)
        L9a:
            int r8 = r13.size()
            if (r8 != r3) goto Lb2
            android.content.Context r8 = r4.b
            android.content.res.Resources r8 = r8.getResources()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r7] = r5
            r5 = 2132088211(0x7f151593, float:1.98167E38)
            java.lang.String r5 = r8.getString(r5, r9)
            goto Ld0
        Lb2:
            int r8 = r13.size()
            int r8 = r8 + (-1)
            android.content.Context r9 = r4.b
            android.content.res.Resources r9 = r9.getResources()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r7] = r5
            r11[r3] = r10
            r5 = 2131951713(0x7f130061, float:1.9539848E38)
            java.lang.String r5 = r9.getQuantityString(r5, r8, r11)
        Ld0:
            fdjx r7 = r12.c
            fdpl r8 = r12.d
            yhv r9 = new yhv
            r9.<init>(r4, r7, r13, r8)
            r6.<init>(r2, r5, r9)
            r5 = r6
        Ldd:
            r0.b = r3
            java.lang.Object r13 = r14.fO(r5, r0)
            if (r13 != r1) goto Le6
            return r1
        Le6:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygy.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
