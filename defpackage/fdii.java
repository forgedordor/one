package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdii {
    public static final Object a(Collection collection, fcxy fcxyVar) {
        return collection.isEmpty() ? fcvo.a : new fdig((fdkf[]) collection.toArray(new fdkf[0])).a(fcxyVar);
    }

    public static final Object b(fdkf[] fdkfVarArr, fcxy fcxyVar) {
        return new fdig(fdkfVarArr).a(fcxyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.Collection r4, defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.fdih
            if (r0 == 0) goto L13
            r0 = r5
            fdih r0 = (defpackage.fdih) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdih r0 = new fdih
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            defpackage.fctl.b(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fctl.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            fdlr r5 = (defpackage.fdlr) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.o(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            fctx r4 = defpackage.fctx.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdii.c(java.util.Collection, fcxy):java.lang.Object");
    }
}
