package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfr implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Context b;
    final /* synthetic */ vft c;
    final /* synthetic */ zqm d;

    public vfr(fdpm fdpmVar, Context context, vft vftVar, zqm zqmVar) {
        this.a = fdpmVar;
        this.b = context;
        this.c = vftVar;
        this.d = zqmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.vfq
            if (r2 == 0) goto L17
            r2 = r1
            vfq r2 = (defpackage.vfq) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vfq r2 = new vfq
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            defpackage.fctl.b(r1)
            goto Lb7
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r21
            zqw r4 = (defpackage.zqw) r4
            java.util.List r6 = r4.a
            boolean r7 = r6.isEmpty()
            r8 = 0
            if (r7 != 0) goto Lae
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L4d
            goto L84
        L4d:
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r6.next()
            ajlt r7 = (defpackage.ajlt) r7
            amvr r9 = r7.g()
            boolean r9 = r9 instanceof defpackage.amwf
            if (r9 != 0) goto L51
            amvr r9 = r7.g()
            boolean r9 = r9 instanceof defpackage.amwa
            if (r9 != 0) goto L51
            amvr r7 = r7.g()
            boolean r9 = r7 instanceof defpackage.amwm
            if (r9 == 0) goto L78
            amwm r7 = (defpackage.amwm) r7
            goto L79
        L78:
            r7 = r8
        L79:
            if (r7 == 0) goto L80
            java.lang.String r7 = r7.l()
            goto L81
        L80:
            r7 = r8
        L81:
            if (r7 != 0) goto L51
            goto Lae
        L84:
            android.content.Context r6 = r0.b
            r7 = 2132085484(0x7f150aec, float:1.9811168E38)
            java.lang.String r9 = r6.getString(r7)
            r9.getClass()
            vft r7 = r0.c
            zqm r8 = r0.d
            djrr r10 = defpackage.djrr.aE
            dihq r11 = new dihq
            vfp r12 = new vfp
            r12.<init>(r7, r4, r6, r8)
            r19 = 1004(0x3ec, float:1.407E-42)
            r8 = r11
            r11 = 0
            r18 = r12
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        Lae:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r8, r2)
            if (r1 != r3) goto Lb7
            return r3
        Lb7:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfr.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
