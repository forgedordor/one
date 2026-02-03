package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gun {
    private final feav a = new feaz();
    private final hox b = new hpl(null, hsi.a);

    private final void e(guk gukVar) {
        this.b.b(gukVar);
    }

    public final guk a() {
        return (guk) this.b.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gul r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gum
            if (r0 == 0) goto L13
            r0 = r9
            gum r0 = (defpackage.gum) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gum r0 = new gum
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            gum r8 = r0.d
            feaz r8 = r0.f
            gul r0 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L86
        L31:
            r9 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            feaz r8 = r0.f
            gul r2 = r0.e
            defpackage.fctl.b(r9)
            r9 = r8
            r8 = r2
            goto L59
        L45:
            defpackage.fctl.b(r9)
            feav r9 = r7.a
            r0.e = r8
            r2 = r9
            feaz r2 = (defpackage.feaz) r2
            r0.f = r2
            r0.c = r5
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto L9b
        L59:
            r0.e = r8     // Catch: java.lang.Throwable -> L8f
            r2 = r9
            feaz r2 = (defpackage.feaz) r2     // Catch: java.lang.Throwable -> L8f
            r0.f = r2     // Catch: java.lang.Throwable -> L8f
            r0.d = r0     // Catch: java.lang.Throwable -> L8f
            r0.c = r4     // Catch: java.lang.Throwable -> L8f
            fdiu r2 = new fdiu     // Catch: java.lang.Throwable -> L8f
            fcxy r4 = defpackage.fcym.c(r0)     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8f
            r2.B()     // Catch: java.lang.Throwable -> L8f
            guk r4 = new guk     // Catch: java.lang.Throwable -> L8f
            r4.<init>(r8, r2)     // Catch: java.lang.Throwable -> L8f
            r7.e(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r8 = r2.m()     // Catch: java.lang.Throwable -> L8f
            if (r8 != r1) goto L81
            r0.getClass()     // Catch: java.lang.Throwable -> L8f
        L81:
            if (r8 == r1) goto L9b
            r6 = r9
            r9 = r8
            r8 = r6
        L86:
            r7.e(r3)     // Catch: java.lang.Throwable -> L8d
            r8.d()
            return r9
        L8d:
            r9 = move-exception
            goto L97
        L8f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L93:
            r7.e(r3)     // Catch: java.lang.Throwable -> L8d
            throw r9     // Catch: java.lang.Throwable -> L8d
        L97:
            r8.d()
            throw r9
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gun.b(gul, fcxy):java.lang.Object");
    }

    public final Object c(String str, String str2, boolean z, int i, fcxy fcxyVar) {
        return b(new gul(str, str2, z, i), fcxyVar);
    }
}
