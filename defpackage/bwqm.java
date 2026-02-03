package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqm implements egyi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/info/E2eeInfoDataSource");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final bwvf g;
    private final fdjx h;
    private final fcyh i;
    private final cogw j;

    public bwqm(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, bwvf bwvfVar) {
        this.h = fdjxVar;
        this.i = fcyhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.j = cogwVar;
        this.f = fcsuVar5;
        this.g = bwvfVar;
        if ((bwvfVar.b & 2) == 0) {
            throw new IllegalArgumentException("Fetching e2ee capabilities should not have been triggered without providing self identity.");
        }
    }

    @Override // defpackage.egyi
    public final eopy a() {
        return auvw.j(this.h, new bwql(this, null));
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return auvw.c(this.h, fcyi.a, fdjz.a, new bwqe(this, null));
    }

    @Override // defpackage.egyi
    public final /* bridge */ /* synthetic */ Object c() {
        return bwuu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bwqh
            if (r0 == 0) goto L13
            r0 = r7
            bwqh r0 = (defpackage.bwqh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwqh r0 = new bwqh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.i
            fcyh r7 = defpackage.eicg.a(r7)
            bwqg r2 = new bwqg
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqm.d(java.util.List, fcxy):java.lang.Object");
    }

    public final Object e(fcxy fcxyVar) {
        bwvf bwvfVar = this.g;
        int i = bwvfVar.c;
        if (i == 2) {
            return fdin.a(eicg.a(this.i), new bwqi(null, this), fcxyVar);
        }
        if (i != 1) {
            throw new IllegalArgumentException("Request should have either conversationId or a list of MessagingIdentity.");
        }
        evtg evtgVar = ((bwve) bwvfVar.d).b;
        evtgVar.getClass();
        return evtgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.List r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bwqj
            if (r0 == 0) goto L13
            r0 = r7
            bwqj r0 = (defpackage.bwqj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwqj r0 = new bwqj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            fcyh r7 = r0.u()
            boolean r7 = defpackage.eicg.b(r7)
            if (r7 == 0) goto L65
            java.lang.String r7 = "E2eeInfoDataSource#getRegistrations"
            eieu r7 = defpackage.eiiy.h(r7)
            r0.d = r7     // Catch: java.lang.Throwable -> L5b
            r0.c = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.g(r6, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 == r1) goto L5a
            r4 = r7
            r7 = r6
            r6 = r4
        L53:
            egyh r7 = (defpackage.egyh) r7     // Catch: java.lang.Throwable -> L29
            r0 = 0
            defpackage.fczl.a(r6, r0)
            return r7
        L5a:
            return r1
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            defpackage.fczl.a(r6, r7)
            throw r0
        L65:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqm.f(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a A[LOOP:0: B:33:0x0104->B:35:0x010a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [bwqm] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwqm.g(java.util.List, fcxy):java.lang.Object");
    }
}
