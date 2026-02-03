package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnb {
    public final fcyh a;
    public final cmfo b;
    public final asjn c;
    public final aptm d;

    public cdnb(fcyh fcyhVar, cmfo cmfoVar, asjn asjnVar, aptm aptmVar) {
        fcyhVar.getClass();
        asjnVar.getClass();
        aptmVar.getClass();
        this.a = fcyhVar;
        this.b = cmfoVar;
        this.c = asjnVar;
        this.d = aptmVar;
    }

    public static final boolean c(cdmq cdmqVar) {
        cdmqVar.getClass();
        return ((cdmqVar.b & 1) == 0 || cdmqVar.d) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdmu
            if (r0 == 0) goto L13
            r0 = r6
            cdmu r0 = (defpackage.cdmu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdmu r0 = new cdmu
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            fcyh r6 = r5.a
            fcyh r6 = defpackage.eicg.a(r6)
            cdmt r2 = new cdmt
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdnb.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cdmv
            if (r0 == 0) goto L13
            r0 = r5
            cdmv r0 = (defpackage.cdmv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdmv r0 = new cdmv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cdmq r5 = (defpackage.cdmq) r5
            boolean r5 = c(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdnb.b(fcxy):java.lang.Object");
    }

    public final void d(cdnd cdndVar) {
        if (this.c.a()) {
            if (this.d.a()) {
                cdndVar.copyOnWrite();
                cdne cdneVar = (cdne) cdndVar.instance;
                cdne cdneVar2 = cdne.a;
                cdneVar.d = cdnc.a(3);
                return;
            }
            cdndVar.copyOnWrite();
            cdne cdneVar3 = (cdne) cdndVar.instance;
            cdne cdneVar4 = cdne.a;
            cdneVar3.d = cdnc.a(2);
        }
    }
}
