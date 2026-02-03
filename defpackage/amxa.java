package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amxa extends cayv {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/content/download/ReflectionAttachmentCompletedHandler");
    private static final cohg b = new cohf("ReflectionAttachmentCompletedHandler::processPendingWorkItemAsync");
    private final fdjx c;
    private final fcsu d;

    public amxa(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return b.a();
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = amxd.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        amxd amxdVar = (amxd) evuhVar;
        amxdVar.getClass();
        return auvw.c(this.c, fcyi.a, fdjz.a, new amwz(this, amxdVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r4.b(r11, (android.net.Uri) r2, r12) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.amxd r11, defpackage.fcxy r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.amwy
            if (r0 == 0) goto L13
            r0 = r12
            amwy r0 = (defpackage.amwy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amwy r0 = new amwy
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> L2b
            goto Lae
        L2b:
            r11 = move-exception
            goto Lb3
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r11 = r0.e
            amxd r2 = r0.d
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> L2b
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L8d
        L42:
            defpackage.fctl.b(r12)
            efil r12 = com.google.android.rcs.client.messaging.data.ContentType.d()     // Catch: java.lang.Exception -> L2b
            aubx r2 = r11.f     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto L4f
            aubx r2 = defpackage.aubx.a     // Catch: java.lang.Exception -> L2b
        L4f:
            java.lang.String r2 = r2.c     // Catch: java.lang.Exception -> L2b
            r12.f(r2)     // Catch: java.lang.Exception -> L2b
            aubx r2 = r11.f     // Catch: java.lang.Exception -> L2b
            if (r2 != 0) goto L5a
            aubx r2 = defpackage.aubx.a     // Catch: java.lang.Exception -> L2b
        L5a:
            java.lang.String r2 = r2.d     // Catch: java.lang.Exception -> L2b
            r12.e(r2)     // Catch: java.lang.Exception -> L2b
            com.google.android.rcs.client.messaging.data.ContentType r12 = r12.g()     // Catch: java.lang.Exception -> L2b
            fcsu r2 = r10.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L2b
            amwr r2 = (defpackage.amwr) r2     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r12.f()     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r11.g     // Catch: java.lang.Exception -> L2b
            r6.getClass()     // Catch: java.lang.Exception -> L2b
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r11.d     // Catch: java.lang.Exception -> L2b
            r7.getClass()     // Catch: java.lang.Exception -> L2b
            r0.d = r11     // Catch: java.lang.Exception -> L2b
            r8 = r12
            com.google.android.rcs.client.messaging.data.AutoValue_ContentType r8 = (com.google.android.rcs.client.messaging.data.AutoValue_ContentType) r8     // Catch: java.lang.Exception -> L2b
            r0.e = r8     // Catch: java.lang.Exception -> L2b
            r0.c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r2.a(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L2b
            if (r2 != r1) goto L8d
            goto Lad
        L8d:
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Exception -> L2b
            fcsu r4 = r10.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Exception -> L2b
            amwr r4 = (defpackage.amwr) r4     // Catch: java.lang.Exception -> L2b
            java.lang.String r11 = r11.j     // Catch: java.lang.Exception -> L2b
            r11.getClass()     // Catch: java.lang.Exception -> L2b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L2b
            r5 = 0
            r0.d = r5     // Catch: java.lang.Exception -> L2b
            r0.e = r5     // Catch: java.lang.Exception -> L2b
            r0.c = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = r4.b(r11, r2, r12)     // Catch: java.lang.Exception -> L2b
            if (r11 != r1) goto Lae
        Lad:
            return r1
        Lae:
            cbcw r11 = defpackage.cbcw.i()
            return r11
        Lb3:
            ekrg r12 = defpackage.amxa.a
            ekrw r12 = r12.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleRcs"
            r12.X(r0, r1)
            ekrd r12 = (defpackage.ekrd) r12
            ekrw r11 = r12.g(r11)
            r12 = 66
            java.lang.String r0 = "ReflectionAttachmentCompletedHandler.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/message/content/download/ReflectionAttachmentCompletedHandler"
            java.lang.String r2 = "processInternal"
            ekrw r11 = r11.h(r1, r2, r12, r0)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r12 = "Persist the file to bugle DB failed."
            r11.q(r12)
            cbcw r11 = defpackage.cbcw.k()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amxa.k(amxd, fcxy):java.lang.Object");
    }
}
