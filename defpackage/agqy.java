package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqy implements agqq {
    public final fcsu b;
    public final fcsu c;
    private final efwo d;
    private final addt e;
    private final egej f;
    private final fcsu g;
    private final fdjx h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final aqts q;
    private final aqtr r;
    private final ekrg s;

    public agqy(efwo efwoVar, addt addtVar, egej egejVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, aqts aqtsVar, aqtr aqtrVar) {
        efwoVar.getClass();
        addtVar.getClass();
        egejVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        aqtsVar.getClass();
        aqtrVar.getClass();
        this.d = efwoVar;
        this.e = addtVar;
        this.f = egejVar;
        this.g = fcsuVar;
        this.b = fcsuVar2;
        this.h = fdjxVar;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.c = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.o = fcsuVar10;
        this.p = fcsuVar11;
        this.q = aqtsVar;
        this.r = aqtrVar;
        this.s = ekrg.c("com/google/android/apps/messaging/penpal/PenpalAvailabilityCheckerImpl");
    }

    private final void g(List list, boolean z) {
        List list2;
        if (list.isEmpty()) {
            list2 = list;
        } else {
            ekrw ekrwVarH = this.s.h();
            ekrwVarH.X(eksq.a, "BuglePenpal");
            list2 = list;
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/penpal/PenpalAvailabilityCheckerImpl", "logUnavailableReasons", 286, "PenpalAvailabilityCheckerImpl.kt")).t("Penpal availability check results: %s", fcva.aF(list2, ",", null, null, null, 62));
        }
        if (z) {
            ains ainsVar = (ains) this.n.b();
            if (list2.isEmpty()) {
                ainsVar.c("Bugle.Penpal.PenpalAvailabilityChecker.Success");
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ainsVar.c("Bugle.Penpal.PenpalAvailabilityChecker.".concat(String.valueOf(((agqp) it.next()).name())));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r11 != r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134 A[PHI: r2 r9 r10
      0x0134: PHI (r2v10 java.util.List) = (r2v12 java.util.List), (r2v13 java.util.List) binds: [B:43:0x0132, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r9v10 boolean) = (r9v7 boolean), (r9v11 boolean) binds: [B:43:0x0132, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r10v12 java.util.ArrayList) = (r10v19 java.util.ArrayList), (r10v20 java.util.ArrayList) binds: [B:43:0x0132, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147 A[PHI: r9 r10
      0x0147: PHI (r9v9 boolean) = (r9v4 boolean), (r9v6 boolean), (r9v10 boolean) binds: [B:38:0x0109, B:15:0x004d, B:45:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r10v11 java.util.ArrayList) = (r10v4 java.util.ArrayList), (r10v21 java.util.ArrayList), (r10v22 java.util.ArrayList) binds: [B:38:0x0109, B:15:0x004d, B:45:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.agqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r9, boolean r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.a(java.util.List, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r19, java.util.ArrayList r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.b(java.util.List, java.util.ArrayList, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.ArrayList r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.agqs
            if (r0 == 0) goto L13
            r0 = r7
            agqs r0 = (defpackage.agqs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agqs r0 = new agqs
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            ejxr r7 = defpackage.crbf.ak
            java.lang.Object r7 = r7.get()
            cczi r7 = (defpackage.cczi) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La5
            cczi r7 = defpackage.crbf.aI
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L57
            goto La5
        L57:
            fcsu r7 = r5.g
            java.lang.Object r7 = r7.b()
            abzv r7 = (defpackage.abzv) r7
            efwo r2 = r5.d
            etfr r4 = defpackage.etfu.a
            java.lang.String r4 = r4.a
            eiju r7 = r7.a(r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto La4
        L73:
            abzu r7 = (defpackage.abzu) r7
            if (r7 != 0) goto L78
            goto L86
        L78:
            int r7 = r7.ordinal()
            if (r7 == 0) goto La5
            if (r7 == r3) goto L9c
            r0 = 2
            if (r7 == r0) goto L94
            r0 = 3
            if (r7 != r0) goto L8e
        L86:
            agqp r7 = defpackage.agqp.f
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        L8e:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        L94:
            agqp r7 = defpackage.agqp.a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        L9c:
            agqp r7 = defpackage.agqp.e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto La5
        La4:
            return r1
        La5:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.c(java.util.ArrayList, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.agqt
            if (r0 == 0) goto L13
            r0 = r7
            agqt r0 = (defpackage.agqt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agqt r0 = new agqt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.g
            java.lang.Object r7 = r7.b()
            abzv r7 = (defpackage.abzv) r7
            efwo r2 = r5.d
            etfr r4 = defpackage.etfv.a
            java.lang.String r4 = r4.a
            eiju r7 = r7.a(r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L9f
        L50:
            abzu r7 = (defpackage.abzu) r7
            if (r7 != 0) goto L55
            goto L63
        L55:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L9c
            if (r7 == r3) goto L95
            r0 = 2
            if (r7 == r0) goto L8d
            r0 = 3
            if (r7 != r0) goto L87
        L63:
            cczi r7 = defpackage.crbf.ba
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7f
            cczi r7 = defpackage.crbf.bd
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9c
        L7f:
            agqp r7 = defpackage.agqp.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto L9c
        L87:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        L8d:
            agqp r7 = defpackage.agqp.a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
            goto L9c
        L95:
            agqp r7 = defpackage.agqp.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r7)
        L9c:
            fctx r6 = defpackage.fctx.a
            return r6
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.d(java.util.ArrayList, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.agqu
            if (r0 == 0) goto L13
            r0 = r6
            agqu r0 = (defpackage.agqu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            agqu r0 = new agqu
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
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            cczi r6 = defpackage.crbf.aQ
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L82
            addt r6 = r4.e
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            egbs r6 = (defpackage.egbs) r6
            if (r6 == 0) goto L7b
            egej r0 = r4.f
            boolean r0 = r0.f(r6)
            if (r0 == 0) goto L7b
            evsl r0 = defpackage.egfn.a
            evsl r0 = defpackage.evsn.m449$$Nest$smcheckIsLite(r0)
            r6.d(r0)
            evry r6 = r6.r
            evsk r1 = r0.d
            java.lang.Object r6 = r6.l(r1)
            if (r6 != 0) goto L71
            java.lang.Object r6 = r0.b
            goto L75
        L71:
            java.lang.Object r6 = r0.c(r6)
        L75:
            egfg r6 = (defpackage.egfg) r6
            boolean r6 = r6.c
            if (r6 != 0) goto L82
        L7b:
            agqp r6 = defpackage.agqp.b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
        L82:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.e(java.util.ArrayList, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.ArrayList r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqy.f(java.util.ArrayList, fcxy):java.lang.Object");
    }
}
