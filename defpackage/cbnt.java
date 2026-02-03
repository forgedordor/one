package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbnt implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Set b;

    public cbnt(fdpm fdpmVar, Set set) {
        this.a = fdpmVar;
        this.b = set;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cbns
            if (r0 == 0) goto L13
            r0 = r9
            cbns r0 = (defpackage.cbns) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cbns r0 = new cbns
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L51
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            fdpm r9 = r7.a
            r2 = r8
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.Set r2 = r7.b
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L51
            r0.b = r3
            java.lang.Object r8 = r9.fO(r8, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbnt.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
