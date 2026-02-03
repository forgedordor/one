package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class awnd {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.awnf r4, defpackage.awpx r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.awne
            if (r0 == 0) goto L13
            r0 = r6
            awne r0 = (defpackage.awne) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            awne r0 = new awne
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.fctl.b(r6)
            java.util.List r5 = defpackage.fcva.b(r5)
            r0.b = r3
            java.lang.Object r6 = b(r4, r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r4 = defpackage.fcva.X(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awnd.a(awnf, awpx, fcxy):java.lang.Object");
    }

    public static /* synthetic */ Object b(awnf awnfVar, List list, fcxy fcxyVar) {
        return awnfVar.n(list, null, fcxyVar);
    }
}
