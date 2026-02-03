package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crrj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ecjh r4, defpackage.fdap r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.crri
            if (r0 == 0) goto L13
            r0 = r6
            crri r0 = (defpackage.crri) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crri r0 = new crri
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r6)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.a()
            r4.getClass()
            r0.a = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r4, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r6.getClass()
            java.lang.Object r4 = r5.invoke(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crrj.a(ecjh, fdap, fcxy):java.lang.Object");
    }

    public static final Object b(ecjh ecjhVar, final fdap fdapVar, fcxy fcxyVar) {
        final fdap fdapVar2 = new fdap() { // from class: crrg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                evsf builder;
                evsn evsnVar = (evsn) obj;
                if (evsnVar == null || (builder = evsnVar.toBuilder()) == null) {
                    return null;
                }
                fdapVar.invoke(builder);
                return builder.build();
            }
        };
        return fdxs.c(ecjhVar.b(new ejvr() { // from class: crrh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar2.invoke(obj);
            }
        }, eoqg.a), fcxyVar);
    }
}
