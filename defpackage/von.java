package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class von implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Context b;
    final /* synthetic */ vop c;

    public von(fdpm fdpmVar, Context context, vop vopVar) {
        this.a = fdpmVar;
        this.b = context;
        this.c = vopVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof defpackage.vom
            if (r2 == 0) goto L17
            r2 = r1
            vom r2 = (defpackage.vom) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vom r2 = new vom
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L84
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r20
            ekgb r4 = (defpackage.ekgb) r4
            java.lang.Object r4 = defpackage.fcva.Y(r4)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r4 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r4
            r6 = 0
            if (r4 == 0) goto L50
            alqm r4 = r4.g()
            if (r4 == 0) goto L50
            java.lang.String r4 = r4.n()
            goto L51
        L50:
            r4 = r6
        L51:
            if (r4 != 0) goto L54
            goto L7b
        L54:
            android.content.Context r6 = r0.b
            dihq r7 = new dihq
            r8 = 2132086859(0x7f15104b, float:1.9813957E38)
            java.lang.String r8 = r6.getString(r8)
            r8.getClass()
            vop r6 = r0.c
            djrr r9 = defpackage.djrr.ez
            vol r10 = new vol
            r10.<init>(r6, r4)
            r18 = 996(0x3e4, float:1.396E-42)
            r17 = r10
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6 = r7
        L7b:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r6, r2)
            if (r1 != r3) goto L84
            return r3
        L84:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.von.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
