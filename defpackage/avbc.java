package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avbc implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Duration b;

    public avbc(fdpm fdpmVar, Duration duration) {
        this.b = duration;
        this.a = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.eooa.a(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avbb
            if (r0 == 0) goto L13
            r0 = r7
            avbb r0 = (defpackage.avbb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            avbb r0 = new avbb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            goto L43
        L36:
            defpackage.fctl.b(r7)
            fdpm r7 = r5.a
            r0.b = r4
            java.lang.Object r6 = r7.fO(r6, r0)
            if (r6 == r1) goto L51
        L43:
            j$.time.Duration r6 = r5.b
            r0.b = r3
            java.lang.Object r6 = defpackage.eooa.a(r6, r0)
            if (r6 != r1) goto L4e
            goto L51
        L4e:
            fctx r6 = defpackage.fctx.a
            return r6
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avbc.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
