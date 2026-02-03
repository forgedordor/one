package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwog extends dwiy {
    private volatile transient boolean d;
    private volatile transient boolean e;

    public dwog(String str, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        super(str, ejwiVar, ejwiVar2, ejwiVar3, ejwiVar4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (((defpackage.dwru) r0.c()).equals(defpackage.dwru.UNKNOWN) != false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.dwrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r7 = this;
            boolean r0 = r7.e
            if (r0 != 0) goto L78
            monitor-enter(r7)
            boolean r0 = r7.e     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L73
            ejwi r0 = r7.a     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            dwru r1 = defpackage.dwru.UNKNOWN     // Catch: java.lang.Throwable -> L75
            dwru r0 = (defpackage.dwru) r0     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L22
        L20:
            r3 = r2
            goto L6f
        L22:
            ejwi r0 = r7.b     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            r3 = 0
            if (r1 == 0) goto L4c
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            r1 = r0
            ekoe r1 = (defpackage.ekoe) r1     // Catch: java.lang.Throwable -> L75
            int r1 = r1.c     // Catch: java.lang.Throwable -> L75
            r4 = r3
        L35:
            if (r4 >= r1) goto L4c
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L75
            dwrq r5 = (defpackage.dwrq) r5     // Catch: java.lang.Throwable -> L75
            dwrs r5 = r5.a()     // Catch: java.lang.Throwable -> L75
            dwrs r6 = defpackage.dwrs.UNKNOWN     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L75
            int r4 = r4 + 1
            if (r5 == 0) goto L35
            goto L20
        L4c:
            ejwi r0 = r7.c     // Catch: java.lang.Throwable -> L75
            boolean r1 = r0.g()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L6f
            java.lang.Object r0 = r0.c()     // Catch: java.lang.Throwable -> L75
            r1 = r0
            ekoe r1 = (defpackage.ekoe) r1     // Catch: java.lang.Throwable -> L75
            int r1 = r1.c     // Catch: java.lang.Throwable -> L75
            r4 = r3
        L5e:
            if (r4 >= r1) goto L6f
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L75
            dwrn r5 = (defpackage.dwrn) r5     // Catch: java.lang.Throwable -> L75
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L75
            int r4 = r4 + 1
            if (r5 == 0) goto L5e
            goto L20
        L6f:
            r7.d = r3     // Catch: java.lang.Throwable -> L75
            r7.e = r2     // Catch: java.lang.Throwable -> L75
        L73:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            throw r0
        L78:
            boolean r0 = r7.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwog.f():boolean");
    }
}
