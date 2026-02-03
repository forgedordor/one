package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayrq {
    public static final ayrq a = new ayrq();

    private ayrq() {
    }

    public static final long c(String str, fdae fdaeVar) throws IOException {
        int i = fdhq.a;
        long jB = fdhq.b();
        eieu eieuVarH = eiiy.h(str);
        try {
            fdaeVar.invoke();
            fczl.a(eieuVarH, null);
            return fdhr.b(jB);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.fdap r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ayro
            if (r0 == 0) goto L13
            r0 = r9
            ayro r0 = (defpackage.ayro) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayro r0 = new ayro
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.a
            eieu r0 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L50
        L2b:
            r7 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r9)
            int r9 = defpackage.fdhq.a
            long r4 = defpackage.fdhq.b()
            eieu r7 = defpackage.eiiy.h(r7)
            r0.e = r7     // Catch: java.lang.Throwable -> L5f
            r0.a = r4     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L5f
            if (r8 == r1) goto L5e
            r0 = r7
            r7 = r4
        L50:
            r9 = 0
            defpackage.fczl.a(r0, r9)
            long r7 = defpackage.fdhr.b(r7)
            fdhi r9 = new fdhi
            r9.<init>(r7)
            return r9
        L5e:
            return r1
        L5f:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L62:
            throw r7     // Catch: java.lang.Throwable -> L63
        L63:
            r8 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayrq.a(java.lang.String, fdap, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.fdap r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ayrp
            if (r0 == 0) goto L13
            r0 = r9
            ayrp r0 = (defpackage.ayrp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayrp r0 = new ayrp
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r7 = r0.a
            eieu r0 = r0.e
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L50
        L2b:
            r7 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.fctl.b(r9)
            int r9 = defpackage.fdhq.a
            long r4 = defpackage.fdhq.b()
            eieu r7 = defpackage.eiiy.h(r7)
            r0.e = r7     // Catch: java.lang.Throwable -> L5f
            r0.a = r4     // Catch: java.lang.Throwable -> L5f
            r0.d = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r9 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L5f
            if (r9 == r1) goto L5e
            r0 = r7
            r7 = r4
        L50:
            r1 = 0
            defpackage.fczl.a(r0, r1)
            fdhu r0 = new fdhu
            long r7 = defpackage.fdhr.b(r7)
            r0.<init>(r9, r7)
            return r0
        L5e:
            return r1
        L5f:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L62:
            throw r7     // Catch: java.lang.Throwable -> L63
        L63:
            r8 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayrq.b(java.lang.String, fdap, fcxy):java.lang.Object");
    }
}
