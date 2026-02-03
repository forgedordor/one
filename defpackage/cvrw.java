package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvrw implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ cvry b;

    public cvrw(fdpm fdpmVar, cvry cvryVar) {
        this.a = fdpmVar;
        this.b = cvryVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cvrv
            if (r0 == 0) goto L13
            r0 = r12
            cvrv r0 = (defpackage.cvrv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvrv r0 = new cvrv
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r12)
            goto Lbb
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.fctl.b(r12)
            fdpm r12 = r10.a
            ajlk r11 = (defpackage.ajlk) r11
            cvry r2 = r10.b
            ajlj r4 = r11.c()
            r4.getClass()
            ajlj r5 = defpackage.ajlj.GROUP
            r6 = 0
            r7 = 0
            if (r4 == r5) goto L4a
            ajlj r8 = defpackage.ajlj.ONE_ON_ONE
            if (r4 != r8) goto La1
        L4a:
            fcsu r4 = r2.d
            java.lang.Object r4 = r4.b()
            csea r4 = (defpackage.csea) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8 = r2.f
            csog r8 = defpackage.csof.a(r8)
            boolean r4 = r4.e(r8)
            if (r4 != 0) goto La1
            anty r4 = r2.c
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.a
            anpj r2 = r4.d(r2)
            java.lang.Object r2 = r2.c()
            ekgb r2 = (defpackage.ekgb) r2
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L78:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L93
            java.lang.Object r8 = r2.next()
            r9 = r8
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            anzg r9 = r9.H()
            boolean r9 = r9.a()
            if (r9 == 0) goto L78
            r4.add(r8)
            goto L78
        L93:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L9a
            goto La1
        L9a:
            java.lang.Object r2 = r4.get(r6)
            r7 = r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
        La1:
            cvsa r2 = new cvsa
            ajlj r11 = r11.c()
            if (r11 != r5) goto Lab
            r11 = r3
            goto Lac
        Lab:
            r11 = r6
        Lac:
            if (r7 == 0) goto Laf
            r6 = r3
        Laf:
            r2.<init>(r7, r11, r6)
            r0.b = r3
            java.lang.Object r11 = r12.fO(r2, r0)
            if (r11 != r1) goto Lbb
            return r1
        Lbb:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvrw.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
