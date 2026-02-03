package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpn implements hoq {
    public final hol a = new hol();
    private final hoq b;

    public hpn(hoq hoqVar) {
        this.b = hoqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [fdap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [fdap] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [hoq] */
    @Override // defpackage.hoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdap r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.hpm
            if (r0 == 0) goto L13
            r0 = r8
            hpm r0 = (defpackage.hpm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hpm r0 = new hpm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            defpackage.fctl.b(r8)
            goto L73
        L38:
            defpackage.fctl.b(r8)
            hol r8 = r6.a
            r0.a = r7
            r0.d = r4
            boolean r2 = r8.a()
            if (r2 == 0) goto L4a
            fctx r8 = defpackage.fctx.a
            goto L71
        L4a:
            fdiu r2 = new fdiu
            fcxy r5 = defpackage.fcym.c(r0)
            r2.<init>(r5, r4)
            r2.B()
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            java.util.List r5 = r8.b     // Catch: java.lang.Throwable -> L83
            r5.add(r2)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r4)
            hok r4 = new hok
            r4.<init>(r8, r2)
            r2.d(r4)
            java.lang.Object r8 = r2.m()
            fcyl r2 = defpackage.fcyl.a
            if (r8 == r2) goto L71
            fctx r8 = defpackage.fctx.a
        L71:
            if (r8 == r1) goto L82
        L73:
            hoq r8 = r6.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L81
            goto L82
        L81:
            return r7
        L82:
            return r1
        L83:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpn.a(fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final /* synthetic */ fcyg getKey() {
        return hoq.e;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
