package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwnn extends cayv {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler");
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fdjx h;
    private final fcyh i;
    private final fcyh j;

    public bwnn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.a = fcsuVar3;
        this.b = fcsuVar4;
        this.c = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fdjxVar;
        this.i = fcyhVar;
        this.j = fcyhVar2;
    }

    private final Instant o() {
        Instant instantF = ((cogw) this.e.b()).f();
        instantF.getClass();
        return instantF;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("FtdDataCleanUpWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = bwne.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bwne bwneVar = (bwne) evuhVar;
        bwneVar.getClass();
        return auvw.c(this.h, fcyi.a, fdjz.a, new bwnk(bwneVar, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.bwnf
            if (r0 == 0) goto L13
            r0 = r11
            bwnf r0 = (defpackage.bwnf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwnf r0 = new bwnf
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "cleanUpPendingDecryptedMessages"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler"
            java.lang.String r5 = "BugleE2eeEtouffee"
            r6 = 1
            java.lang.String r7 = "FtdDataCleanUpWorkHandler.kt"
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            defpackage.fctl.b(r11)
            goto L86
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.bwnn.d
            ekrw r11 = r11.e()
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r5)
            r2 = 154(0x9a, float:2.16E-43)
            ekrw r11 = r11.h(r4, r3, r2, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Deleting old decrypted messages."
            r11.q(r2)
            fcsu r11 = r10.e
            java.lang.Object r11 = r11.b()
            cogw r11 = (defpackage.cogw) r11
            j$.time.Instant r11 = r11.f()
            r11.getClass()
            cczv r2 = defpackage.bwbv.k
            java.lang.Object r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r8 = (long) r2
            j$.time.Duration r2 = j$.time.Duration.ofDays(r8)
            j$.time.Instant r11 = r11.minus(r2)
            fcyh r2 = r10.i
            bwng r8 = new bwng
            r9 = 0
            r8.<init>(r10, r11, r9)
            r0.c = r6
            java.lang.Object r11 = defpackage.fdin.a(r2, r8, r0)
            if (r11 == r1) goto La9
        L86:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 <= 0) goto La6
            ekrg r0 = defpackage.bwnn.d
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            r1 = 165(0xa5, float:2.31E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Deleted pending decrypted messages: %d."
            r0.r(r1, r11)
        La6:
            fctx r11 = defpackage.fctx.a
            return r11
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwnn.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        if (r14 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.aubq r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwnn.l(aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.bwne r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bwnj
            if (r0 == 0) goto L13
            r0 = r8
            bwnj r0 = (defpackage.bwnj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwnj r0 = new bwnj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            bwne r7 = r0.d
            defpackage.fctl.b(r8)
            goto L58
        L3b:
            bwne r7 = r0.d
            defpackage.fctl.b(r8)
            goto L4e
        L41:
            defpackage.fctl.b(r8)
            r0.d = r7
            r0.c = r5
            java.lang.Object r8 = r6.k(r0)
            if (r8 == r1) goto L6e
        L4e:
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r6.n(r0)
            if (r8 == r1) goto L6e
        L58:
            aubq r7 = r7.c
            if (r7 != 0) goto L5e
            aubq r7 = defpackage.aubq.a
        L5e:
            r7.getClass()
            r8 = 0
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = r6.l(r7, r0)
            if (r7 != r1) goto L6d
            goto L6e
        L6d:
            return r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwnn.m(bwne, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bwnl
            if (r0 == 0) goto L13
            r0 = r8
            bwnl r0 = (defpackage.bwnl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bwnl r0 = new bwnl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L7f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.fctl.b(r8)
            ekrg r8 = defpackage.bwnn.d
            ekrw r8 = r8.e()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r4 = "BugleE2eeEtouffee"
            r8.X(r2, r4)
            r2 = 131(0x83, float:1.84E-43)
            java.lang.String r4 = "FtdDataCleanUpWorkHandler.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/ftd/FtdDataCleanUpWorkHandler"
            java.lang.String r6 = "removePendingMessageCutoff"
            ekrw r8 = r8.h(r5, r6, r2, r4)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r2 = "Removing pending message cutoff"
            r8.q(r2)
            j$.time.Instant r8 = r7.o()
            cczv r2 = defpackage.bwbv.j
            java.lang.Object r2 = r2.e()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r4 = (long) r2
            j$.time.Duration r2 = j$.time.Duration.ofDays(r4)
            j$.time.Instant r8 = r8.minus(r2)
            long r4 = r8.toEpochMilli()
            fcyh r8 = r7.i
            bwnm r2 = new bwnm
            r6 = 0
            r2.<init>(r7, r4, r6)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L97
        L7f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 <= 0) goto L94
            fcsu r0 = r7.g
            java.lang.Object r0 = r0.b()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.Etouffee.OutdatedPendingMessages.Removed.Count"
            r0.e(r1, r8)
        L94:
            fctx r8 = defpackage.fctx.a
            return r8
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwnn.n(fcxy):java.lang.Object");
    }
}
