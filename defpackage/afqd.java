package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqd implements fdpm {
    final /* synthetic */ Set a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdpm c;

    public afqd(Set set, fdat fdatVar, fdpm fdpmVar) {
        this.a = set;
        this.b = fdatVar;
        this.c = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r7.fO(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.afqc
            if (r0 == 0) goto L13
            r0 = r8
            afqc r0 = (defpackage.afqc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            afqc r0 = new afqc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r8)
            goto L51
        L3a:
            defpackage.fctl.b(r8)
            java.util.Set r8 = r6.a
            fdat r2 = r6.b
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r2.a(r7, r0)
            if (r2 == r1) goto L6a
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L51:
            boolean r7 = r7.add(r8)
            if (r7 == 0) goto L67
            fdpm r7 = r6.c
            r8 = 0
            r0.a = r8
            r0.b = r8
            r0.e = r3
            java.lang.Object r7 = r7.fO(r2, r0)
            if (r7 != r1) goto L67
            goto L6a
        L67:
            fctx r7 = defpackage.fctx.a
            return r7
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqd.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
