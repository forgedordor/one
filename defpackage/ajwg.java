package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajwg implements ajwc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/ConversationLeaverImpl");
    public final fcyh b;
    public final fcsu c;
    private final fdjx d;
    private final cijw e;

    public ajwg(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, cijw cijwVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        cijwVar.getClass();
        this.d = fdjxVar;
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.e = cijwVar;
    }

    @Override // defpackage.ajwc
    public final eiju a(Conversation conversation, int i, auib auibVar) {
        auibVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new ajwe(this, conversation, i, auibVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ciju r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ajwf
            if (r0 == 0) goto L13
            r0 = r7
            ajwf r0 = (defpackage.ajwf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajwf r0 = new ajwf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L47
        L36:
            defpackage.fctl.b(r7)
            cijw r7 = r5.e
            eiju r6 = r7.a(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L64
        L47:
            cazi r7 = (defpackage.cazi) r7
            eiju r6 = r7.a()
            r6.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 != r1) goto L59
            goto L64
        L59:
            cbcw r7 = (defpackage.cbcw) r7
            boolean r6 = r7.e()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwg.b(ciju, fcxy):java.lang.Object");
    }
}
