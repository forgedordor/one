package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayl extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ daym c;
    final /* synthetic */ chnc d;
    final /* synthetic */ ctcj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayl(daym daymVar, chnc chncVar, ctcj ctcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = daymVar;
        this.d = chncVar;
        this.e = ctcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r8 != r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[PHI: r1
      0x0069: PHI (r1v6 java.lang.Object) = (r1v5 java.lang.Object), (r1v16 java.lang.Object) binds: [B:17:0x0067, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.fctl.b(r8)
            goto Ld6
        L11:
            java.lang.Object r1 = r7.a
            defpackage.fctl.b(r8)
            goto L69
        L17:
            defpackage.fctl.b(r8)
            goto L43
        L1b:
            defpackage.fctl.b(r8)
            daym r8 = r7.c
            fcsu r1 = r8.g
            java.lang.Object r1 = r1.b()
            daxj r1 = (defpackage.daxj) r1
            chnc r4 = r7.d
            r1.a(r4)
            ctcj r1 = r7.e
            ctcj r4 = defpackage.ctcj.WELCOME_FLOW_SETTINGS
            if (r1 != r4) goto Ld6
            fcsu r8 = r8.h
            java.lang.Object r8 = r8.b()
            chna r8 = (defpackage.chna) r8
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Ld5
        L43:
            chmw r8 = (defpackage.chmw) r8
            int r8 = r8.c
            chnc r8 = defpackage.chnc.b(r8)
            if (r8 != 0) goto L4f
            chnc r8 = defpackage.chnc.SHARE_TO_UNKNOWN
        L4f:
            r1 = r8
            r1.getClass()
            daym r8 = r7.c
            fcsu r8 = r8.h
            java.lang.Object r8 = r8.b()
            chna r8 = (defpackage.chna) r8
            chnc r4 = r7.d
            r7.a = r1
            r7.b = r2
            java.lang.Object r8 = r8.b(r4, r7)
            if (r8 == r0) goto Ld5
        L69:
            daym r8 = r7.c
            chnc r4 = r7.d
            r5 = 0
            r7.a = r5
            r5 = 3
            r7.b = r5
            j$.util.Optional r6 = r8.i
            boolean r6 = r6.isPresent()
            if (r6 != 0) goto L7e
            fctx r8 = defpackage.fctx.a
            goto Ld3
        L7e:
            chnc r1 = (defpackage.chnc) r1
            int r1 = r1.ordinal()
            if (r1 == r2) goto L8f
            if (r1 == r5) goto L89
            goto L94
        L89:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.n
            r1.set(r3)
            goto L94
        L8f:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.o
            r1.set(r3)
        L94:
            int r1 = r4.ordinal()
            if (r1 == r2) goto La8
            if (r1 == r5) goto L9f
            fctx r8 = defpackage.fctx.a
            goto Ld3
        L9f:
            java.lang.Object r8 = r8.b(r7)
            if (r8 == r0) goto Ld3
            fctx r8 = defpackage.fctx.a
            goto Ld3
        La8:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.o
            boolean r1 = r1.getAndSet(r3)
            if (r1 != 0) goto Ld1
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.n
            boolean r1 = r1.get()
            if (r1 == 0) goto Lb9
            goto Ld1
        Lb9:
            fcsu r8 = r8.j
            java.lang.Object r8 = r8.b()
            anty r8 = (defpackage.anty) r8
            eiju r8 = r8.t()
            r8.getClass()
            java.lang.Object r8 = defpackage.fdxs.c(r8, r7)
            if (r8 == r0) goto Ld3
            fctx r8 = defpackage.fctx.a
            goto Ld3
        Ld1:
            fctx r8 = defpackage.fctx.a
        Ld3:
            if (r8 != r0) goto Ld6
        Ld5:
            return r0
        Ld6:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dayl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dayl(this.c, this.d, this.e, fcxyVar);
    }
}
