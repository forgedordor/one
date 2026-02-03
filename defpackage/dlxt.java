package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxt {
    public final dmai a;
    private final Set b;
    private final dlzq c;

    public dlxt(dmai dmaiVar, Set set, dlzq dlzqVar) {
        this.a = dmaiVar;
        this.b = set;
        this.c = dlzqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r7.b(r0) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r7.b(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dlxq
            if (r0 == 0) goto L13
            r0 = r7
            dlxq r0 = (defpackage.dlxq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlxq r0 = new dlxq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L52
        L3b:
            defpackage.fctl.b(r7)
            goto L4c
        L3f:
            defpackage.fctl.b(r7)
            dmai r7 = r6.a
            r0.d = r5
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L7a
        L4c:
            java.util.Set r7 = r6.b
            java.util.Iterator r2 = r7.iterator()
        L52:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r2.next()
            dlym r7 = (defpackage.dlym) r7
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L52
            goto L7a
        L69:
            dlzq r7 = r6.c
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L77
            goto L7a
        L77:
            fctx r7 = defpackage.fctx.a
            return r7
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxt.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r7.c(r0) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r7.c(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dlxr
            if (r0 == 0) goto L13
            r0 = r7
            dlxr r0 = (defpackage.dlxr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlxr r0 = new dlxr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L52
        L3b:
            defpackage.fctl.b(r7)
            goto L4c
        L3f:
            defpackage.fctl.b(r7)
            dmai r7 = r6.a
            r0.d = r5
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L7a
        L4c:
            java.util.Set r7 = r6.b
            java.util.Iterator r2 = r7.iterator()
        L52:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r2.next()
            dlym r7 = (defpackage.dlym) r7
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            goto L7a
        L69:
            dlzq r7 = r6.c
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L77
            goto L7a
        L77:
            fctx r7 = defpackage.fctx.a
            return r7
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxt.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r7.d(r0) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r7.d(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dlxs
            if (r0 == 0) goto L13
            r0 = r7
            dlxs r0 = (defpackage.dlxs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlxs r0 = new dlxs
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r7)
            goto L52
        L3b:
            defpackage.fctl.b(r7)
            goto L4c
        L3f:
            defpackage.fctl.b(r7)
            dlzq r7 = r6.c
            r0.d = r5
            java.lang.Object r7 = r7.d(r0)
            if (r7 == r1) goto L7a
        L4c:
            java.util.Set r7 = r6.b
            java.util.Iterator r2 = r7.iterator()
        L52:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r2.next()
            dlym r7 = (defpackage.dlym) r7
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L52
            goto L7a
        L69:
            dmai r7 = r6.a
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L77
            goto L7a
        L77:
            fctx r7 = defpackage.fctx.a
            return r7
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxt.c(fcxy):java.lang.Object");
    }
}
