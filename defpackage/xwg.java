package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwg implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ xwm b;
    final /* synthetic */ fduf c;

    public xwg(fdpm fdpmVar, xwm xwmVar, fduf fdufVar) {
        this.a = fdpmVar;
        this.b = xwmVar;
        this.c = fdufVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof defpackage.xwf
            if (r2 == 0) goto L17
            r2 = r1
            xwf r2 = (defpackage.xwf) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            xwf r2 = new xwf
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
            r4 = r17
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            xwm r4 = r0.b
            fduf r6 = r0.c
            long r8 = defpackage.ije.d
            r10 = 1041865114(0x3e19999a, float:0.15)
            long r10 = defpackage.ije.h(r8, r10)
            long r12 = defpackage.ije.a
            if (r7 < 0) goto Lba
            r15 = 99
            if (r7 > r15) goto L6e
            android.content.Context r4 = r4.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r17 = 0
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r17] = r15
            r15 = 2131951698(0x7f130052, float:1.9539818E38)
            java.lang.String r4 = r4.getQuantityString(r15, r7, r14)
            goto L85
        L6e:
            r17 = 0
            android.content.Context r4 = r4.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r17] = r14
            r14 = 2132087136(0x7f151160, float:1.9814519E38)
            java.lang.String r4 = r4.getString(r14, r15)
        L85:
            r4.getClass()
            diwu r14 = new diwu
            ije r15 = new ije
            r15.<init>(r12)
            ije r12 = new ije
            r12.<init>(r8)
            r13 = r12
            ije r12 = new ije
            r12.<init>(r10)
            r11 = r13
            ije r13 = new ije
            r13.<init>(r8)
            r8 = r14
            xwa r14 = new xwa
            r14.<init>()
            djrr r10 = defpackage.djrr.cp
            r9 = r4
            r6 = r8
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.b = r5
            java.lang.Object r1 = r1.fO(r6, r2)
            if (r1 != r3) goto Lb7
            return r3
        Lb7:
            fctx r1 = defpackage.fctx.a
            return r1
        Lba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot have negative reply count."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwg.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
