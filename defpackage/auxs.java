package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxs implements fdvc {
    private final fctc a;
    private final List b = fcvo.a;

    public auxs(fdae fdaeVar) {
        this.a = fctd.b(3, fdaeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (defpackage.fdkj.b(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fduj, defpackage.fdpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdpm r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.auxr
            if (r0 == 0) goto L13
            r0 = r7
            auxr r0 = (defpackage.auxr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            auxr r0 = new auxr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            defpackage.fctl.b(r7)
            goto L5f
        L32:
            defpackage.fctl.b(r7)
            goto L56
        L36:
            defpackage.fctl.b(r7)
            fcyh r7 = r0.u()
            fdlq r2 = defpackage.fdlr.c
            fcyf r7 = r7.get(r2)
            fdlr r7 = (defpackage.fdlr) r7
            if (r7 == 0) goto L4a
            defpackage.fdlw.g(r7)
        L4a:
            java.lang.Object r7 = r5.b()
            r0.c = r4
            java.lang.Object r6 = r6.fO(r7, r0)
            if (r6 == r1) goto L65
        L56:
            r0.c = r3
            java.lang.Object r6 = defpackage.fdkj.b(r0)
            if (r6 != r1) goto L5f
            goto L65
        L5f:
            fcta r6 = new fcta
            r6.<init>()
            throw r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auxs.a(fdpm, fcxy):java.lang.Object");
    }

    public final Object b() {
        return this.a.a();
    }

    @Override // defpackage.fdvc
    public final Object c() {
        return b();
    }

    @Override // defpackage.fduj
    public final List d() {
        return this.b;
    }
}
