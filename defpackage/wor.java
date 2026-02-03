package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wor implements woh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl");
    public final bxno b;
    public final doht c;
    public final aptx d;
    public final ajlv e;
    private final fdjx f;
    private final fdjx g;
    private final fcyh h;
    private final fduj i;
    private final Conversation j;
    private final wms k;
    private final aqht l;
    private final aqzg m;
    private final ains n;

    public wor(fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, bxno bxnoVar, fduj fdujVar, Conversation conversation, doht dohtVar, aptx aptxVar, ajlv ajlvVar, wms wmsVar, aqht aqhtVar, aqzg aqzgVar, ains ainsVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        bxnoVar.getClass();
        fdujVar.getClass();
        conversation.getClass();
        aptxVar.getClass();
        aqzgVar.getClass();
        ainsVar.getClass();
        this.f = fdjxVar;
        this.g = fdjxVar2;
        this.h = fcyhVar;
        this.b = bxnoVar;
        this.i = fdujVar;
        this.j = conversation;
        this.c = dohtVar;
        this.d = aptxVar;
        this.e = ajlvVar;
        this.k = wmsVar;
        this.l = aqhtVar;
        this.m = aqzgVar;
        this.n = ainsVar;
    }

    @Override // defpackage.woh
    public final vvr a(vvr vvrVar) {
        vvq vvqVar;
        athh athhVar;
        vvrVar.getClass();
        if (!this.d.a() || (athhVar = (vvqVar = vvrVar.b).b) == null) {
            auvw.k(this.f, null, null, new woj(vvrVar, this, null), 3);
            return vvrVar;
        }
        auvw.k(this.g, null, null, new woi(athhVar, this, null), 3);
        return this.l.a() ? vvr.b(vvrVar, vvq.a(vvqVar, athg.c(), null, null, null, 61)) : vvrVar;
    }

    @Override // defpackage.woh
    public final Object b(vvr vvrVar, boolean z, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.h), new wom(null, this, vvrVar, z), fcxyVar);
    }

    @Override // defpackage.woh
    public final Object c(vvr vvrVar) {
        auvw.k(this.f, null, null, new won(vvrVar, this, null), 3);
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wok
            if (r0 == 0) goto L13
            r0 = r5
            wok r0 = (defpackage.wok) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wok r0 = new wok
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L52
        L3c:
            boolean r0 = r5 instanceof defpackage.wab
            if (r0 == 0) goto L43
            wab r5 = (defpackage.wab) r5
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto L4f
            boolean r5 = r5.p()
            if (r5 != r3) goto L4f
            java.lang.String r5 = "video/hevc"
            return r5
        L4f:
            java.lang.String r5 = "video/avc"
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wol
            if (r0 == 0) goto L13
            r0 = r5
            wol r0 = (defpackage.wol) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wol r0 = new wol
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.wab
            if (r0 == 0) goto L43
            wab r5 = (defpackage.wab) r5
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto L4b
            long r0 = r5.e()
            goto L4e
        L4b:
            r0 = 104857600(0x6400000, double:5.1806538E-316)
        L4e:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.e(fcxy):java.lang.Object");
    }

    public final Object f(vvr vvrVar, fcxy fcxyVar) {
        if (vvt.e(vvrVar)) {
            return i(fcxyVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vvr r21, boolean r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.g(vvr, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wop
            if (r0 == 0) goto L13
            r0 = r5
            wop r0 = (defpackage.wop) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wop r0 = new wop
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.wab
            if (r0 == 0) goto L43
            wab r5 = (defpackage.wab) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.k()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.h(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.woq
            if (r0 == 0) goto L13
            r0 = r5
            woq r0 = (defpackage.woq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            woq r0 = new woq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.wab
            if (r0 == 0) goto L43
            wab r5 = (defpackage.wab) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.l()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wor.i(fcxy):java.lang.Object");
    }
}
