package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asoq {
    public static final egyj a = new egyb("RbmDeepLinkingMetadata");
    public static final eksp b = eksp.c("BugleRbmDeepLinking");
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final awhr l;
    public final ConcurrentMap m;
    private final fcsu n;
    private final fcsu o;

    public asoq(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, awhr awhrVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar10.getClass();
        awhrVar.getClass();
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.n = fcsuVar3;
        this.o = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
        this.k = fcsuVar10;
        this.l = awhrVar;
        this.m = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ekgb r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.asoo
            if (r0 == 0) goto L13
            r0 = r8
            asoo r0 = (defpackage.asoo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asoo r0 = new asoo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            eieu r7 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L59
        L2a:
            r8 = move-exception
            goto L67
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "RbmBusinessInfoMetadataDataService.getOrCreateConversation"
            eieu r8 = defpackage.eiiy.h(r8)
            fcsu r2 = r6.o     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L63
            ajln r2 = (defpackage.ajln) r2     // Catch: java.lang.Throwable -> L63
            eiju r7 = r2.m(r7, r3)     // Catch: java.lang.Throwable -> L63
            r7.getClass()     // Catch: java.lang.Throwable -> L63
            r0.d = r8     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 == r1) goto L62
            r5 = r8
            r8 = r7
            r7 = r5
        L59:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r8 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r8     // Catch: java.lang.Throwable -> L2a
            defpackage.fczl.a(r7, r3)
            r8.getClass()
            return r8
        L62:
            return r1
        L63:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L67:
            throw r8     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asoq.a(ekgb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.asop
            if (r0 == 0) goto L13
            r0 = r5
            asop r0 = (defpackage.asop) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asop r0 = new asop
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.n
            java.lang.Object r5 = r5.b()
            aofc r5 = (defpackage.aofc) r5
            eiju r5 = r5.f()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5.getClass()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = defpackage.fdct.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asoq.b(fcxy):java.lang.Object");
    }
}
