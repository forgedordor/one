package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjm implements fdpm {
    final /* synthetic */ fdpm a;

    public wjm(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wjl
            if (r0 == 0) goto L13
            r0 = r12
            wjl r0 = (defpackage.wjl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wjl r0 = new wjl
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r12)
            goto L80
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r12)
            fdpm r12 = r10.a
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L3f:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r11.next()
            r5 = r4
            vvs r5 = (defpackage.vvs) r5
            boolean r6 = defpackage.wkk.c(r5)
            if (r6 != 0) goto L73
            ekrg r4 = defpackage.wjy.a
            ekrw r4 = r4.i()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r7 = "BugleComposeRow2"
            r4.X(r6, r7)
            r6 = 91
            java.lang.String r7 = "DraftAttachmentUiAdapterImpl.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$createUiData$$inlined$map$1$2"
            java.lang.String r9 = "emit"
            ekrw r4 = r4.h(r8, r9, r6, r7)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r6 = "Cannot convert to AttachmentUiData: %s"
            r4.t(r6, r5)
            goto L3f
        L73:
            r2.add(r4)
            goto L3f
        L77:
            r0.b = r3
            java.lang.Object r11 = r12.fO(r2, r0)
            if (r11 != r1) goto L80
            return r1
        L80:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjm.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
