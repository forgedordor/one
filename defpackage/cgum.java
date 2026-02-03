package defpackage;

import android.location.Location;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgum implements cgte {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl");
    public static final egyj b = new egyb("GEMINI_ENTRY_POINT_SETTINGS_DATA_SERVICE_KEY");
    public final fdjx c;
    public final lkb d;
    public final fcsu e;
    private final fdjx f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public cgum(fdjx fdjxVar, fdjx fdjxVar2, lkb lkbVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        lkbVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.f = fdjxVar;
        this.c = fdjxVar2;
        this.d = lkbVar;
        this.g = fcsuVar;
        this.e = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
    }

    @Override // defpackage.cgte
    public final ehaw a() {
        return new cgtn(this);
    }

    @Override // defpackage.cgte
    public final eiju b() {
        return auvw.b(new cgto(this), this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cgtg
            if (r0 == 0) goto L13
            r0 = r8
            cgtg r0 = (defpackage.cgtg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgtg r0 = new cgtg
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            int r0 = r0.a
            defpackage.fctl.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            goto L53
        L39:
            defpackage.fctl.b(r8)
            r0.d = r4
            fdjx r8 = r7.f
            fcyh r8 = r8.hE()
            fcyh r8 = defpackage.eicg.a(r8)
            cgth r2 = new cgth
            r2.<init>(r5, r7)
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L92
        L53:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L91
            fcsu r2 = r7.g
            int r8 = r8.intValue()
            java.lang.Object r2 = r2.b()
            egbf r2 = (defpackage.egbf) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e()
            r0.a = r8
            r0.d = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L92
            r6 = r0
            r0 = r8
            r8 = r6
        L74:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L7d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r8.next()
            r2 = r1
            efwo r2 = (defpackage.efwo) r2
            int r2 = r2.a()
            if (r2 != r0) goto L7d
            return r1
        L91:
            return r5
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgum.c(fcxy):java.lang.Object");
    }

    @Override // defpackage.cgte
    public final Object d(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f.hE()), new cgti(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cgtk
            if (r0 == 0) goto L13
            r0 = r8
            cgtk r0 = (defpackage.cgtk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgtk r0 = new cgtk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Integer r0 = r0.d
            defpackage.fctl.b(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            goto L53
        L39:
            defpackage.fctl.b(r8)
            fdjx r8 = r7.f
            fcyh r8 = r8.hE()
            fcyh r8 = defpackage.eicg.a(r8)
            cgtj r2 = new cgtj
            r2.<init>(r3, r7)
            r0.c = r5
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L92
        L53:
            fcsu r2 = r7.g
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r2 = r2.b()
            egbf r2 = (defpackage.egbf) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e()
            r0.d = r8
            r0.c = r4
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L92
            r6 = r0
            r0 = r8
            r8 = r6
        L6e:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r8.next()
            r2 = r1
            efwo r2 = (defpackage.efwo) r2
            int r2 = r2.a()
            if (r0 == 0) goto L77
            int r4 = r0.intValue()
            if (r2 != r4) goto L77
            return r1
        L91:
            return r3
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgum.e(fcxy):java.lang.Object");
    }

    @Override // defpackage.cgte
    public final Object f(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f.hE()), new cgtl(null, this), fcxyVar);
    }

    @Override // defpackage.cgte
    public final Object g(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f.hE()), new cgtp(null, this), fcxyVar);
    }

    @Override // defpackage.cgte
    public final Object h(efwo efwoVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f.hE()), new cgtq(null, this, efwoVar), fcxyVar);
    }

    @Override // defpackage.cgte
    public final Object i(String str, fcxy fcxyVar) {
        Object objA = this.d.a(new cgtz(str, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.cgte
    public final fdvc j(efwo efwoVar) {
        return fdtg.b(new cgtt(this.d.b(), efwoVar), this.c, fdur.a, false);
    }

    @Override // defpackage.cgte
    public final void k() {
        auvw.k(this.f, null, null, new cgty(this, null), 3);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl", "resetPenpalData", 210, "PenpalSettingsDataServiceImpl.kt")).q("Reset Penpal data");
    }

    @Override // defpackage.cgte
    public final void l(efwo efwoVar) {
        auvw.k(this.f, null, null, new cgub(this, efwoVar, null), 3);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl", "setActiveUser", 133, "PenpalSettingsDataServiceImpl.kt")).r("Setting active Penpal user to AccountId=%s", ((efwq) efwoVar).a);
    }

    @Override // defpackage.cgte
    public final void m(boolean z) {
        auvw.k(this.f, null, null, new cgue(z, this, null), 3);
    }

    @Override // defpackage.cgte
    public final void n() {
        auvw.k(this.f, null, null, new cgug(this, null), 3);
    }

    @Override // defpackage.cgte
    public final void o(efwo efwoVar) {
        auvw.k(this.f, null, null, new cgui(this, efwoVar, null), 3);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl", "setHasUserConsented", 104, "PenpalSettingsDataServiceImpl.kt")).r("User consented to Penpal chat v1 AccountId=%s", efwoVar.a());
    }

    @Override // defpackage.cgte
    public final void p(Location location) {
        auvw.k(this.f, null, null, new cguk(this, location, null), 3);
    }

    @Override // defpackage.cgte
    public final void q() {
        auvw.k(this.f, null, null, new cgtw(this, null), 3);
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGemini");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/penpal/settings/PenpalSettingsDataServiceImpl", "onUserSignOut", 153, "PenpalSettingsDataServiceImpl.kt")).t("User signed out, Penpal chat cleared AccountId=%s", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cgtf
            if (r0 == 0) goto L13
            r0 = r6
            cgtf r0 = (defpackage.cgtf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgtf r0 = new cgtf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.s(r0)
            if (r6 == r1) goto L63
        L41:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r6
            if (r6 == 0) goto L60
            fcsu r2 = r5.h
            java.lang.Object r2 = r2.b()
            ajln r2 = (defpackage.ajln) r2
            elka r4 = defpackage.elka.CONVERSATION_FROM_MORE_BUTTON
            eiju r6 = r2.d(r6, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L63
        L5e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L60:
            fctx r6 = defpackage.fctx.a
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgum.r(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cgtu
            if (r0 == 0) goto L13
            r0 = r5
            cgtu r0 = (defpackage.cgtu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgtu r0 = new cgtu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L66
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fcsu r5 = r4.j
            java.lang.Object r5 = r5.b()
            alrj r5 = (defpackage.alrj) r5
            alqm r5 = r5.v()
            fcsu r2 = r4.i
            java.lang.Object r2 = r2.b()
            anty r2 = (defpackage.anty) r2
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r5 = r2.h(r5)
            fcsu r2 = r4.h
            java.lang.Object r2 = r2.b()
            ajln r2 = (defpackage.ajln) r2
            ekgb r5 = defpackage.ekgb.r(r5)
            eiju r5 = r2.j(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            r5.getClass()
            j$.util.Optional r5 = (j$.util.Optional) r5
            java.lang.Object r5 = defpackage.fdct.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgum.s(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cgul
            if (r0 == 0) goto L13
            r0 = r6
            cgul r0 = (defpackage.cgul) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgul r0 = new cgul
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.s(r0)
            if (r6 == r1) goto L63
        L41:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r6
            if (r6 == 0) goto L60
            fcsu r2 = r5.h
            java.lang.Object r2 = r2.b()
            ajln r2 = (defpackage.ajln) r2
            elka r4 = defpackage.elka.CONVERSATION_FROM_MORE_BUTTON
            eiju r6 = r2.C(r6, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L63
        L5e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L60:
            fctx r6 = defpackage.fctx.a
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgum.t(fcxy):java.lang.Object");
    }
}
