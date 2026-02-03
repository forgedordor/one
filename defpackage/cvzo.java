package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvzo extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvzp b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvzo(cvzp cvzpVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvzpVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvzo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r0.a(r3, r10) == r1) goto L24;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r1 = defpackage.fcyl.a
            int r0 = r10.a
            java.lang.String r2 = "HeaderUiAdapterImpl.kt"
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 1
            if (r0 == 0) goto L20
            if (r0 == r4) goto L15
            defpackage.fctl.b(r11)
            goto Lbe
        L15:
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            goto L4a
        L19:
            r0 = move-exception
            r11 = r0
            goto Lc1
        L1d:
            r0 = move-exception
            r11 = r0
            goto L55
        L20:
            defpackage.fctl.b(r11)
            cvzp r11 = r10.b
            fduf r0 = r11.n
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r0.f(r5)
            fcsu r0 = r11.m     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            ajln r0 = (defpackage.ajln) r0     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r11 = r11.d     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            android.net.Uri r5 = r10.c     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            eiju r11 = r0.E(r11, r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            r11.getClass()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            r10.a = r4     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            java.lang.Object r11 = defpackage.fdxs.c(r11, r10)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            if (r11 != r1) goto L4a
            goto Lbd
        L4a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            cvzp r0 = r10.b
            fduf r0 = r0.n
            r0.f(r3)
            r3 = r11
            goto L80
        L55:
            ekrg r0 = defpackage.cvzp.a     // Catch: java.lang.Throwable -> L19
            ekrw r0 = r0.j()     // Catch: java.lang.Throwable -> L19
            ekrz r4 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "BugleCdp"
            r0.X(r4, r5)     // Catch: java.lang.Throwable -> L19
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L19
            ekrw r11 = r0.g(r11)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "com/google/android/apps/messaging/ui/conversation/details/header/HeaderUiAdapterImpl$updateIcon$1"
            java.lang.String r4 = "invokeSuspend"
            r5 = 180(0xb4, float:2.52E-43)
            ekrw r11 = r11.h(r0, r4, r5, r2)     // Catch: java.lang.Throwable -> L19
            ekrd r11 = (defpackage.ekrd) r11     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "Failed to update group icon"
            r11.q(r0)     // Catch: java.lang.Throwable -> L19
            cvzp r11 = r10.b
            fduf r11 = r11.n
            r11.f(r3)
        L80:
            boolean r11 = r3.booleanValue()
            if (r11 != 0) goto Lbe
            cvzp r11 = r10.b
            fcsu r0 = r11.f
            java.lang.Object r0 = r0.b()
            aaft r0 = (defpackage.aaft) r0
            android.content.Context r2 = r11.c
            aafw r3 = new aafw
            r4 = 2132084022(0x7f150536, float:1.9808203E38)
            java.lang.String r4 = r2.getString(r4)
            r4.getClass()
            android.net.Uri r5 = r10.c
            r6 = 2132084023(0x7f150537, float:1.9808205E38)
            java.lang.String r2 = r2.getString(r6)
            cvzn r8 = new cvzn
            r8.<init>()
            r9 = 41
            r6 = 0
            r7 = 2
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = r0.a(r3, r10)
            if (r11 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            fctx r11 = defpackage.fctx.a
            return r11
        Lc1:
            cvzp r0 = r10.b
            fduf r0 = r0.n
            r0.f(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvzo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvzo(this.b, this.c, fcxyVar);
    }
}
