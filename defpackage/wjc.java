package defpackage;

import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState");
    public final wre b;
    public final woh c;
    public final aptx d;
    public final fcsu e;
    public final fdvc f;
    public final wpa g;
    private final fcyh h;
    private final fdjx i;
    private final wpk j;
    private final HashMap k;
    private final feav l;
    private Set m;
    private final feav n;

    public wjc(fcyh fcyhVar, fdjx fdjxVar, wre wreVar, wpa wpaVar, woh wohVar, wpk wpkVar, aptx aptxVar, fcsu fcsuVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        wreVar.getClass();
        wohVar.getClass();
        aptxVar.getClass();
        this.h = fcyhVar;
        this.i = fdjxVar;
        this.b = wreVar;
        this.g = wpaVar;
        this.c = wohVar;
        this.j = wpkVar;
        this.d = aptxVar;
        this.e = fcsuVar;
        this.f = auyf.c(wreVar.a, fdjxVar, new fdap() { // from class: wir
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                return vvwVar.b;
            }
        });
        this.k = new HashMap();
        this.l = new feaz();
        this.m = fcvq.a;
        this.n = new feaz();
        auvw.k(fdjxVar, fcyhVar, null, new wiu(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (c(r10, r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wiv
            if (r0 == 0) goto L13
            r0 = r11
            wiv r0 = (defpackage.wiv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wiv r0 = new wiv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r11)
            goto L8b
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            goto L7f
        L38:
            defpackage.fctl.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r5 = r10.size()
            r6 = 0
        L4a:
            if (r6 >= r5) goto L74
            java.lang.Object r7 = r10.get(r6)
            vvs r7 = (defpackage.vvs) r7
            boolean r8 = r7 instanceof defpackage.vvp
            if (r8 == 0) goto L5f
            fcvv r8 = new fcvv
            r8.<init>(r6, r7)
            r11.add(r8)
            goto L6b
        L5f:
            boolean r8 = r7 instanceof defpackage.vvr
            if (r8 == 0) goto L6e
            fcvv r8 = new fcvv
            r8.<init>(r6, r7)
            r2.add(r8)
        L6b:
            int r6 = r6 + 1
            goto L4a
        L6e:
            fctg r10 = new fctg
            r10.<init>()
            throw r10
        L74:
            r0.a = r2
            r0.d = r4
            java.lang.Object r10 = r9.b(r11, r0)
            if (r10 == r1) goto L8e
            r10 = r2
        L7f:
            r11 = 0
            r0.a = r11
            r0.d = r3
            java.lang.Object r10 = r9.c(r10, r0)
            if (r10 != r1) goto L8b
            goto L8e
        L8b:
            fctx r10 = defpackage.fctx.a
            return r10
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjc.a(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjc.b(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:30:0x0088, B:32:0x008e, B:35:0x00a6, B:36:0x00b5, B:38:0x00bb, B:39:0x00cb, B:23:0x005b, B:24:0x0064, B:26:0x006a, B:28:0x007e, B:29:0x0082), top: B:45:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[Catch: all -> 0x0030, LOOP:1: B:36:0x00b5->B:38:0x00bb, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:30:0x0088, B:32:0x008e, B:35:0x00a6, B:36:0x00b5, B:38:0x00bb, B:39:0x00cb, B:23:0x005b, B:24:0x0064, B:26:0x006a, B:28:0x007e, B:29:0x0082), top: B:45:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [feav] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wjc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjc.c(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcvv r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wjb
            if (r0 == 0) goto L13
            r0 = r11
            wjb r0 = (defpackage.wjb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wjb r0 = new wjb
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "onNewProcessedAttachment"
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentState"
            java.lang.String r5 = "BugleComposeRow2"
            r6 = 1
            java.lang.String r7 = "DraftAttachmentState.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            fcvv r10 = r0.d
            defpackage.fctl.b(r11)
            goto L79
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.fctl.b(r11)
            ekrg r11 = defpackage.wjc.a
            ekrw r11 = r11.f()
            ekrz r2 = defpackage.eksq.a
            r11.X(r2, r5)
            r2 = 165(0xa5, float:2.31E-43)
            ekrw r11 = r11.h(r4, r3, r2, r7)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r2 = "Processed attachment added: %s"
            r11.t(r2, r10)
            fcsu r11 = r9.e
            java.lang.Object r11 = r11.b()
            vth r11 = (defpackage.vth) r11
            java.lang.Object r2 = r10.b
            vvr r2 = (defpackage.vvr) r2
            int r8 = r10.a
            r11.e(r2, r8)
            wpk r11 = r9.j
            r0.d = r10
            r0.c = r6
            wpj r6 = new wpj
            r8 = 0
            r6.<init>(r11, r2, r8)
            fcyh r11 = r11.a
            java.lang.Object r11 = defpackage.eicj.a(r11, r6, r0)
            if (r11 == r1) goto La1
        L79:
            vvr r11 = (defpackage.vvr) r11
            if (r11 == 0) goto L9e
            ekrg r0 = defpackage.wjc.a
            ekrw r0 = r0.e()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r5)
            r1 = 171(0xab, float:2.4E-43)
            ekrw r0 = r0.h(r4, r3, r1, r7)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Updating deferredSpatulaVerdict for attachment: %s"
            r0.t(r1, r11)
            java.lang.Object r0 = r10.b
            vvs r0 = (defpackage.vvs) r0
            int r10 = r10.a
            r9.e(r0, r10, r11)
        L9e:
            fctx r10 = defpackage.fctx.a
            return r10
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjc.d(fcvv, fcxy):java.lang.Object");
    }

    public final void e(vvs vvsVar, int i, vvs vvsVar2) {
        auvw.k(this.i, this.h, null, new wja(vvsVar, vvsVar2, this, i, null), 2);
    }
}
