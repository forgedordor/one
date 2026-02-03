package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyv {
    static final /* synthetic */ anyv a = new anyv();

    private anyv() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009a -> B:24:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.anpj r7, int r8, defpackage.anyw r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.anyu
            if (r0 == 0) goto L13
            r0 = r10
            anyu r0 = (defpackage.anyu) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            anyu r0 = new anyu
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.e
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.d
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            int r5 = r0.h
            defpackage.fctl.b(r10)
            goto L9b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r9 = r0.a
            int r8 = r0.h
            defpackage.fctl.b(r10)
            goto L5a
        L44:
            defpackage.fctl.b(r10)
            eiju r7 = r7.b()
            r7.getClass()
            r0.h = r8
            r0.a = r9
            r0.g = r4
            java.lang.Object r10 = defpackage.fdxs.c(r7, r0)
            if (r10 == r1) goto Lcc
        L5a:
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r10, r2)
            r7.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r5 = r8
            r2 = r9
            r8 = r10
        L71:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La2
            java.lang.Object r9 = r8.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r9
            anpj r9 = r9.E(r5)
            eiju r9 = r9.b()
            r9.getClass()
            r0.h = r5
            r0.a = r2
            r0.b = r7
            r0.c = r8
            r0.d = r7
            r0.g = r3
            java.lang.Object r10 = defpackage.fdxs.c(r9, r0)
            if (r10 == r1) goto Lcc
            r9 = r7
        L9b:
            anyy r10 = (defpackage.anyy) r10
            r7.add(r10)
            r7 = r9
            goto L71
        La2:
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto Lad
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Lad
            goto Lc7
        Lad:
            java.util.Iterator r7 = r7.iterator()
        Lb1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc7
            java.lang.Object r8 = r7.next()
            anyy r8 = (defpackage.anyy) r8
            r8.getClass()
            boolean r8 = r2.a(r8)
            if (r8 != 0) goto Lb1
            r4 = 0
        Lc7:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anyv.a(anpj, int, anyw, fcxy):java.lang.Object");
    }
}
