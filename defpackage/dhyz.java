package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyz implements dhyu {
    private final dhzc a;

    public dhyz(fcsu fcsuVar) {
        Object objB = fcsuVar.b();
        objB.getClass();
        this.a = (dhzc) objB;
    }

    private static final dhyt d(dhza dhzaVar) {
        Integer num = dhzaVar.a;
        int i = 1;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                i = 2;
            } else if (iIntValue == 2) {
                i = 3;
            }
        }
        return new dhyt(new dhyv(i));
    }

    private static final Object e(defn defnVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        defnVar.s(new dhyy(fdiuVar));
        return fdiuVar.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, android.os.ParcelFileDescriptor r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dhyw
            if (r0 == 0) goto L13
            r0 = r7
            dhyw r0 = (defpackage.dhyw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhyw r0 = new dhyw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            dhzc r7 = r4.a
            defn r5 = r7.a(r5, r6)
            r0.c = r3
            java.lang.Object r7 = e(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            dhza r7 = (defpackage.dhza) r7
            dhyt r5 = d(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhyz.a(int, android.os.ParcelFileDescriptor, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dhyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, android.os.ParcelFileDescriptor r6, int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dhyx
            if (r0 == 0) goto L13
            r0 = r8
            dhyx r0 = (defpackage.dhyx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhyx r0 = new dhyx
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r8)
            dhzc r8 = r4.a
            defn r5 = r8.b(r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = e(r5, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            dhza r8 = (defpackage.dhza) r8
            dhyt r5 = d(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhyz.b(int, android.os.ParcelFileDescriptor, int, fcxy):java.lang.Object");
    }

    @Override // defpackage.dhyu
    public final Object c(int[] iArr, fcxy fcxyVar) {
        Object objE = e(this.a.c(iArr), fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }
}
