package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkl extends lmn {
    public List a;
    final /* synthetic */ llo b;

    public lkl(llo lloVar, List list) {
        this.b = lloVar;
        this.a = fcva.ao(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.lmn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lkh
            if (r0 == 0) goto L13
            r0 = r7
            lkh r0 = (defpackage.lkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lkh r0 = new lkh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.fctl.b(r7)
            goto L66
        L36:
            defpackage.fctl.b(r7)
            java.util.List r7 = r6.a
            if (r7 == 0) goto L5b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L44
            goto L5b
        L44:
            llo r7 = r6.b
            lmg r2 = r7.c()
            lkk r4 = new lkk
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.c = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 == r1) goto L72
        L58:
            ljt r7 = (defpackage.ljt) r7
            goto L68
        L5b:
            llo r7 = r6.b
            r0.c = r4
            r2 = 0
            java.lang.Object r7 = r7.k(r2, r0)
            if (r7 == r1) goto L72
        L66:
            ljt r7 = (defpackage.ljt) r7
        L68:
            llo r0 = r6.b
            llp r0 = r0.c
            r0.b(r7)
            fctx r7 = defpackage.fctx.a
            return r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkl.a(fcxy):java.lang.Object");
    }
}
