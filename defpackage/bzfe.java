package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzfe implements bzce {
    public static final /* synthetic */ int d = 0;
    private static final evrw e;
    public final cpmc a;
    public final cprh b;
    public final fcyh c;

    static {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("extended_detail");
        evsn evsnVarBuild = evrvVar.build();
        evsnVarBuild.getClass();
        e = (evrw) evsnVarBuild;
    }

    public bzfe(cpmc cpmcVar, cprh cprhVar, fcyh fcyhVar) {
        cpmcVar.getClass();
        cprhVar.getClass();
        fcyhVar.getClass();
        this.a = cpmcVar;
        this.b = cprhVar;
        this.c = fcyhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r12 != r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [bzbz] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bzfe] */
    @Override // defpackage.bzce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r10, defpackage.bzbz r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfe.a(java.util.Map, bzbz, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bzce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.bzbz r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bzew
            if (r0 == 0) goto L13
            r0 = r7
            bzew r0 = (defpackage.bzew) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzew r0 = new bzew
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L58
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            cpmc r7 = r4.a     // Catch: java.lang.Throwable -> L58
            int r6 = r6.c     // Catch: java.lang.Throwable -> L58
            boolean r6 = defpackage.cpxz.b(r6)     // Catch: java.lang.Throwable -> L58
            eiju r6 = r7.h(r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.d = r5     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L58
            bzcb r6 = new bzcb     // Catch: java.lang.Throwable -> L58
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L58
            r7 = r7 ^ r3
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L58
            return r6
        L58:
            r5 = move-exception
            java.lang.Object r5 = defpackage.fctl.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfe.b(java.lang.String, bzbz, fcxy):java.lang.Object");
    }

    @Override // defpackage.bzce
    public final /* bridge */ /* synthetic */ Object c(Object obj, bzbz bzbzVar, EnumSet enumSet, fcxy fcxyVar) {
        return e((eqnl) obj, bzbzVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bzex
            if (r0 == 0) goto L13
            r0 = r10
            bzex r0 = (defpackage.bzex) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzex r0 = new bzex
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.fctl.b(r10)
            goto L7f
        L37:
            defpackage.fctl.b(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r2 = 10
            int r2 = defpackage.fcva.p(r9, r2)
            int r2 = defpackage.fcwa.a(r2)
            r6 = 16
            int r2 = defpackage.fddu.f(r2, r6)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L53:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r9.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            fctk r7 = new fctk
            r7.<init>(r6)
            r10.put(r2, r7)
            goto L53
        L6d:
            bzey r9 = new bzey
            r9.<init>(r8)
            bzfa r2 = new bzfa
            r2.<init>(r8, r3)
            r0.c = r5
            java.lang.Object r10 = defpackage.bzfl.a(r10, r9, r2, r0)
            if (r10 == r1) goto L9e
        L7f:
            java.util.Map r10 = (java.util.Map) r10
            bzet r9 = new bzet
            r9.<init>()
            java.util.Map r9 = defpackage.bzfl.b(r10, r9)
            bzfb r10 = new bzfb
            r10.<init>(r8)
            bzfc r2 = new bzfc
            r2.<init>(r8, r3)
            r0.c = r4
            java.lang.Object r9 = defpackage.bzfl.a(r9, r10, r2, r0)
            if (r9 != r1) goto L9d
            goto L9e
        L9d:
            return r9
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfe.d(java.util.Collection, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eqnl r5, defpackage.bzbz r6, defpackage.fcxy r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bzfd
            if (r0 == 0) goto L13
            r0 = r7
            bzfd r0 = (defpackage.bzfd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzfd r0 = new bzfd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            cpmc r7 = r4.a     // Catch: java.lang.Throwable -> L27
            evrw r2 = defpackage.bzfe.e     // Catch: java.lang.Throwable -> L27
            int r6 = r6.c     // Catch: java.lang.Throwable -> L27
            boolean r6 = defpackage.cpxz.b(r6)     // Catch: java.lang.Throwable -> L27
            eiju r5 = r7.W(r5, r2, r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L4b
            return r1
        L4b:
            eqnl r7 = (defpackage.eqnl) r7     // Catch: java.lang.Throwable -> L27
            bzcd r5 = new bzcd     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r7.c     // Catch: java.lang.Throwable -> L27
            r6.getClass()     // Catch: java.lang.Throwable -> L27
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27
            return r5
        L58:
            java.lang.Object r5 = defpackage.fctl.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzfe.e(eqnl, bzbz, fcxy):java.lang.Object");
    }
}
