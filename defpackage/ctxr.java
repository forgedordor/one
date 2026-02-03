package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxr implements ctxf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl");
    public final fcyh b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final ctxw f;
    public final asdt g;
    public final ardj h;
    public final ards i;
    public final ctuu j;
    public final apvx k;
    public final cogw l;
    public final ctxu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final feav q;

    public ctxr(fcyh fcyhVar, ctxu ctxuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, ctxw ctxwVar, asdt asdtVar, ardj ardjVar, ards ardsVar, ctuu ctuuVar, apvx apvxVar, cogw cogwVar) {
        fcyhVar.getClass();
        ctxuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        ardjVar.getClass();
        ctuuVar.getClass();
        cogwVar.getClass();
        this.b = fcyhVar;
        this.m = ctxuVar;
        this.n = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.o = fcsuVar5;
        this.p = fcsuVar6;
        this.e = fcsuVar7;
        this.f = ctxwVar;
        this.g = asdtVar;
        this.h = ardjVar;
        this.i = ardsVar;
        this.j = ctuuVar;
        this.k = apvxVar;
        this.l = cogwVar;
        this.q = new feaz();
    }

    @Override // defpackage.ctxf
    public final Object a(alqm alqmVar, aoer aoerVar, fcxy fcxyVar) throws Throwable {
        Object objG = g(new ctxj(this, alqmVar, aoerVar, null), fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    @Override // defpackage.ctxf
    public final Object b(List list, aoer aoerVar, String str, Uri uri, fcxy fcxyVar) throws Throwable {
        Object objG = g(new ctxm(this, list, aoerVar, str, uri, null), fcxyVar);
        return objG == fcyl.a ? objG : fctx.a;
    }

    @Override // defpackage.ctxf
    public final void c(ConversationId conversationId) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "openChat", 102, "ChatStarterImpl.kt")).q("Opening the conversation");
        fcsu fcsuVar = this.d;
        ((dzuc) fcsuVar.b()).e(ajfo.n);
        ((dzuc) fcsuVar.b()).e(cqjd.n);
        h(conversationId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r11 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013a, code lost:
    
        if (r11 != r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxr.d(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.alqm r8, defpackage.aoer r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ctxi
            if (r0 == 0) goto L13
            r0 = r10
            ctxi r0 = (defpackage.ctxi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctxi r0 = new ctxi
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L7a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r10)
            boolean r10 = r8.z()
            if (r10 != 0) goto L3e
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L3e:
            fcsu r10 = r7.o
            java.lang.Object r10 = r10.b()
            anty r10 = (defpackage.anty) r10
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r8 = r10.h(r8)
            ekrg r10 = defpackage.ctxr.a
            ekrw r10 = r10.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleContacts"
            r10.X(r2, r4)
            r2 = 336(0x150, float:4.71E-43)
            java.lang.String r4 = "ChatStarterImpl.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl"
            java.lang.String r6 = "mayStartPenpalBotChat"
            ekrw r10 = r10.h(r5, r6, r2, r4)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r2 = "Starting a 1-1 Penpal bot conversation"
            r10.q(r2)
            ekgb r8 = defpackage.ekgb.r(r8)
            r8.getClass()
            r0.c = r3
            java.lang.Object r8 = r7.f(r8, r9, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxr.e(alqm, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ekgb r22, defpackage.aoer r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxr.f(ekgb, aoer, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ctxq
            if (r0 == 0) goto L13
            r0 = r6
            ctxq r0 = (defpackage.ctxq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctxq r0 = new ctxq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L44
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            feav r6 = r4.q
            boolean r6 = defpackage.feau.b(r6)
            if (r6 == 0) goto L51
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 == r1) goto L4a
        L44:
            feav r5 = r4.q
            defpackage.feau.c(r5)
            goto L71
        L4a:
            return r1
        L4b:
            feav r6 = r4.q
            defpackage.feau.c(r6)
            throw r5
        L51:
            ekrg r5 = defpackage.ctxr.a
            ekrw r5 = r5.e()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r0 = "BugleContacts"
            r5.X(r6, r0)
            r6 = 349(0x15d, float:4.89E-43)
            java.lang.String r0 = "ChatStarterImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl"
            java.lang.String r2 = "tryWithLock"
            ekrw r5 = r5.h(r1, r2, r6, r0)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "Failed to acquire lock for start chat"
            r5.q(r6)
        L71:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxr.g(fdap, fcxy):java.lang.Object");
    }

    public final void h(ConversationId conversationId) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleContacts");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "navigateToConversation", 274, "ChatStarterImpl.kt")).t("Navigating to conversation: %s", conversationId);
        if (((afzc) this.n.b()).j(new agbq(new agbs(conversationId, true, false, 2, null, false, false, 994)))) {
            return;
        }
        ekrw ekrwVarJ = ekrgVar.j();
        ekrwVarJ.X(ekrzVar, "BugleContacts");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "navigateToConversation", 290, "ChatStarterImpl.kt")).t("Failed to navigate to conversation: %s", conversationId);
    }
}
