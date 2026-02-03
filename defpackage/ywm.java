package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywm implements yvs {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/metatext/MetatextClickHandlerImpl");
    public final Context b;
    public final fdjx c;
    public final ahax d;
    public final ajmh e;
    public final fcyh f;
    public final fdpl g;
    public final afzc h;
    public final fcsu i;
    public final fdpl j;
    public final cliy k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final appk o;
    private final Conversation p;
    private final ywn q;
    private final eigp r;
    private final aaft s;

    public ywm(Context context, fdjx fdjxVar, ahax ahaxVar, aaft aaftVar, appk appkVar, ajmh ajmhVar, fcyh fcyhVar, Conversation conversation, fdpl fdplVar, ywn ywnVar, afzc afzcVar, fcsu fcsuVar, fdpl fdplVar2, eigp eigpVar, cliy cliyVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        ahaxVar.getClass();
        aaftVar.getClass();
        appkVar.getClass();
        ajmhVar.getClass();
        fcyhVar.getClass();
        conversation.getClass();
        fdplVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        fdplVar2.getClass();
        eigpVar.getClass();
        cliyVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = ahaxVar;
        this.s = aaftVar;
        this.o = appkVar;
        this.e = ajmhVar;
        this.f = fcyhVar;
        this.p = conversation;
        this.g = fdplVar;
        this.q = ywnVar;
        this.h = afzcVar;
        this.i = fcsuVar;
        this.j = fdplVar2;
        this.r = eigpVar;
        this.k = cliyVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
    }

    @Override // defpackage.yvs
    public final void a(ajlt ajltVar, anlb anlbVar) throws IOException {
        ajltVar.getClass();
        eieh eiehVarA = this.r.a("MetatextClickHandlerImpl#onClick");
        try {
            if (ykm.g(anlbVar)) {
                f(ajltVar);
            } else if (ykm.h(anlbVar)) {
                ywn ywnVar = this.q;
                auvw.k(((yww) ywnVar).a, null, null, new ywu((yww) ywnVar, ajltVar, null), 3);
            } else {
                auvw.k(this.c, null, null, new ywi(this, ajltVar, anlbVar, null), 3);
            }
            fczl.a(eiehVarA, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eiehVarA, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r12.a(r4, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ajlt r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.yvy
            if (r0 == 0) goto L13
            r0 = r13
            yvy r0 = (defpackage.yvy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yvy r0 = new yvy
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.fctl.b(r13)
            goto Lb2
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            defpackage.fctl.b(r13)
            goto L81
        L3a:
            defpackage.fctl.b(r13)
            goto L61
        L3e:
            defpackage.fctl.b(r13)
            appk r13 = r11.o
            boolean r13 = r13.a()
            if (r13 == 0) goto L6b
            ajmh r13 = r11.e
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r12.b()
            ekgb r12 = defpackage.ekgb.r(r12)
            cdyt r2 = defpackage.cdyt.METATEXT_MESSAGE_MANUAL_DELETION
            eiju r12 = r13.s(r12, r2)
            r0.c = r5
            java.lang.Object r13 = defpackage.fdxs.c(r12, r0)
            if (r13 == r1) goto Lb5
        L61:
            r13.getClass()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
            goto L8a
        L6b:
            ajmh r13 = r11.e
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r12.b()
            ekgb r12 = defpackage.ekgb.r(r12)
            eiju r12 = r13.r(r12)
            r0.c = r4
            java.lang.Object r13 = defpackage.fdxs.c(r12, r0)
            if (r13 == r1) goto Lb5
        L81:
            r13.getClass()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
        L8a:
            if (r12 != 0) goto Lb2
            aaft r12 = r11.s
            android.content.Context r13 = r11.b
            aafw r4 = new aafw
            android.content.res.Resources r13 = r13.getResources()
            r2 = 2132083820(0x7f15046c, float:1.9807793E38)
            java.lang.String r5 = r13.getString(r2)
            r5.getClass()
            r9 = 0
            r10 = 125(0x7d, float:1.75E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.c = r3
            java.lang.Object r12 = r12.a(r4, r0)
            if (r12 != r1) goto Lb2
            goto Lb5
        Lb2:
            fctx r12 = defpackage.fctx.a
            return r12
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywm.b(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ajlt r7, defpackage.fcxy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yvz
            if (r0 == 0) goto L13
            r0 = r8
            yvz r0 = (defpackage.yvz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yvz r0 = new yvz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r8)
            goto L76
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.fctl.b(r8)
            goto L56
        L37:
            defpackage.fctl.b(r8)
            boolean r7 = defpackage.ykm.w(r7)
            if (r7 != 0) goto L41
            return r3
        L41:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = r6.p
            anpj r7 = r7.h()
            eiju r7 = r7.b()
            r7.getClass()
            r0.c = r5
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto L8e
        L56:
            ajlk r8 = (defpackage.ajlk) r8
            ajlj r7 = r8.c()
            ajlj r8 = defpackage.ajlj.ONE_ON_ONE
            if (r7 == r8) goto L61
            return r3
        L61:
            com.google.android.apps.messaging.shared.api.messaging.Conversation r7 = r6.p
            anpj r7 = r7.i()
            eiju r7 = r7.b()
            r7.getClass()
            r0.c = r4
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto L8e
        L76:
            ekgb r8 = (defpackage.ekgb) r8
            r7 = 0
            java.lang.Object r8 = r8.get(r7)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
            java.lang.String r7 = r8.x(r7)
            boolean r8 = defpackage.aqbw.a()
            if (r8 == 0) goto L8d
            java.lang.String r7 = defpackage.cssf.a(r7)
        L8d:
            return r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywm.c(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ywa
            if (r0 == 0) goto L13
            r0 = r6
            ywa r0 = (defpackage.ywa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ywa r0 = new ywa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            if (r5 == 0) goto L69
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r4.p
            anpj r6 = r6.h()
            eiju r6 = r6.b()
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            ajlk r6 = (defpackage.ajlk) r6
            ajlj r6 = r6.c()
            ajlj r0 = defpackage.ajlj.ONE_ON_ONE
            if (r6 == r0) goto L59
            goto L69
        L59:
            r6 = 0
            java.lang.String r5 = r5.x(r6)
            boolean r6 = defpackage.aqbw.a()
            if (r6 == 0) goto L68
            java.lang.String r5 = defpackage.cssf.a(r5)
        L68:
            return r5
        L69:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywm.d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ajlt r6, defpackage.fcxy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ywb
            if (r0 == 0) goto L13
            r0 = r7
            ywb r0 = (defpackage.ywb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ywb r0 = new ywb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L81
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L5e
        L38:
            defpackage.fctl.b(r7)
            ajmc r6 = r6.d()
            boolean r7 = r6 instanceof defpackage.ajmq
            if (r7 == 0) goto L91
            r7 = r6
            ajmq r7 = (defpackage.ajmq) r7
            aoer r7 = r7.c()
            ajna r2 = defpackage.ajna.SIMPLE
            eiju r7 = r7.n(r2)
            fdkf r7 = defpackage.auvw.e(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L90
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L8b
            ajmq r6 = (defpackage.ajmq) r6
            aoer r6 = r6.c()
            ajna r7 = defpackage.ajna.SATELLITE
            eiju r6 = r6.n(r7)
            fdkf r6 = defpackage.auvw.e(r6)
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r6.c(r0)
            if (r7 == r1) goto L90
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L8a
            goto L8b
        L8a:
            r4 = 0
        L8b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L90:
            return r1
        L91:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywm.e(ajlt, fcxy):java.lang.Object");
    }

    public final void f(ajlt ajltVar) {
        auvw.k(this.c, this.f, null, new ywl(this, ajltVar, null), 2);
    }

    public final boolean g() {
        return dhhi.a(this.b) || ((cljh) this.k.h().c()).a();
    }
}
