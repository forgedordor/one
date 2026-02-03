package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zan implements yst {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/doubletap/DoubleTapCallbackUiAdapterImpl");
    public final Context b;
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final fdjx i;
    private final ajmh j;
    private final fdpl k;
    private final fcsu l;
    private final fcsu m;
    private final fctc n;
    private final fctc o;

    public zan(Context context, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, ajmh ajmhVar, fdpl fdplVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        context.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        ajmhVar.getClass();
        fcsuVar7.getClass();
        this.b = context;
        this.i = fdjxVar;
        this.c = fdjxVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.j = ajmhVar;
        this.k = fdplVar;
        this.l = fcsuVar5;
        this.h = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fctd.a(new fdae() { // from class: zac
            @Override // defpackage.fdae
            public final Object invoke() {
                return (String) ((Optional) this.a.d.b()).get();
            }
        });
        this.o = fctd.a(new fdae() { // from class: zad
            @Override // defpackage.fdae
            public final Object invoke() {
                return anhp.a(this.a.f());
            }
        });
    }

    @Override // defpackage.yst
    public final fdpl a(ajlt ajltVar) {
        ajltVar.getClass();
        return new zaj(((zvz) this.l.b()).a(ajltVar, ckmx.a()), this, ajltVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ajlt r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zaf
            if (r0 == 0) goto L13
            r0 = r7
            zaf r0 = (defpackage.zaf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zaf r0 = new zaf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
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
            java.lang.Object r6 = r0.a
            zan r6 = r0.e
            defpackage.fctl.b(r7)
            goto L4a
        L3a:
            defpackage.fctl.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 == r1) goto L90
            r6 = r5
        L4a:
            anho r7 = (defpackage.anho) r7
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r6.h(r7)
            if (r7 == r1) goto L90
        L59:
            ckmc r6 = defpackage.ckmc.REMOVE_REACTION
            r0 = 0
            if (r7 != r6) goto L77
            android.content.Context r6 = r5.b
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r7 = r5.f()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r0] = r7
            r7 = 2132083977(0x7f150509, float:1.9808112E38)
            java.lang.String r6 = r6.getString(r7, r1)
            r6.getClass()
            return r6
        L77:
            android.content.Context r6 = r5.b
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r7 = r5.f()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r0] = r7
            r7 = 2132083975(0x7f150507, float:1.9808107E38)
            java.lang.String r6 = r6.getString(r7, r1)
            r6.getClass()
            return r6
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zan.b(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ajlt r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.zag
            if (r0 == 0) goto L13
            r0 = r9
            zag r0 = (defpackage.zag) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zag r0 = new zag
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            auwy r8 = r0.d
            defpackage.fctl.b(r9)
            goto L55
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            com.google.android.apps.messaging.shared.api.messaging.MessageId r9 = r8.b()
            zae r2 = new zae
            r2.<init>()
            r4 = 500(0x1f4, double:2.47E-321)
            fdjx r9 = r7.i
            fdap r9 = defpackage.auxh.a(r2, r4, r9)
            r2 = r9
            auwy r2 = (defpackage.auwy) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 == r1) goto L5d
            r6 = r9
            r9 = r8
            r8 = r6
        L55:
            java.lang.String r9 = (java.lang.String) r9
            zap r0 = new zap
            r0.<init>(r8, r9)
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zan.c(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ajlt r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zak
            if (r0 == 0) goto L13
            r0 = r8
            zak r0 = (defpackage.zak) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zak r0 = new zak
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L58
        L3b:
            defpackage.fctl.b(r8)
            fcsu r8 = r6.m
            java.lang.Object r8 = r8.b()
            arxn r8 = (defpackage.arxn) r8
            boolean r8 = r8.a()
            if (r8 == 0) goto L68
            fdpl r8 = r6.k
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fdtc.a(r8, r0)
            if (r8 == r1) goto L8d
        L58:
            aoer r8 = (defpackage.aoer) r8
            if (r8 == 0) goto L67
            angr r7 = r7.i()
            if (r7 == 0) goto L67
            anho r7 = r7.c(r8)
            return r7
        L67:
            return r5
        L68:
            fdpl r8 = r6.k
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fdtc.a(r8, r0)
            if (r8 == r1) goto L8d
        L74:
            aoer r8 = (defpackage.aoer) r8
            if (r8 == 0) goto L83
            angr r7 = r7.i()
            if (r7 == 0) goto L83
            anhj r7 = r7.b(r8)
            goto L84
        L83:
            r7 = r5
        L84:
            if (r7 != 0) goto L87
            return r5
        L87:
            anho r8 = new anho
            r8.<init>(r7, r5)
            return r8
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zan.d(ajlt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.api.messaging.MessageId r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zal
            if (r0 == 0) goto L13
            r0 = r6
            zal r0 = (defpackage.zal) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zal r0 = new zal
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ajmh r6 = r4.j
            eiju r5 = r6.v(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r5, r0)
            if (r6 == r1) goto L69
        L43:
            r5 = r6
            ajlt r5 = (defpackage.ajlt) r5
            if (r5 != 0) goto L68
            ekrg r5 = defpackage.zan.a
            ekrw r5 = r5.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleDoubleTap"
            r5.X(r0, r1)
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r1 = "DoubleTapCallbackUiAdapterImpl.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/doubletap/DoubleTapCallbackUiAdapterImpl"
            java.lang.String r3 = "loadMessage"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "message is null"
            r5.q(r0)
        L68:
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zan.e(com.google.android.apps.messaging.shared.api.messaging.MessageId, fcxy):java.lang.Object");
    }

    public final String f() {
        return (String) this.n.a();
    }

    public final angl g() {
        return (angl) this.o.a();
    }

    public final Object h(anho anhoVar) {
        anhj anhjVar = anhoVar != null ? anhoVar.a : null;
        return anhjVar == null ? ckmc.ADD_REACTION : fdbq.f(anhjVar, g()) ? ckmc.REMOVE_REACTION : ckmc.REPLACE_REACTION;
    }
}
