package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aobn implements aoay {
    public final Context b;
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final eizx h;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final dqsn m;
    private static final aoba i = new aoba();
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientRepositoryProfileUpdateExtensionImpl");

    public aobn(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, dqsn dqsnVar) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        dqsnVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.m = dqsnVar;
        this.h = new eizx();
    }

    @Override // defpackage.aoay
    public final eiju a(efwo efwoVar, anty antyVar, anue anueVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.c, eicg.a(fcyiVar), fdjzVar, new aobb(null, antyVar, efwoVar, anueVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.anty r15, defpackage.antg r16, defpackage.fcxy r17) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.aobd
            if (r1 == 0) goto L15
            r1 = r0
            aobd r1 = (defpackage.aobd) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            aobd r1 = new aobd
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.c
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L4c
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            java.lang.Object r15 = r1.b
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r1 = r1.a
            antg r1 = (defpackage.antg) r1
            defpackage.fctl.b(r0)
            goto Lc2
        L35:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3d:
            java.lang.Object r15 = r1.b
            antg r15 = (defpackage.antg) r15
            java.lang.Object r3 = r1.a
            anty r3 = (defpackage.anty) r3
            defpackage.fctl.b(r0)
            r13 = r3
            r3 = r15
            r15 = r13
            goto La1
        L4c:
            defpackage.fctl.b(r0)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = r16.b()
            anue r10 = r0.F()
            antq r11 = r16.a()
            r0 = r15
            antf r0 = (defpackage.antf) r0
            j$.util.Optional r0 = r0.h
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L70
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            eiju r0 = defpackage.eijx.e(r0)
            goto L90
        L70:
            java.lang.Object r0 = r0.get()
            r8 = r0
            aobn r8 = (defpackage.aobn) r8
            fdjx r0 = r8.c
            fcyi r3 = defpackage.fcyi.a
            fdjz r12 = defpackage.fdjz.a
            fcyh r3 = defpackage.eicg.a(r3)
            aobm r6 = new aobm
            r7 = 0
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            fdkf r0 = defpackage.fdin.b(r0, r3, r12, r6)
            eiju r0 = defpackage.auvw.a(r0)
        L90:
            r0.getClass()
            r1.a = r15
            r3 = r16
            r1.b = r3
            r1.e = r5
            java.lang.Object r0 = defpackage.fdxs.c(r0, r1)
            if (r0 == r2) goto Ld7
        La1:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            anue r5 = r3.c()
            chpc r6 = r3.g()
            eiju r15 = r15.G(r5, r6)
            r15.getClass()
            r1.a = r3
            r1.b = r0
            r1.e = r4
            java.lang.Object r15 = defpackage.fdxs.c(r15, r1)
            if (r15 == r2) goto Ld7
            r1 = r0
            r0 = r15
            r15 = r1
            r1 = r3
        Lc2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Ld5
            boolean r15 = r0.booleanValue()
            if (r15 == 0) goto Ld5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = r1.b()
            return r15
        Ld5:
            r15 = 0
            return r15
        Ld7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobn.b(anty, antg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0031, B:30:0x00b8, B:25:0x0088, B:27:0x008e, B:32:0x00ca, B:33:0x00da, B:35:0x00e0, B:37:0x00f0, B:40:0x00f9, B:41:0x00fd, B:20:0x004c, B:21:0x005b, B:23:0x0061, B:24:0x006b), top: B:54:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0031, B:30:0x00b8, B:25:0x0088, B:27:0x008e, B:32:0x00ca, B:33:0x00da, B:35:0x00e0, B:37:0x00f0, B:40:0x00f9, B:41:0x00fd, B:20:0x004c, B:21:0x005b, B:23:0x0061, B:24:0x006b), top: B:54:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:30:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.anty r10, java.util.List r11, boolean r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobn.c(anty, java.util.List, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.anty r17, defpackage.ajmu r18, defpackage.ekgb r19, boolean r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobn.d(anty, ajmu, ekgb, boolean, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.anty r6, defpackage.anue r7, final defpackage.antq r8, defpackage.fcxy r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.aobc
            if (r0 == 0) goto L13
            r0 = r9
            aobc r0 = (defpackage.aobc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aobc r0 = new aobc
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            chos r8 = r0.d
            defpackage.fctl.b(r9)
            goto L6a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "getRecipientById"
            eieu r9 = defpackage.eiiy.k(r9)
            ekgb r7 = defpackage.ekgb.r(r7)     // Catch: java.lang.Throwable -> L85
            bsbm r7 = defpackage.antf.l(r7)     // Catch: java.lang.Throwable -> L85
            eiju r7 = r7.x()     // Catch: java.lang.Throwable -> L85
            anrz r2 = new anrz     // Catch: java.lang.Throwable -> L85
            r4 = r6
            antf r4 = (defpackage.antf) r4     // Catch: java.lang.Throwable -> L85
            r2.<init>()     // Catch: java.lang.Throwable -> L85
            antf r6 = (defpackage.antf) r6     // Catch: java.lang.Throwable -> L85
            eosc r6 = r6.b     // Catch: java.lang.Throwable -> L85
            eiju r6 = r7.h(r2, r6)     // Catch: java.lang.Throwable -> L85
            r9.b(r6)     // Catch: java.lang.Throwable -> L85
            r9.close()
            r7 = r8
            chos r7 = (defpackage.chos) r7
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r6, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            if (r9 != 0) goto L74
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L74:
            dqsn r6 = r5.m
            aoaz r7 = new aoaz
            r7.<init>()
            java.lang.String r8 = "internalUpdateUntrustedDisplayNameAndMetaDataV2"
            java.lang.Object r6 = r6.c(r8, r7)
            r6.getClass()
            return r6
        L85:
            r6 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r7 = move-exception
            r6.addSuppressed(r7)
        L8e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobn.e(anty, anue, antq, fcxy):java.lang.Object");
    }
}
