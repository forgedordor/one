package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dawc implements dggm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/welcome/v1/consent/ConsentRcsProvisioningListenerImpl");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;

    public dawc(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.davy
            if (r0 == 0) goto L13
            r0 = r7
            davy r0 = (defpackage.davy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            davy r0 = new davy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L42
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fctl.b(r7)
            fcsu r7 = r6.b
            java.lang.Object r7 = r7.b()
            ctcm r7 = (defpackage.ctcm) r7
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L79
        L42:
            j$.time.Instant r7 = (j$.time.Instant) r7
            if (r7 == 0) goto L5a
            fcsu r0 = r6.c
            java.lang.Object r0 = r0.b()
            cogw r0 = (defpackage.cogw) r0
            j$.time.Instant r0 = r0.f()
            r0.getClass()
            j$.time.Duration r7 = defpackage.eooc.a(r0, r7)
            goto L5b
        L5a:
            r7 = 0
        L5b:
            r0 = 0
            if (r7 == 0) goto L73
            fcsu r1 = r6.f
            long r4 = r7.toDays()
            java.lang.Object r7 = r1.b()
            java.lang.Number r7 = (java.lang.Number) r7
            long r1 = r7.longValue()
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 > 0) goto L73
            goto L74
        L73:
            r3 = r0
        L74:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawc.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.dggm
    public final void b(Set set) {
        auvw.k(this.e, null, null, new dawa(this, set, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.davz
            if (r0 == 0) goto L13
            r0 = r6
            davz r0 = (defpackage.davz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            davz r0 = new davz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.b
            java.lang.Object r6 = r6.b()
            ctcm r6 = (defpackage.ctcm) r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 == r1) goto L70
        L46:
            ekhx r6 = (defpackage.ekhx) r6
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L55
        L53:
            r3 = r1
            goto L6b
        L55:
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L59
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawc.c(java.util.Set, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:19:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dawb
            if (r0 == 0) goto L13
            r0 = r7
            dawb r0 = (defpackage.dawb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dawb r0 = new dawb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r2 = r7
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r6.next()
            dggn r7 = (defpackage.dggn) r7
            fcsu r4 = r5.g
            java.lang.Object r4 = r4.b()
            dghj r4 = (defpackage.dghj) r4
            r0.a = r2
            r0.b = r6
            r0.e = r3
            java.lang.Object r7 = r4.k(r7, r0)
            if (r7 == r1) goto L6e
        L60:
            dggk r7 = (defpackage.dggk) r7
            if (r7 == 0) goto L67
            java.lang.String r7 = r7.a
            goto L68
        L67:
            r7 = 0
        L68:
            if (r7 == 0) goto L40
            r2.add(r7)
            goto L40
        L6e:
            return r1
        L6f:
            ekhx r6 = defpackage.ekfv.f(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dawc.d(java.util.Set, fcxy):java.lang.Object");
    }
}
