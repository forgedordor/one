package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkm implements ehwh {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final ekrg d;
    private final fcsu e;
    private final fdjx f;
    private final fdjx g;

    public cnkm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar, fdjx fdjxVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fdjxVar;
        this.g = fdjxVar2;
        this.d = ekrg.c("com/google/android/apps/messaging/shared/tachygram/synclet/TachygramPullMessagesSynclet");
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new cnkl(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cnkm r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cnkk
            if (r0 == 0) goto L13
            r0 = r6
            cnkk r0 = (defpackage.cnkk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnkk r0 = new cnkk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cnkm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.d = r5
            r0.c = r3
            fdjx r6 = r5.g
            fcyh r6 = r6.hE()
            cnkj r2 = new cnkj
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r6 = defpackage.eicj.a(r6, r2, r0)
            if (r6 == r1) goto L7b
        L4a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L55:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            r2 = r1
            aubq r2 = (defpackage.aubq) r2
            fcsu r3 = r5.e
            java.lang.Object r3 = r3.b()
            dggw r3 = (defpackage.dggw) r3
            java.lang.String r2 = r2.d
            boolean r2 = r3.v(r2)
            if (r2 == 0) goto L55
            r0.add(r1)
            goto L55
        L76:
            java.util.Set r5 = defpackage.fcva.av(r0)
            return r5
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnkm.b(cnkm, fcxy):java.lang.Object");
    }
}
