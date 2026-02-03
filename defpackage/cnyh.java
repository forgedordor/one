package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnyh {
    public final fcsu a;
    private final cogw b;
    private final fdjx c;
    private final fctc d;
    private final fduj e;

    public cnyh(fcsu fcsuVar, cogw cogwVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        cogwVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = cogwVar;
        this.c = fdjxVar;
        this.d = fctd.a(new fdae() { // from class: cnya
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgk cmgkVar = (cmgk) this.a.a.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.FORWARD_SYNC_WORK_ORGANIZER);
                cmggVarC.f(cnza.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
        this.e = fdtg.a(a().e(), fdjxVar, fdur.b, 1);
    }

    public final cmfo a() {
        return (cmfo) this.d.a();
    }

    public final cnza b(cnza cnzaVar, boolean z, AtomicBoolean atomicBoolean) {
        cnze cnzeVarA = cnzd.a((cnyl) cnzaVar.toBuilder());
        cnyl cnylVar = cnzeVarA.a;
        atomicBoolean.set(((cnza) cnylVar.instance).f != z);
        cnylVar.copyOnWrite();
        ((cnza) cnylVar.instance).f = z;
        if (z) {
            evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
            evvpVarC.getClass();
            cnylVar.copyOnWrite();
            cnza cnzaVar2 = (cnza) cnylVar.instance;
            cnzaVar2.g = evvpVarC;
            cnzaVar2.b |= 4;
        }
        return cnzeVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnyb
            if (r0 == 0) goto L13
            r0 = r5
            cnyb r0 = (defpackage.cnyb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnyb r0 = new cnyb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fduj r5 = r4.e
            r0.c = r3
            java.lang.Object r5 = defpackage.fdtc.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            cnza r5 = (defpackage.cnza) r5
            boolean r5 = r5.f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnyh.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r6 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cnyc
            if (r0 == 0) goto L13
            r0 = r6
            cnyc r0 = (defpackage.cnyc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnyc r0 = new cnyc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L6f
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4b
            r6 = 0
            return r6
        L4b:
            fduj r6 = r5.e
            r0.c = r3
            java.lang.Object r6 = defpackage.fdtc.a(r6, r0)
            if (r6 == r1) goto L6f
        L55:
            cnza r6 = (defpackage.cnza) r6
            evvp r6 = r6.g
            if (r6 != 0) goto L5d
            evvp r6 = defpackage.evvp.a
        L5d:
            r6.getClass()
            cogw r0 = r5.b
            j$.time.Instant r6 = defpackage.evxd.d(r6)
            j$.time.Instant r0 = r0.f()
            j$.time.Duration r6 = j$.time.Duration.between(r6, r0)
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnyh.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cnyg
            if (r0 == 0) goto L13
            r0 = r9
            cnyg r0 = (defpackage.cnyg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cnyg r0 = new cnyg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            fdci r8 = r0.e
            defpackage.fctl.b(r9)
            goto L79
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r8 = r0.a
            fdci r2 = r0.e
            defpackage.fctl.b(r9)
            r6 = r2
            r2 = r9
            r9 = r6
            goto L64
        L3f:
            defpackage.fctl.b(r9)
            fdci r9 = new fdci
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r2.<init>(r5)
            r9.a = r2
            cmfo r2 = r7.a()
            cnxy r5 = new cnxy
            r5.<init>()
            r0.e = r9
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = r2.d(r5, r0)
            if (r2 == r1) goto L86
        L64:
            cnza r2 = (defpackage.cnza) r2
            fduj r2 = r7.e
            cnyf r4 = new cnyf
            r4.<init>(r2, r8)
            r0.e = r9
            r0.d = r3
            java.lang.Object r8 = defpackage.fdtc.a(r4, r0)
            if (r8 != r1) goto L78
            goto L86
        L78:
            r8 = r9
        L79:
            java.lang.Object r8 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8
            boolean r8 = r8.get()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnyh.e(boolean, fcxy):java.lang.Object");
    }
}
