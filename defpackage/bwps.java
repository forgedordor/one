package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwps implements egyi {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final DetailsPageE2eeInfoRequest e;
    private final fdjx f;
    private final fcyh g;
    private final fcyh h;
    private final cogw i;
    private final fcsu j;

    public bwps(fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        this.f = fdjxVar;
        this.g = fcyhVar;
        this.h = fcyhVar2;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.i = cogwVar;
        this.j = fcsuVar5;
        this.e = detailsPageE2eeInfoRequest;
    }

    private final Object h(Conversation conversation, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.h), new bwpk(null, conversation), fcxyVar);
    }

    private final Object i(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.g), new bwpn(null, this), fcxyVar);
    }

    @Override // defpackage.egyi
    public final eopy a() {
        return auvw.j(this.f, new bwpo(this, null));
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new bwpl(this, null));
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ Object c() {
        return bwuu.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        if (r5.a(r4, r2, r6, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[LOOP:0: B:29:0x00b8->B:31:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwps.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e A[LOOP:1: B:35:0x0138->B:37:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd A[LOOP:0: B:64:0x01f7->B:66:0x01fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fdjx r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwps.e(fdjx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bwpq
            if (r0 == 0) goto L13
            r0 = r6
            bwpq r0 = (defpackage.bwpq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwpq r0 = new bwpq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest r6 = r5.e
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r6.b
            if (r6 == 0) goto L39
            return r6
        L39:
            fcyh r6 = r5.h
            fcyh r6 = defpackage.eicg.a(r6)
            bwpp r2 = new bwpp
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 == r1) goto L53
        L4d:
            r6.getClass()
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r6
            return r6
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwps.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [fcyl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bwpm
            if (r0 == 0) goto L13
            r0 = r5
            bwpm r0 = (defpackage.bwpm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwpm r0 = new bwpm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 == r1) goto L79
        L3a:
            java.util.List r5 = (java.util.List) r5
            r0 = 10
            int r0 = defpackage.fcva.p(r5, r0)
            int r0 = defpackage.fcwa.a(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 16
            int r0 = defpackage.fddu.f(r0, r2)
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            alqm r2 = r2.g()
            j$.util.Optional r2 = r2.e()
            java.lang.Object r2 = r2.get()
            aubq r2 = (defpackage.aubq) r2
            java.lang.String r2 = r2.d
            r2.getClass()
            r1.put(r2, r0)
            goto L55
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwps.g(fcxy):java.lang.Object");
    }
}
