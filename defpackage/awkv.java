package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awkv implements awjc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/core/destination/DestinationsTableOperations");
    private final fcyh b;
    private final byeq c;

    public awkv(byeq byeqVar, fcyh fcyhVar) {
        byeqVar.getClass();
        fcyhVar.getClass();
        this.c = byeqVar;
        this.b = fcyhVar;
    }

    @Override // defpackage.awjc
    public final Object a(Set set, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new awks(null, set), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.awjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final java.lang.String r5, final defpackage.awja r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.awku
            if (r0 == 0) goto L13
            r0 = r7
            awku r0 = (defpackage.awku) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awku r0 = new awku
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            byeq r7 = r4.c
            awkp r2 = new awkp
            r2.<init>()
            java.lang.String r5 = "DestinationsTableOperations#matchExactOrCreate"
            eiju r5 = r7.a(r5, r2)
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awkv.b(java.lang.String, awja, fcxy):java.lang.Object");
    }
}
