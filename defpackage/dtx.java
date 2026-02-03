package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtx extends fcyy implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ fdae c;
    final /* synthetic */ fdae d;
    final /* synthetic */ fdat e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtx(fdap fdapVar, fdae fdaeVar, fdae fdaeVar2, fdat fdatVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = fdapVar;
        this.c = fdaeVar;
        this.d = fdaeVar2;
        this.e = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtx) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: CancellationException -> 0x009b, TryCatch #0 {CancellationException -> 0x009b, blocks: (B:7:0x0010, B:26:0x006b, B:28:0x0073, B:30:0x0080, B:32:0x008c, B:33:0x008f, B:34:0x0092, B:10:0x0018, B:20:0x0045, B:22:0x0049, B:13:0x0020, B:18:0x0037, B:16:0x002c), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: CancellationException -> 0x009b, TryCatch #0 {CancellationException -> 0x009b, blocks: (B:7:0x0010, B:26:0x006b, B:28:0x0073, B:30:0x0080, B:32:0x008c, B:33:0x008f, B:34:0x0092, B:10:0x0018, B:20:0x0045, B:22:0x0049, B:13:0x0020, B:18:0x0037, B:16:0x002c), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: CancellationException -> 0x009b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x009b, blocks: (B:7:0x0010, B:26:0x006b, B:28:0x0073, B:30:0x0080, B:32:0x008c, B:33:0x008f, B:34:0x0092, B:10:0x0018, B:20:0x0045, B:22:0x0049, B:13:0x0020, B:18:0x0037, B:16:0x002c), top: B:41:0x0006 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.f
            ire r0 = (defpackage.ire) r0
            defpackage.fctl.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L6b
        L14:
            java.lang.Object r1 = r6.f
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L45
        L1c:
            java.lang.Object r1 = r6.f
            ire r1 = (defpackage.ire) r1
            defpackage.fctl.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L37
        L24:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.f
            r1 = r7
            ire r1 = (defpackage.ire) r1
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.a = r3     // Catch: java.util.concurrent.CancellationException -> L9b
            r7 = 0
            java.lang.Object r7 = defpackage.dzm.g(r1, r7, r6, r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == r0) goto L9a
        L37:
            ise r7 = (defpackage.ise) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            long r3 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.a = r2     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r7 = defpackage.duh.f(r1, r3, r6)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == r0) goto L9a
        L45:
            ise r7 = (defpackage.ise) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == 0) goto L97
            fdap r2 = r6.b     // Catch: java.util.concurrent.CancellationException -> L9b
            long r3 = r7.c     // Catch: java.util.concurrent.CancellationException -> L9b
            ihs r5 = new ihs     // Catch: java.util.concurrent.CancellationException -> L9b
            r5.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L9b
            r2.invoke(r5)     // Catch: java.util.concurrent.CancellationException -> L9b
            long r2 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            fdat r7 = r6.e     // Catch: java.util.concurrent.CancellationException -> L9b
            dtw r4 = new dtw     // Catch: java.util.concurrent.CancellationException -> L9b
            r4.<init>()     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r7 = 3
            r6.a = r7     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r7 = defpackage.duh.j(r1, r2, r4, r6)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 != r0) goto L6a
            goto L9a
        L6a:
            r0 = r1
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r7 = r7.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == 0) goto L92
            irs r7 = r0.p()     // Catch: java.util.concurrent.CancellationException -> L9b
            java.util.List r7 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            int r0 = r7.size()     // Catch: java.util.concurrent.CancellationException -> L9b
            r1 = 0
        L7e:
            if (r1 >= r0) goto L97
            java.lang.Object r2 = r7.get(r1)     // Catch: java.util.concurrent.CancellationException -> L9b
            ise r2 = (defpackage.ise) r2     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r3 = defpackage.irt.e(r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r3 == 0) goto L8f
            r2.b()     // Catch: java.util.concurrent.CancellationException -> L9b
        L8f:
            int r1 = r1 + 1
            goto L7e
        L92:
            fdae r7 = r6.d     // Catch: java.util.concurrent.CancellationException -> L9b
            r7.invoke()     // Catch: java.util.concurrent.CancellationException -> L9b
        L97:
            fctx r7 = defpackage.fctx.a
            return r7
        L9a:
            return r0
        L9b:
            r7 = move-exception
            fdae r0 = r6.d
            r0.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dtx dtxVar = new dtx(this.b, this.c, this.d, this.e, fcxyVar);
        dtxVar.f = obj;
        return dtxVar;
    }
}
