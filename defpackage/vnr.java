package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnr implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Context b;
    final /* synthetic */ vwn c;

    public vnr(fdpm fdpmVar, Context context, vwn vwnVar) {
        this.a = fdpmVar;
        this.b = context;
        this.c = vwnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.vnq
            if (r2 == 0) goto L17
            r2 = r1
            vnq r2 = (defpackage.vnq) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            vnq r2 = new vnq
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            defpackage.fctl.b(r1)
            goto L6c
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r19
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r11 = r4.booleanValue()
            android.content.Context r4 = r0.b
            dihq r6 = new dihq
            r7 = 2132082813(0x7f15007d, float:1.980575E38)
            java.lang.String r7 = r4.getString(r7)
            r7.getClass()
            vwn r4 = r0.c
            vnj r8 = new vnj
            r8.<init>(r4)
            r17 = 998(0x3e6, float:1.398E-42)
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.b = r5
            java.lang.Object r1 = r1.fO(r6, r2)
            if (r1 != r3) goto L6c
            return r3
        L6c:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnr.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
