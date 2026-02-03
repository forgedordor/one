package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elge implements fdap {
    private final feav a = new feaz();
    private elgg b;

    public elge(fdap fdapVar) {
        this.b = new elgf(fdapVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.elgd
            if (r0 == 0) goto L13
            r0 = r7
            elgd r0 = (defpackage.elgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            elgd r0 = new elgd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            feaz r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L72
        L2c:
            r7 = move-exception
            goto L8a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            feaz r2 = r0.d
            defpackage.fctl.b(r7)
            r7 = r2
            goto L4f
        L3d:
            defpackage.fctl.b(r7)
            feav r7 = r6.a
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L8e
        L4f:
            elgg r2 = r6.b     // Catch: java.lang.Throwable -> L86
            boolean r4 = r2 instanceof defpackage.elgc     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L5a
            elgc r2 = (defpackage.elgc) r2     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r2.a     // Catch: java.lang.Throwable -> L86
            goto L7c
        L5a:
            boolean r4 = r2 instanceof defpackage.elgf     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L80
            elgf r2 = (defpackage.elgf) r2     // Catch: java.lang.Throwable -> L86
            fdap r2 = r2.a     // Catch: java.lang.Throwable -> L86
            r4 = r7
            feaz r4 = (defpackage.feaz) r4     // Catch: java.lang.Throwable -> L86
            r0.d = r4     // Catch: java.lang.Throwable -> L86
            r0.c = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 == r1) goto L8e
            r5 = r0
            r0 = r7
            r7 = r5
        L72:
            elgc r1 = new elgc     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            r6.b = r1     // Catch: java.lang.Throwable -> L2c
            r5 = r0
            r0 = r7
            r7 = r5
        L7c:
            r7.d()
            return r0
        L80:
            fctg r0 = new fctg     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L8a:
            r0.d()
            throw r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elge.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fcxy fcxyVar = (fcxy) obj;
        elgg elggVar = this.b;
        if (elggVar instanceof elgc) {
            return ((elgc) elggVar).a;
        }
        if (elggVar instanceof elgf) {
            return a(fcxyVar);
        }
        throw new fctg();
    }
}
