package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dghz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgia b;
    Object c;
    Object d;
    int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghz(fcxy fcxyVar, dgia dgiaVar) {
        super(2, fcxyVar);
        this.b = dgiaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dghz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[LOOP:0: B:25:0x0078->B:26:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[LOOP:1: B:31:0x008b->B:32:0x008d, LOOP_END] */
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
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            int r0 = r7.e
            java.lang.Object r1 = r7.d
            java.lang.Object r4 = r7.c
            java.lang.Object r5 = r7.f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = (java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) r5
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L75
            goto L66
        L16:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.f
            fdjx r8 = (defpackage.fdjx) r8
            dgia r8 = r7.b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r8.e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            int r4 = r1.getWriteHoldCount()
            if (r4 != 0) goto L30
            int r4 = r1.getReadHoldCount()
            goto L31
        L30:
            r4 = r2
        L31:
            r6 = r2
        L32:
            if (r6 >= r4) goto L3a
            r5.unlock()
            int r6 = r6 + 1
            goto L32
        L3a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.concurrent.atomic.AtomicBoolean r6 = r8.f     // Catch: java.lang.Throwable -> L88
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L78
            java.util.List r6 = r8.g     // Catch: java.lang.Throwable -> L88
            fcsu r8 = r8.c     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L88
            dghb r8 = (defpackage.dghb) r8     // Catch: java.lang.Throwable -> L88
            r7.f = r5     // Catch: java.lang.Throwable -> L88
            r7.c = r1     // Catch: java.lang.Throwable -> L88
            r7.d = r6     // Catch: java.lang.Throwable -> L88
            r7.e = r4     // Catch: java.lang.Throwable -> L88
            r7.a = r3     // Catch: java.lang.Throwable -> L88
            java.lang.Object r8 = r8.a(r7)     // Catch: java.lang.Throwable -> L88
            if (r8 == r0) goto L77
            r0 = r4
            r4 = r1
            r1 = r6
        L66:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L75
            r1.addAll(r8)     // Catch: java.lang.Throwable -> L75
            dgia r8 = r7.b     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f     // Catch: java.lang.Throwable -> L75
            r8.set(r3)     // Catch: java.lang.Throwable -> L75
            r1 = r4
            r4 = r0
            goto L78
        L75:
            r8 = move-exception
            goto L8b
        L77:
            return r0
        L78:
            if (r2 >= r4) goto L80
            r5.lock()
            int r2 = r2 + 1
            goto L78
        L80:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) r1
            r1.unlock()
            fctx r8 = defpackage.fctx.a
            return r8
        L88:
            r8 = move-exception
            r0 = r4
            r4 = r1
        L8b:
            if (r2 >= r0) goto L93
            r5.lock()
            int r2 = r2 + 1
            goto L8b
        L93:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) r4
            r4.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dghz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dghz dghzVar = new dghz(fcxyVar, this.b);
        dghzVar.f = obj;
        return dghzVar;
    }
}
