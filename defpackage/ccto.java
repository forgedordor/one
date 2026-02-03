package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccto implements atnb {
    public final cctj a;
    private final ccer b;
    private final ccpm c;
    private final ccap d;
    private final efob e;
    private final arac f;
    private final atam g;

    public ccto(cctj cctjVar, ccer ccerVar, ccpm ccpmVar, ccap ccapVar, efob efobVar, arac aracVar) {
        cctjVar.getClass();
        ccerVar.getClass();
        ccpmVar.getClass();
        ccapVar.getClass();
        efobVar.getClass();
        aracVar.getClass();
        this.a = cctjVar;
        this.b = ccerVar;
        this.c = ccpmVar;
        this.d = ccapVar;
        this.e = efobVar;
        this.f = aracVar;
        this.g = new atam();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.atnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r5, defpackage.aucl r6, defpackage.asrg r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cctk
            if (r0 == 0) goto L13
            r0 = r8
            cctk r0 = (defpackage.cctk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cctk r0 = new cctk
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r8)
            r0.c = r3
            java.lang.Object r8 = r4.b(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            fcti r8 = (defpackage.fcti) r8
            java.lang.Object r5 = r8.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccto.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, aucl, asrg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, defpackage.aucl r19, defpackage.asrg r20, defpackage.fcxy r21) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccto.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, aucl, asrg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, defpackage.asrg r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.cctm
            if (r0 == 0) goto L13
            r0 = r15
            cctm r0 = (defpackage.cctm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cctm r0 = new cctm
            r0.<init>(r12, r15)
        L18:
            r11 = r0
            java.lang.Object r15 = r11.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.fctl.b(r15)
            return r15
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            ccep r13 = r11.g
            java.lang.Object r14 = r11.b
            asrg r1 = r11.f
            java.lang.Object r3 = r11.a
            defpackage.fctl.b(r15)
            r7 = r1
            r1 = r14
            goto L6b
        L41:
            defpackage.fctl.b(r15)
            ccap r15 = r12.d
            ccer r1 = r12.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r13.A()
            r4.getClass()
            ccep r1 = r1.a(r4, r14)
            ccpm r4 = r12.c
            r11.a = r13
            r11.f = r14
            r11.b = r15
            r11.g = r1
            r11.e = r3
            java.lang.Object r3 = r4.e(r13)
            if (r3 == r0) goto La6
            r7 = r3
            r3 = r13
            r13 = r1
            r1 = r15
            r15 = r7
            r7 = r14
        L6b:
            ccpl r15 = (defpackage.ccpl) r15
            basd r4 = r3.F()
            r4.getClass()
            basd r5 = r3.E()
            r5.getClass()
            aubx r6 = defpackage.cche.c
            eyga r8 = r3.ac()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r14 = r3.H()
            r14.getClass()
            athh r9 = r14.z()
            cctn r10 = new cctn
            r14 = 0
            r10.<init>(r12, r3, r14)
            r11.a = r14
            r11.f = r14
            r11.b = r14
            r11.g = r14
            r11.e = r2
            r2 = r13
            r3 = r15
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto La5
            goto La6
        La5:
            return r13
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccto.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, asrg, fcxy):java.lang.Object");
    }
}
