package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chgl implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/PassToChatApiInterceptor");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final cgxm j;

    public chgl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = new cgxm("PassToChatApiInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        if (r6 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        if (r2 == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        if (r2 == r4) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.chgt r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgl.b(chgt, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.chgt r9, java.lang.String r10, defpackage.aubq r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgl.d(chgt, java.lang.String, aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (r13 == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgxk
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chhb r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgl.c(chhb, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.chgt r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.chgk
            if (r0 == 0) goto L13
            r0 = r6
            chgk r0 = (defpackage.chgk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chgk r0 = new chgk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            axcm r5 = r0.d
            defpackage.fctl.b(r6)
            goto L65
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.g
            java.lang.Object r6 = r6.b()
            aryo r6 = (defpackage.aryo) r6
            boolean r6 = r6.a()
            java.lang.String r2 = "Required value was null."
            if (r6 != 0) goto L4f
            aubq r5 = r5.b
            if (r5 == 0) goto L49
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r2)
            throw r5
        L4f:
            axcm r5 = r5.c
            if (r5 == 0) goto L89
            fcsu r6 = r4.f
            java.lang.Object r6 = r6.b()
            awxu r6 = (defpackage.awxu) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 == r1) goto L88
        L65:
            if (r6 == 0) goto L7a
            alqm r6 = (defpackage.alqm) r6
            j$.util.Optional r6 = r6.e()
            chgg r0 = new chgg
            r0.<init>()
            java.lang.Object r5 = r6.orElseThrow(r0)
            r5.getClass()
            return r5
        L7a:
            java.lang.String r6 = "myIdentity "
            java.lang.String r0 = " doesn't have a phone number"
            java.lang.String r5 = defpackage.a.h(r5, r6, r0)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r5)
            throw r6
        L88:
            return r1
        L89:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chgl.f(chgt, fcxy):java.lang.Object");
    }
}
