package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopk implements doph {
    public final fbnd a;
    private final fctc b;

    public dopk(fbnd fbndVar) {
        fbndVar.getClass();
        this.a = fbndVar;
        this.b = fctd.a(new fdae() { // from class: dopi
            @Override // defpackage.fdae
            public final Object invoke() {
                return new eaik(this.a.a, fbnc.a);
            }
        });
    }

    private static final Exception b(Exception exc, Status status) {
        int iOrdinal = status.getCode().ordinal();
        return iOrdinal != 3 ? iOrdinal != 7 ? iOrdinal != 12 ? iOrdinal != 16 ? exc : new dooa(exc.getMessage()) : new doob(exc.getMessage()) : new donz(exc.getMessage()) : new dony(exc.getMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.doph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fdat r5, defpackage.fcxy r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dopj
            if (r0 == 0) goto L13
            r0 = r6
            dopj r0 = (defpackage.dopj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dopj r0 = new dopj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r6)     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            return r6
        L27:
            r5 = move-exception
            goto L48
        L29:
            r5 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            fctc r6 = r4.b     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            java.lang.Object r6 = r6.a()     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            eaik r6 = (defpackage.eaik) r6     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            r0.c = r3     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: defpackage.fbtf -> L27 io.grpc.StatusException -> L29
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        L48:
            io.grpc.Status r6 = r5.a
            r6.getClass()
            java.lang.Exception r5 = b(r5, r6)
            throw r5
        L52:
            io.grpc.Status r6 = r5.a
            r6.getClass()
            java.lang.Exception r5 = b(r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dopk.a(fdat, fcxy):java.lang.Object");
    }
}
