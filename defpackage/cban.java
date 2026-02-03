package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cban {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator");
    public final cbcr b;
    public final Context c;
    private final fdjx d;

    public cban(cbcr cbcrVar, Context context, fdjx fdjxVar) {
        cbcrVar.getClass();
        context.getClass();
        fdjxVar.getClass();
        this.b = cbcrVar;
        this.c = context;
        this.d = fdjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pzj r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.cbam
            if (r0 == 0) goto L13
            r0 = r12
            cbam r0 = (defpackage.cbam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbam r0 = new cbam
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r12)
            goto L73
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.fctl.b(r12)
            fdjx r12 = r10.d
            r2 = 3
            fdkf[] r2 = new defpackage.fdkf[r2]
            fcyi r5 = defpackage.fcyi.a
            fdjz r6 = defpackage.fdjz.a
            fcyh r7 = defpackage.eicg.a(r5)
            cbaj r8 = new cbaj
            r9 = 0
            r8.<init>(r9, r10, r11)
            fdkf r7 = defpackage.fdin.b(r12, r7, r6, r8)
            r2[r3] = r7
            fcyh r7 = defpackage.eicg.a(r5)
            cbak r8 = new cbak
            r8.<init>(r9, r10, r11)
            fdkf r7 = defpackage.fdin.b(r12, r7, r6, r8)
            r2[r4] = r7
            fcyh r5 = defpackage.eicg.a(r5)
            cbal r7 = new cbal
            r7.<init>(r9, r10, r11)
            fdkf r11 = defpackage.fdin.b(r12, r5, r6, r7)
            r12 = 2
            r2[r12] = r11
            r0.c = r4
            java.lang.Object r12 = defpackage.fdii.b(r2, r0)
            if (r12 == r1) goto L9f
        L73:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r11 = r12 instanceof java.util.Collection
            if (r11 == 0) goto L84
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L84
        L82:
            r3 = r4
            goto L9a
        L84:
            java.util.Iterator r11 = r12.iterator()
        L88:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L82
            java.lang.Object r12 = r11.next()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L88
        L9a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cban.a(pzj, fcxy):java.lang.Object");
    }
}
