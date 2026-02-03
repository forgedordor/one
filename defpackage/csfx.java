package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csfx extends fcyz implements fdat {
    int a;
    final /* synthetic */ csgc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csfx(csgc csgcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csfx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            defpackage.fctl.b(r8)
            if (r1 == 0) goto La
            goto L1f
        La:
            csgc r8 = r7.b
            ecjh r8 = r8.b
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a()
            r8.getClass()
            r1 = 1
            r7.a = r1
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 != r0) goto L1f
            return r0
        L1f:
            r8.getClass()
            ezba r8 = (defpackage.ezba) r8
            int r0 = defpackage.ekgb.d
            ekfw r0 = new ekfw
            r0.<init>()
            ekfw r1 = new ekfw
            r1.<init>()
            evtg r2 = r8.c
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            ezay r3 = (defpackage.ezay) r3
            int r4 = r3.c
            ezax r5 = defpackage.ezax.b(r4)
            if (r5 != 0) goto L4c
            ezax r5 = defpackage.ezax.UNRECOGNIZED
        L4c:
            ezax r6 = defpackage.ezax.RCS
            if (r5 == r6) goto L5c
            ezax r4 = defpackage.ezax.b(r4)
            if (r4 != 0) goto L58
            ezax r4 = defpackage.ezax.UNRECOGNIZED
        L58:
            ezax r5 = defpackage.ezax.PROTOCOL_UNSPECIFIED
            if (r4 != r5) goto L61
        L5c:
            java.lang.String r4 = r3.b
            r0.h(r4)
        L61:
            int r4 = r3.c
            ezax r5 = defpackage.ezax.b(r4)
            if (r5 != 0) goto L6b
            ezax r5 = defpackage.ezax.UNRECOGNIZED
        L6b:
            ezax r6 = defpackage.ezax.XMS
            if (r5 == r6) goto L7b
            ezax r4 = defpackage.ezax.b(r4)
            if (r4 != 0) goto L77
            ezax r4 = defpackage.ezax.UNRECOGNIZED
        L77:
            ezax r5 = defpackage.ezax.PROTOCOL_UNSPECIFIED
            if (r4 != r5) goto L36
        L7b:
            java.lang.String r3 = r3.b
            r1.h(r3)
            goto L36
        L81:
            csfn r2 = new csfn
            java.lang.String r8 = r8.b
            r8.getClass()
            ekgb r0 = r0.g()
            r0.getClass()
            ekgb r1 = r1.g()
            r1.getClass()
            r2.<init>(r8, r0, r1)
            ekrg r8 = defpackage.csgc.a
            ekrw r8 = r8.h()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleSpam"
            r8.X(r0, r1)
            r0 = 83
            java.lang.String r1 = "TemplatesStore.kt"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplatesStore$current$2$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r8 = r8.h(r3, r4, r0, r1)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r0 = r2.a
            java.lang.String r1 = "cache miss! load and set cached templates at version %s"
            r8.t(r1, r0)
            csgc r8 = r7.b
            csfo r0 = defpackage.csfo.a
        Lbf:
            java.util.concurrent.atomic.AtomicReference r1 = r8.c
            boolean r3 = r1.compareAndSet(r0, r2)
            if (r3 == 0) goto Lc8
            goto Lce
        Lc8:
            java.lang.Object r1 = r1.get()
            if (r1 == r0) goto Lbf
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csfx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csfx(this.b, fcxyVar);
    }
}
